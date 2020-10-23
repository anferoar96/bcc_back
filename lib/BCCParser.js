// Generated from grammars/BCC.g4 by ANTLR 4.8
// jshint ignore: start
var antlr4 = require('antlr4/index');
var BCCListener = require('./BCCListener').BCCListener;
var BCCVisitor = require('./BCCVisitor').BCCVisitor;

var grammarFileName = "BCC.g4";


var serializedATN = ["\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964",
    "\u0003:\u012a\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004\u0004\t",
    "\u0004\u0004\u0005\t\u0005\u0004\u0006\t\u0006\u0004\u0007\t\u0007\u0004",
    "\b\t\b\u0004\t\t\t\u0004\n\t\n\u0004\u000b\t\u000b\u0004\f\t\f\u0004",
    "\r\t\r\u0004\u000e\t\u000e\u0004\u000f\t\u000f\u0003\u0002\u0007\u0002",
    " \n\u0002\f\u0002\u000e\u0002#\u000b\u0002\u0003\u0002\u0003\u0002\u0005",
    "\u0002\'\n\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003",
    "\u0003\u0003\u0003\u0003\u0003\u0007\u00030\n\u0003\f\u0003\u000e\u0003",
    "3\u000b\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003",
    "\u0004\u0003\u0004\u0005\u0004;\n\u0004\u0003\u0004\u0003\u0004\u0003",
    "\u0004\u0003\u0004\u0003\u0004\u0005\u0004B\n\u0004\u0003\u0004\u0003",
    "\u0004\u0003\u0005\u0003\u0005\u0006\u0005H\n\u0005\r\u0005\u000e\u0005",
    "I\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005O\n\u0005\u0003\u0006",
    "\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006",
    "\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006",
    "\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006",
    "\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006",
    "\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006",
    "\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006",
    "\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006",
    "\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006",
    "\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006",
    "\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006",
    "\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006",
    "\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006",
    "\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006",
    "\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006",
    "\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006",
    "\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006",
    "\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006",
    "\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006",
    "\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006",
    "\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006",
    "\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0005\u0006\u00ce\n",
    "\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0007\u0007\u00d3\n\u0007",
    "\f\u0007\u000e\u0007\u00d6\u000b\u0007\u0003\u0007\u0003\u0007\u0007",
    "\u0007\u00da\n\u0007\f\u0007\u000e\u0007\u00dd\u000b\u0007\u0005\u0007",
    "\u00df\n\u0007\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0005",
    "\b\u00e7\n\b\u0003\t\u0003\t\u0003\t\u0005\t\u00ec\n\t\u0003\n\u0003",
    "\n\u0003\n\u0007\n\u00f1\n\n\f\n\u000e\n\u00f4\u000b\n\u0003\u000b\u0003",
    "\u000b\u0003\u000b\u0007\u000b\u00f9\n\u000b\f\u000b\u000e\u000b\u00fc",
    "\u000b\u000b\u0003\f\u0003\f\u0003\f\u0003\f\u0003\f\u0003\f\u0003\f",
    "\u0003\f\u0003\f\u0003\f\u0003\f\u0003\f\u0003\f\u0003\f\u0003\f\u0003",
    "\f\u0007\f\u010e\n\f\f\f\u000e\f\u0111\u000b\f\u0005\f\u0113\n\f\u0003",
    "\f\u0005\f\u0116\n\f\u0003\r\u0003\r\u0003\r\u0003\r\u0005\r\u011c\n",
    "\r\u0003\r\u0007\r\u011f\n\r\f\r\u000e\r\u0122\u000b\r\u0003\r\u0003",
    "\r\u0003\u000e\u0003\u000e\u0003\u000f\u0003\u000f\u0003\u000f\u0002",
    "\u0002\u0010\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018",
    "\u001a\u001c\u0002\b\u0004\u0002\r\u000e\u0014\u0017\u0003\u0002\u001a",
    "\u001b\u0003\u0002\u001c\u001e\u0003\u0002\u001f \u0003\u0002\u0003",
    "\u0004\u0003\u0002\u0005\u0006\u0002\u014c\u0002&\u0003\u0002\u0002",
    "\u0002\u0004(\u0003\u0002\u0002\u0002\u00064\u0003\u0002\u0002\u0002",
    "\bN\u0003\u0002\u0002\u0002\n\u00cd\u0003\u0002\u0002\u0002\f\u00cf",
    "\u0003\u0002\u0002\u0002\u000e\u00e6\u0003\u0002\u0002\u0002\u0010\u00e8",
    "\u0003\u0002\u0002\u0002\u0012\u00ed\u0003\u0002\u0002\u0002\u0014\u00f5",
    "\u0003\u0002\u0002\u0002\u0016\u0115\u0003\u0002\u0002\u0002\u0018\u011b",
    "\u0003\u0002\u0002\u0002\u001a\u0125\u0003\u0002\u0002\u0002\u001c\u0127",
    "\u0003\u0002\u0002\u0002\u001e \u0005\u0006\u0004\u0002\u001f\u001e",
    "\u0003\u0002\u0002\u0002 #\u0003\u0002\u0002\u0002!\u001f\u0003\u0002",
    "\u0002\u0002!\"\u0003\u0002\u0002\u0002\"$\u0003\u0002\u0002\u0002#",
    "!\u0003\u0002\u0002\u0002$\'\u0005\u0018\r\u0002%\'\u0007\u0002\u0002",
    "\u0003&!\u0003\u0002\u0002\u0002&%\u0003\u0002\u0002\u0002\'\u0003\u0003",
    "\u0002\u0002\u0002()\u00078\u0002\u0002)*\u0007\u0007\u0002\u0002*1",
    "\u0005\u001c\u000f\u0002+,\u0007\b\u0002\u0002,-\u00078\u0002\u0002",
    "-.\u0007\u0007\u0002\u0002.0\u0005\u001c\u000f\u0002/+\u0003\u0002\u0002",
    "\u000203\u0003\u0002\u0002\u00021/\u0003\u0002\u0002\u000212\u0003\u0002",
    "\u0002\u00022\u0005\u0003\u0002\u0002\u000231\u0003\u0002\u0002\u0002",
    "45\u0007!\u0002\u000256\u00077\u0002\u000267\u0007\u0007\u0002\u0002",
    "78\u0005\u001c\u000f\u00028:\u0007\u000b\u0002\u00029;\u0005\u0004\u0003",
    "\u0002:9\u0003\u0002\u0002\u0002:;\u0003\u0002\u0002\u0002;<\u0003\u0002",
    "\u0002\u0002<A\u0007\f\u0002\u0002=>\u0007\"\u0002\u0002>?\u0005\u0004",
    "\u0003\u0002?@\u0007\t\u0002\u0002@B\u0003\u0002\u0002\u0002A=\u0003",
    "\u0002\u0002\u0002AB\u0003\u0002\u0002\u0002BC\u0003\u0002\u0002\u0002",
    "CD\u0005\b\u0005\u0002D\u0007\u0003\u0002\u0002\u0002EG\u0007\u0018",
    "\u0002\u0002FH\u0005\n\u0006\u0002GF\u0003\u0002\u0002\u0002HI\u0003",
    "\u0002\u0002\u0002IG\u0003\u0002\u0002\u0002IJ\u0003\u0002\u0002\u0002",
    "JK\u0003\u0002\u0002\u0002KL\u0007\u0019\u0002\u0002LO\u0003\u0002\u0002",
    "\u0002MO\u0005\n\u0006\u0002NE\u0003\u0002\u0002\u0002NM\u0003\u0002",
    "\u0002\u0002O\t\u0003\u0002\u0002\u0002PQ\u0007#\u0002\u0002QR\u0005",
    "\f\u0007\u0002RS\u0007\t\u0002\u0002S\u00ce\u0003\u0002\u0002\u0002",
    "TU\u0007$\u0002\u0002UV\u00078\u0002\u0002V\u00ce\u0007\t\u0002\u0002",
    "WX\u0007%\u0002\u0002XY\u0007\u000b\u0002\u0002YZ\u0005\f\u0007\u0002",
    "Z[\u0007\f\u0002\u0002[\\\u0007&\u0002\u0002\\]\u0005\b\u0005\u0002",
    "]\u00ce\u0003\u0002\u0002\u0002^_\u0007\'\u0002\u0002_`\u0007\u000b",
    "\u0002\u0002`a\u0005\f\u0007\u0002ab\u0007\f\u0002\u0002bc\u0007&\u0002",
    "\u0002cd\u0005\b\u0005\u0002de\u0007(\u0002\u0002ef\u0005\b\u0005\u0002",
    "f\u00ce\u0003\u0002\u0002\u0002gh\u0007)\u0002\u0002hi\u0007\u000b\u0002",
    "\u0002ij\u0005\f\u0007\u0002jk\u0007\f\u0002\u0002kl\u0007&\u0002\u0002",
    "lm\u0005\b\u0005\u0002m\u00ce\u0003\u0002\u0002\u0002no\u0007*\u0002",
    "\u0002op\u0007\u000b\u0002\u0002pq\u0005\f\u0007\u0002qr\u0007\f\u0002",
    "\u0002rs\u0007&\u0002\u0002st\u0005\b\u0005\u0002t\u00ce\u0003\u0002",
    "\u0002\u0002uv\u0007+\u0002\u0002vw\u0005\f\u0007\u0002wx\u0007\t\u0002",
    "\u0002x\u00ce\u0003\u0002\u0002\u0002yz\u0007,\u0002\u0002z{\u0007\u000b",
    "\u0002\u0002{|\u0005\f\u0007\u0002|}\u0007\f\u0002\u0002}~\u0007&\u0002",
    "\u0002~\u007f\u0005\b\u0005\u0002\u007f\u00ce\u0003\u0002\u0002\u0002",
    "\u0080\u0081\u0007-\u0002\u0002\u0081\u00ce\u0005\b\u0005\u0002\u0082",
    "\u0083\u0007&\u0002\u0002\u0083\u0084\u0005\b\u0005\u0002\u0084\u0085",
    "\u0007*\u0002\u0002\u0085\u0086\u0007\u000b\u0002\u0002\u0086\u0087",
    "\u0005\f\u0007\u0002\u0087\u0088\u0007\f\u0002\u0002\u0088\u00ce\u0003",
    "\u0002\u0002\u0002\u0089\u008a\u0007&\u0002\u0002\u008a\u008b\u0005",
    "\b\u0005\u0002\u008b\u008c\u0007,\u0002\u0002\u008c\u008d\u0007\u000b",
    "\u0002\u0002\u008d\u008e\u0005\f\u0007\u0002\u008e\u008f\u0007\f\u0002",
    "\u0002\u008f\u00ce\u0003\u0002\u0002\u0002\u0090\u0091\u0007.\u0002",
    "\u0002\u0091\u0092\u00076\u0002\u0002\u0092\u0093\u0007\u0007\u0002",
    "\u0002\u0093\u00ce\u0005\b\u0005\u0002\u0094\u0095\u0007/\u0002\u0002",
    "\u0095\u0096\u0007\u000b\u0002\u0002\u0096\u0097\u0005\f\u0007\u0002",
    "\u0097\u0098\u0007\t\u0002\u0002\u0098\u0099\u0005\f\u0007\u0002\u0099",
    "\u009a\u0007\t\u0002\u0002\u009a\u009b\u0005\f\u0007\u0002\u009b\u009c",
    "\u0007\f\u0002\u0002\u009c\u009d\u0007&\u0002\u0002\u009d\u009e\u0005",
    "\b\u0005\u0002\u009e\u00ce\u0003\u0002\u0002\u0002\u009f\u00a0\u0007",
    "1\u0002\u0002\u00a0\u00ce\u0007\t\u0002\u0002\u00a1\u00a2\u00072\u0002",
    "\u0002\u00a2\u00ce\u0007\t\u0002\u0002\u00a3\u00a4\u00078\u0002\u0002",
    "\u00a4\u00a5\u0007\n\u0002\u0002\u00a5\u00a6\u0005\f\u0007\u0002\u00a6",
    "\u00a7\u0007\t\u0002\u0002\u00a7\u00ce\u0003\u0002\u0002\u0002\u00a8",
    "\u00a9\u00078\u0002\u0002\u00a9\u00aa\u0007\u000f\u0002\u0002\u00aa",
    "\u00ab\u0005\f\u0007\u0002\u00ab\u00ac\u0007\t\u0002\u0002\u00ac\u00ce",
    "\u0003\u0002\u0002\u0002\u00ad\u00ae\u00078\u0002\u0002\u00ae\u00af",
    "\u0007\u0010\u0002\u0002\u00af\u00b0\u0005\f\u0007\u0002\u00b0\u00b1",
    "\u0007\t\u0002\u0002\u00b1\u00ce\u0003\u0002\u0002\u0002\u00b2\u00b3",
    "\u00078\u0002\u0002\u00b3\u00b4\u0007\u0011\u0002\u0002\u00b4\u00b5",
    "\u0005\f\u0007\u0002\u00b5\u00b6\u0007\t\u0002\u0002\u00b6\u00ce\u0003",
    "\u0002\u0002\u0002\u00b7\u00b8\u00078\u0002\u0002\u00b8\u00b9\u0007",
    "\u0012\u0002\u0002\u00b9\u00ba\u0005\f\u0007\u0002\u00ba\u00bb\u0007",
    "\t\u0002\u0002\u00bb\u00ce\u0003\u0002\u0002\u0002\u00bc\u00bd\u0007",
    "8\u0002\u0002\u00bd\u00be\u0007\u0013\u0002\u0002\u00be\u00bf\u0005",
    "\f\u0007\u0002\u00bf\u00c0\u0007\t\u0002\u0002\u00c0\u00ce\u0003\u0002",
    "\u0002\u0002\u00c1\u00c2\u00078\u0002\u0002\u00c2\u00c3\u0007\u001f",
    "\u0002\u0002\u00c3\u00ce\u0007\t\u0002\u0002\u00c4\u00c5\u00078\u0002",
    "\u0002\u00c5\u00c6\u0007 \u0002\u0002\u00c6\u00ce\u0007\t\u0002\u0002",
    "\u00c7\u00c8\u0007 \u0002\u0002\u00c8\u00c9\u00078\u0002\u0002\u00c9",
    "\u00ce\u0007\t\u0002\u0002\u00ca\u00cb\u0007\u001f\u0002\u0002\u00cb",
    "\u00cc\u00078\u0002\u0002\u00cc\u00ce\u0007\t\u0002\u0002\u00cdP\u0003",
    "\u0002\u0002\u0002\u00cdT\u0003\u0002\u0002\u0002\u00cdW\u0003\u0002",
    "\u0002\u0002\u00cd^\u0003\u0002\u0002\u0002\u00cdg\u0003\u0002\u0002",
    "\u0002\u00cdn\u0003\u0002\u0002\u0002\u00cdu\u0003\u0002\u0002\u0002",
    "\u00cdy\u0003\u0002\u0002\u0002\u00cd\u0080\u0003\u0002\u0002\u0002",
    "\u00cd\u0082\u0003\u0002\u0002\u0002\u00cd\u0089\u0003\u0002\u0002\u0002",
    "\u00cd\u0090\u0003\u0002\u0002\u0002\u00cd\u0094\u0003\u0002\u0002\u0002",
    "\u00cd\u009f\u0003\u0002\u0002\u0002\u00cd\u00a1\u0003\u0002\u0002\u0002",
    "\u00cd\u00a3\u0003\u0002\u0002\u0002\u00cd\u00a8\u0003\u0002\u0002\u0002",
    "\u00cd\u00ad\u0003\u0002\u0002\u0002\u00cd\u00b2\u0003\u0002\u0002\u0002",
    "\u00cd\u00b7\u0003\u0002\u0002\u0002\u00cd\u00bc\u0003\u0002\u0002\u0002",
    "\u00cd\u00c1\u0003\u0002\u0002\u0002\u00cd\u00c4\u0003\u0002\u0002\u0002",
    "\u00cd\u00c7\u0003\u0002\u0002\u0002\u00cd\u00ca\u0003\u0002\u0002\u0002",
    "\u00ce\u000b\u0003\u0002\u0002\u0002\u00cf\u00de\u0005\u000e\b\u0002",
    "\u00d0\u00d1\u00073\u0002\u0002\u00d1\u00d3\u0005\u000e\b\u0002\u00d2",
    "\u00d0\u0003\u0002\u0002\u0002\u00d3\u00d6\u0003\u0002\u0002\u0002\u00d4",
    "\u00d2\u0003\u0002\u0002\u0002\u00d4\u00d5\u0003\u0002\u0002\u0002\u00d5",
    "\u00df\u0003\u0002\u0002\u0002\u00d6\u00d4\u0003\u0002\u0002\u0002\u00d7",
    "\u00d8\u00074\u0002\u0002\u00d8\u00da\u0005\u000e\b\u0002\u00d9\u00d7",
    "\u0003\u0002\u0002\u0002\u00da\u00dd\u0003\u0002\u0002\u0002\u00db\u00d9",
    "\u0003\u0002\u0002\u0002\u00db\u00dc\u0003\u0002\u0002\u0002\u00dc\u00df",
    "\u0003\u0002\u0002\u0002\u00dd\u00db\u0003\u0002\u0002\u0002\u00de\u00d4",
    "\u0003\u0002\u0002\u0002\u00de\u00db\u0003\u0002\u0002\u0002\u00de\u00df",
    "\u0003\u0002\u0002\u0002\u00df\r\u0003\u0002\u0002\u0002\u00e0\u00e1",
    "\u00075\u0002\u0002\u00e1\u00e2\u0007\u000b\u0002\u0002\u00e2\u00e3",
    "\u0005\f\u0007\u0002\u00e3\u00e4\u0007\f\u0002\u0002\u00e4\u00e7\u0003",
    "\u0002\u0002\u0002\u00e5\u00e7\u0005\u0010\t\u0002\u00e6\u00e0\u0003",
    "\u0002\u0002\u0002\u00e6\u00e5\u0003\u0002\u0002\u0002\u00e7\u000f\u0003",
    "\u0002\u0002\u0002\u00e8\u00eb\u0005\u0012\n\u0002\u00e9\u00ea\t\u0002",
    "\u0002\u0002\u00ea\u00ec\u0005\u0012\n\u0002\u00eb\u00e9\u0003\u0002",
    "\u0002\u0002\u00eb\u00ec\u0003\u0002\u0002\u0002\u00ec\u0011\u0003\u0002",
    "\u0002\u0002\u00ed\u00f2\u0005\u0014\u000b\u0002\u00ee\u00ef\t\u0003",
    "\u0002\u0002\u00ef\u00f1\u0005\u0014\u000b\u0002\u00f0\u00ee\u0003\u0002",
    "\u0002\u0002\u00f1\u00f4\u0003\u0002\u0002\u0002\u00f2\u00f0\u0003\u0002",
    "\u0002\u0002\u00f2\u00f3\u0003\u0002\u0002\u0002\u00f3\u0013\u0003\u0002",
    "\u0002\u0002\u00f4\u00f2\u0003\u0002\u0002\u0002\u00f5\u00fa\u0005\u0016",
    "\f\u0002\u00f6\u00f7\t\u0004\u0002\u0002\u00f7\u00f9\u0005\u0016\f\u0002",
    "\u00f8\u00f6\u0003\u0002\u0002\u0002\u00f9\u00fc\u0003\u0002\u0002\u0002",
    "\u00fa\u00f8\u0003\u0002\u0002\u0002\u00fa\u00fb\u0003\u0002\u0002\u0002",
    "\u00fb\u0015\u0003\u0002\u0002\u0002\u00fc\u00fa\u0003\u0002\u0002\u0002",
    "\u00fd\u0116\u00076\u0002\u0002\u00fe\u0116\u0005\u001a\u000e\u0002",
    "\u00ff\u0100\u00078\u0002\u0002\u0100\u0116\t\u0005\u0002\u0002\u0101",
    "\u0102\t\u0005\u0002\u0002\u0102\u0116\u00078\u0002\u0002\u0103\u0116",
    "\u00078\u0002\u0002\u0104\u0105\u0007\u000b\u0002\u0002\u0105\u0106",
    "\u0005\f\u0007\u0002\u0106\u0107\u0007\f\u0002\u0002\u0107\u0116\u0003",
    "\u0002\u0002\u0002\u0108\u0109\u00077\u0002\u0002\u0109\u0112\u0007",
    "\u000b\u0002\u0002\u010a\u010f\u0005\f\u0007\u0002\u010b\u010c\u0007",
    "\b\u0002\u0002\u010c\u010e\u0005\f\u0007\u0002\u010d\u010b\u0003\u0002",
    "\u0002\u0002\u010e\u0111\u0003\u0002\u0002\u0002\u010f\u010d\u0003\u0002",
    "\u0002\u0002\u010f\u0110\u0003\u0002\u0002\u0002\u0110\u0113\u0003\u0002",
    "\u0002\u0002\u0111\u010f\u0003\u0002\u0002\u0002\u0112\u010a\u0003\u0002",
    "\u0002\u0002\u0112\u0113\u0003\u0002\u0002\u0002\u0113\u0114\u0003\u0002",
    "\u0002\u0002\u0114\u0116\u0007\f\u0002\u0002\u0115\u00fd\u0003\u0002",
    "\u0002\u0002\u0115\u00fe\u0003\u0002\u0002\u0002\u0115\u00ff\u0003\u0002",
    "\u0002\u0002\u0115\u0101\u0003\u0002\u0002\u0002\u0115\u0103\u0003\u0002",
    "\u0002\u0002\u0115\u0104\u0003\u0002\u0002\u0002\u0115\u0108\u0003\u0002",
    "\u0002\u0002\u0116\u0017\u0003\u0002\u0002\u0002\u0117\u0118\u0007\"",
    "\u0002\u0002\u0118\u0119\u0005\u0004\u0003\u0002\u0119\u011a\u0007\t",
    "\u0002\u0002\u011a\u011c\u0003\u0002\u0002\u0002\u011b\u0117\u0003\u0002",
    "\u0002\u0002\u011b\u011c\u0003\u0002\u0002\u0002\u011c\u0120\u0003\u0002",
    "\u0002\u0002\u011d\u011f\u0005\n\u0006\u0002\u011e\u011d\u0003\u0002",
    "\u0002\u0002\u011f\u0122\u0003\u0002\u0002\u0002\u0120\u011e\u0003\u0002",
    "\u0002\u0002\u0120\u0121\u0003\u0002\u0002\u0002\u0121\u0123\u0003\u0002",
    "\u0002\u0002\u0122\u0120\u0003\u0002\u0002\u0002\u0123\u0124\u00070",
    "\u0002\u0002\u0124\u0019\u0003\u0002\u0002\u0002\u0125\u0126\t\u0006",
    "\u0002\u0002\u0126\u001b\u0003\u0002\u0002\u0002\u0127\u0128\t\u0007",
    "\u0002\u0002\u0128\u001d\u0003\u0002\u0002\u0002\u0016!&1:AIN\u00cd",
    "\u00d4\u00db\u00de\u00e6\u00eb\u00f2\u00fa\u010f\u0112\u0115\u011b\u0120"].join("");


var atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

var decisionsToDFA = atn.decisionToState.map( function(ds, index) { return new antlr4.dfa.DFA(ds, index); });

var sharedContextCache = new antlr4.PredictionContextCache();

var literalNames = [ null, "'true'", "'false'", "'num'", "'bool'", "':'", 
                     "','", "';'", "':='", "'('", "')'", "'<'", "'<='", 
                     "'+='", "'-='", "'*='", "'/='", "'%='", "'!='", "'=='", 
                     "'>'", "'>='", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", 
                     "'%'", "'++'", "'--'", "'function'", "'var'", "'print'", 
                     "'input'", "'when'", "'do'", "'if'", "'else'", "'unless'", 
                     "'while'", "'return'", "'until'", "'loop'", "'repeat'", 
                     "'for'", "'end'", "'next'", "'break'", "'and'", "'or'", 
                     "'not'" ];

var symbolicNames = [ null, null, null, null, null, "TK_DOSPUNTOS", "TK_COMA", 
                      "TK_PUNTOYCOMA", "TK_ASIGNACION", "TK_PAR_IZQ", "TK_PAR_DER", 
                      "TK_MENOR", "TK_MENOR_IGUAL", "TK_SUM_ASIG", "TK_RES_ASIG", 
                      "TK_MUL_ASIG", "TK_DIV_ASIG", "TK_MOD_ASIG", "TK_DIFERENTE", 
                      "TK_IGUALDAD", "TK_MAYOR", "TK_MAYOR_IGUAL", "TK_LLAVE_IZQ", 
                      "TK_LLAVE_DER", "TK_MAS", "TK_MENOS", "TK_MUL", "TK_DIV", 
                      "TK_MOD", "TK_INCREMENTO", "TK_DECREMENTO", "FUNCTION", 
                      "VAR", "PRINT", "INPUT", "WHEN", "DO", "IF", "ELSE", 
                      "UNLESS", "WHILE", "RETURN", "UNTIL", "LOOP", "REPEAT", 
                      "FOR", "END", "NEXT", "BREAK", "AND", "OR", "NOT", 
                      "NUM", "FID", "ID", "WS", "COMMENT" ];

var ruleNames =  [ "prog", "varDecl", "fndeclList", "stmtBlock", "stmt", 
                   "lexpr", "nexpr", "rexpr", "simpleExpr", "term", "factor", 
                   "mainProg", "bool", "datatype" ];

function BCCParser (input) {
	antlr4.Parser.call(this, input);
    this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
    this.ruleNames = ruleNames;
    this.literalNames = literalNames;
    this.symbolicNames = symbolicNames;
    return this;
}

BCCParser.prototype = Object.create(antlr4.Parser.prototype);
BCCParser.prototype.constructor = BCCParser;

Object.defineProperty(BCCParser.prototype, "atn", {
	get : function() {
		return atn;
	}
});

BCCParser.EOF = antlr4.Token.EOF;
BCCParser.T__0 = 1;
BCCParser.T__1 = 2;
BCCParser.T__2 = 3;
BCCParser.T__3 = 4;
BCCParser.TK_DOSPUNTOS = 5;
BCCParser.TK_COMA = 6;
BCCParser.TK_PUNTOYCOMA = 7;
BCCParser.TK_ASIGNACION = 8;
BCCParser.TK_PAR_IZQ = 9;
BCCParser.TK_PAR_DER = 10;
BCCParser.TK_MENOR = 11;
BCCParser.TK_MENOR_IGUAL = 12;
BCCParser.TK_SUM_ASIG = 13;
BCCParser.TK_RES_ASIG = 14;
BCCParser.TK_MUL_ASIG = 15;
BCCParser.TK_DIV_ASIG = 16;
BCCParser.TK_MOD_ASIG = 17;
BCCParser.TK_DIFERENTE = 18;
BCCParser.TK_IGUALDAD = 19;
BCCParser.TK_MAYOR = 20;
BCCParser.TK_MAYOR_IGUAL = 21;
BCCParser.TK_LLAVE_IZQ = 22;
BCCParser.TK_LLAVE_DER = 23;
BCCParser.TK_MAS = 24;
BCCParser.TK_MENOS = 25;
BCCParser.TK_MUL = 26;
BCCParser.TK_DIV = 27;
BCCParser.TK_MOD = 28;
BCCParser.TK_INCREMENTO = 29;
BCCParser.TK_DECREMENTO = 30;
BCCParser.FUNCTION = 31;
BCCParser.VAR = 32;
BCCParser.PRINT = 33;
BCCParser.INPUT = 34;
BCCParser.WHEN = 35;
BCCParser.DO = 36;
BCCParser.IF = 37;
BCCParser.ELSE = 38;
BCCParser.UNLESS = 39;
BCCParser.WHILE = 40;
BCCParser.RETURN = 41;
BCCParser.UNTIL = 42;
BCCParser.LOOP = 43;
BCCParser.REPEAT = 44;
BCCParser.FOR = 45;
BCCParser.END = 46;
BCCParser.NEXT = 47;
BCCParser.BREAK = 48;
BCCParser.AND = 49;
BCCParser.OR = 50;
BCCParser.NOT = 51;
BCCParser.NUM = 52;
BCCParser.FID = 53;
BCCParser.ID = 54;
BCCParser.WS = 55;
BCCParser.COMMENT = 56;

BCCParser.RULE_prog = 0;
BCCParser.RULE_varDecl = 1;
BCCParser.RULE_fndeclList = 2;
BCCParser.RULE_stmtBlock = 3;
BCCParser.RULE_stmt = 4;
BCCParser.RULE_lexpr = 5;
BCCParser.RULE_nexpr = 6;
BCCParser.RULE_rexpr = 7;
BCCParser.RULE_simpleExpr = 8;
BCCParser.RULE_term = 9;
BCCParser.RULE_factor = 10;
BCCParser.RULE_mainProg = 11;
BCCParser.RULE_bool = 12;
BCCParser.RULE_datatype = 13;


function ProgContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = BCCParser.RULE_prog;
    return this;
}

ProgContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ProgContext.prototype.constructor = ProgContext;

ProgContext.prototype.mainProg = function() {
    return this.getTypedRuleContext(MainProgContext,0);
};

ProgContext.prototype.fndeclList = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(FndeclListContext);
    } else {
        return this.getTypedRuleContext(FndeclListContext,i);
    }
};

ProgContext.prototype.EOF = function() {
    return this.getToken(BCCParser.EOF, 0);
};

ProgContext.prototype.enterRule = function(listener) {
    if(listener instanceof BCCListener ) {
        listener.enterProg(this);
	}
};

ProgContext.prototype.exitRule = function(listener) {
    if(listener instanceof BCCListener ) {
        listener.exitProg(this);
	}
};

ProgContext.prototype.accept = function(visitor) {
    if ( visitor instanceof BCCVisitor ) {
        return visitor.visitProg(this);
    } else {
        return visitor.visitChildren(this);
    }
};




BCCParser.ProgContext = ProgContext;

BCCParser.prototype.prog = function() {

    var localctx = new ProgContext(this, this._ctx, this.state);
    this.enterRule(localctx, 0, BCCParser.RULE_prog);
    var _la = 0; // Token type
    try {
        this.state = 36;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case BCCParser.TK_INCREMENTO:
        case BCCParser.TK_DECREMENTO:
        case BCCParser.FUNCTION:
        case BCCParser.VAR:
        case BCCParser.PRINT:
        case BCCParser.INPUT:
        case BCCParser.WHEN:
        case BCCParser.DO:
        case BCCParser.IF:
        case BCCParser.UNLESS:
        case BCCParser.WHILE:
        case BCCParser.RETURN:
        case BCCParser.UNTIL:
        case BCCParser.LOOP:
        case BCCParser.REPEAT:
        case BCCParser.FOR:
        case BCCParser.END:
        case BCCParser.NEXT:
        case BCCParser.BREAK:
        case BCCParser.ID:
            this.enterOuterAlt(localctx, 1);
            this.state = 31;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while(_la===BCCParser.FUNCTION) {
                this.state = 28;
                this.fndeclList();
                this.state = 33;
                this._errHandler.sync(this);
                _la = this._input.LA(1);
            }
            this.state = 34;
            this.mainProg();
            break;
        case BCCParser.EOF:
            this.enterOuterAlt(localctx, 2);
            this.state = 35;
            this.match(BCCParser.EOF);
            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function VarDeclContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = BCCParser.RULE_varDecl;
    return this;
}

VarDeclContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
VarDeclContext.prototype.constructor = VarDeclContext;

VarDeclContext.prototype.ID = function(i) {
	if(i===undefined) {
		i = null;
	}
    if(i===null) {
        return this.getTokens(BCCParser.ID);
    } else {
        return this.getToken(BCCParser.ID, i);
    }
};


VarDeclContext.prototype.TK_DOSPUNTOS = function(i) {
	if(i===undefined) {
		i = null;
	}
    if(i===null) {
        return this.getTokens(BCCParser.TK_DOSPUNTOS);
    } else {
        return this.getToken(BCCParser.TK_DOSPUNTOS, i);
    }
};


VarDeclContext.prototype.datatype = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(DatatypeContext);
    } else {
        return this.getTypedRuleContext(DatatypeContext,i);
    }
};

VarDeclContext.prototype.TK_COMA = function(i) {
	if(i===undefined) {
		i = null;
	}
    if(i===null) {
        return this.getTokens(BCCParser.TK_COMA);
    } else {
        return this.getToken(BCCParser.TK_COMA, i);
    }
};


VarDeclContext.prototype.enterRule = function(listener) {
    if(listener instanceof BCCListener ) {
        listener.enterVarDecl(this);
	}
};

VarDeclContext.prototype.exitRule = function(listener) {
    if(listener instanceof BCCListener ) {
        listener.exitVarDecl(this);
	}
};

VarDeclContext.prototype.accept = function(visitor) {
    if ( visitor instanceof BCCVisitor ) {
        return visitor.visitVarDecl(this);
    } else {
        return visitor.visitChildren(this);
    }
};




BCCParser.VarDeclContext = VarDeclContext;

BCCParser.prototype.varDecl = function() {

    var localctx = new VarDeclContext(this, this._ctx, this.state);
    this.enterRule(localctx, 2, BCCParser.RULE_varDecl);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 38;
        this.match(BCCParser.ID);
        this.state = 39;
        this.match(BCCParser.TK_DOSPUNTOS);
        this.state = 40;
        this.datatype();
        this.state = 47;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while(_la===BCCParser.TK_COMA) {
            this.state = 41;
            this.match(BCCParser.TK_COMA);
            this.state = 42;
            this.match(BCCParser.ID);
            this.state = 43;
            this.match(BCCParser.TK_DOSPUNTOS);
            this.state = 44;
            this.datatype();
            this.state = 49;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function FndeclListContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = BCCParser.RULE_fndeclList;
    return this;
}

FndeclListContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
FndeclListContext.prototype.constructor = FndeclListContext;

FndeclListContext.prototype.FUNCTION = function() {
    return this.getToken(BCCParser.FUNCTION, 0);
};

FndeclListContext.prototype.FID = function() {
    return this.getToken(BCCParser.FID, 0);
};

FndeclListContext.prototype.TK_DOSPUNTOS = function() {
    return this.getToken(BCCParser.TK_DOSPUNTOS, 0);
};

FndeclListContext.prototype.datatype = function() {
    return this.getTypedRuleContext(DatatypeContext,0);
};

FndeclListContext.prototype.TK_PAR_IZQ = function() {
    return this.getToken(BCCParser.TK_PAR_IZQ, 0);
};

FndeclListContext.prototype.TK_PAR_DER = function() {
    return this.getToken(BCCParser.TK_PAR_DER, 0);
};

FndeclListContext.prototype.stmtBlock = function() {
    return this.getTypedRuleContext(StmtBlockContext,0);
};

FndeclListContext.prototype.varDecl = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(VarDeclContext);
    } else {
        return this.getTypedRuleContext(VarDeclContext,i);
    }
};

FndeclListContext.prototype.VAR = function() {
    return this.getToken(BCCParser.VAR, 0);
};

FndeclListContext.prototype.TK_PUNTOYCOMA = function() {
    return this.getToken(BCCParser.TK_PUNTOYCOMA, 0);
};

FndeclListContext.prototype.enterRule = function(listener) {
    if(listener instanceof BCCListener ) {
        listener.enterFndeclList(this);
	}
};

FndeclListContext.prototype.exitRule = function(listener) {
    if(listener instanceof BCCListener ) {
        listener.exitFndeclList(this);
	}
};

FndeclListContext.prototype.accept = function(visitor) {
    if ( visitor instanceof BCCVisitor ) {
        return visitor.visitFndeclList(this);
    } else {
        return visitor.visitChildren(this);
    }
};




BCCParser.FndeclListContext = FndeclListContext;

BCCParser.prototype.fndeclList = function() {

    var localctx = new FndeclListContext(this, this._ctx, this.state);
    this.enterRule(localctx, 4, BCCParser.RULE_fndeclList);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 50;
        this.match(BCCParser.FUNCTION);
        this.state = 51;
        this.match(BCCParser.FID);
        this.state = 52;
        this.match(BCCParser.TK_DOSPUNTOS);
        this.state = 53;
        this.datatype();
        this.state = 54;
        this.match(BCCParser.TK_PAR_IZQ);
        this.state = 56;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        if(_la===BCCParser.ID) {
            this.state = 55;
            this.varDecl();
        }

        this.state = 58;
        this.match(BCCParser.TK_PAR_DER);
        this.state = 63;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        if(_la===BCCParser.VAR) {
            this.state = 59;
            this.match(BCCParser.VAR);
            this.state = 60;
            this.varDecl();
            this.state = 61;
            this.match(BCCParser.TK_PUNTOYCOMA);
        }

        this.state = 65;
        this.stmtBlock();
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function StmtBlockContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = BCCParser.RULE_stmtBlock;
    return this;
}

StmtBlockContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
StmtBlockContext.prototype.constructor = StmtBlockContext;

StmtBlockContext.prototype.TK_LLAVE_IZQ = function() {
    return this.getToken(BCCParser.TK_LLAVE_IZQ, 0);
};

StmtBlockContext.prototype.TK_LLAVE_DER = function() {
    return this.getToken(BCCParser.TK_LLAVE_DER, 0);
};

StmtBlockContext.prototype.stmt = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(StmtContext);
    } else {
        return this.getTypedRuleContext(StmtContext,i);
    }
};

StmtBlockContext.prototype.enterRule = function(listener) {
    if(listener instanceof BCCListener ) {
        listener.enterStmtBlock(this);
	}
};

StmtBlockContext.prototype.exitRule = function(listener) {
    if(listener instanceof BCCListener ) {
        listener.exitStmtBlock(this);
	}
};

StmtBlockContext.prototype.accept = function(visitor) {
    if ( visitor instanceof BCCVisitor ) {
        return visitor.visitStmtBlock(this);
    } else {
        return visitor.visitChildren(this);
    }
};




BCCParser.StmtBlockContext = StmtBlockContext;

BCCParser.prototype.stmtBlock = function() {

    var localctx = new StmtBlockContext(this, this._ctx, this.state);
    this.enterRule(localctx, 6, BCCParser.RULE_stmtBlock);
    var _la = 0; // Token type
    try {
        this.state = 76;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case BCCParser.TK_LLAVE_IZQ:
            this.enterOuterAlt(localctx, 1);
            this.state = 67;
            this.match(BCCParser.TK_LLAVE_IZQ);
            this.state = 69; 
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            do {
                this.state = 68;
                this.stmt();
                this.state = 71; 
                this._errHandler.sync(this);
                _la = this._input.LA(1);
            } while(((((_la - 29)) & ~0x1f) == 0 && ((1 << (_la - 29)) & ((1 << (BCCParser.TK_INCREMENTO - 29)) | (1 << (BCCParser.TK_DECREMENTO - 29)) | (1 << (BCCParser.PRINT - 29)) | (1 << (BCCParser.INPUT - 29)) | (1 << (BCCParser.WHEN - 29)) | (1 << (BCCParser.DO - 29)) | (1 << (BCCParser.IF - 29)) | (1 << (BCCParser.UNLESS - 29)) | (1 << (BCCParser.WHILE - 29)) | (1 << (BCCParser.RETURN - 29)) | (1 << (BCCParser.UNTIL - 29)) | (1 << (BCCParser.LOOP - 29)) | (1 << (BCCParser.REPEAT - 29)) | (1 << (BCCParser.FOR - 29)) | (1 << (BCCParser.NEXT - 29)) | (1 << (BCCParser.BREAK - 29)) | (1 << (BCCParser.ID - 29)))) !== 0));
            this.state = 73;
            this.match(BCCParser.TK_LLAVE_DER);
            break;
        case BCCParser.TK_INCREMENTO:
        case BCCParser.TK_DECREMENTO:
        case BCCParser.PRINT:
        case BCCParser.INPUT:
        case BCCParser.WHEN:
        case BCCParser.DO:
        case BCCParser.IF:
        case BCCParser.UNLESS:
        case BCCParser.WHILE:
        case BCCParser.RETURN:
        case BCCParser.UNTIL:
        case BCCParser.LOOP:
        case BCCParser.REPEAT:
        case BCCParser.FOR:
        case BCCParser.NEXT:
        case BCCParser.BREAK:
        case BCCParser.ID:
            this.enterOuterAlt(localctx, 2);
            this.state = 75;
            this.stmt();
            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function StmtContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = BCCParser.RULE_stmt;
    return this;
}

StmtContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
StmtContext.prototype.constructor = StmtContext;

StmtContext.prototype.PRINT = function() {
    return this.getToken(BCCParser.PRINT, 0);
};

StmtContext.prototype.lexpr = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(LexprContext);
    } else {
        return this.getTypedRuleContext(LexprContext,i);
    }
};

StmtContext.prototype.TK_PUNTOYCOMA = function(i) {
	if(i===undefined) {
		i = null;
	}
    if(i===null) {
        return this.getTokens(BCCParser.TK_PUNTOYCOMA);
    } else {
        return this.getToken(BCCParser.TK_PUNTOYCOMA, i);
    }
};


StmtContext.prototype.INPUT = function() {
    return this.getToken(BCCParser.INPUT, 0);
};

StmtContext.prototype.ID = function() {
    return this.getToken(BCCParser.ID, 0);
};

StmtContext.prototype.WHEN = function() {
    return this.getToken(BCCParser.WHEN, 0);
};

StmtContext.prototype.TK_PAR_IZQ = function() {
    return this.getToken(BCCParser.TK_PAR_IZQ, 0);
};

StmtContext.prototype.TK_PAR_DER = function() {
    return this.getToken(BCCParser.TK_PAR_DER, 0);
};

StmtContext.prototype.DO = function() {
    return this.getToken(BCCParser.DO, 0);
};

StmtContext.prototype.stmtBlock = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(StmtBlockContext);
    } else {
        return this.getTypedRuleContext(StmtBlockContext,i);
    }
};

StmtContext.prototype.IF = function() {
    return this.getToken(BCCParser.IF, 0);
};

StmtContext.prototype.ELSE = function() {
    return this.getToken(BCCParser.ELSE, 0);
};

StmtContext.prototype.UNLESS = function() {
    return this.getToken(BCCParser.UNLESS, 0);
};

StmtContext.prototype.WHILE = function() {
    return this.getToken(BCCParser.WHILE, 0);
};

StmtContext.prototype.RETURN = function() {
    return this.getToken(BCCParser.RETURN, 0);
};

StmtContext.prototype.UNTIL = function() {
    return this.getToken(BCCParser.UNTIL, 0);
};

StmtContext.prototype.LOOP = function() {
    return this.getToken(BCCParser.LOOP, 0);
};

StmtContext.prototype.REPEAT = function() {
    return this.getToken(BCCParser.REPEAT, 0);
};

StmtContext.prototype.NUM = function() {
    return this.getToken(BCCParser.NUM, 0);
};

StmtContext.prototype.TK_DOSPUNTOS = function() {
    return this.getToken(BCCParser.TK_DOSPUNTOS, 0);
};

StmtContext.prototype.FOR = function() {
    return this.getToken(BCCParser.FOR, 0);
};

StmtContext.prototype.NEXT = function() {
    return this.getToken(BCCParser.NEXT, 0);
};

StmtContext.prototype.BREAK = function() {
    return this.getToken(BCCParser.BREAK, 0);
};

StmtContext.prototype.TK_ASIGNACION = function() {
    return this.getToken(BCCParser.TK_ASIGNACION, 0);
};

StmtContext.prototype.TK_SUM_ASIG = function() {
    return this.getToken(BCCParser.TK_SUM_ASIG, 0);
};

StmtContext.prototype.TK_RES_ASIG = function() {
    return this.getToken(BCCParser.TK_RES_ASIG, 0);
};

StmtContext.prototype.TK_MUL_ASIG = function() {
    return this.getToken(BCCParser.TK_MUL_ASIG, 0);
};

StmtContext.prototype.TK_DIV_ASIG = function() {
    return this.getToken(BCCParser.TK_DIV_ASIG, 0);
};

StmtContext.prototype.TK_MOD_ASIG = function() {
    return this.getToken(BCCParser.TK_MOD_ASIG, 0);
};

StmtContext.prototype.TK_INCREMENTO = function() {
    return this.getToken(BCCParser.TK_INCREMENTO, 0);
};

StmtContext.prototype.TK_DECREMENTO = function() {
    return this.getToken(BCCParser.TK_DECREMENTO, 0);
};

StmtContext.prototype.enterRule = function(listener) {
    if(listener instanceof BCCListener ) {
        listener.enterStmt(this);
	}
};

StmtContext.prototype.exitRule = function(listener) {
    if(listener instanceof BCCListener ) {
        listener.exitStmt(this);
	}
};

StmtContext.prototype.accept = function(visitor) {
    if ( visitor instanceof BCCVisitor ) {
        return visitor.visitStmt(this);
    } else {
        return visitor.visitChildren(this);
    }
};




BCCParser.StmtContext = StmtContext;

BCCParser.prototype.stmt = function() {

    var localctx = new StmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 8, BCCParser.RULE_stmt);
    try {
        this.state = 203;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,7,this._ctx);
        switch(la_) {
        case 1:
            this.enterOuterAlt(localctx, 1);
            this.state = 78;
            this.match(BCCParser.PRINT);
            this.state = 79;
            this.lexpr();
            this.state = 80;
            this.match(BCCParser.TK_PUNTOYCOMA);
            break;

        case 2:
            this.enterOuterAlt(localctx, 2);
            this.state = 82;
            this.match(BCCParser.INPUT);
            this.state = 83;
            this.match(BCCParser.ID);
            this.state = 84;
            this.match(BCCParser.TK_PUNTOYCOMA);
            break;

        case 3:
            this.enterOuterAlt(localctx, 3);
            this.state = 85;
            this.match(BCCParser.WHEN);
            this.state = 86;
            this.match(BCCParser.TK_PAR_IZQ);
            this.state = 87;
            this.lexpr();
            this.state = 88;
            this.match(BCCParser.TK_PAR_DER);
            this.state = 89;
            this.match(BCCParser.DO);
            this.state = 90;
            this.stmtBlock();
            break;

        case 4:
            this.enterOuterAlt(localctx, 4);
            this.state = 92;
            this.match(BCCParser.IF);
            this.state = 93;
            this.match(BCCParser.TK_PAR_IZQ);
            this.state = 94;
            this.lexpr();
            this.state = 95;
            this.match(BCCParser.TK_PAR_DER);
            this.state = 96;
            this.match(BCCParser.DO);
            this.state = 97;
            this.stmtBlock();
            this.state = 98;
            this.match(BCCParser.ELSE);
            this.state = 99;
            this.stmtBlock();
            break;

        case 5:
            this.enterOuterAlt(localctx, 5);
            this.state = 101;
            this.match(BCCParser.UNLESS);
            this.state = 102;
            this.match(BCCParser.TK_PAR_IZQ);
            this.state = 103;
            this.lexpr();
            this.state = 104;
            this.match(BCCParser.TK_PAR_DER);
            this.state = 105;
            this.match(BCCParser.DO);
            this.state = 106;
            this.stmtBlock();
            break;

        case 6:
            this.enterOuterAlt(localctx, 6);
            this.state = 108;
            this.match(BCCParser.WHILE);
            this.state = 109;
            this.match(BCCParser.TK_PAR_IZQ);
            this.state = 110;
            this.lexpr();
            this.state = 111;
            this.match(BCCParser.TK_PAR_DER);
            this.state = 112;
            this.match(BCCParser.DO);
            this.state = 113;
            this.stmtBlock();
            break;

        case 7:
            this.enterOuterAlt(localctx, 7);
            this.state = 115;
            this.match(BCCParser.RETURN);
            this.state = 116;
            this.lexpr();
            this.state = 117;
            this.match(BCCParser.TK_PUNTOYCOMA);
            break;

        case 8:
            this.enterOuterAlt(localctx, 8);
            this.state = 119;
            this.match(BCCParser.UNTIL);
            this.state = 120;
            this.match(BCCParser.TK_PAR_IZQ);
            this.state = 121;
            this.lexpr();
            this.state = 122;
            this.match(BCCParser.TK_PAR_DER);
            this.state = 123;
            this.match(BCCParser.DO);
            this.state = 124;
            this.stmtBlock();
            break;

        case 9:
            this.enterOuterAlt(localctx, 9);
            this.state = 126;
            this.match(BCCParser.LOOP);
            this.state = 127;
            this.stmtBlock();
            break;

        case 10:
            this.enterOuterAlt(localctx, 10);
            this.state = 128;
            this.match(BCCParser.DO);
            this.state = 129;
            this.stmtBlock();
            this.state = 130;
            this.match(BCCParser.WHILE);
            this.state = 131;
            this.match(BCCParser.TK_PAR_IZQ);
            this.state = 132;
            this.lexpr();
            this.state = 133;
            this.match(BCCParser.TK_PAR_DER);
            break;

        case 11:
            this.enterOuterAlt(localctx, 11);
            this.state = 135;
            this.match(BCCParser.DO);
            this.state = 136;
            this.stmtBlock();
            this.state = 137;
            this.match(BCCParser.UNTIL);
            this.state = 138;
            this.match(BCCParser.TK_PAR_IZQ);
            this.state = 139;
            this.lexpr();
            this.state = 140;
            this.match(BCCParser.TK_PAR_DER);
            break;

        case 12:
            this.enterOuterAlt(localctx, 12);
            this.state = 142;
            this.match(BCCParser.REPEAT);
            this.state = 143;
            this.match(BCCParser.NUM);
            this.state = 144;
            this.match(BCCParser.TK_DOSPUNTOS);
            this.state = 145;
            this.stmtBlock();
            break;

        case 13:
            this.enterOuterAlt(localctx, 13);
            this.state = 146;
            this.match(BCCParser.FOR);
            this.state = 147;
            this.match(BCCParser.TK_PAR_IZQ);
            this.state = 148;
            this.lexpr();
            this.state = 149;
            this.match(BCCParser.TK_PUNTOYCOMA);
            this.state = 150;
            this.lexpr();
            this.state = 151;
            this.match(BCCParser.TK_PUNTOYCOMA);
            this.state = 152;
            this.lexpr();
            this.state = 153;
            this.match(BCCParser.TK_PAR_DER);
            this.state = 154;
            this.match(BCCParser.DO);
            this.state = 155;
            this.stmtBlock();
            break;

        case 14:
            this.enterOuterAlt(localctx, 14);
            this.state = 157;
            this.match(BCCParser.NEXT);
            this.state = 158;
            this.match(BCCParser.TK_PUNTOYCOMA);
            break;

        case 15:
            this.enterOuterAlt(localctx, 15);
            this.state = 159;
            this.match(BCCParser.BREAK);
            this.state = 160;
            this.match(BCCParser.TK_PUNTOYCOMA);
            break;

        case 16:
            this.enterOuterAlt(localctx, 16);
            this.state = 161;
            this.match(BCCParser.ID);
            this.state = 162;
            this.match(BCCParser.TK_ASIGNACION);
            this.state = 163;
            this.lexpr();
            this.state = 164;
            this.match(BCCParser.TK_PUNTOYCOMA);
            break;

        case 17:
            this.enterOuterAlt(localctx, 17);
            this.state = 166;
            this.match(BCCParser.ID);
            this.state = 167;
            this.match(BCCParser.TK_SUM_ASIG);
            this.state = 168;
            this.lexpr();
            this.state = 169;
            this.match(BCCParser.TK_PUNTOYCOMA);
            break;

        case 18:
            this.enterOuterAlt(localctx, 18);
            this.state = 171;
            this.match(BCCParser.ID);
            this.state = 172;
            this.match(BCCParser.TK_RES_ASIG);
            this.state = 173;
            this.lexpr();
            this.state = 174;
            this.match(BCCParser.TK_PUNTOYCOMA);
            break;

        case 19:
            this.enterOuterAlt(localctx, 19);
            this.state = 176;
            this.match(BCCParser.ID);
            this.state = 177;
            this.match(BCCParser.TK_MUL_ASIG);
            this.state = 178;
            this.lexpr();
            this.state = 179;
            this.match(BCCParser.TK_PUNTOYCOMA);
            break;

        case 20:
            this.enterOuterAlt(localctx, 20);
            this.state = 181;
            this.match(BCCParser.ID);
            this.state = 182;
            this.match(BCCParser.TK_DIV_ASIG);
            this.state = 183;
            this.lexpr();
            this.state = 184;
            this.match(BCCParser.TK_PUNTOYCOMA);
            break;

        case 21:
            this.enterOuterAlt(localctx, 21);
            this.state = 186;
            this.match(BCCParser.ID);
            this.state = 187;
            this.match(BCCParser.TK_MOD_ASIG);
            this.state = 188;
            this.lexpr();
            this.state = 189;
            this.match(BCCParser.TK_PUNTOYCOMA);
            break;

        case 22:
            this.enterOuterAlt(localctx, 22);
            this.state = 191;
            this.match(BCCParser.ID);
            this.state = 192;
            this.match(BCCParser.TK_INCREMENTO);
            this.state = 193;
            this.match(BCCParser.TK_PUNTOYCOMA);
            break;

        case 23:
            this.enterOuterAlt(localctx, 23);
            this.state = 194;
            this.match(BCCParser.ID);
            this.state = 195;
            this.match(BCCParser.TK_DECREMENTO);
            this.state = 196;
            this.match(BCCParser.TK_PUNTOYCOMA);
            break;

        case 24:
            this.enterOuterAlt(localctx, 24);
            this.state = 197;
            this.match(BCCParser.TK_DECREMENTO);
            this.state = 198;
            this.match(BCCParser.ID);
            this.state = 199;
            this.match(BCCParser.TK_PUNTOYCOMA);
            break;

        case 25:
            this.enterOuterAlt(localctx, 25);
            this.state = 200;
            this.match(BCCParser.TK_INCREMENTO);
            this.state = 201;
            this.match(BCCParser.ID);
            this.state = 202;
            this.match(BCCParser.TK_PUNTOYCOMA);
            break;

        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function LexprContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = BCCParser.RULE_lexpr;
    return this;
}

LexprContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
LexprContext.prototype.constructor = LexprContext;

LexprContext.prototype.nexpr = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(NexprContext);
    } else {
        return this.getTypedRuleContext(NexprContext,i);
    }
};

LexprContext.prototype.AND = function(i) {
	if(i===undefined) {
		i = null;
	}
    if(i===null) {
        return this.getTokens(BCCParser.AND);
    } else {
        return this.getToken(BCCParser.AND, i);
    }
};


LexprContext.prototype.OR = function(i) {
	if(i===undefined) {
		i = null;
	}
    if(i===null) {
        return this.getTokens(BCCParser.OR);
    } else {
        return this.getToken(BCCParser.OR, i);
    }
};


LexprContext.prototype.enterRule = function(listener) {
    if(listener instanceof BCCListener ) {
        listener.enterLexpr(this);
	}
};

LexprContext.prototype.exitRule = function(listener) {
    if(listener instanceof BCCListener ) {
        listener.exitLexpr(this);
	}
};

LexprContext.prototype.accept = function(visitor) {
    if ( visitor instanceof BCCVisitor ) {
        return visitor.visitLexpr(this);
    } else {
        return visitor.visitChildren(this);
    }
};




BCCParser.LexprContext = LexprContext;

BCCParser.prototype.lexpr = function() {

    var localctx = new LexprContext(this, this._ctx, this.state);
    this.enterRule(localctx, 10, BCCParser.RULE_lexpr);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 205;
        this.nexpr();
        this.state = 220;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,10,this._ctx);
        if(la_===1) {
            this.state = 210;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while(_la===BCCParser.AND) {
                this.state = 206;
                this.match(BCCParser.AND);
                this.state = 207;
                this.nexpr();
                this.state = 212;
                this._errHandler.sync(this);
                _la = this._input.LA(1);
            }

        } else if(la_===2) {
            this.state = 217;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while(_la===BCCParser.OR) {
                this.state = 213;
                this.match(BCCParser.OR);
                this.state = 214;
                this.nexpr();
                this.state = 219;
                this._errHandler.sync(this);
                _la = this._input.LA(1);
            }

        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function NexprContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = BCCParser.RULE_nexpr;
    return this;
}

NexprContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
NexprContext.prototype.constructor = NexprContext;

NexprContext.prototype.NOT = function() {
    return this.getToken(BCCParser.NOT, 0);
};

NexprContext.prototype.TK_PAR_IZQ = function() {
    return this.getToken(BCCParser.TK_PAR_IZQ, 0);
};

NexprContext.prototype.lexpr = function() {
    return this.getTypedRuleContext(LexprContext,0);
};

NexprContext.prototype.TK_PAR_DER = function() {
    return this.getToken(BCCParser.TK_PAR_DER, 0);
};

NexprContext.prototype.rexpr = function() {
    return this.getTypedRuleContext(RexprContext,0);
};

NexprContext.prototype.enterRule = function(listener) {
    if(listener instanceof BCCListener ) {
        listener.enterNexpr(this);
	}
};

NexprContext.prototype.exitRule = function(listener) {
    if(listener instanceof BCCListener ) {
        listener.exitNexpr(this);
	}
};

NexprContext.prototype.accept = function(visitor) {
    if ( visitor instanceof BCCVisitor ) {
        return visitor.visitNexpr(this);
    } else {
        return visitor.visitChildren(this);
    }
};




BCCParser.NexprContext = NexprContext;

BCCParser.prototype.nexpr = function() {

    var localctx = new NexprContext(this, this._ctx, this.state);
    this.enterRule(localctx, 12, BCCParser.RULE_nexpr);
    try {
        this.state = 228;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case BCCParser.NOT:
            this.enterOuterAlt(localctx, 1);
            this.state = 222;
            this.match(BCCParser.NOT);
            this.state = 223;
            this.match(BCCParser.TK_PAR_IZQ);
            this.state = 224;
            this.lexpr();
            this.state = 225;
            this.match(BCCParser.TK_PAR_DER);
            break;
        case BCCParser.T__0:
        case BCCParser.T__1:
        case BCCParser.TK_PAR_IZQ:
        case BCCParser.TK_INCREMENTO:
        case BCCParser.TK_DECREMENTO:
        case BCCParser.NUM:
        case BCCParser.FID:
        case BCCParser.ID:
            this.enterOuterAlt(localctx, 2);
            this.state = 227;
            this.rexpr();
            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function RexprContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = BCCParser.RULE_rexpr;
    return this;
}

RexprContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
RexprContext.prototype.constructor = RexprContext;

RexprContext.prototype.simpleExpr = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(SimpleExprContext);
    } else {
        return this.getTypedRuleContext(SimpleExprContext,i);
    }
};

RexprContext.prototype.TK_MENOR = function() {
    return this.getToken(BCCParser.TK_MENOR, 0);
};

RexprContext.prototype.TK_IGUALDAD = function() {
    return this.getToken(BCCParser.TK_IGUALDAD, 0);
};

RexprContext.prototype.TK_MENOR_IGUAL = function() {
    return this.getToken(BCCParser.TK_MENOR_IGUAL, 0);
};

RexprContext.prototype.TK_MAYOR = function() {
    return this.getToken(BCCParser.TK_MAYOR, 0);
};

RexprContext.prototype.TK_MAYOR_IGUAL = function() {
    return this.getToken(BCCParser.TK_MAYOR_IGUAL, 0);
};

RexprContext.prototype.TK_DIFERENTE = function() {
    return this.getToken(BCCParser.TK_DIFERENTE, 0);
};

RexprContext.prototype.enterRule = function(listener) {
    if(listener instanceof BCCListener ) {
        listener.enterRexpr(this);
	}
};

RexprContext.prototype.exitRule = function(listener) {
    if(listener instanceof BCCListener ) {
        listener.exitRexpr(this);
	}
};

RexprContext.prototype.accept = function(visitor) {
    if ( visitor instanceof BCCVisitor ) {
        return visitor.visitRexpr(this);
    } else {
        return visitor.visitChildren(this);
    }
};




BCCParser.RexprContext = RexprContext;

BCCParser.prototype.rexpr = function() {

    var localctx = new RexprContext(this, this._ctx, this.state);
    this.enterRule(localctx, 14, BCCParser.RULE_rexpr);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 230;
        this.simpleExpr();
        this.state = 233;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        if((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << BCCParser.TK_MENOR) | (1 << BCCParser.TK_MENOR_IGUAL) | (1 << BCCParser.TK_DIFERENTE) | (1 << BCCParser.TK_IGUALDAD) | (1 << BCCParser.TK_MAYOR) | (1 << BCCParser.TK_MAYOR_IGUAL))) !== 0)) {
            this.state = 231;
            _la = this._input.LA(1);
            if(!((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << BCCParser.TK_MENOR) | (1 << BCCParser.TK_MENOR_IGUAL) | (1 << BCCParser.TK_DIFERENTE) | (1 << BCCParser.TK_IGUALDAD) | (1 << BCCParser.TK_MAYOR) | (1 << BCCParser.TK_MAYOR_IGUAL))) !== 0))) {
            this._errHandler.recoverInline(this);
            }
            else {
            	this._errHandler.reportMatch(this);
                this.consume();
            }
            this.state = 232;
            this.simpleExpr();
        }

    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function SimpleExprContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = BCCParser.RULE_simpleExpr;
    return this;
}

SimpleExprContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
SimpleExprContext.prototype.constructor = SimpleExprContext;

SimpleExprContext.prototype.term = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(TermContext);
    } else {
        return this.getTypedRuleContext(TermContext,i);
    }
};

SimpleExprContext.prototype.TK_MAS = function(i) {
	if(i===undefined) {
		i = null;
	}
    if(i===null) {
        return this.getTokens(BCCParser.TK_MAS);
    } else {
        return this.getToken(BCCParser.TK_MAS, i);
    }
};


SimpleExprContext.prototype.TK_MENOS = function(i) {
	if(i===undefined) {
		i = null;
	}
    if(i===null) {
        return this.getTokens(BCCParser.TK_MENOS);
    } else {
        return this.getToken(BCCParser.TK_MENOS, i);
    }
};


SimpleExprContext.prototype.enterRule = function(listener) {
    if(listener instanceof BCCListener ) {
        listener.enterSimpleExpr(this);
	}
};

SimpleExprContext.prototype.exitRule = function(listener) {
    if(listener instanceof BCCListener ) {
        listener.exitSimpleExpr(this);
	}
};

SimpleExprContext.prototype.accept = function(visitor) {
    if ( visitor instanceof BCCVisitor ) {
        return visitor.visitSimpleExpr(this);
    } else {
        return visitor.visitChildren(this);
    }
};




BCCParser.SimpleExprContext = SimpleExprContext;

BCCParser.prototype.simpleExpr = function() {

    var localctx = new SimpleExprContext(this, this._ctx, this.state);
    this.enterRule(localctx, 16, BCCParser.RULE_simpleExpr);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 235;
        this.term();
        this.state = 240;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while(_la===BCCParser.TK_MAS || _la===BCCParser.TK_MENOS) {
            this.state = 236;
            _la = this._input.LA(1);
            if(!(_la===BCCParser.TK_MAS || _la===BCCParser.TK_MENOS)) {
            this._errHandler.recoverInline(this);
            }
            else {
            	this._errHandler.reportMatch(this);
                this.consume();
            }
            this.state = 237;
            this.term();
            this.state = 242;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function TermContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = BCCParser.RULE_term;
    return this;
}

TermContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
TermContext.prototype.constructor = TermContext;

TermContext.prototype.factor = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(FactorContext);
    } else {
        return this.getTypedRuleContext(FactorContext,i);
    }
};

TermContext.prototype.TK_MUL = function(i) {
	if(i===undefined) {
		i = null;
	}
    if(i===null) {
        return this.getTokens(BCCParser.TK_MUL);
    } else {
        return this.getToken(BCCParser.TK_MUL, i);
    }
};


TermContext.prototype.TK_DIV = function(i) {
	if(i===undefined) {
		i = null;
	}
    if(i===null) {
        return this.getTokens(BCCParser.TK_DIV);
    } else {
        return this.getToken(BCCParser.TK_DIV, i);
    }
};


TermContext.prototype.TK_MOD = function(i) {
	if(i===undefined) {
		i = null;
	}
    if(i===null) {
        return this.getTokens(BCCParser.TK_MOD);
    } else {
        return this.getToken(BCCParser.TK_MOD, i);
    }
};


TermContext.prototype.enterRule = function(listener) {
    if(listener instanceof BCCListener ) {
        listener.enterTerm(this);
	}
};

TermContext.prototype.exitRule = function(listener) {
    if(listener instanceof BCCListener ) {
        listener.exitTerm(this);
	}
};

TermContext.prototype.accept = function(visitor) {
    if ( visitor instanceof BCCVisitor ) {
        return visitor.visitTerm(this);
    } else {
        return visitor.visitChildren(this);
    }
};




BCCParser.TermContext = TermContext;

BCCParser.prototype.term = function() {

    var localctx = new TermContext(this, this._ctx, this.state);
    this.enterRule(localctx, 18, BCCParser.RULE_term);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 243;
        this.factor();
        this.state = 248;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << BCCParser.TK_MUL) | (1 << BCCParser.TK_DIV) | (1 << BCCParser.TK_MOD))) !== 0)) {
            this.state = 244;
            _la = this._input.LA(1);
            if(!((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << BCCParser.TK_MUL) | (1 << BCCParser.TK_DIV) | (1 << BCCParser.TK_MOD))) !== 0))) {
            this._errHandler.recoverInline(this);
            }
            else {
            	this._errHandler.reportMatch(this);
                this.consume();
            }
            this.state = 245;
            this.factor();
            this.state = 250;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function FactorContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = BCCParser.RULE_factor;
    return this;
}

FactorContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
FactorContext.prototype.constructor = FactorContext;

FactorContext.prototype.NUM = function() {
    return this.getToken(BCCParser.NUM, 0);
};

FactorContext.prototype.bool = function() {
    return this.getTypedRuleContext(BoolContext,0);
};

FactorContext.prototype.ID = function() {
    return this.getToken(BCCParser.ID, 0);
};

FactorContext.prototype.TK_INCREMENTO = function() {
    return this.getToken(BCCParser.TK_INCREMENTO, 0);
};

FactorContext.prototype.TK_DECREMENTO = function() {
    return this.getToken(BCCParser.TK_DECREMENTO, 0);
};

FactorContext.prototype.TK_PAR_IZQ = function() {
    return this.getToken(BCCParser.TK_PAR_IZQ, 0);
};

FactorContext.prototype.lexpr = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(LexprContext);
    } else {
        return this.getTypedRuleContext(LexprContext,i);
    }
};

FactorContext.prototype.TK_PAR_DER = function() {
    return this.getToken(BCCParser.TK_PAR_DER, 0);
};

FactorContext.prototype.FID = function() {
    return this.getToken(BCCParser.FID, 0);
};

FactorContext.prototype.TK_COMA = function(i) {
	if(i===undefined) {
		i = null;
	}
    if(i===null) {
        return this.getTokens(BCCParser.TK_COMA);
    } else {
        return this.getToken(BCCParser.TK_COMA, i);
    }
};


FactorContext.prototype.enterRule = function(listener) {
    if(listener instanceof BCCListener ) {
        listener.enterFactor(this);
	}
};

FactorContext.prototype.exitRule = function(listener) {
    if(listener instanceof BCCListener ) {
        listener.exitFactor(this);
	}
};

FactorContext.prototype.accept = function(visitor) {
    if ( visitor instanceof BCCVisitor ) {
        return visitor.visitFactor(this);
    } else {
        return visitor.visitChildren(this);
    }
};




BCCParser.FactorContext = FactorContext;

BCCParser.prototype.factor = function() {

    var localctx = new FactorContext(this, this._ctx, this.state);
    this.enterRule(localctx, 20, BCCParser.RULE_factor);
    var _la = 0; // Token type
    try {
        this.state = 275;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,17,this._ctx);
        switch(la_) {
        case 1:
            this.enterOuterAlt(localctx, 1);
            this.state = 251;
            this.match(BCCParser.NUM);
            break;

        case 2:
            this.enterOuterAlt(localctx, 2);
            this.state = 252;
            this.bool();
            break;

        case 3:
            this.enterOuterAlt(localctx, 3);
            this.state = 253;
            this.match(BCCParser.ID);
            this.state = 254;
            _la = this._input.LA(1);
            if(!(_la===BCCParser.TK_INCREMENTO || _la===BCCParser.TK_DECREMENTO)) {
            this._errHandler.recoverInline(this);
            }
            else {
            	this._errHandler.reportMatch(this);
                this.consume();
            }
            break;

        case 4:
            this.enterOuterAlt(localctx, 4);
            this.state = 255;
            _la = this._input.LA(1);
            if(!(_la===BCCParser.TK_INCREMENTO || _la===BCCParser.TK_DECREMENTO)) {
            this._errHandler.recoverInline(this);
            }
            else {
            	this._errHandler.reportMatch(this);
                this.consume();
            }
            this.state = 256;
            this.match(BCCParser.ID);
            break;

        case 5:
            this.enterOuterAlt(localctx, 5);
            this.state = 257;
            this.match(BCCParser.ID);
            break;

        case 6:
            this.enterOuterAlt(localctx, 6);
            this.state = 258;
            this.match(BCCParser.TK_PAR_IZQ);
            this.state = 259;
            this.lexpr();
            this.state = 260;
            this.match(BCCParser.TK_PAR_DER);
            break;

        case 7:
            this.enterOuterAlt(localctx, 7);
            this.state = 262;
            this.match(BCCParser.FID);
            this.state = 263;
            this.match(BCCParser.TK_PAR_IZQ);
            this.state = 272;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            if((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << BCCParser.T__0) | (1 << BCCParser.T__1) | (1 << BCCParser.TK_PAR_IZQ) | (1 << BCCParser.TK_INCREMENTO) | (1 << BCCParser.TK_DECREMENTO))) !== 0) || ((((_la - 51)) & ~0x1f) == 0 && ((1 << (_la - 51)) & ((1 << (BCCParser.NOT - 51)) | (1 << (BCCParser.NUM - 51)) | (1 << (BCCParser.FID - 51)) | (1 << (BCCParser.ID - 51)))) !== 0)) {
                this.state = 264;
                this.lexpr();
                this.state = 269;
                this._errHandler.sync(this);
                _la = this._input.LA(1);
                while(_la===BCCParser.TK_COMA) {
                    this.state = 265;
                    this.match(BCCParser.TK_COMA);
                    this.state = 266;
                    this.lexpr();
                    this.state = 271;
                    this._errHandler.sync(this);
                    _la = this._input.LA(1);
                }
            }

            this.state = 274;
            this.match(BCCParser.TK_PAR_DER);
            break;

        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function MainProgContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = BCCParser.RULE_mainProg;
    return this;
}

MainProgContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
MainProgContext.prototype.constructor = MainProgContext;

MainProgContext.prototype.END = function() {
    return this.getToken(BCCParser.END, 0);
};

MainProgContext.prototype.VAR = function() {
    return this.getToken(BCCParser.VAR, 0);
};

MainProgContext.prototype.varDecl = function() {
    return this.getTypedRuleContext(VarDeclContext,0);
};

MainProgContext.prototype.TK_PUNTOYCOMA = function() {
    return this.getToken(BCCParser.TK_PUNTOYCOMA, 0);
};

MainProgContext.prototype.stmt = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(StmtContext);
    } else {
        return this.getTypedRuleContext(StmtContext,i);
    }
};

MainProgContext.prototype.enterRule = function(listener) {
    if(listener instanceof BCCListener ) {
        listener.enterMainProg(this);
	}
};

MainProgContext.prototype.exitRule = function(listener) {
    if(listener instanceof BCCListener ) {
        listener.exitMainProg(this);
	}
};

MainProgContext.prototype.accept = function(visitor) {
    if ( visitor instanceof BCCVisitor ) {
        return visitor.visitMainProg(this);
    } else {
        return visitor.visitChildren(this);
    }
};




BCCParser.MainProgContext = MainProgContext;

BCCParser.prototype.mainProg = function() {

    var localctx = new MainProgContext(this, this._ctx, this.state);
    this.enterRule(localctx, 22, BCCParser.RULE_mainProg);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 281;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        if(_la===BCCParser.VAR) {
            this.state = 277;
            this.match(BCCParser.VAR);
            this.state = 278;
            this.varDecl();
            this.state = 279;
            this.match(BCCParser.TK_PUNTOYCOMA);
        }

        this.state = 286;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while(((((_la - 29)) & ~0x1f) == 0 && ((1 << (_la - 29)) & ((1 << (BCCParser.TK_INCREMENTO - 29)) | (1 << (BCCParser.TK_DECREMENTO - 29)) | (1 << (BCCParser.PRINT - 29)) | (1 << (BCCParser.INPUT - 29)) | (1 << (BCCParser.WHEN - 29)) | (1 << (BCCParser.DO - 29)) | (1 << (BCCParser.IF - 29)) | (1 << (BCCParser.UNLESS - 29)) | (1 << (BCCParser.WHILE - 29)) | (1 << (BCCParser.RETURN - 29)) | (1 << (BCCParser.UNTIL - 29)) | (1 << (BCCParser.LOOP - 29)) | (1 << (BCCParser.REPEAT - 29)) | (1 << (BCCParser.FOR - 29)) | (1 << (BCCParser.NEXT - 29)) | (1 << (BCCParser.BREAK - 29)) | (1 << (BCCParser.ID - 29)))) !== 0)) {
            this.state = 283;
            this.stmt();
            this.state = 288;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
        }
        this.state = 289;
        this.match(BCCParser.END);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function BoolContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = BCCParser.RULE_bool;
    return this;
}

BoolContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
BoolContext.prototype.constructor = BoolContext;


BoolContext.prototype.enterRule = function(listener) {
    if(listener instanceof BCCListener ) {
        listener.enterBool(this);
	}
};

BoolContext.prototype.exitRule = function(listener) {
    if(listener instanceof BCCListener ) {
        listener.exitBool(this);
	}
};

BoolContext.prototype.accept = function(visitor) {
    if ( visitor instanceof BCCVisitor ) {
        return visitor.visitBool(this);
    } else {
        return visitor.visitChildren(this);
    }
};




BCCParser.BoolContext = BoolContext;

BCCParser.prototype.bool = function() {

    var localctx = new BoolContext(this, this._ctx, this.state);
    this.enterRule(localctx, 24, BCCParser.RULE_bool);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 291;
        _la = this._input.LA(1);
        if(!(_la===BCCParser.T__0 || _la===BCCParser.T__1)) {
        this._errHandler.recoverInline(this);
        }
        else {
        	this._errHandler.reportMatch(this);
            this.consume();
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function DatatypeContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = BCCParser.RULE_datatype;
    return this;
}

DatatypeContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
DatatypeContext.prototype.constructor = DatatypeContext;


DatatypeContext.prototype.enterRule = function(listener) {
    if(listener instanceof BCCListener ) {
        listener.enterDatatype(this);
	}
};

DatatypeContext.prototype.exitRule = function(listener) {
    if(listener instanceof BCCListener ) {
        listener.exitDatatype(this);
	}
};

DatatypeContext.prototype.accept = function(visitor) {
    if ( visitor instanceof BCCVisitor ) {
        return visitor.visitDatatype(this);
    } else {
        return visitor.visitChildren(this);
    }
};




BCCParser.DatatypeContext = DatatypeContext;

BCCParser.prototype.datatype = function() {

    var localctx = new DatatypeContext(this, this._ctx, this.state);
    this.enterRule(localctx, 26, BCCParser.RULE_datatype);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 293;
        _la = this._input.LA(1);
        if(!(_la===BCCParser.T__2 || _la===BCCParser.T__3)) {
        this._errHandler.recoverInline(this);
        }
        else {
        	this._errHandler.reportMatch(this);
            this.consume();
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


exports.BCCParser = BCCParser;
