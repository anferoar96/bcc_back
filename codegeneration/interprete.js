const BccVisitor = require('../lib/BCCVisitor').BCCVisitor;

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
       // console.log(reglas)
    }

    visitStmt(ctx){
        
        if(ctx.PRINT()!=null){
            let aux=this.visit(ctx.lexpr())[0]
            console.log(aux)
        }else if(ctx.INPUT()!=null){

        }else if(ctx.WHEN()!=null){

        }else if(ctx.IF()!=null){

        }else if(ctx.UNLESS()!=null){

        }else if(ctx.WHILE()!=null){

        }else if(ctx.RETURN()!=null){

        }else if(ctx.UNTIL()!=null){

        }else if(ctx.LOOP()!=null){

        }else if(ctx.DO()!=null){

        }else if(ctx.REPEAT()!=null){

        }else if(ctx.FOR()!=null){

        }else if(ctx.NEXT()!=null){

        }else if(ctx.BREAK()!=null){

        }else if(ctx.ID()!=null){
           let l='',op='',r='';
           this.fID(ctx,l,op,r);
        }
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

    
}

module.exports=Visitor;