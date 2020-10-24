// Generated from grammars/BCC.g4 by ANTLR 4.8
// jshint ignore: start
var antlr4 = require('antlr4/index');

// This class defines a complete listener for a parse tree produced by BCCParser.
function BCCListener() {
	antlr4.tree.ParseTreeListener.call(this);
	return this;
}

BCCListener.prototype = Object.create(antlr4.tree.ParseTreeListener.prototype);
BCCListener.prototype.constructor = BCCListener;

// Enter a parse tree produced by BCCParser#prog.
BCCListener.prototype.enterProg = function(ctx) {
};

// Exit a parse tree produced by BCCParser#prog.
BCCListener.prototype.exitProg = function(ctx) {
};


// Enter a parse tree produced by BCCParser#varDecl.
BCCListener.prototype.enterVarDecl = function(ctx) {
};

// Exit a parse tree produced by BCCParser#varDecl.
BCCListener.prototype.exitVarDecl = function(ctx) {
};


// Enter a parse tree produced by BCCParser#fndeclList.
BCCListener.prototype.enterFndeclList = function(ctx) {
};

// Exit a parse tree produced by BCCParser#fndeclList.
BCCListener.prototype.exitFndeclList = function(ctx) {
};


// Enter a parse tree produced by BCCParser#stmtBlock.
BCCListener.prototype.enterStmtBlock = function(ctx) {
};

// Exit a parse tree produced by BCCParser#stmtBlock.
BCCListener.prototype.exitStmtBlock = function(ctx) {
};


// Enter a parse tree produced by BCCParser#stmt.
BCCListener.prototype.enterStmt = function(ctx) {
};

// Exit a parse tree produced by BCCParser#stmt.
BCCListener.prototype.exitStmt = function(ctx) {
};


// Enter a parse tree produced by BCCParser#lexpr.
BCCListener.prototype.enterLexpr = function(ctx) {
};

// Exit a parse tree produced by BCCParser#lexpr.
BCCListener.prototype.exitLexpr = function(ctx) {
};


// Enter a parse tree produced by BCCParser#nexpr.
BCCListener.prototype.enterNexpr = function(ctx) {
};

// Exit a parse tree produced by BCCParser#nexpr.
BCCListener.prototype.exitNexpr = function(ctx) {
};


// Enter a parse tree produced by BCCParser#rexpr.
BCCListener.prototype.enterRexpr = function(ctx) {
};

// Exit a parse tree produced by BCCParser#rexpr.
BCCListener.prototype.exitRexpr = function(ctx) {
};


// Enter a parse tree produced by BCCParser#simpleExpr.
BCCListener.prototype.enterSimpleExpr = function(ctx) {
};

// Exit a parse tree produced by BCCParser#simpleExpr.
BCCListener.prototype.exitSimpleExpr = function(ctx) {
};


// Enter a parse tree produced by BCCParser#term.
BCCListener.prototype.enterTerm = function(ctx) {
};

// Exit a parse tree produced by BCCParser#term.
BCCListener.prototype.exitTerm = function(ctx) {
};


// Enter a parse tree produced by BCCParser#factor.
BCCListener.prototype.enterFactor = function(ctx) {
};

// Exit a parse tree produced by BCCParser#factor.
BCCListener.prototype.exitFactor = function(ctx) {
};


// Enter a parse tree produced by BCCParser#mainProg.
BCCListener.prototype.enterMainProg = function(ctx) {
};

// Exit a parse tree produced by BCCParser#mainProg.
BCCListener.prototype.exitMainProg = function(ctx) {
};


// Enter a parse tree produced by BCCParser#bool.
BCCListener.prototype.enterBool = function(ctx) {
};

// Exit a parse tree produced by BCCParser#bool.
BCCListener.prototype.exitBool = function(ctx) {
};



exports.BCCListener = BCCListener;