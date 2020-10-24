const antl4=require('antlr4');
const BccLexer = require('./lib/BCCLexer');
const BccParser = require('./lib/BCCParser');
const fs=require('fs');

const input=fs.readFileSync('./inputs/0.txt').toString();
const chars = new antl4.InputStream(input);
const lexer=new BccLexer.BCCLexer(chars);
lexer.strictMode=false;
const tokens=new antl4.CommonTokenStream(lexer);
const parser=new BccParser.BCCParser(tokens);
const tree=parser.prog();
console.log(tree.toStringTree(parser.ruleNames))