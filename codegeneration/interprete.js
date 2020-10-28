const BccVisitor = require('../lib/BCCVisitor').BCCVisitor;
const reader = require('readline-sync');

var reglas;

class Visitor extends BccVisitor{
    start(ctx){
        reglas=new Map();
        this.visitProg(ctx);    
    }
    visitChildren(ctx){
        let m;
        for(let i=0;i<ctx.getChildCount();i++){
            m= this.visit(ctx.getChild(i))
        }
        return m;
    }

    visitTerminal(ctx) {
        
        return ctx.getText();
    }
    visitVarDecl(ctx){
        let p;
        //z:['num',null]
        let decla=[];  
        let name;
        for(let i=0;i<ctx.getChildCount();i++){
            p=this.visit(ctx.getChild(i))
            if(p!='num' && p!='bool' && p!=':' && p!=','){
                name=p
            }
            if(p=='num' || p=='bool'){
                decla=[p,null];
                reglas.set(name,decla)
            }

        }
        
    }

    visitStmt(ctx){
        
        if(ctx.PRINT()!=null){
            //console.log("Aqui vamos")
            let aux=this.visit(ctx.lexpr())[0]
            console.log(aux)
        }else if(ctx.INPUT()!=null){
            let vari=this.visit(ctx.ID())
            if(reglas.has(vari)){
                let valor = reader.question();
                let tipo=reglas.get(vari)[0]
                if(tipo=='num'){
                    if(isNaN(valor)){
                        console.log("El valor a ingresar debe ser de tipo numerico")
                    }else{
                        let change=reglas.get(vari)
                        change[1]=Number(valor)
                        reglas.set(vari,change)
                    }
                }else if(tipo=='bool'){
                    if(valor=='true' || valor=='false'){
                        let change=reglas.get(vari)
                        change[1]=(valor=='true')
                        reglas.set(vari,change)
                    }else{
                        console.log("El valor a ingresar debe ser booleano")
                    }
                }
            }else{
                console.log("Variable aun no ha sido declarada")
            }

        }else if(ctx.WHEN()!=null){
            let res=this.visit(ctx.lexpr())[0]
            if(res==true){
                this.visit(ctx.stmtBlock())
            }

        }else if(ctx.IF()!=null){
            let res=this.visit(ctx.lexpr())[0]
            if(res){
                this.visit(ctx.getChild(5))
            }else{
                this.visit(ctx.getChild(7))
            }
        }else if(ctx.UNLESS()!=null){
            let res=this.visit(ctx.lexpr())[0]
            if(res==false){
                this.visit(ctx.stmtBlock())
            }
        }else if(ctx.WHILE()!=null){
            while (true){
                let ex=this.visit(ctx.lexpr())[0]
                if(ex){
                    this.visit(ctx.stmtBlock())
                }else{
                    break
                }
            }  
        }else if(ctx.RETURN()!=null){

        }else if(ctx.UNTIL()!=null){
            while(true){
                let ex=this.visit(ctx.lexpr())[0]
                if(ex){
                    break
                }else{
                    this.visit(ctx.stmtBlock())
                }
            }
            
        }else if(ctx.LOOP()!=null){
            while(true){
                this.visit(ctx.stmtBlock())
            }
        }else if(ctx.FOR()!=null){
            let ini=this.visit(ctx.assignexpr());
            let cond=this.visit(ctx.getChild(4));
            while(cond){
                this.visit(ctx.stmtBlock())
                let aux=reglas.get(ini)
                let aum=this.visit(ctx.getChild(6));
                aux[1]=aum
                reglas.set(ini,aux)
                this.visit(ctx.getChild(6))
                cond=this.visit(ctx.getChild(4))
            }
        }else if(ctx.REPEAT()!=null){
            let rep=Number(this.visit(ctx.NUM()))
            for(let i=0;i<rep;i++){
                this.visit(ctx.stmtBlock())
            }
        }else if(ctx.DO()!=null){
            if(ctx.WHILE()!=null){
                
            }else if(ctx.UNTIL()!=null){

            }
           
        }else if(ctx.NEXT()!=null){

        }else if(ctx.BREAK()!=null){
            //this.visit(ctx.getChild())
        }else if(ctx.ID()!=null){
           let l='',op='',r='';
           this.fID(ctx,l,op,r);
        }
    }

    visitAssignexpr(ctx){
        let l='',op='',r='';
        l=this.visit(ctx.ID())
        op=this.visit(ctx.getChild(1))
        r= this.visit(ctx.lexpr())
        if(reglas.has(l)){
            let decla=reglas.get(l);
            if(decla[0]=='bool'){
                if(r!=true && r!=false){
                    console.log("Tipo incorrecto de variable")
                }
            }
            decla[1]=r;
            reglas.set(l,decla)
        }else{
            console.log("Variable aun no ha sido declarada")
        }
        return l;
        //this.fID(ctx,l,op,r); 
    }

    fID(ctx,l,op,r){
        if(ctx.getChildCount()==4){
            
            l=this.visit(ctx.ID())
            op=this.visit(ctx.getChild(1))
            r=this.visit(ctx.lexpr())[0]  //Depronto modificar
            if(reglas.has(l)){
                let decla=reglas.get(l);
                if(decla[0]=='bool'){
                    if(r!=true && r!=false){
                        console.log("Tipo incorrecto de variable")
                    }
                }
                decla[1]=r;
                reglas.set(l,decla)
                //console.log(reglas)
            }else{
                console.log("Variable aun no ha sido declarada")
            }
        }  
    }

    visitFactor(ctx){
        if(ctx.NUM()!=null){
            return Number(ctx.getText())
        }else if(ctx.BOOL()!=null){
            let isTrue=(ctx.getText()=='true')
            return isTrue
        }else if(ctx.ID()!=null){
            let cid=ctx.ID().getText();
            let aux=''
            if(reglas.has(cid)){
                aux= reglas.get(cid)[1]
            }else{
                console.log("Variable no ha sido aun inicializada")
            }
            if(ctx.getChildCount()==1){
                return aux
            }else{
                if(ctx.TK_INCREMENTO()!=null){
                    return Number(aux)+1
                }else if(ctx.TK_DECREMENTO()!=null){
                    return Number(aux)-1
                }
            }
            
        }else if(ctx.TK_PAR_IZQ()!=null){
            return this.visit(ctx.lexpr())[0]
        }
    }

    visitSimpleExpr(ctx){
        let res=[]
        for(let i=0;i<ctx.getChildCount();i++){
            let p=this.visit(ctx.getChild(i))
            if(res.length==2){
                if(res[1]=='+'){
                    res[0]=res[0]+p
                }else if(res[1]=='-'){
                    res[0]=res[0]-p
                }
                res=res.slice(0,1)
            }else{
               res.push(p) 
            }
        }
        return res[0]
    }

    visitTerm(ctx){
        let res=[]
        for(let i=0;i<ctx.getChildCount();i++){
            let p=this.visit(ctx.getChild(i))
            if(res.length==2){
                if(res[1]=='*'){
                    res[0]=res[0]*p
                }else if(res[1]=='/'){
                    res[0]=res[0]/p
                }else if(res[1]=='%'){
                    res[0]=res[0]%p
                }
                res=res.slice(0,1)
            }else{
                res.push(p)
            }
        }
        return res[0]
    }

    visitRexpr(ctx){
        let res=[]
        for(let i=0;i<ctx.getChildCount();i++){
            let p=this.visit(ctx.getChild(i));
            if(res.length==2){
                if(res[1]=='<'){
                    res[0]=(res[0]<p)
                }else if(res[1]=='=='){
                    res[0]=(res[0]==p)
                }else if(res[1]=='<='){
                    res[0]=(res[0]<=p)
                }else if(res[1]=='>'){
                    res[0]=(res[0]>p)
                }else if(res[1]=='>='){
                    res[0]=(res[0]>=p)
                }else if(res[1]=='!='){
                    res[0]=(res[0]!=p)
                }
                res=res.slice(0,1)
            }else{
                res.push(p)
            }
        } 
        //console.log(res[0])
        return res[0]
    }
    
}

module.exports=Visitor;