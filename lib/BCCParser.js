// Generated from grammars/BCC.g4 by ANTLR 4.8
// jshint ignore: start
var antlr4 = require('antlr4/index');
var BCCListener = require('./BCCListener').BCCListener;
var BCCVisitor = require('./BCCVisitor').BCCVisitor;

var grammarFileName = "BCC.g4";


var serializedATN = ["\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964",
    "\u00038\u0122\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004\u0004\t",
    "\u0004\u0004\u0005\t\u0005\u0004\u0006\t\u0006\u0004\u0007\t\u0007\u0004",
    "\b\t\b\u0004\t\t\t\u0004\n\t\n\u0004\u000b\t\u000b\u0004\f\t\f\u0004",
    "\r\t\r\u0003\u0002\u0007\u0002\u001c\n\u0002\f\u0002\u000e\u0002\u001f",
    "\u000b\u0002\u0003\u0002\u0003\u0002\u0005\u0002#\n\u0002\u0003\u0003",
    "\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003",
    "\u0007\u0003,\n\u0003\f\u0003\u000e\u0003/\u000b\u0003\u0003\u0004\u0003",
    "\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0005\u00047",
    "\n\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004",
    "\u0005\u0004>\n\u0004\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005",
    "\u0006\u0005D\n\u0005\r\u0005\u000e\u0005E\u0003\u0005\u0003\u0005\u0003",
    "\u0005\u0005\u0005K\n\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0003",
    "\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003",
    "\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003",
    "\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003",
    "\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003",
    "\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003",
    "\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003",
    "\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003",
    "\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003",
    "\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003",
    "\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003",
    "\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003",
    "\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003",
    "\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003",
    "\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003",
    "\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003",
    "\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003",
    "\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003",
    "\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003",
    "\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003",
    "\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003",
    "\u0006\u0003\u0006\u0005\u0006\u00ca\n\u0006\u0003\u0007\u0003\u0007",
    "\u0003\u0007\u0007\u0007\u00cf\n\u0007\f\u0007\u000e\u0007\u00d2\u000b",
    "\u0007\u0003\u0007\u0003\u0007\u0007\u0007\u00d6\n\u0007\f\u0007\u000e",
    "\u0007\u00d9\u000b\u0007\u0005\u0007\u00db\n\u0007\u0003\b\u0003\b\u0003",
    "\b\u0003\b\u0003\b\u0003\b\u0005\b\u00e3\n\b\u0003\t\u0003\t\u0003\t",
    "\u0005\t\u00e8\n\t\u0003\n\u0003\n\u0003\n\u0007\n\u00ed\n\n\f\n\u000e",
    "\n\u00f0\u000b\n\u0003\u000b\u0003\u000b\u0003\u000b\u0007\u000b\u00f5",
    "\n\u000b\f\u000b\u000e\u000b\u00f8\u000b\u000b\u0003\f\u0003\f\u0003",
    "\f\u0003\f\u0003\f\u0003\f\u0003\f\u0003\f\u0003\f\u0003\f\u0003\f\u0003",
    "\f\u0003\f\u0003\f\u0003\f\u0003\f\u0007\f\u010a\n\f\f\f\u000e\f\u010d",
    "\u000b\f\u0005\f\u010f\n\f\u0003\f\u0005\f\u0112\n\f\u0003\r\u0003\r",
    "\u0003\r\u0003\r\u0005\r\u0118\n\r\u0003\r\u0007\r\u011b\n\r\f\r\u000e",
    "\r\u011e\u000b\r\u0003\r\u0003\r\u0003\r\u0002\u0002\u000e\u0002\u0004",
    "\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0002\u0006\u0004\u0002",
    "\u000b\f\u0012\u0015\u0003\u0002\u0018\u0019\u0003\u0002\u001a\u001c",
    "\u0003\u0002\u001d\u001e\u0002\u0146\u0002\"\u0003\u0002\u0002\u0002",
    "\u0004$\u0003\u0002\u0002\u0002\u00060\u0003\u0002\u0002\u0002\bJ\u0003",
    "\u0002\u0002\u0002\n\u00c9\u0003\u0002\u0002\u0002\f\u00cb\u0003\u0002",
    "\u0002\u0002\u000e\u00e2\u0003\u0002\u0002\u0002\u0010\u00e4\u0003\u0002",
    "\u0002\u0002\u0012\u00e9\u0003\u0002\u0002\u0002\u0014\u00f1\u0003\u0002",
    "\u0002\u0002\u0016\u0111\u0003\u0002\u0002\u0002\u0018\u0117\u0003\u0002",
    "\u0002\u0002\u001a\u001c\u0005\u0006\u0004\u0002\u001b\u001a\u0003\u0002",
    "\u0002\u0002\u001c\u001f\u0003\u0002\u0002\u0002\u001d\u001b\u0003\u0002",
    "\u0002\u0002\u001d\u001e\u0003\u0002\u0002\u0002\u001e \u0003\u0002",
    "\u0002\u0002\u001f\u001d\u0003\u0002\u0002\u0002 #\u0005\u0018\r\u0002",
    "!#\u0007\u0002\u0002\u0003\"\u001d\u0003\u0002\u0002\u0002\"!\u0003",
    "\u0002\u0002\u0002#\u0003\u0003\u0002\u0002\u0002$%\u00076\u0002\u0002",
    "%&\u0007\u0005\u0002\u0002&-\u0007\u0004\u0002\u0002\'(\u0007\u0006",
    "\u0002\u0002()\u00076\u0002\u0002)*\u0007\u0005\u0002\u0002*,\u0007",
    "\u0004\u0002\u0002+\'\u0003\u0002\u0002\u0002,/\u0003\u0002\u0002\u0002",
    "-+\u0003\u0002\u0002\u0002-.\u0003\u0002\u0002\u0002.\u0005\u0003\u0002",
    "\u0002\u0002/-\u0003\u0002\u0002\u000201\u0007\u001f\u0002\u000212\u0007",
    "5\u0002\u000223\u0007\u0005\u0002\u000234\u0007\u0004\u0002\u000246",
    "\u0007\t\u0002\u000257\u0005\u0004\u0003\u000265\u0003\u0002\u0002\u0002",
    "67\u0003\u0002\u0002\u000278\u0003\u0002\u0002\u00028=\u0007\n\u0002",
    "\u00029:\u0007 \u0002\u0002:;\u0005\u0004\u0003\u0002;<\u0007\u0007",
    "\u0002\u0002<>\u0003\u0002\u0002\u0002=9\u0003\u0002\u0002\u0002=>\u0003",
    "\u0002\u0002\u0002>?\u0003\u0002\u0002\u0002?@\u0005\b\u0005\u0002@",
    "\u0007\u0003\u0002\u0002\u0002AC\u0007\u0016\u0002\u0002BD\u0005\n\u0006",
    "\u0002CB\u0003\u0002\u0002\u0002DE\u0003\u0002\u0002\u0002EC\u0003\u0002",
    "\u0002\u0002EF\u0003\u0002\u0002\u0002FG\u0003\u0002\u0002\u0002GH\u0007",
    "\u0017\u0002\u0002HK\u0003\u0002\u0002\u0002IK\u0005\n\u0006\u0002J",
    "A\u0003\u0002\u0002\u0002JI\u0003\u0002\u0002\u0002K\t\u0003\u0002\u0002",
    "\u0002LM\u0007!\u0002\u0002MN\u0005\f\u0007\u0002NO\u0007\u0007\u0002",
    "\u0002O\u00ca\u0003\u0002\u0002\u0002PQ\u0007\"\u0002\u0002QR\u0007",
    "6\u0002\u0002R\u00ca\u0007\u0007\u0002\u0002ST\u0007#\u0002\u0002TU",
    "\u0007\t\u0002\u0002UV\u0005\f\u0007\u0002VW\u0007\n\u0002\u0002WX\u0007",
    "$\u0002\u0002XY\u0005\b\u0005\u0002Y\u00ca\u0003\u0002\u0002\u0002Z",
    "[\u0007%\u0002\u0002[\\\u0007\t\u0002\u0002\\]\u0005\f\u0007\u0002]",
    "^\u0007\n\u0002\u0002^_\u0007$\u0002\u0002_`\u0005\b\u0005\u0002`a\u0007",
    "&\u0002\u0002ab\u0005\b\u0005\u0002b\u00ca\u0003\u0002\u0002\u0002c",
    "d\u0007\'\u0002\u0002de\u0007\t\u0002\u0002ef\u0005\f\u0007\u0002fg",
    "\u0007\n\u0002\u0002gh\u0007$\u0002\u0002hi\u0005\b\u0005\u0002i\u00ca",
    "\u0003\u0002\u0002\u0002jk\u0007(\u0002\u0002kl\u0007\t\u0002\u0002",
    "lm\u0005\f\u0007\u0002mn\u0007\n\u0002\u0002no\u0007$\u0002\u0002op",
    "\u0005\b\u0005\u0002p\u00ca\u0003\u0002\u0002\u0002qr\u0007)\u0002\u0002",
    "rs\u0005\f\u0007\u0002st\u0007\u0007\u0002\u0002t\u00ca\u0003\u0002",
    "\u0002\u0002uv\u0007*\u0002\u0002vw\u0007\t\u0002\u0002wx\u0005\f\u0007",
    "\u0002xy\u0007\n\u0002\u0002yz\u0007$\u0002\u0002z{\u0005\b\u0005\u0002",
    "{\u00ca\u0003\u0002\u0002\u0002|}\u0007+\u0002\u0002}\u00ca\u0005\b",
    "\u0005\u0002~\u007f\u0007$\u0002\u0002\u007f\u0080\u0005\b\u0005\u0002",
    "\u0080\u0081\u0007(\u0002\u0002\u0081\u0082\u0007\t\u0002\u0002\u0082",
    "\u0083\u0005\f\u0007\u0002\u0083\u0084\u0007\n\u0002\u0002\u0084\u00ca",
    "\u0003\u0002\u0002\u0002\u0085\u0086\u0007$\u0002\u0002\u0086\u0087",
    "\u0005\b\u0005\u0002\u0087\u0088\u0007*\u0002\u0002\u0088\u0089\u0007",
    "\t\u0002\u0002\u0089\u008a\u0005\f\u0007\u0002\u008a\u008b\u0007\n\u0002",
    "\u0002\u008b\u00ca\u0003\u0002\u0002\u0002\u008c\u008d\u0007,\u0002",
    "\u0002\u008d\u008e\u00074\u0002\u0002\u008e\u008f\u0007\u0005\u0002",
    "\u0002\u008f\u00ca\u0005\b\u0005\u0002\u0090\u0091\u0007-\u0002\u0002",
    "\u0091\u0092\u0007\t\u0002\u0002\u0092\u0093\u0005\f\u0007\u0002\u0093",
    "\u0094\u0007\u0007\u0002\u0002\u0094\u0095\u0005\f\u0007\u0002\u0095",
    "\u0096\u0007\u0007\u0002\u0002\u0096\u0097\u0005\f\u0007\u0002\u0097",
    "\u0098\u0007\n\u0002\u0002\u0098\u0099\u0007$\u0002\u0002\u0099\u009a",
    "\u0005\b\u0005\u0002\u009a\u00ca\u0003\u0002\u0002\u0002\u009b\u009c",
    "\u0007/\u0002\u0002\u009c\u00ca\u0007\u0007\u0002\u0002\u009d\u009e",
    "\u00070\u0002\u0002\u009e\u00ca\u0007\u0007\u0002\u0002\u009f\u00a0",
    "\u00076\u0002\u0002\u00a0\u00a1\u0007\b\u0002\u0002\u00a1\u00a2\u0005",
    "\f\u0007\u0002\u00a2\u00a3\u0007\u0007\u0002\u0002\u00a3\u00ca\u0003",
    "\u0002\u0002\u0002\u00a4\u00a5\u00076\u0002\u0002\u00a5\u00a6\u0007",
    "\r\u0002\u0002\u00a6\u00a7\u0005\f\u0007\u0002\u00a7\u00a8\u0007\u0007",
    "\u0002\u0002\u00a8\u00ca\u0003\u0002\u0002\u0002\u00a9\u00aa\u00076",
    "\u0002\u0002\u00aa\u00ab\u0007\u000e\u0002\u0002\u00ab\u00ac\u0005\f",
    "\u0007\u0002\u00ac\u00ad\u0007\u0007\u0002\u0002\u00ad\u00ca\u0003\u0002",
    "\u0002\u0002\u00ae\u00af\u00076\u0002\u0002\u00af\u00b0\u0007\u000f",
    "\u0002\u0002\u00b0\u00b1\u0005\f\u0007\u0002\u00b1\u00b2\u0007\u0007",
    "\u0002\u0002\u00b2\u00ca\u0003\u0002\u0002\u0002\u00b3\u00b4\u00076",
    "\u0002\u0002\u00b4\u00b5\u0007\u0010\u0002\u0002\u00b5\u00b6\u0005\f",
    "\u0007\u0002\u00b6\u00b7\u0007\u0007\u0002\u0002\u00b7\u00ca\u0003\u0002",
    "\u0002\u0002\u00b8\u00b9\u00076\u0002\u0002\u00b9\u00ba\u0007\u0011",
    "\u0002\u0002\u00ba\u00bb\u0005\f\u0007\u0002\u00bb\u00bc\u0007\u0007",
    "\u0002\u0002\u00bc\u00ca\u0003\u0002\u0002\u0002\u00bd\u00be\u00076",
    "\u0002\u0002\u00be\u00bf\u0007\u001d\u0002\u0002\u00bf\u00ca\u0007\u0007",
    "\u0002\u0002\u00c0\u00c1\u00076\u0002\u0002\u00c1\u00c2\u0007\u001e",
    "\u0002\u0002\u00c2\u00ca\u0007\u0007\u0002\u0002\u00c3\u00c4\u0007\u001e",
    "\u0002\u0002\u00c4\u00c5\u00076\u0002\u0002\u00c5\u00ca\u0007\u0007",
    "\u0002\u0002\u00c6\u00c7\u0007\u001d\u0002\u0002\u00c7\u00c8\u00076",
    "\u0002\u0002\u00c8\u00ca\u0007\u0007\u0002\u0002\u00c9L\u0003\u0002",
    "\u0002\u0002\u00c9P\u0003\u0002\u0002\u0002\u00c9S\u0003\u0002\u0002",
    "\u0002\u00c9Z\u0003\u0002\u0002\u0002\u00c9c\u0003\u0002\u0002\u0002",
    "\u00c9j\u0003\u0002\u0002\u0002\u00c9q\u0003\u0002\u0002\u0002\u00c9",
    "u\u0003\u0002\u0002\u0002\u00c9|\u0003\u0002\u0002\u0002\u00c9~\u0003",
    "\u0002\u0002\u0002\u00c9\u0085\u0003\u0002\u0002\u0002\u00c9\u008c\u0003",
    "\u0002\u0002\u0002\u00c9\u0090\u0003\u0002\u0002\u0002\u00c9\u009b\u0003",
    "\u0002\u0002\u0002\u00c9\u009d\u0003\u0002\u0002\u0002\u00c9\u009f\u0003",
    "\u0002\u0002\u0002\u00c9\u00a4\u0003\u0002\u0002\u0002\u00c9\u00a9\u0003",
    "\u0002\u0002\u0002\u00c9\u00ae\u0003\u0002\u0002\u0002\u00c9\u00b3\u0003",
    "\u0002\u0002\u0002\u00c9\u00b8\u0003\u0002\u0002\u0002\u00c9\u00bd\u0003",
    "\u0002\u0002\u0002\u00c9\u00c0\u0003\u0002\u0002\u0002\u00c9\u00c3\u0003",
    "\u0002\u0002\u0002\u00c9\u00c6\u0003\u0002\u0002\u0002\u00ca\u000b\u0003",
    "\u0002\u0002\u0002\u00cb\u00da\u0005\u000e\b\u0002\u00cc\u00cd\u0007",
    "1\u0002\u0002\u00cd\u00cf\u0005\u000e\b\u0002\u00ce\u00cc\u0003\u0002",
    "\u0002\u0002\u00cf\u00d2\u0003\u0002\u0002\u0002\u00d0\u00ce\u0003\u0002",
    "\u0002\u0002\u00d0\u00d1\u0003\u0002\u0002\u0002\u00d1\u00db\u0003\u0002",
    "\u0002\u0002\u00d2\u00d0\u0003\u0002\u0002\u0002\u00d3\u00d4\u00072",
    "\u0002\u0002\u00d4\u00d6\u0005\u000e\b\u0002\u00d5\u00d3\u0003\u0002",
    "\u0002\u0002\u00d6\u00d9\u0003\u0002\u0002\u0002\u00d7\u00d5\u0003\u0002",
    "\u0002\u0002\u00d7\u00d8\u0003\u0002\u0002\u0002\u00d8\u00db\u0003\u0002",
    "\u0002\u0002\u00d9\u00d7\u0003\u0002\u0002\u0002\u00da\u00d0\u0003\u0002",
    "\u0002\u0002\u00da\u00d7\u0003\u0002\u0002\u0002\u00da\u00db\u0003\u0002",
    "\u0002\u0002\u00db\r\u0003\u0002\u0002\u0002\u00dc\u00dd\u00073\u0002",
    "\u0002\u00dd\u00de\u0007\t\u0002\u0002\u00de\u00df\u0005\f\u0007\u0002",
    "\u00df\u00e0\u0007\n\u0002\u0002\u00e0\u00e3\u0003\u0002\u0002\u0002",
    "\u00e1\u00e3\u0005\u0010\t\u0002\u00e2\u00dc\u0003\u0002\u0002\u0002",
    "\u00e2\u00e1\u0003\u0002\u0002\u0002\u00e3\u000f\u0003\u0002\u0002\u0002",
    "\u00e4\u00e7\u0005\u0012\n\u0002\u00e5\u00e6\t\u0002\u0002\u0002\u00e6",
    "\u00e8\u0005\u0012\n\u0002\u00e7\u00e5\u0003\u0002\u0002\u0002\u00e7",
    "\u00e8\u0003\u0002\u0002\u0002\u00e8\u0011\u0003\u0002\u0002\u0002\u00e9",
    "\u00ee\u0005\u0014\u000b\u0002\u00ea\u00eb\t\u0003\u0002\u0002\u00eb",
    "\u00ed\u0005\u0014\u000b\u0002\u00ec\u00ea\u0003\u0002\u0002\u0002\u00ed",
    "\u00f0\u0003\u0002\u0002\u0002\u00ee\u00ec\u0003\u0002\u0002\u0002\u00ee",
    "\u00ef\u0003\u0002\u0002\u0002\u00ef\u0013\u0003\u0002\u0002\u0002\u00f0",
    "\u00ee\u0003\u0002\u0002\u0002\u00f1\u00f6\u0005\u0016\f\u0002\u00f2",
    "\u00f3\t\u0004\u0002\u0002\u00f3\u00f5\u0005\u0016\f\u0002\u00f4\u00f2",
    "\u0003\u0002\u0002\u0002\u00f5\u00f8\u0003\u0002\u0002\u0002\u00f6\u00f4",
    "\u0003\u0002\u0002\u0002\u00f6\u00f7\u0003\u0002\u0002\u0002\u00f7\u0015",
    "\u0003\u0002\u0002\u0002\u00f8\u00f6\u0003\u0002\u0002\u0002\u00f9\u0112",
    "\u00074\u0002\u0002\u00fa\u0112\u0007\u0003\u0002\u0002\u00fb\u00fc",
    "\u00076\u0002\u0002\u00fc\u0112\t\u0005\u0002\u0002\u00fd\u00fe\t\u0005",
    "\u0002\u0002\u00fe\u0112\u00076\u0002\u0002\u00ff\u0112\u00076\u0002",
    "\u0002\u0100\u0101\u0007\t\u0002\u0002\u0101\u0102\u0005\f\u0007\u0002",
    "\u0102\u0103\u0007\n\u0002\u0002\u0103\u0112\u0003\u0002\u0002\u0002",
    "\u0104\u0105\u00075\u0002\u0002\u0105\u010e\u0007\t\u0002\u0002\u0106",
    "\u010b\u0005\f\u0007\u0002\u0107\u0108\u0007\u0006\u0002\u0002\u0108",
    "\u010a\u0005\f\u0007\u0002\u0109\u0107\u0003\u0002\u0002\u0002\u010a",
    "\u010d\u0003\u0002\u0002\u0002\u010b\u0109\u0003\u0002\u0002\u0002\u010b",
    "\u010c\u0003\u0002\u0002\u0002\u010c\u010f\u0003\u0002\u0002\u0002\u010d",
    "\u010b\u0003\u0002\u0002\u0002\u010e\u0106\u0003\u0002\u0002\u0002\u010e",
    "\u010f\u0003\u0002\u0002\u0002\u010f\u0110\u0003\u0002\u0002\u0002\u0110",
    "\u0112\u0007\n\u0002\u0002\u0111\u00f9\u0003\u0002\u0002\u0002\u0111",
    "\u00fa\u0003\u0002\u0002\u0002\u0111\u00fb\u0003\u0002\u0002\u0002\u0111",
    "\u00fd\u0003\u0002\u0002\u0002\u0111\u00ff\u0003\u0002\u0002\u0002\u0111",
    "\u0100\u0003\u0002\u0002\u0002\u0111\u0104\u0003\u0002\u0002\u0002\u0112",
    "\u0017\u0003\u0002\u0002\u0002\u0113\u0114\u0007 \u0002\u0002\u0114",
    "\u0115\u0005\u0004\u0003\u0002\u0115\u0116\u0007\u0007\u0002\u0002\u0116",
    "\u0118\u0003\u0002\u0002\u0002\u0117\u0113\u0003\u0002\u0002\u0002\u0117",
    "\u0118\u0003\u0002\u0002\u0002\u0118\u011c\u0003\u0002\u0002\u0002\u0119",
    "\u011b\u0005\n\u0006\u0002\u011a\u0119\u0003\u0002\u0002\u0002\u011b",
    "\u011e\u0003\u0002\u0002\u0002\u011c\u011a\u0003\u0002\u0002\u0002\u011c",
    "\u011d\u0003\u0002\u0002\u0002\u011d\u011f\u0003\u0002\u0002\u0002\u011e",
    "\u011c\u0003\u0002\u0002\u0002\u011f\u0120\u0007.\u0002\u0002\u0120",
    "\u0019\u0003\u0002\u0002\u0002\u0016\u001d\"-6=EJ\u00c9\u00d0\u00d7",
    "\u00da\u00e2\u00e7\u00ee\u00f6\u010b\u010e\u0111\u0117\u011c"].join("");


var atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

var decisionsToDFA = atn.decisionToState.map( function(ds, index) { return new antlr4.dfa.DFA(ds, index); });

var sharedContextCache = new antlr4.PredictionContextCache();

var literalNames = [ null, null, null, "':'", "','", "';'", "':='", "'('", 
                     "')'", "'<'", "'<='", "'+='", "'-='", "'*='", "'/='", 
                     "'%='", "'!='", "'=='", "'>'", "'>='", "'{'", "'}'", 
                     "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", 
                     "'function'", "'var'", "'print'", "'input'", "'when'", 
                     "'do'", "'if'", "'else'", "'unless'", "'while'", "'return'", 
                     "'until'", "'loop'", "'repeat'", "'for'", "'end'", 
                     "'next'", "'break'", "'and'", "'or'", "'not'" ];

var symbolicNames = [ null, "BOOL", "DATATYPE", "TK_DOSPUNTOS", "TK_COMA", 
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
                   "mainProg" ];

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
BCCParser.BOOL = 1;
BCCParser.DATATYPE = 2;
BCCParser.TK_DOSPUNTOS = 3;
BCCParser.TK_COMA = 4;
BCCParser.TK_PUNTOYCOMA = 5;
BCCParser.TK_ASIGNACION = 6;
BCCParser.TK_PAR_IZQ = 7;
BCCParser.TK_PAR_DER = 8;
BCCParser.TK_MENOR = 9;
BCCParser.TK_MENOR_IGUAL = 10;
BCCParser.TK_SUM_ASIG = 11;
BCCParser.TK_RES_ASIG = 12;
BCCParser.TK_MUL_ASIG = 13;
BCCParser.TK_DIV_ASIG = 14;
BCCParser.TK_MOD_ASIG = 15;
BCCParser.TK_DIFERENTE = 16;
BCCParser.TK_IGUALDAD = 17;
BCCParser.TK_MAYOR = 18;
BCCParser.TK_MAYOR_IGUAL = 19;
BCCParser.TK_LLAVE_IZQ = 20;
BCCParser.TK_LLAVE_DER = 21;
BCCParser.TK_MAS = 22;
BCCParser.TK_MENOS = 23;
BCCParser.TK_MUL = 24;
BCCParser.TK_DIV = 25;
BCCParser.TK_MOD = 26;
BCCParser.TK_INCREMENTO = 27;
BCCParser.TK_DECREMENTO = 28;
BCCParser.FUNCTION = 29;
BCCParser.VAR = 30;
BCCParser.PRINT = 31;
BCCParser.INPUT = 32;
BCCParser.WHEN = 33;
BCCParser.DO = 34;
BCCParser.IF = 35;
BCCParser.ELSE = 36;
BCCParser.UNLESS = 37;
BCCParser.WHILE = 38;
BCCParser.RETURN = 39;
BCCParser.UNTIL = 40;
BCCParser.LOOP = 41;
BCCParser.REPEAT = 42;
BCCParser.FOR = 43;
BCCParser.END = 44;
BCCParser.NEXT = 45;
BCCParser.BREAK = 46;
BCCParser.AND = 47;
BCCParser.OR = 48;
BCCParser.NOT = 49;
BCCParser.NUM = 50;
BCCParser.FID = 51;
BCCParser.ID = 52;
BCCParser.WS = 53;
BCCParser.COMMENT = 54;

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
        this.state = 32;
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
            this.state = 27;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while(_la===BCCParser.FUNCTION) {
                this.state = 24;
                this.fndeclList();
                this.state = 29;
                this._errHandler.sync(this);
                _la = this._input.LA(1);
            }
            this.state = 30;
            this.mainProg();
            break;
        case BCCParser.EOF:
            this.enterOuterAlt(localctx, 2);
            this.state = 31;
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


VarDeclContext.prototype.DATATYPE = function(i) {
	if(i===undefined) {
		i = null;
	}
    if(i===null) {
        return this.getTokens(BCCParser.DATATYPE);
    } else {
        return this.getToken(BCCParser.DATATYPE, i);
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
        this.state = 34;
        this.match(BCCParser.ID);
        this.state = 35;
        this.match(BCCParser.TK_DOSPUNTOS);
        this.state = 36;
        this.match(BCCParser.DATATYPE);
        this.state = 43;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while(_la===BCCParser.TK_COMA) {
            this.state = 37;
            this.match(BCCParser.TK_COMA);
            this.state = 38;
            this.match(BCCParser.ID);
            this.state = 39;
            this.match(BCCParser.TK_DOSPUNTOS);
            this.state = 40;
            this.match(BCCParser.DATATYPE);
            this.state = 45;
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

FndeclListContext.prototype.DATATYPE = function() {
    return this.getToken(BCCParser.DATATYPE, 0);
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
        this.state = 46;
        this.match(BCCParser.FUNCTION);
        this.state = 47;
        this.match(BCCParser.FID);
        this.state = 48;
        this.match(BCCParser.TK_DOSPUNTOS);
        this.state = 49;
        this.match(BCCParser.DATATYPE);
        this.state = 50;
        this.match(BCCParser.TK_PAR_IZQ);
        this.state = 52;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        if(_la===BCCParser.ID) {
            this.state = 51;
            this.varDecl();
        }

        this.state = 54;
        this.match(BCCParser.TK_PAR_DER);
        this.state = 59;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        if(_la===BCCParser.VAR) {
            this.state = 55;
            this.match(BCCParser.VAR);
            this.state = 56;
            this.varDecl();
            this.state = 57;
            this.match(BCCParser.TK_PUNTOYCOMA);
        }

        this.state = 61;
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
        this.state = 72;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case BCCParser.TK_LLAVE_IZQ:
            this.enterOuterAlt(localctx, 1);
            this.state = 63;
            this.match(BCCParser.TK_LLAVE_IZQ);
            this.state = 65; 
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            do {
                this.state = 64;
                this.stmt();
                this.state = 67; 
                this._errHandler.sync(this);
                _la = this._input.LA(1);
            } while(((((_la - 27)) & ~0x1f) == 0 && ((1 << (_la - 27)) & ((1 << (BCCParser.TK_INCREMENTO - 27)) | (1 << (BCCParser.TK_DECREMENTO - 27)) | (1 << (BCCParser.PRINT - 27)) | (1 << (BCCParser.INPUT - 27)) | (1 << (BCCParser.WHEN - 27)) | (1 << (BCCParser.DO - 27)) | (1 << (BCCParser.IF - 27)) | (1 << (BCCParser.UNLESS - 27)) | (1 << (BCCParser.WHILE - 27)) | (1 << (BCCParser.RETURN - 27)) | (1 << (BCCParser.UNTIL - 27)) | (1 << (BCCParser.LOOP - 27)) | (1 << (BCCParser.REPEAT - 27)) | (1 << (BCCParser.FOR - 27)) | (1 << (BCCParser.NEXT - 27)) | (1 << (BCCParser.BREAK - 27)) | (1 << (BCCParser.ID - 27)))) !== 0));
            this.state = 69;
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
            this.state = 71;
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
        this.state = 199;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,7,this._ctx);
        switch(la_) {
        case 1:
            this.enterOuterAlt(localctx, 1);
            this.state = 74;
            this.match(BCCParser.PRINT);
            this.state = 75;
            this.lexpr();
            this.state = 76;
            this.match(BCCParser.TK_PUNTOYCOMA);
            break;

        case 2:
            this.enterOuterAlt(localctx, 2);
            this.state = 78;
            this.match(BCCParser.INPUT);
            this.state = 79;
            this.match(BCCParser.ID);
            this.state = 80;
            this.match(BCCParser.TK_PUNTOYCOMA);
            break;

        case 3:
            this.enterOuterAlt(localctx, 3);
            this.state = 81;
            this.match(BCCParser.WHEN);
            this.state = 82;
            this.match(BCCParser.TK_PAR_IZQ);
            this.state = 83;
            this.lexpr();
            this.state = 84;
            this.match(BCCParser.TK_PAR_DER);
            this.state = 85;
            this.match(BCCParser.DO);
            this.state = 86;
            this.stmtBlock();
            break;

        case 4:
            this.enterOuterAlt(localctx, 4);
            this.state = 88;
            this.match(BCCParser.IF);
            this.state = 89;
            this.match(BCCParser.TK_PAR_IZQ);
            this.state = 90;
            this.lexpr();
            this.state = 91;
            this.match(BCCParser.TK_PAR_DER);
            this.state = 92;
            this.match(BCCParser.DO);
            this.state = 93;
            this.stmtBlock();
            this.state = 94;
            this.match(BCCParser.ELSE);
            this.state = 95;
            this.stmtBlock();
            break;

        case 5:
            this.enterOuterAlt(localctx, 5);
            this.state = 97;
            this.match(BCCParser.UNLESS);
            this.state = 98;
            this.match(BCCParser.TK_PAR_IZQ);
            this.state = 99;
            this.lexpr();
            this.state = 100;
            this.match(BCCParser.TK_PAR_DER);
            this.state = 101;
            this.match(BCCParser.DO);
            this.state = 102;
            this.stmtBlock();
            break;

        case 6:
            this.enterOuterAlt(localctx, 6);
            this.state = 104;
            this.match(BCCParser.WHILE);
            this.state = 105;
            this.match(BCCParser.TK_PAR_IZQ);
            this.state = 106;
            this.lexpr();
            this.state = 107;
            this.match(BCCParser.TK_PAR_DER);
            this.state = 108;
            this.match(BCCParser.DO);
            this.state = 109;
            this.stmtBlock();
            break;

        case 7:
            this.enterOuterAlt(localctx, 7);
            this.state = 111;
            this.match(BCCParser.RETURN);
            this.state = 112;
            this.lexpr();
            this.state = 113;
            this.match(BCCParser.TK_PUNTOYCOMA);
            break;

        case 8:
            this.enterOuterAlt(localctx, 8);
            this.state = 115;
            this.match(BCCParser.UNTIL);
            this.state = 116;
            this.match(BCCParser.TK_PAR_IZQ);
            this.state = 117;
            this.lexpr();
            this.state = 118;
            this.match(BCCParser.TK_PAR_DER);
            this.state = 119;
            this.match(BCCParser.DO);
            this.state = 120;
            this.stmtBlock();
            break;

        case 9:
            this.enterOuterAlt(localctx, 9);
            this.state = 122;
            this.match(BCCParser.LOOP);
            this.state = 123;
            this.stmtBlock();
            break;

        case 10:
            this.enterOuterAlt(localctx, 10);
            this.state = 124;
            this.match(BCCParser.DO);
            this.state = 125;
            this.stmtBlock();
            this.state = 126;
            this.match(BCCParser.WHILE);
            this.state = 127;
            this.match(BCCParser.TK_PAR_IZQ);
            this.state = 128;
            this.lexpr();
            this.state = 129;
            this.match(BCCParser.TK_PAR_DER);
            break;

        case 11:
            this.enterOuterAlt(localctx, 11);
            this.state = 131;
            this.match(BCCParser.DO);
            this.state = 132;
            this.stmtBlock();
            this.state = 133;
            this.match(BCCParser.UNTIL);
            this.state = 134;
            this.match(BCCParser.TK_PAR_IZQ);
            this.state = 135;
            this.lexpr();
            this.state = 136;
            this.match(BCCParser.TK_PAR_DER);
            break;

        case 12:
            this.enterOuterAlt(localctx, 12);
            this.state = 138;
            this.match(BCCParser.REPEAT);
            this.state = 139;
            this.match(BCCParser.NUM);
            this.state = 140;
            this.match(BCCParser.TK_DOSPUNTOS);
            this.state = 141;
            this.stmtBlock();
            break;

        case 13:
            this.enterOuterAlt(localctx, 13);
            this.state = 142;
            this.match(BCCParser.FOR);
            this.state = 143;
            this.match(BCCParser.TK_PAR_IZQ);
            this.state = 144;
            this.lexpr();
            this.state = 145;
            this.match(BCCParser.TK_PUNTOYCOMA);
            this.state = 146;
            this.lexpr();
            this.state = 147;
            this.match(BCCParser.TK_PUNTOYCOMA);
            this.state = 148;
            this.lexpr();
            this.state = 149;
            this.match(BCCParser.TK_PAR_DER);
            this.state = 150;
            this.match(BCCParser.DO);
            this.state = 151;
            this.stmtBlock();
            break;

        case 14:
            this.enterOuterAlt(localctx, 14);
            this.state = 153;
            this.match(BCCParser.NEXT);
            this.state = 154;
            this.match(BCCParser.TK_PUNTOYCOMA);
            break;

        case 15:
            this.enterOuterAlt(localctx, 15);
            this.state = 155;
            this.match(BCCParser.BREAK);
            this.state = 156;
            this.match(BCCParser.TK_PUNTOYCOMA);
            break;

        case 16:
            this.enterOuterAlt(localctx, 16);
            this.state = 157;
            this.match(BCCParser.ID);
            this.state = 158;
            this.match(BCCParser.TK_ASIGNACION);
            this.state = 159;
            this.lexpr();
            this.state = 160;
            this.match(BCCParser.TK_PUNTOYCOMA);
            break;

        case 17:
            this.enterOuterAlt(localctx, 17);
            this.state = 162;
            this.match(BCCParser.ID);
            this.state = 163;
            this.match(BCCParser.TK_SUM_ASIG);
            this.state = 164;
            this.lexpr();
            this.state = 165;
            this.match(BCCParser.TK_PUNTOYCOMA);
            break;

        case 18:
            this.enterOuterAlt(localctx, 18);
            this.state = 167;
            this.match(BCCParser.ID);
            this.state = 168;
            this.match(BCCParser.TK_RES_ASIG);
            this.state = 169;
            this.lexpr();
            this.state = 170;
            this.match(BCCParser.TK_PUNTOYCOMA);
            break;

        case 19:
            this.enterOuterAlt(localctx, 19);
            this.state = 172;
            this.match(BCCParser.ID);
            this.state = 173;
            this.match(BCCParser.TK_MUL_ASIG);
            this.state = 174;
            this.lexpr();
            this.state = 175;
            this.match(BCCParser.TK_PUNTOYCOMA);
            break;

        case 20:
            this.enterOuterAlt(localctx, 20);
            this.state = 177;
            this.match(BCCParser.ID);
            this.state = 178;
            this.match(BCCParser.TK_DIV_ASIG);
            this.state = 179;
            this.lexpr();
            this.state = 180;
            this.match(BCCParser.TK_PUNTOYCOMA);
            break;

        case 21:
            this.enterOuterAlt(localctx, 21);
            this.state = 182;
            this.match(BCCParser.ID);
            this.state = 183;
            this.match(BCCParser.TK_MOD_ASIG);
            this.state = 184;
            this.lexpr();
            this.state = 185;
            this.match(BCCParser.TK_PUNTOYCOMA);
            break;

        case 22:
            this.enterOuterAlt(localctx, 22);
            this.state = 187;
            this.match(BCCParser.ID);
            this.state = 188;
            this.match(BCCParser.TK_INCREMENTO);
            this.state = 189;
            this.match(BCCParser.TK_PUNTOYCOMA);
            break;

        case 23:
            this.enterOuterAlt(localctx, 23);
            this.state = 190;
            this.match(BCCParser.ID);
            this.state = 191;
            this.match(BCCParser.TK_DECREMENTO);
            this.state = 192;
            this.match(BCCParser.TK_PUNTOYCOMA);
            break;

        case 24:
            this.enterOuterAlt(localctx, 24);
            this.state = 193;
            this.match(BCCParser.TK_DECREMENTO);
            this.state = 194;
            this.match(BCCParser.ID);
            this.state = 195;
            this.match(BCCParser.TK_PUNTOYCOMA);
            break;

        case 25:
            this.enterOuterAlt(localctx, 25);
            this.state = 196;
            this.match(BCCParser.TK_INCREMENTO);
            this.state = 197;
            this.match(BCCParser.ID);
            this.state = 198;
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
        this.state = 201;
        this.nexpr();
        this.state = 216;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,10,this._ctx);
        if(la_===1) {
            this.state = 206;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while(_la===BCCParser.AND) {
                this.state = 202;
                this.match(BCCParser.AND);
                this.state = 203;
                this.nexpr();
                this.state = 208;
                this._errHandler.sync(this);
                _la = this._input.LA(1);
            }

        } else if(la_===2) {
            this.state = 213;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while(_la===BCCParser.OR) {
                this.state = 209;
                this.match(BCCParser.OR);
                this.state = 210;
                this.nexpr();
                this.state = 215;
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
        this.state = 224;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case BCCParser.NOT:
            this.enterOuterAlt(localctx, 1);
            this.state = 218;
            this.match(BCCParser.NOT);
            this.state = 219;
            this.match(BCCParser.TK_PAR_IZQ);
            this.state = 220;
            this.lexpr();
            this.state = 221;
            this.match(BCCParser.TK_PAR_DER);
            break;
        case BCCParser.BOOL:
        case BCCParser.TK_PAR_IZQ:
        case BCCParser.TK_INCREMENTO:
        case BCCParser.TK_DECREMENTO:
        case BCCParser.NUM:
        case BCCParser.FID:
        case BCCParser.ID:
            this.enterOuterAlt(localctx, 2);
            this.state = 223;
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
        this.state = 226;
        this.simpleExpr();
        this.state = 229;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        if((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << BCCParser.TK_MENOR) | (1 << BCCParser.TK_MENOR_IGUAL) | (1 << BCCParser.TK_DIFERENTE) | (1 << BCCParser.TK_IGUALDAD) | (1 << BCCParser.TK_MAYOR) | (1 << BCCParser.TK_MAYOR_IGUAL))) !== 0)) {
            this.state = 227;
            _la = this._input.LA(1);
            if(!((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << BCCParser.TK_MENOR) | (1 << BCCParser.TK_MENOR_IGUAL) | (1 << BCCParser.TK_DIFERENTE) | (1 << BCCParser.TK_IGUALDAD) | (1 << BCCParser.TK_MAYOR) | (1 << BCCParser.TK_MAYOR_IGUAL))) !== 0))) {
            this._errHandler.recoverInline(this);
            }
            else {
            	this._errHandler.reportMatch(this);
                this.consume();
            }
            this.state = 228;
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
        this.state = 231;
        this.term();
        this.state = 236;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while(_la===BCCParser.TK_MAS || _la===BCCParser.TK_MENOS) {
            this.state = 232;
            _la = this._input.LA(1);
            if(!(_la===BCCParser.TK_MAS || _la===BCCParser.TK_MENOS)) {
            this._errHandler.recoverInline(this);
            }
            else {
            	this._errHandler.reportMatch(this);
                this.consume();
            }
            this.state = 233;
            this.term();
            this.state = 238;
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
        this.state = 239;
        this.factor();
        this.state = 244;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << BCCParser.TK_MUL) | (1 << BCCParser.TK_DIV) | (1 << BCCParser.TK_MOD))) !== 0)) {
            this.state = 240;
            _la = this._input.LA(1);
            if(!((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << BCCParser.TK_MUL) | (1 << BCCParser.TK_DIV) | (1 << BCCParser.TK_MOD))) !== 0))) {
            this._errHandler.recoverInline(this);
            }
            else {
            	this._errHandler.reportMatch(this);
                this.consume();
            }
            this.state = 241;
            this.factor();
            this.state = 246;
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

FactorContext.prototype.BOOL = function() {
    return this.getToken(BCCParser.BOOL, 0);
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
        this.state = 271;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,17,this._ctx);
        switch(la_) {
        case 1:
            this.enterOuterAlt(localctx, 1);
            this.state = 247;
            this.match(BCCParser.NUM);
            break;

        case 2:
            this.enterOuterAlt(localctx, 2);
            this.state = 248;
            this.match(BCCParser.BOOL);
            break;

        case 3:
            this.enterOuterAlt(localctx, 3);
            this.state = 249;
            this.match(BCCParser.ID);
            this.state = 250;
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
            this.state = 251;
            _la = this._input.LA(1);
            if(!(_la===BCCParser.TK_INCREMENTO || _la===BCCParser.TK_DECREMENTO)) {
            this._errHandler.recoverInline(this);
            }
            else {
            	this._errHandler.reportMatch(this);
                this.consume();
            }
            this.state = 252;
            this.match(BCCParser.ID);
            break;

        case 5:
            this.enterOuterAlt(localctx, 5);
            this.state = 253;
            this.match(BCCParser.ID);
            break;

        case 6:
            this.enterOuterAlt(localctx, 6);
            this.state = 254;
            this.match(BCCParser.TK_PAR_IZQ);
            this.state = 255;
            this.lexpr();
            this.state = 256;
            this.match(BCCParser.TK_PAR_DER);
            break;

        case 7:
            this.enterOuterAlt(localctx, 7);
            this.state = 258;
            this.match(BCCParser.FID);
            this.state = 259;
            this.match(BCCParser.TK_PAR_IZQ);
            this.state = 268;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            if((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << BCCParser.BOOL) | (1 << BCCParser.TK_PAR_IZQ) | (1 << BCCParser.TK_INCREMENTO) | (1 << BCCParser.TK_DECREMENTO))) !== 0) || ((((_la - 49)) & ~0x1f) == 0 && ((1 << (_la - 49)) & ((1 << (BCCParser.NOT - 49)) | (1 << (BCCParser.NUM - 49)) | (1 << (BCCParser.FID - 49)) | (1 << (BCCParser.ID - 49)))) !== 0)) {
                this.state = 260;
                this.lexpr();
                this.state = 265;
                this._errHandler.sync(this);
                _la = this._input.LA(1);
                while(_la===BCCParser.TK_COMA) {
                    this.state = 261;
                    this.match(BCCParser.TK_COMA);
                    this.state = 262;
                    this.lexpr();
                    this.state = 267;
                    this._errHandler.sync(this);
                    _la = this._input.LA(1);
                }
            }

            this.state = 270;
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
        this.state = 277;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        if(_la===BCCParser.VAR) {
            this.state = 273;
            this.match(BCCParser.VAR);
            this.state = 274;
            this.varDecl();
            this.state = 275;
            this.match(BCCParser.TK_PUNTOYCOMA);
        }

        this.state = 282;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while(((((_la - 27)) & ~0x1f) == 0 && ((1 << (_la - 27)) & ((1 << (BCCParser.TK_INCREMENTO - 27)) | (1 << (BCCParser.TK_DECREMENTO - 27)) | (1 << (BCCParser.PRINT - 27)) | (1 << (BCCParser.INPUT - 27)) | (1 << (BCCParser.WHEN - 27)) | (1 << (BCCParser.DO - 27)) | (1 << (BCCParser.IF - 27)) | (1 << (BCCParser.UNLESS - 27)) | (1 << (BCCParser.WHILE - 27)) | (1 << (BCCParser.RETURN - 27)) | (1 << (BCCParser.UNTIL - 27)) | (1 << (BCCParser.LOOP - 27)) | (1 << (BCCParser.REPEAT - 27)) | (1 << (BCCParser.FOR - 27)) | (1 << (BCCParser.NEXT - 27)) | (1 << (BCCParser.BREAK - 27)) | (1 << (BCCParser.ID - 27)))) !== 0)) {
            this.state = 279;
            this.stmt();
            this.state = 284;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
        }
        this.state = 285;
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


exports.BCCParser = BCCParser;
