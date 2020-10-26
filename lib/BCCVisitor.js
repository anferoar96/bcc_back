// Generated from grammars/BCC.g4 by ANTLR 4.8
// jshint ignore: start
var antlr4 = require('antlr4/index');

// This class defines a complete generic visitor for a parse tree produced by BCCParser.

function BCCVisitor() {
	antlr4.tree.ParseTreeVisitor.call(this);
	return this;
}

BCCVisitor.prototype = Object.create(antlr4.tree.ParseTreeVisitor.prototype);
BCCVisitor.prototype.constructor = BCCVisitor;

// Visit a parse tree produced by BCCParser#prog.
BCCVisitor.prototype.visitProg = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by BCCParser#varDecl.
BCCVisitor.prototype.visitVarDecl = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by BCCParser#fndeclList.
BCCVisitor.prototype.visitFndeclList = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by BCCParser#stmtBlock.
BCCVisitor.prototype.visitStmtBlock = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by BCCParser#stmt.
BCCVisitor.prototype.visitStmt = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by BCCParser#assignexpr.
BCCVisitor.prototype.visitAssignexpr = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by BCCParser#lexpr.
BCCVisitor.prototype.visitLexpr = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by BCCParser#nexpr.
BCCVisitor.prototype.visitNexpr = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by BCCParser#rexpr.
BCCVisitor.prototype.visitRexpr = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by BCCParser#simpleExpr.
BCCVisitor.prototype.visitSimpleExpr = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by BCCParser#term.
BCCVisitor.prototype.visitTerm = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by BCCParser#factor.
BCCVisitor.prototype.visitFactor = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by BCCParser#mainProg.
BCCVisitor.prototype.visitMainProg = function(ctx) {
  return this.visitChildren(ctx);
};



exports.BCCVisitor = BCCVisitor;