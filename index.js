const antl4=require('antlr4');
const BccLexer = require('./lib/BCCLexer');
const BccParser = require('./lib/BCCParser');
const Interprete = require('./codegeneration/Interprete');
const fs=require('fs');

const input=fs.readFileSync('./inputs/5.txt').toString();
const chars = new antl4.InputStream(input);
const lexer=new BccLexer.BCCLexer(chars);
lexer.strictMode=false;
const tokens=new antl4.CommonTokenStream(lexer);
const parser=new BccParser.BCCParser(tokens);
const tree=parser.prog();
//console.log(tree.toStringTree(parser.ruleNames));
const output=new Interprete().start(tree);