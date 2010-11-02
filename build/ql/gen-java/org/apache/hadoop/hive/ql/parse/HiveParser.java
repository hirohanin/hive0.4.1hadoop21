// $ANTLR 3.0.1 /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g 2010-09-20 11:50:02

package org.apache.hadoop.hive.ql.parse;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class HiveParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "TOK_INSERT", "TOK_QUERY", "TOK_SELECT", "TOK_SELECTDI", "TOK_SELEXPR", "TOK_FROM", "TOK_TAB", "TOK_PARTSPEC", "TOK_PARTVAL", "TOK_DIR", "TOK_LOCAL_DIR", "TOK_TABREF", "TOK_SUBQUERY", "TOK_DESTINATION", "TOK_ALLCOLREF", "TOK_TABLE_OR_COL", "TOK_FUNCTION", "TOK_FUNCTIONDI", "TOK_WHERE", "TOK_OP_EQ", "TOK_OP_NE", "TOK_OP_LE", "TOK_OP_LT", "TOK_OP_GE", "TOK_OP_GT", "TOK_OP_DIV", "TOK_OP_ADD", "TOK_OP_SUB", "TOK_OP_MUL", "TOK_OP_MOD", "TOK_OP_BITAND", "TOK_OP_BITNOT", "TOK_OP_BITOR", "TOK_OP_BITXOR", "TOK_OP_AND", "TOK_OP_OR", "TOK_OP_NOT", "TOK_OP_LIKE", "TOK_TRUE", "TOK_FALSE", "TOK_TRANSFORM", "TOK_SERDE", "TOK_SERDENAME", "TOK_SERDEPROPS", "TOK_EXPLIST", "TOK_ALIASLIST", "TOK_GROUPBY", "TOK_ORDERBY", "TOK_CLUSTERBY", "TOK_DISTRIBUTEBY", "TOK_SORTBY", "TOK_UNION", "TOK_JOIN", "TOK_LEFTOUTERJOIN", "TOK_RIGHTOUTERJOIN", "TOK_FULLOUTERJOIN", "TOK_LOAD", "TOK_NULL", "TOK_ISNULL", "TOK_ISNOTNULL", "TOK_TINYINT", "TOK_SMALLINT", "TOK_INT", "TOK_BIGINT", "TOK_BOOLEAN", "TOK_FLOAT", "TOK_DOUBLE", "TOK_DATE", "TOK_DATETIME", "TOK_TIMESTAMP", "TOK_STRING", "TOK_LIST", "TOK_MAP", "TOK_CREATETABLE", "TOK_LIKETABLE", "TOK_DESCTABLE", "TOK_DESCFUNCTION", "TOK_ALTERTABLE_RENAME", "TOK_ALTERTABLE_ADDCOLS", "TOK_ALTERTABLE_REPLACECOLS", "TOK_ALTERTABLE_ADDPARTS", "TOK_ALTERTABLE_DROPPARTS", "TOK_ALTERTABLE_SERDEPROPERTIES", "TOK_ALTERTABLE_SERIALIZER", "TOK_ALTERTABLE_PROPERTIES", "TOK_MSCK", "TOK_SHOWTABLES", "TOK_SHOWFUNCTIONS", "TOK_SHOWPARTITIONS", "TOK_DROPTABLE", "TOK_TABCOLLIST", "TOK_TABCOL", "TOK_TABLECOMMENT", "TOK_TABLEPARTCOLS", "TOK_TABLEBUCKETS", "TOK_TABLEROWFORMAT", "TOK_TABLEROWFORMATFIELD", "TOK_TABLEROWFORMATCOLLITEMS", "TOK_TABLEROWFORMATMAPKEYS", "TOK_TABLEROWFORMATLINES", "TOK_TBLSEQUENCEFILE", "TOK_TBLTEXTFILE", "TOK_TBLRCFILE", "TOK_TABLEFILEFORMAT", "TOK_TABCOLNAME", "TOK_TABLELOCATION", "TOK_PARTITIONLOCATION", "TOK_TABLESAMPLE", "TOK_TMP_FILE", "TOK_TABSORTCOLNAMEASC", "TOK_TABSORTCOLNAMEDESC", "TOK_CHARSETLITERAL", "TOK_CREATEFUNCTION", "TOK_DROPFUNCTION", "TOK_EXPLAIN", "TOK_TABLESERIALIZER", "TOK_TABLEPROPERTIES", "TOK_TABLEPROPLIST", "TOK_TABTYPE", "TOK_LIMIT", "TOK_TABLEPROPERTY", "TOK_IFNOTEXISTS", "TOK_HINTLIST", "TOK_HINT", "TOK_MAPJOIN", "TOK_HINTARGLIST", "TOK_USERSCRIPTCOLNAMES", "TOK_USERSCRIPTCOLSCHEMA", "TOK_RECORDREADER", "KW_EXPLAIN", "KW_EXTENDED", "KW_LOAD", "KW_DATA", "KW_LOCAL", "KW_INPATH", "StringLiteral", "KW_OVERWRITE", "KW_INTO", "KW_TABLE", "KW_IF", "KW_NOT", "KW_EXISTS", "KW_CREATE", "KW_EXTERNAL", "Identifier", "KW_LIKE", "LPAREN", "RPAREN", "KW_DROP", "KW_ALTER", "KW_RENAME", "KW_TO", "KW_ADD", "KW_REPLACE", "KW_COLUMNS", "KW_LOCATION", "COMMA", "KW_SET", "KW_PROPERTIES", "KW_SERDE", "KW_WITH", "KW_SERDEPROPERTIES", "DOT", "KW_ELEM_TYPE", "KW_KEY_TYPE", "KW_VALUE_TYPE", "KW_DESCRIBE", "KW_FUNCTION", "KW_SHOW", "KW_TABLES", "KW_FUNCTIONS", "KW_PARTITIONS", "KW_MSCK", "KW_TEMPORARY", "KW_AS", "KW_COMMENT", "KW_PARTITIONED", "KW_BY", "KW_CLUSTERED", "KW_SORTED", "Number", "KW_BUCKETS", "KW_RECORDREADER", "KW_ROW", "KW_FORMAT", "KW_DELIMITED", "EQUAL", "KW_FIELDS", "KW_TERMINATED", "KW_ESCAPED", "KW_COLLECTION", "KW_ITEMS", "KW_MAP", "KW_KEYS", "KW_LINES", "KW_STORED", "KW_SEQUENCEFILE", "KW_TEXTFILE", "KW_RCFILE", "KW_INPUTFORMAT", "KW_OUTPUTFORMAT", "KW_ASC", "KW_DESC", "KW_TINYINT", "KW_SMALLINT", "KW_INT", "KW_BIGINT", "KW_BOOLEAN", "KW_FLOAT", "KW_DOUBLE", "KW_DATE", "KW_DATETIME", "KW_TIMESTAMP", "KW_STRING", "KW_ARRAY", "LESSTHAN", "GREATERTHAN", "KW_UNION", "KW_ALL", "KW_INSERT", "KW_DIRECTORY", "KW_LIMIT", "KW_SELECT", "KW_DISTINCT", "DIVIDE", "STAR", "PLUS", "KW_MAPJOIN", "KW_TRANSFORM", "KW_REDUCE", "KW_USING", "KW_FROM", "KW_ON", "KW_JOIN", "KW_LEFT", "KW_OUTER", "KW_RIGHT", "KW_FULL", "KW_TABLESAMPLE", "KW_BUCKET", "KW_OUT", "KW_OF", "KW_WHERE", "KW_GROUP", "KW_ORDER", "KW_CLUSTER", "KW_DISTRIBUTE", "KW_SORT", "KW_CAST", "KW_CASE", "KW_WHEN", "KW_THEN", "KW_ELSE", "KW_END", "CharSetName", "CharSetLiteral", "KW_NULL", "LSQUARE", "RSQUARE", "MINUS", "TILDE", "KW_IS", "BITWISEXOR", "MOD", "DIV", "AMPERSAND", "BITWISEOR", "NOTEQUAL", "LESSTHANOREQUALTO", "GREATERTHANOREQUALTO", "KW_RLIKE", "KW_REGEXP", "KW_AND", "KW_OR", "KW_TRUE", "KW_FALSE", "KW_PARTITION", "KW_CLUSTERSTATUS", "KW_UTC", "KW_UTCTIMESTAMP", "KW_LONG", "KW_DELETE", "KW_PLUS", "KW_MINUS", "KW_FETCH", "KW_INTERSECT", "KW_VIEW", "KW_IN", "KW_DATABASE", "KW_MATERIALIZED", "KW_SCHEMA", "KW_SCHEMAS", "KW_GRANT", "KW_REVOKE", "KW_SSL", "KW_UNDO", "KW_LOCK", "KW_UNLOCK", "KW_PROCEDURE", "KW_UNSIGNED", "KW_WHILE", "KW_READ", "KW_READS", "KW_PURGE", "KW_RANGE", "KW_ANALYZE", "KW_BEFORE", "KW_BETWEEN", "KW_BOTH", "KW_BINARY", "KW_CROSS", "KW_CONTINUE", "KW_CURSOR", "KW_TRIGGER", "COLON", "SEMICOLON", "LCURLY", "RCURLY", "QUESTION", "DOLLAR", "Letter", "HexDigit", "Digit", "Exponent", "RegexComponent", "WS", "COMMENT"
    };
    public static final int KW_ALTER=153;
    public static final int TOK_FUNCTIONDI=21;
    public static final int TOK_TABREF=15;
    public static final int KW_LIKE=149;
    public static final int KW_PARTITIONED=180;
    public static final int KW_JOIN=237;
    public static final int STAR=229;
    public static final int LSQUARE=261;
    public static final int KW_PLUS=286;
    public static final int MOD=267;
    public static final int KW_ITEMS=195;
    public static final int KW_FORMAT=188;
    public static final int TOK_OP_EQ=23;
    public static final int KW_ROW=187;
    public static final int TOK_OP_GT=28;
    public static final int TOK_ALTERTABLE_SERDEPROPERTIES=86;
    public static final int KW_REVOKE=297;
    public static final int KW_FLOAT=212;
    public static final int KW_BOTH=312;
    public static final int KW_DROP=152;
    public static final int EOF=-1;
    public static final int KW_EXPLAIN=133;
    public static final int KW_ASC=205;
    public static final int TOK_OP_GE=27;
    public static final int RPAREN=151;
    public static final int RegexComponent=328;
    public static final int TOK_OP_ADD=30;
    public static final int TOK_TABCOLNAME=108;
    public static final int KW_PARTITIONS=175;
    public static final int KW_RANGE=308;
    public static final int TOK_TABLESAMPLE=111;
    public static final int KW_THEN=255;
    public static final int TOK_FROM=9;
    public static final int TOK_QUERY=5;
    public static final int TOK_RIGHTOUTERJOIN=58;
    public static final int TOK_TINYINT=64;
    public static final int KW_TABLE=142;
    public static final int DIVIDE=228;
    public static final int KW_SCHEMA=294;
    public static final int TOK_ALTERTABLE_SERIALIZER=87;
    public static final int TOK_BIGINT=67;
    public static final int TOK_DESCFUNCTION=80;
    public static final int KW_ADD=156;
    public static final int TOK_ALTERTABLE_RENAME=81;
    public static final int LCURLY=320;
    public static final int SEMICOLON=319;
    public static final int TOK_TABCOL=95;
    public static final int KW_FETCH=288;
    public static final int KW_MATERIALIZED=293;
    public static final int KW_DELETE=285;
    public static final int KW_TRANSFORM=232;
    public static final int TOK_WHERE=22;
    public static final int TOK_TBLSEQUENCEFILE=104;
    public static final int WS=329;
    public static final int KW_SELECT=226;
    public static final int TOK_SELEXPR=8;
    public static final int TOK_TABLEROWFORMATFIELD=100;
    public static final int TOK_MAP=76;
    public static final int KW_REPLACE=157;
    public static final int KW_LOCK=300;
    public static final int KW_BUCKET=243;
    public static final int KW_GROUP=247;
    public static final int KW_LOAD=135;
    public static final int KW_TO=155;
    public static final int KW_BY=181;
    public static final int TOK_UNION=55;
    public static final int TOK_SELECT=6;
    public static final int TOK_OP_LIKE=41;
    public static final int KW_LOCAL=137;
    public static final int KW_DISTRIBUTE=250;
    public static final int KW_NOT=144;
    public static final int TOK_TABLEPROPLIST=121;
    public static final int KW_ELSE=256;
    public static final int TOK_TMP_FILE=112;
    public static final int KW_UTC=282;
    public static final int KW_INPATH=138;
    public static final int KW_OUT=244;
    public static final int KW_LINES=198;
    public static final int KW_AND=276;
    public static final int TOK_SUBQUERY=16;
    public static final int KW_CLUSTERSTATUS=281;
    public static final int CharSetName=258;
    public static final int KW_BOOLEAN=211;
    public static final int TOK_DOUBLE=70;
    public static final int KW_REGEXP=275;
    public static final int TOK_DROPFUNCTION=117;
    public static final int KW_DIRECTORY=224;
    public static final int TOK_DESCTABLE=79;
    public static final int TOK_DATETIME=72;
    public static final int HexDigit=325;
    public static final int KW_PARTITION=280;
    public static final int LPAREN=150;
    public static final int KW_SORT=251;
    public static final int KW_FROM=235;
    public static final int TOK_MAPJOIN=128;
    public static final int GREATERTHANOREQUALTO=273;
    public static final int KW_REDUCE=233;
    public static final int TOK_TIMESTAMP=73;
    public static final int TOK_IFNOTEXISTS=125;
    public static final int TOK_TBLTEXTFILE=105;
    public static final int KW_TERMINATED=192;
    public static final int TOK_TRUE=42;
    public static final int KW_READS=306;
    public static final int KW_SET=161;
    public static final int TOK_LOCAL_DIR=14;
    public static final int KW_IN=291;
    public static final int KW_SSL=298;
    public static final int PLUS=230;
    public static final int KW_INPUTFORMAT=203;
    public static final int KW_IS=265;
    public static final int KW_OUTER=239;
    public static final int TOK_TABSORTCOLNAMEDESC=114;
    public static final int KW_EXTENDED=134;
    public static final int TOK_LOAD=60;
    public static final int KW_IF=143;
    public static final int KW_LOCATION=159;
    public static final int KW_ORDER=248;
    public static final int KW_MSCK=176;
    public static final int TOK_TRANSFORM=44;
    public static final int KW_ALL=222;
    public static final int LESSTHAN=219;
    public static final int KW_DELIMITED=189;
    public static final int TOK_ISNULL=62;
    public static final int TOK_ALLCOLREF=18;
    public static final int TOK_FUNCTION=20;
    public static final int KW_WHEN=254;
    public static final int TOK_TABLEROWFORMATLINES=103;
    public static final int KW_FUNCTIONS=174;
    public static final int TOK_DIR=13;
    public static final int TOK_CREATEFUNCTION=116;
    public static final int AMPERSAND=269;
    public static final int TOK_SHOWTABLES=90;
    public static final int MINUS=263;
    public static final int KW_FIELDS=191;
    public static final int KW_SEQUENCEFILE=200;
    public static final int BITWISEOR=270;
    public static final int TOK_FALSE=43;
    public static final int KW_SERDEPROPERTIES=165;
    public static final int COLON=318;
    public static final int StringLiteral=139;
    public static final int KW_ANALYZE=309;
    public static final int TOK_TABLECOMMENT=96;
    public static final int CharSetLiteral=259;
    public static final int TOK_LIKETABLE=78;
    public static final int TOK_TABLE_OR_COL=19;
    public static final int KW_PROCEDURE=302;
    public static final int TOK_SMALLINT=65;
    public static final int TOK_OP_LT=26;
    public static final int TOK_ALTERTABLE_ADDPARTS=84;
    public static final int KW_CLUSTERED=182;
    public static final int KW_TABLESAMPLE=242;
    public static final int RCURLY=321;
    public static final int TOK_TABLEPROPERTY=124;
    public static final int KW_PURGE=307;
    public static final int TOK_FULLOUTERJOIN=59;
    public static final int KW_COMMENT=179;
    public static final int KW_USING=234;
    public static final int TOK_OP_LE=25;
    public static final int KW_NULL=260;
    public static final int TOK_OP_AND=38;
    public static final int DIV=268;
    public static final int TOK_OP_MOD=33;
    public static final int KW_DATABASE=292;
    public static final int TOK_MSCK=89;
    public static final int TOK_OP_BITXOR=37;
    public static final int TOK_HINTARGLIST=129;
    public static final int KW_SERDE=163;
    public static final int KW_TINYINT=207;
    public static final int KW_DATETIME=215;
    public static final int TOK_ALTERTABLE_ADDCOLS=82;
    public static final int KW_STRING=217;
    public static final int TOK_GROUPBY=50;
    public static final int KW_CROSS=314;
    public static final int KW_OUTPUTFORMAT=204;
    public static final int TOK_CHARSETLITERAL=115;
    public static final int TOK_TABLEPARTCOLS=97;
    public static final int KW_COLLECTION=194;
    public static final int KW_LONG=284;
    public static final int TOK_ALTERTABLE_DROPPARTS=85;
    public static final int KW_INSERT=223;
    public static final int TOK_SERDEPROPS=47;
    public static final int BITWISEXOR=266;
    public static final int TOK_NULL=61;
    public static final int TOK_OP_OR=39;
    public static final int TOK_DROPTABLE=93;
    public static final int KW_WHERE=246;
    public static final int TOK_TABLEROWFORMATMAPKEYS=102;
    public static final int Identifier=148;
    public static final int KW_EXISTS=145;
    public static final int TOK_OP_DIV=29;
    public static final int NOTEQUAL=271;
    public static final int TOK_PARTVAL=12;
    public static final int TOK_OP_NE=24;
    public static final int TOK_TABLEBUCKETS=98;
    public static final int KW_RLIKE=274;
    public static final int TOK_DATE=71;
    public static final int KW_SCHEMAS=295;
    public static final int TOK_OP_NOT=40;
    public static final int COMMENT=330;
    public static final int TOK_TABLEROWFORMAT=99;
    public static final int KW_OVERWRITE=140;
    public static final int KW_DISTINCT=227;
    public static final int GREATERTHAN=220;
    public static final int TOK_ISNOTNULL=63;
    public static final int TOK_SHOWPARTITIONS=92;
    public static final int KW_CLUSTER=249;
    public static final int KW_FUNCTION=171;
    public static final int TOK_EXPLIST=48;
    public static final int TOK_DISTRIBUTEBY=53;
    public static final int TOK_ALIASLIST=49;
    public static final int KW_ESCAPED=193;
    public static final int TOK_LIST=75;
    public static final int KW_INT=209;
    public static final int KW_SMALLINT=208;
    public static final int TOK_INSERT=4;
    public static final int TOK_TBLRCFILE=106;
    public static final int TOK_TABLEPROPERTIES=120;
    public static final int TOK_HINT=127;
    public static final int KW_TEXTFILE=201;
    public static final int TOK_USERSCRIPTCOLNAMES=130;
    public static final int TOK_SERDE=45;
    public static final int KW_RENAME=154;
    public static final int KW_LEFT=238;
    public static final int KW_KEYS=197;
    public static final int KW_VIEW=290;
    public static final int TOK_SHOWFUNCTIONS=91;
    public static final int KW_DOUBLE=213;
    public static final int TOK_TABLESERIALIZER=119;
    public static final int TOK_ALTERTABLE_REPLACECOLS=83;
    public static final int TOK_LEFTOUTERJOIN=57;
    public static final int KW_SORTED=183;
    public static final int KW_BINARY=313;
    public static final int KW_MAP=196;
    public static final int KW_ELEM_TYPE=167;
    public static final int TOK_STRING=74;
    public static final int KW_END=257;
    public static final int KW_FULL=241;
    public static final int TOK_CLUSTERBY=52;
    public static final int TOK_FLOAT=69;
    public static final int TOK_SERDENAME=46;
    public static final int TOK_SORTBY=54;
    public static final int LESSTHANOREQUALTO=272;
    public static final int TOK_PARTITIONLOCATION=110;
    public static final int KW_TABLES=173;
    public static final int KW_ARRAY=218;
    public static final int KW_BUCKETS=185;
    public static final int Letter=324;
    public static final int KW_CURSOR=316;
    public static final int DOLLAR=323;
    public static final int KW_TIMESTAMP=216;
    public static final int KW_UTCTIMESTAMP=283;
    public static final int KW_READ=305;
    public static final int TOK_SELECTDI=7;
    public static final int KW_COLUMNS=158;
    public static final int KW_UNLOCK=301;
    public static final int TOK_OP_MUL=32;
    public static final int KW_DESCRIBE=170;
    public static final int TOK_CREATETABLE=77;
    public static final int KW_DESC=206;
    public static final int KW_RCFILE=202;
    public static final int Exponent=327;
    public static final int KW_CREATE=146;
    public static final int KW_MAPJOIN=231;
    public static final int KW_TRUE=278;
    public static final int TOK_ALTERTABLE_PROPERTIES=88;
    public static final int KW_LIMIT=225;
    public static final int KW_WITH=164;
    public static final int KW_BIGINT=210;
    public static final int TOK_INT=66;
    public static final int KW_MINUS=287;
    public static final int KW_RIGHT=240;
    public static final int TOK_TABLEFILEFORMAT=107;
    public static final int KW_GRANT=296;
    public static final int TOK_ORDERBY=51;
    public static final int KW_EXTERNAL=147;
    public static final int Number=184;
    public static final int COMMA=160;
    public static final int KW_WHILE=304;
    public static final int EQUAL=190;
    public static final int TILDE=264;
    public static final int TOK_JOIN=56;
    public static final int KW_RECORDREADER=186;
    public static final int TOK_DESTINATION=17;
    public static final int TOK_OP_BITAND=34;
    public static final int DOT=166;
    public static final int KW_UNDO=299;
    public static final int TOK_TAB=10;
    public static final int KW_UNION=221;
    public static final int KW_TEMPORARY=177;
    public static final int KW_CAST=252;
    public static final int KW_FALSE=279;
    public static final int KW_INTERSECT=289;
    public static final int TOK_EXPLAIN=118;
    public static final int KW_TRIGGER=317;
    public static final int KW_CONTINUE=315;
    public static final int TOK_USERSCRIPTCOLSCHEMA=131;
    public static final int TOK_OP_BITOR=36;
    public static final int RSQUARE=262;
    public static final int Digit=326;
    public static final int KW_STORED=199;
    public static final int TOK_PARTSPEC=11;
    public static final int TOK_BOOLEAN=68;
    public static final int KW_UNSIGNED=303;
    public static final int KW_CASE=253;
    public static final int KW_DATA=136;
    public static final int TOK_LIMIT=123;
    public static final int TOK_TABSORTCOLNAMEASC=113;
    public static final int TOK_OP_BITNOT=35;
    public static final int KW_SHOW=172;
    public static final int KW_DATE=214;
    public static final int TOK_TABCOLLIST=94;
    public static final int TOK_TABTYPE=122;
    public static final int KW_INTO=141;
    public static final int QUESTION=322;
    public static final int TOK_HINTLIST=126;
    public static final int KW_OR=277;
    public static final int TOK_TABLEROWFORMATCOLLITEMS=101;
    public static final int KW_ON=236;
    public static final int KW_VALUE_TYPE=169;
    public static final int KW_AS=178;
    public static final int KW_BEFORE=310;
    public static final int KW_OF=245;
    public static final int KW_BETWEEN=311;
    public static final int KW_KEY_TYPE=168;
    public static final int TOK_OP_SUB=31;
    public static final int TOK_TABLELOCATION=109;
    public static final int TOK_RECORDREADER=132;
    public static final int KW_PROPERTIES=162;

        public HiveParser(TokenStream input) {
            super(input);
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g"; }

     
      Stack msgs = new Stack<String>();


    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start statement
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:163:1: statement : ( explainStatement EOF | execStatement EOF );
    public final statement_return statement() throws RecognitionException {
        statement_return retval = new statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF2=null;
        Token EOF4=null;
        explainStatement_return explainStatement1 = null;

        execStatement_return execStatement3 = null;


        CommonTree EOF2_tree=null;
        CommonTree EOF4_tree=null;

        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:164:2: ( explainStatement EOF | execStatement EOF )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==KW_EXPLAIN) ) {
                alt1=1;
            }
            else if ( (LA1_0==KW_LOAD||LA1_0==KW_CREATE||(LA1_0>=KW_DROP && LA1_0<=KW_ALTER)||LA1_0==KW_DESCRIBE||LA1_0==KW_SHOW||LA1_0==KW_MSCK||LA1_0==KW_MAP||LA1_0==KW_INSERT||LA1_0==KW_SELECT||LA1_0==KW_REDUCE||LA1_0==KW_FROM) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("163:1: statement : ( explainStatement EOF | execStatement EOF );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:164:4: explainStatement EOF
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_explainStatement_in_statement460);
                    explainStatement1=explainStatement();
                    _fsp--;

                    adaptor.addChild(root_0, explainStatement1.getTree());
                    EOF2=(Token)input.LT(1);
                    match(input,EOF,FOLLOW_EOF_in_statement462); 
                    EOF2_tree = (CommonTree)adaptor.create(EOF2);
                    adaptor.addChild(root_0, EOF2_tree);


                    }
                    break;
                case 2 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:165:4: execStatement EOF
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_execStatement_in_statement467);
                    execStatement3=execStatement();
                    _fsp--;

                    adaptor.addChild(root_0, execStatement3.getTree());
                    EOF4=(Token)input.LT(1);
                    match(input,EOF,FOLLOW_EOF_in_statement469); 
                    EOF4_tree = (CommonTree)adaptor.create(EOF4);
                    adaptor.addChild(root_0, EOF4_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end statement

    public static class explainStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start explainStatement
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:168:1: explainStatement : KW_EXPLAIN (isExtended= KW_EXTENDED )? execStatement -> ^( TOK_EXPLAIN execStatement ( $isExtended)? ) ;
    public final explainStatement_return explainStatement() throws RecognitionException {
        explainStatement_return retval = new explainStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token isExtended=null;
        Token KW_EXPLAIN5=null;
        execStatement_return execStatement6 = null;


        CommonTree isExtended_tree=null;
        CommonTree KW_EXPLAIN5_tree=null;
        RewriteRuleTokenStream stream_KW_EXTENDED=new RewriteRuleTokenStream(adaptor,"token KW_EXTENDED");
        RewriteRuleTokenStream stream_KW_EXPLAIN=new RewriteRuleTokenStream(adaptor,"token KW_EXPLAIN");
        RewriteRuleSubtreeStream stream_execStatement=new RewriteRuleSubtreeStream(adaptor,"rule execStatement");
         msgs.push("explain statement"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:171:2: ( KW_EXPLAIN (isExtended= KW_EXTENDED )? execStatement -> ^( TOK_EXPLAIN execStatement ( $isExtended)? ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:171:4: KW_EXPLAIN (isExtended= KW_EXTENDED )? execStatement
            {
            KW_EXPLAIN5=(Token)input.LT(1);
            match(input,KW_EXPLAIN,FOLLOW_KW_EXPLAIN_in_explainStatement490); 
            stream_KW_EXPLAIN.add(KW_EXPLAIN5);

            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:171:15: (isExtended= KW_EXTENDED )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==KW_EXTENDED) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:171:16: isExtended= KW_EXTENDED
                    {
                    isExtended=(Token)input.LT(1);
                    match(input,KW_EXTENDED,FOLLOW_KW_EXTENDED_in_explainStatement495); 
                    stream_KW_EXTENDED.add(isExtended);


                    }
                    break;

            }

            pushFollow(FOLLOW_execStatement_in_explainStatement499);
            execStatement6=execStatement();
            _fsp--;

            stream_execStatement.add(execStatement6.getTree());

            // AST REWRITE
            // elements: execStatement, isExtended
            // token labels: isExtended
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_isExtended=new RewriteRuleTokenStream(adaptor,"token isExtended",isExtended);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 171:55: -> ^( TOK_EXPLAIN execStatement ( $isExtended)? )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:171:58: ^( TOK_EXPLAIN execStatement ( $isExtended)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_EXPLAIN, "TOK_EXPLAIN"), root_1);

                adaptor.addChild(root_1, stream_execStatement.next());
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:171:86: ( $isExtended)?
                if ( stream_isExtended.hasNext() ) {
                    adaptor.addChild(root_1, stream_isExtended.next());

                }
                stream_isExtended.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end explainStatement

    public static class execStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start execStatement
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:174:1: execStatement : ( queryStatementExpression | loadStatement | ddlStatement );
    public final execStatement_return execStatement() throws RecognitionException {
        execStatement_return retval = new execStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        queryStatementExpression_return queryStatementExpression7 = null;

        loadStatement_return loadStatement8 = null;

        ddlStatement_return ddlStatement9 = null;



         msgs.push("statement"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:177:5: ( queryStatementExpression | loadStatement | ddlStatement )
            int alt3=3;
            switch ( input.LA(1) ) {
            case KW_MAP:
            case KW_INSERT:
            case KW_SELECT:
            case KW_REDUCE:
            case KW_FROM:
                {
                alt3=1;
                }
                break;
            case KW_LOAD:
                {
                alt3=2;
                }
                break;
            case KW_CREATE:
            case KW_DROP:
            case KW_ALTER:
            case KW_DESCRIBE:
            case KW_SHOW:
            case KW_MSCK:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("174:1: execStatement : ( queryStatementExpression | loadStatement | ddlStatement );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:177:7: queryStatementExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_queryStatementExpression_in_execStatement537);
                    queryStatementExpression7=queryStatementExpression();
                    _fsp--;

                    adaptor.addChild(root_0, queryStatementExpression7.getTree());

                    }
                    break;
                case 2 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:178:7: loadStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_loadStatement_in_execStatement545);
                    loadStatement8=loadStatement();
                    _fsp--;

                    adaptor.addChild(root_0, loadStatement8.getTree());

                    }
                    break;
                case 3 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:179:7: ddlStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_ddlStatement_in_execStatement553);
                    ddlStatement9=ddlStatement();
                    _fsp--;

                    adaptor.addChild(root_0, ddlStatement9.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end execStatement

    public static class loadStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start loadStatement
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:182:1: loadStatement : KW_LOAD KW_DATA (islocal= KW_LOCAL )? KW_INPATH (path= StringLiteral ) (isoverwrite= KW_OVERWRITE )? KW_INTO KW_TABLE (tab= tabName ) -> ^( TOK_LOAD $path $tab ( $islocal)? ( $isoverwrite)? ) ;
    public final loadStatement_return loadStatement() throws RecognitionException {
        loadStatement_return retval = new loadStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token islocal=null;
        Token path=null;
        Token isoverwrite=null;
        Token KW_LOAD10=null;
        Token KW_DATA11=null;
        Token KW_INPATH12=null;
        Token KW_INTO13=null;
        Token KW_TABLE14=null;
        tabName_return tab = null;


        CommonTree islocal_tree=null;
        CommonTree path_tree=null;
        CommonTree isoverwrite_tree=null;
        CommonTree KW_LOAD10_tree=null;
        CommonTree KW_DATA11_tree=null;
        CommonTree KW_INPATH12_tree=null;
        CommonTree KW_INTO13_tree=null;
        CommonTree KW_TABLE14_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_KW_INPATH=new RewriteRuleTokenStream(adaptor,"token KW_INPATH");
        RewriteRuleTokenStream stream_KW_INTO=new RewriteRuleTokenStream(adaptor,"token KW_INTO");
        RewriteRuleTokenStream stream_KW_LOCAL=new RewriteRuleTokenStream(adaptor,"token KW_LOCAL");
        RewriteRuleTokenStream stream_KW_OVERWRITE=new RewriteRuleTokenStream(adaptor,"token KW_OVERWRITE");
        RewriteRuleTokenStream stream_KW_TABLE=new RewriteRuleTokenStream(adaptor,"token KW_TABLE");
        RewriteRuleTokenStream stream_KW_LOAD=new RewriteRuleTokenStream(adaptor,"token KW_LOAD");
        RewriteRuleTokenStream stream_KW_DATA=new RewriteRuleTokenStream(adaptor,"token KW_DATA");
        RewriteRuleSubtreeStream stream_tabName=new RewriteRuleSubtreeStream(adaptor,"rule tabName");
         msgs.push("load statement"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:185:5: ( KW_LOAD KW_DATA (islocal= KW_LOCAL )? KW_INPATH (path= StringLiteral ) (isoverwrite= KW_OVERWRITE )? KW_INTO KW_TABLE (tab= tabName ) -> ^( TOK_LOAD $path $tab ( $islocal)? ( $isoverwrite)? ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:185:7: KW_LOAD KW_DATA (islocal= KW_LOCAL )? KW_INPATH (path= StringLiteral ) (isoverwrite= KW_OVERWRITE )? KW_INTO KW_TABLE (tab= tabName )
            {
            KW_LOAD10=(Token)input.LT(1);
            match(input,KW_LOAD,FOLLOW_KW_LOAD_in_loadStatement580); 
            stream_KW_LOAD.add(KW_LOAD10);

            KW_DATA11=(Token)input.LT(1);
            match(input,KW_DATA,FOLLOW_KW_DATA_in_loadStatement582); 
            stream_KW_DATA.add(KW_DATA11);

            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:185:23: (islocal= KW_LOCAL )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==KW_LOCAL) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:185:24: islocal= KW_LOCAL
                    {
                    islocal=(Token)input.LT(1);
                    match(input,KW_LOCAL,FOLLOW_KW_LOCAL_in_loadStatement587); 
                    stream_KW_LOCAL.add(islocal);


                    }
                    break;

            }

            KW_INPATH12=(Token)input.LT(1);
            match(input,KW_INPATH,FOLLOW_KW_INPATH_in_loadStatement591); 
            stream_KW_INPATH.add(KW_INPATH12);

            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:185:53: (path= StringLiteral )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:185:54: path= StringLiteral
            {
            path=(Token)input.LT(1);
            match(input,StringLiteral,FOLLOW_StringLiteral_in_loadStatement596); 
            stream_StringLiteral.add(path);


            }

            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:185:74: (isoverwrite= KW_OVERWRITE )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==KW_OVERWRITE) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:185:75: isoverwrite= KW_OVERWRITE
                    {
                    isoverwrite=(Token)input.LT(1);
                    match(input,KW_OVERWRITE,FOLLOW_KW_OVERWRITE_in_loadStatement602); 
                    stream_KW_OVERWRITE.add(isoverwrite);


                    }
                    break;

            }

            KW_INTO13=(Token)input.LT(1);
            match(input,KW_INTO,FOLLOW_KW_INTO_in_loadStatement606); 
            stream_KW_INTO.add(KW_INTO13);

            KW_TABLE14=(Token)input.LT(1);
            match(input,KW_TABLE,FOLLOW_KW_TABLE_in_loadStatement608); 
            stream_KW_TABLE.add(KW_TABLE14);

            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:185:119: (tab= tabName )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:185:120: tab= tabName
            {
            pushFollow(FOLLOW_tabName_in_loadStatement613);
            tab=tabName();
            _fsp--;

            stream_tabName.add(tab.getTree());

            }


            // AST REWRITE
            // elements: path, islocal, isoverwrite, tab
            // token labels: islocal, isoverwrite, path
            // rule labels: retval, tab
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_islocal=new RewriteRuleTokenStream(adaptor,"token islocal",islocal);
            RewriteRuleTokenStream stream_isoverwrite=new RewriteRuleTokenStream(adaptor,"token isoverwrite",isoverwrite);
            RewriteRuleTokenStream stream_path=new RewriteRuleTokenStream(adaptor,"token path",path);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_tab=new RewriteRuleSubtreeStream(adaptor,"token tab",tab!=null?tab.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 186:5: -> ^( TOK_LOAD $path $tab ( $islocal)? ( $isoverwrite)? )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:186:8: ^( TOK_LOAD $path $tab ( $islocal)? ( $isoverwrite)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_LOAD, "TOK_LOAD"), root_1);

                adaptor.addChild(root_1, stream_path.next());
                adaptor.addChild(root_1, stream_tab.next());
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:186:30: ( $islocal)?
                if ( stream_islocal.hasNext() ) {
                    adaptor.addChild(root_1, stream_islocal.next());

                }
                stream_islocal.reset();
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:186:40: ( $isoverwrite)?
                if ( stream_isoverwrite.hasNext() ) {
                    adaptor.addChild(root_1, stream_isoverwrite.next());

                }
                stream_isoverwrite.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end loadStatement

    public static class ddlStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ddlStatement
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:189:1: ddlStatement : ( createStatement | dropStatement | alterStatement | descStatement | showStatement | metastoreCheck | createFunctionStatement | dropFunctionStatement );
    public final ddlStatement_return ddlStatement() throws RecognitionException {
        ddlStatement_return retval = new ddlStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        createStatement_return createStatement15 = null;

        dropStatement_return dropStatement16 = null;

        alterStatement_return alterStatement17 = null;

        descStatement_return descStatement18 = null;

        showStatement_return showStatement19 = null;

        metastoreCheck_return metastoreCheck20 = null;

        createFunctionStatement_return createFunctionStatement21 = null;

        dropFunctionStatement_return dropFunctionStatement22 = null;



         msgs.push("ddl statement"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:192:5: ( createStatement | dropStatement | alterStatement | descStatement | showStatement | metastoreCheck | createFunctionStatement | dropFunctionStatement )
            int alt6=8;
            switch ( input.LA(1) ) {
            case KW_CREATE:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==KW_TEMPORARY) ) {
                    alt6=7;
                }
                else if ( (LA6_1==KW_TABLE||LA6_1==KW_EXTERNAL) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("189:1: ddlStatement : ( createStatement | dropStatement | alterStatement | descStatement | showStatement | metastoreCheck | createFunctionStatement | dropFunctionStatement );", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case KW_DROP:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==KW_TEMPORARY) ) {
                    alt6=8;
                }
                else if ( (LA6_2==KW_TABLE) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("189:1: ddlStatement : ( createStatement | dropStatement | alterStatement | descStatement | showStatement | metastoreCheck | createFunctionStatement | dropFunctionStatement );", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case KW_ALTER:
                {
                alt6=3;
                }
                break;
            case KW_DESCRIBE:
                {
                alt6=4;
                }
                break;
            case KW_SHOW:
                {
                alt6=5;
                }
                break;
            case KW_MSCK:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("189:1: ddlStatement : ( createStatement | dropStatement | alterStatement | descStatement | showStatement | metastoreCheck | createFunctionStatement | dropFunctionStatement );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:192:7: createStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_createStatement_in_ddlStatement666);
                    createStatement15=createStatement();
                    _fsp--;

                    adaptor.addChild(root_0, createStatement15.getTree());

                    }
                    break;
                case 2 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:193:7: dropStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_dropStatement_in_ddlStatement674);
                    dropStatement16=dropStatement();
                    _fsp--;

                    adaptor.addChild(root_0, dropStatement16.getTree());

                    }
                    break;
                case 3 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:194:7: alterStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_alterStatement_in_ddlStatement682);
                    alterStatement17=alterStatement();
                    _fsp--;

                    adaptor.addChild(root_0, alterStatement17.getTree());

                    }
                    break;
                case 4 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:195:7: descStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_descStatement_in_ddlStatement690);
                    descStatement18=descStatement();
                    _fsp--;

                    adaptor.addChild(root_0, descStatement18.getTree());

                    }
                    break;
                case 5 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:196:7: showStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_showStatement_in_ddlStatement698);
                    showStatement19=showStatement();
                    _fsp--;

                    adaptor.addChild(root_0, showStatement19.getTree());

                    }
                    break;
                case 6 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:197:7: metastoreCheck
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_metastoreCheck_in_ddlStatement706);
                    metastoreCheck20=metastoreCheck();
                    _fsp--;

                    adaptor.addChild(root_0, metastoreCheck20.getTree());

                    }
                    break;
                case 7 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:198:7: createFunctionStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_createFunctionStatement_in_ddlStatement714);
                    createFunctionStatement21=createFunctionStatement();
                    _fsp--;

                    adaptor.addChild(root_0, createFunctionStatement21.getTree());

                    }
                    break;
                case 8 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:199:7: dropFunctionStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_dropFunctionStatement_in_ddlStatement722);
                    dropFunctionStatement22=dropFunctionStatement();
                    _fsp--;

                    adaptor.addChild(root_0, dropFunctionStatement22.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end ddlStatement

    public static class ifNotExists_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ifNotExists
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:202:1: ifNotExists : KW_IF KW_NOT KW_EXISTS -> ^( TOK_IFNOTEXISTS ) ;
    public final ifNotExists_return ifNotExists() throws RecognitionException {
        ifNotExists_return retval = new ifNotExists_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_IF23=null;
        Token KW_NOT24=null;
        Token KW_EXISTS25=null;

        CommonTree KW_IF23_tree=null;
        CommonTree KW_NOT24_tree=null;
        CommonTree KW_EXISTS25_tree=null;
        RewriteRuleTokenStream stream_KW_IF=new RewriteRuleTokenStream(adaptor,"token KW_IF");
        RewriteRuleTokenStream stream_KW_NOT=new RewriteRuleTokenStream(adaptor,"token KW_NOT");
        RewriteRuleTokenStream stream_KW_EXISTS=new RewriteRuleTokenStream(adaptor,"token KW_EXISTS");

         msgs.push("if not exists clause"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:205:5: ( KW_IF KW_NOT KW_EXISTS -> ^( TOK_IFNOTEXISTS ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:205:7: KW_IF KW_NOT KW_EXISTS
            {
            KW_IF23=(Token)input.LT(1);
            match(input,KW_IF,FOLLOW_KW_IF_in_ifNotExists749); 
            stream_KW_IF.add(KW_IF23);

            KW_NOT24=(Token)input.LT(1);
            match(input,KW_NOT,FOLLOW_KW_NOT_in_ifNotExists751); 
            stream_KW_NOT.add(KW_NOT24);

            KW_EXISTS25=(Token)input.LT(1);
            match(input,KW_EXISTS,FOLLOW_KW_EXISTS_in_ifNotExists753); 
            stream_KW_EXISTS.add(KW_EXISTS25);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 206:5: -> ^( TOK_IFNOTEXISTS )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:206:8: ^( TOK_IFNOTEXISTS )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_IFNOTEXISTS, "TOK_IFNOTEXISTS"), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end ifNotExists

    public static class createStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start createStatement
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:209:1: createStatement : KW_CREATE (ext= KW_EXTERNAL )? KW_TABLE ( ifNotExists )? name= Identifier (like= KW_LIKE likeName= Identifier | ( LPAREN columnNameTypeList RPAREN )? ( tableComment )? ( tablePartition )? ( tableBuckets )? ( tableRowFormat )? ( tableFileFormat )? ) ( tableLocation )? -> ^( TOK_CREATETABLE $name ( $ext)? ( ifNotExists )? ^( TOK_LIKETABLE ( $likeName)? ) ( columnNameTypeList )? ( tableComment )? ( tablePartition )? ( tableBuckets )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ) ;
    public final createStatement_return createStatement() throws RecognitionException {
        createStatement_return retval = new createStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ext=null;
        Token name=null;
        Token like=null;
        Token likeName=null;
        Token KW_CREATE26=null;
        Token KW_TABLE27=null;
        Token LPAREN29=null;
        Token RPAREN31=null;
        ifNotExists_return ifNotExists28 = null;

        columnNameTypeList_return columnNameTypeList30 = null;

        tableComment_return tableComment32 = null;

        tablePartition_return tablePartition33 = null;

        tableBuckets_return tableBuckets34 = null;

        tableRowFormat_return tableRowFormat35 = null;

        tableFileFormat_return tableFileFormat36 = null;

        tableLocation_return tableLocation37 = null;


        CommonTree ext_tree=null;
        CommonTree name_tree=null;
        CommonTree like_tree=null;
        CommonTree likeName_tree=null;
        CommonTree KW_CREATE26_tree=null;
        CommonTree KW_TABLE27_tree=null;
        CommonTree LPAREN29_tree=null;
        CommonTree RPAREN31_tree=null;
        RewriteRuleTokenStream stream_KW_CREATE=new RewriteRuleTokenStream(adaptor,"token KW_CREATE");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_KW_LIKE=new RewriteRuleTokenStream(adaptor,"token KW_LIKE");
        RewriteRuleTokenStream stream_KW_EXTERNAL=new RewriteRuleTokenStream(adaptor,"token KW_EXTERNAL");
        RewriteRuleTokenStream stream_KW_TABLE=new RewriteRuleTokenStream(adaptor,"token KW_TABLE");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_columnNameTypeList=new RewriteRuleSubtreeStream(adaptor,"rule columnNameTypeList");
        RewriteRuleSubtreeStream stream_tableBuckets=new RewriteRuleSubtreeStream(adaptor,"rule tableBuckets");
        RewriteRuleSubtreeStream stream_tablePartition=new RewriteRuleSubtreeStream(adaptor,"rule tablePartition");
        RewriteRuleSubtreeStream stream_tableComment=new RewriteRuleSubtreeStream(adaptor,"rule tableComment");
        RewriteRuleSubtreeStream stream_tableRowFormat=new RewriteRuleSubtreeStream(adaptor,"rule tableRowFormat");
        RewriteRuleSubtreeStream stream_tableFileFormat=new RewriteRuleSubtreeStream(adaptor,"rule tableFileFormat");
        RewriteRuleSubtreeStream stream_tableLocation=new RewriteRuleSubtreeStream(adaptor,"rule tableLocation");
        RewriteRuleSubtreeStream stream_ifNotExists=new RewriteRuleSubtreeStream(adaptor,"rule ifNotExists");
         msgs.push("create statement"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:212:5: ( KW_CREATE (ext= KW_EXTERNAL )? KW_TABLE ( ifNotExists )? name= Identifier (like= KW_LIKE likeName= Identifier | ( LPAREN columnNameTypeList RPAREN )? ( tableComment )? ( tablePartition )? ( tableBuckets )? ( tableRowFormat )? ( tableFileFormat )? ) ( tableLocation )? -> ^( TOK_CREATETABLE $name ( $ext)? ( ifNotExists )? ^( TOK_LIKETABLE ( $likeName)? ) ( columnNameTypeList )? ( tableComment )? ( tablePartition )? ( tableBuckets )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:212:7: KW_CREATE (ext= KW_EXTERNAL )? KW_TABLE ( ifNotExists )? name= Identifier (like= KW_LIKE likeName= Identifier | ( LPAREN columnNameTypeList RPAREN )? ( tableComment )? ( tablePartition )? ( tableBuckets )? ( tableRowFormat )? ( tableFileFormat )? ) ( tableLocation )?
            {
            KW_CREATE26=(Token)input.LT(1);
            match(input,KW_CREATE,FOLLOW_KW_CREATE_in_createStatement790); 
            stream_KW_CREATE.add(KW_CREATE26);

            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:212:17: (ext= KW_EXTERNAL )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==KW_EXTERNAL) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:212:18: ext= KW_EXTERNAL
                    {
                    ext=(Token)input.LT(1);
                    match(input,KW_EXTERNAL,FOLLOW_KW_EXTERNAL_in_createStatement795); 
                    stream_KW_EXTERNAL.add(ext);


                    }
                    break;

            }

            KW_TABLE27=(Token)input.LT(1);
            match(input,KW_TABLE,FOLLOW_KW_TABLE_in_createStatement799); 
            stream_KW_TABLE.add(KW_TABLE27);

            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:212:45: ( ifNotExists )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==KW_IF) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:212:45: ifNotExists
                    {
                    pushFollow(FOLLOW_ifNotExists_in_createStatement801);
                    ifNotExists28=ifNotExists();
                    _fsp--;

                    stream_ifNotExists.add(ifNotExists28.getTree());

                    }
                    break;

            }

            name=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_createStatement806); 
            stream_Identifier.add(name);

            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:213:7: (like= KW_LIKE likeName= Identifier | ( LPAREN columnNameTypeList RPAREN )? ( tableComment )? ( tablePartition )? ( tableBuckets )? ( tableRowFormat )? ( tableFileFormat )? )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==KW_LIKE) ) {
                alt15=1;
            }
            else if ( (LA15_0==EOF||LA15_0==LPAREN||LA15_0==KW_LOCATION||(LA15_0>=KW_COMMENT && LA15_0<=KW_PARTITIONED)||LA15_0==KW_CLUSTERED||LA15_0==KW_ROW||LA15_0==KW_STORED) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("213:7: (like= KW_LIKE likeName= Identifier | ( LPAREN columnNameTypeList RPAREN )? ( tableComment )? ( tablePartition )? ( tableBuckets )? ( tableRowFormat )? ( tableFileFormat )? )", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:213:9: like= KW_LIKE likeName= Identifier
                    {
                    like=(Token)input.LT(1);
                    match(input,KW_LIKE,FOLLOW_KW_LIKE_in_createStatement818); 
                    stream_KW_LIKE.add(like);

                    likeName=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_createStatement822); 
                    stream_Identifier.add(likeName);


                    }
                    break;
                case 2 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:213:44: ( LPAREN columnNameTypeList RPAREN )? ( tableComment )? ( tablePartition )? ( tableBuckets )? ( tableRowFormat )? ( tableFileFormat )?
                    {
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:213:44: ( LPAREN columnNameTypeList RPAREN )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==LPAREN) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:213:45: LPAREN columnNameTypeList RPAREN
                            {
                            LPAREN29=(Token)input.LT(1);
                            match(input,LPAREN,FOLLOW_LPAREN_in_createStatement827); 
                            stream_LPAREN.add(LPAREN29);

                            pushFollow(FOLLOW_columnNameTypeList_in_createStatement829);
                            columnNameTypeList30=columnNameTypeList();
                            _fsp--;

                            stream_columnNameTypeList.add(columnNameTypeList30.getTree());
                            RPAREN31=(Token)input.LT(1);
                            match(input,RPAREN,FOLLOW_RPAREN_in_createStatement831); 
                            stream_RPAREN.add(RPAREN31);


                            }
                            break;

                    }

                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:213:80: ( tableComment )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==KW_COMMENT) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:213:80: tableComment
                            {
                            pushFollow(FOLLOW_tableComment_in_createStatement835);
                            tableComment32=tableComment();
                            _fsp--;

                            stream_tableComment.add(tableComment32.getTree());

                            }
                            break;

                    }

                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:213:94: ( tablePartition )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==KW_PARTITIONED) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:213:94: tablePartition
                            {
                            pushFollow(FOLLOW_tablePartition_in_createStatement838);
                            tablePartition33=tablePartition();
                            _fsp--;

                            stream_tablePartition.add(tablePartition33.getTree());

                            }
                            break;

                    }

                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:213:110: ( tableBuckets )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==KW_CLUSTERED) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:213:110: tableBuckets
                            {
                            pushFollow(FOLLOW_tableBuckets_in_createStatement841);
                            tableBuckets34=tableBuckets();
                            _fsp--;

                            stream_tableBuckets.add(tableBuckets34.getTree());

                            }
                            break;

                    }

                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:213:124: ( tableRowFormat )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==KW_ROW) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:213:124: tableRowFormat
                            {
                            pushFollow(FOLLOW_tableRowFormat_in_createStatement844);
                            tableRowFormat35=tableRowFormat();
                            _fsp--;

                            stream_tableRowFormat.add(tableRowFormat35.getTree());

                            }
                            break;

                    }

                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:213:140: ( tableFileFormat )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==KW_STORED) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:213:140: tableFileFormat
                            {
                            pushFollow(FOLLOW_tableFileFormat_in_createStatement847);
                            tableFileFormat36=tableFileFormat();
                            _fsp--;

                            stream_tableFileFormat.add(tableFileFormat36.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }

            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:213:159: ( tableLocation )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==KW_LOCATION) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:213:159: tableLocation
                    {
                    pushFollow(FOLLOW_tableLocation_in_createStatement852);
                    tableLocation37=tableLocation();
                    _fsp--;

                    stream_tableLocation.add(tableLocation37.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: tableRowFormat, ext, tableLocation, ifNotExists, tablePartition, tableBuckets, likeName, columnNameTypeList, tableFileFormat, tableComment, name
            // token labels: name, likeName, ext
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleTokenStream stream_likeName=new RewriteRuleTokenStream(adaptor,"token likeName",likeName);
            RewriteRuleTokenStream stream_ext=new RewriteRuleTokenStream(adaptor,"token ext",ext);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 214:5: -> ^( TOK_CREATETABLE $name ( $ext)? ( ifNotExists )? ^( TOK_LIKETABLE ( $likeName)? ) ( columnNameTypeList )? ( tableComment )? ( tablePartition )? ( tableBuckets )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:214:8: ^( TOK_CREATETABLE $name ( $ext)? ( ifNotExists )? ^( TOK_LIKETABLE ( $likeName)? ) ( columnNameTypeList )? ( tableComment )? ( tablePartition )? ( tableBuckets )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_CREATETABLE, "TOK_CREATETABLE"), root_1);

                adaptor.addChild(root_1, stream_name.next());
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:214:32: ( $ext)?
                if ( stream_ext.hasNext() ) {
                    adaptor.addChild(root_1, stream_ext.next());

                }
                stream_ext.reset();
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:214:38: ( ifNotExists )?
                if ( stream_ifNotExists.hasNext() ) {
                    adaptor.addChild(root_1, stream_ifNotExists.next());

                }
                stream_ifNotExists.reset();
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:214:51: ^( TOK_LIKETABLE ( $likeName)? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_LIKETABLE, "TOK_LIKETABLE"), root_2);

                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:214:67: ( $likeName)?
                if ( stream_likeName.hasNext() ) {
                    adaptor.addChild(root_2, stream_likeName.next());

                }
                stream_likeName.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:214:79: ( columnNameTypeList )?
                if ( stream_columnNameTypeList.hasNext() ) {
                    adaptor.addChild(root_1, stream_columnNameTypeList.next());

                }
                stream_columnNameTypeList.reset();
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:214:99: ( tableComment )?
                if ( stream_tableComment.hasNext() ) {
                    adaptor.addChild(root_1, stream_tableComment.next());

                }
                stream_tableComment.reset();
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:214:113: ( tablePartition )?
                if ( stream_tablePartition.hasNext() ) {
                    adaptor.addChild(root_1, stream_tablePartition.next());

                }
                stream_tablePartition.reset();
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:214:129: ( tableBuckets )?
                if ( stream_tableBuckets.hasNext() ) {
                    adaptor.addChild(root_1, stream_tableBuckets.next());

                }
                stream_tableBuckets.reset();
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:214:143: ( tableRowFormat )?
                if ( stream_tableRowFormat.hasNext() ) {
                    adaptor.addChild(root_1, stream_tableRowFormat.next());

                }
                stream_tableRowFormat.reset();
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:214:159: ( tableFileFormat )?
                if ( stream_tableFileFormat.hasNext() ) {
                    adaptor.addChild(root_1, stream_tableFileFormat.next());

                }
                stream_tableFileFormat.reset();
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:214:176: ( tableLocation )?
                if ( stream_tableLocation.hasNext() ) {
                    adaptor.addChild(root_1, stream_tableLocation.next());

                }
                stream_tableLocation.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end createStatement

    public static class dropStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start dropStatement
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:217:1: dropStatement : KW_DROP KW_TABLE Identifier -> ^( TOK_DROPTABLE Identifier ) ;
    public final dropStatement_return dropStatement() throws RecognitionException {
        dropStatement_return retval = new dropStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_DROP38=null;
        Token KW_TABLE39=null;
        Token Identifier40=null;

        CommonTree KW_DROP38_tree=null;
        CommonTree KW_TABLE39_tree=null;
        CommonTree Identifier40_tree=null;
        RewriteRuleTokenStream stream_KW_DROP=new RewriteRuleTokenStream(adaptor,"token KW_DROP");
        RewriteRuleTokenStream stream_KW_TABLE=new RewriteRuleTokenStream(adaptor,"token KW_TABLE");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

         msgs.push("drop statement"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:220:5: ( KW_DROP KW_TABLE Identifier -> ^( TOK_DROPTABLE Identifier ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:220:7: KW_DROP KW_TABLE Identifier
            {
            KW_DROP38=(Token)input.LT(1);
            match(input,KW_DROP,FOLLOW_KW_DROP_in_dropStatement929); 
            stream_KW_DROP.add(KW_DROP38);

            KW_TABLE39=(Token)input.LT(1);
            match(input,KW_TABLE,FOLLOW_KW_TABLE_in_dropStatement931); 
            stream_KW_TABLE.add(KW_TABLE39);

            Identifier40=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_dropStatement933); 
            stream_Identifier.add(Identifier40);


            // AST REWRITE
            // elements: Identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 220:36: -> ^( TOK_DROPTABLE Identifier )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:220:39: ^( TOK_DROPTABLE Identifier )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_DROPTABLE, "TOK_DROPTABLE"), root_1);

                adaptor.addChild(root_1, stream_Identifier.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end dropStatement

    public static class alterStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start alterStatement
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:223:1: alterStatement : KW_ALTER KW_TABLE alterStatementSuffix ;
    public final alterStatement_return alterStatement() throws RecognitionException {
        alterStatement_return retval = new alterStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_ALTER41=null;
        Token KW_TABLE42=null;
        alterStatementSuffix_return alterStatementSuffix43 = null;


        CommonTree KW_ALTER41_tree=null;
        CommonTree KW_TABLE42_tree=null;

         msgs.push("alter statement"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:226:5: ( KW_ALTER KW_TABLE alterStatementSuffix )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:226:7: KW_ALTER KW_TABLE alterStatementSuffix
            {
            root_0 = (CommonTree)adaptor.nil();

            KW_ALTER41=(Token)input.LT(1);
            match(input,KW_ALTER,FOLLOW_KW_ALTER_in_alterStatement969); 
            KW_TABLE42=(Token)input.LT(1);
            match(input,KW_TABLE,FOLLOW_KW_TABLE_in_alterStatement972); 
            pushFollow(FOLLOW_alterStatementSuffix_in_alterStatement975);
            alterStatementSuffix43=alterStatementSuffix();
            _fsp--;

            adaptor.addChild(root_0, alterStatementSuffix43.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end alterStatement

    public static class alterStatementSuffix_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start alterStatementSuffix
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:229:1: alterStatementSuffix : ( alterStatementSuffixRename | alterStatementSuffixAddCol | alterStatementSuffixDropPartitions | alterStatementSuffixAddPartitions | alterStatementSuffixProperties | alterStatementSuffixSerdeProperties );
    public final alterStatementSuffix_return alterStatementSuffix() throws RecognitionException {
        alterStatementSuffix_return retval = new alterStatementSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        alterStatementSuffixRename_return alterStatementSuffixRename44 = null;

        alterStatementSuffixAddCol_return alterStatementSuffixAddCol45 = null;

        alterStatementSuffixDropPartitions_return alterStatementSuffixDropPartitions46 = null;

        alterStatementSuffixAddPartitions_return alterStatementSuffixAddPartitions47 = null;

        alterStatementSuffixProperties_return alterStatementSuffixProperties48 = null;

        alterStatementSuffixSerdeProperties_return alterStatementSuffixSerdeProperties49 = null;



         msgs.push("alter statement"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:232:5: ( alterStatementSuffixRename | alterStatementSuffixAddCol | alterStatementSuffixDropPartitions | alterStatementSuffixAddPartitions | alterStatementSuffixProperties | alterStatementSuffixSerdeProperties )
            int alt17=6;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Identifier) ) {
                switch ( input.LA(2) ) {
                case KW_DROP:
                    {
                    alt17=3;
                    }
                    break;
                case KW_RENAME:
                    {
                    alt17=1;
                    }
                    break;
                case KW_SET:
                    {
                    int LA17_4 = input.LA(3);

                    if ( (LA17_4==KW_SERDE||LA17_4==KW_SERDEPROPERTIES) ) {
                        alt17=6;
                    }
                    else if ( (LA17_4==KW_PROPERTIES) ) {
                        alt17=5;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("229:1: alterStatementSuffix : ( alterStatementSuffixRename | alterStatementSuffixAddCol | alterStatementSuffixDropPartitions | alterStatementSuffixAddPartitions | alterStatementSuffixProperties | alterStatementSuffixSerdeProperties );", 17, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case KW_ADD:
                    {
                    int LA17_5 = input.LA(3);

                    if ( (LA17_5==KW_COLUMNS) ) {
                        alt17=2;
                    }
                    else if ( (LA17_5==KW_PARTITION) ) {
                        alt17=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("229:1: alterStatementSuffix : ( alterStatementSuffixRename | alterStatementSuffixAddCol | alterStatementSuffixDropPartitions | alterStatementSuffixAddPartitions | alterStatementSuffixProperties | alterStatementSuffixSerdeProperties );", 17, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case KW_REPLACE:
                    {
                    alt17=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("229:1: alterStatementSuffix : ( alterStatementSuffixRename | alterStatementSuffixAddCol | alterStatementSuffixDropPartitions | alterStatementSuffixAddPartitions | alterStatementSuffixProperties | alterStatementSuffixSerdeProperties );", 17, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("229:1: alterStatementSuffix : ( alterStatementSuffixRename | alterStatementSuffixAddCol | alterStatementSuffixDropPartitions | alterStatementSuffixAddPartitions | alterStatementSuffixProperties | alterStatementSuffixSerdeProperties );", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:232:7: alterStatementSuffixRename
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_alterStatementSuffixRename_in_alterStatementSuffix1002);
                    alterStatementSuffixRename44=alterStatementSuffixRename();
                    _fsp--;

                    adaptor.addChild(root_0, alterStatementSuffixRename44.getTree());

                    }
                    break;
                case 2 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:233:7: alterStatementSuffixAddCol
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_alterStatementSuffixAddCol_in_alterStatementSuffix1010);
                    alterStatementSuffixAddCol45=alterStatementSuffixAddCol();
                    _fsp--;

                    adaptor.addChild(root_0, alterStatementSuffixAddCol45.getTree());

                    }
                    break;
                case 3 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:234:7: alterStatementSuffixDropPartitions
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_alterStatementSuffixDropPartitions_in_alterStatementSuffix1018);
                    alterStatementSuffixDropPartitions46=alterStatementSuffixDropPartitions();
                    _fsp--;

                    adaptor.addChild(root_0, alterStatementSuffixDropPartitions46.getTree());

                    }
                    break;
                case 4 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:235:7: alterStatementSuffixAddPartitions
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_alterStatementSuffixAddPartitions_in_alterStatementSuffix1026);
                    alterStatementSuffixAddPartitions47=alterStatementSuffixAddPartitions();
                    _fsp--;

                    adaptor.addChild(root_0, alterStatementSuffixAddPartitions47.getTree());

                    }
                    break;
                case 5 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:236:7: alterStatementSuffixProperties
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_alterStatementSuffixProperties_in_alterStatementSuffix1034);
                    alterStatementSuffixProperties48=alterStatementSuffixProperties();
                    _fsp--;

                    adaptor.addChild(root_0, alterStatementSuffixProperties48.getTree());

                    }
                    break;
                case 6 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:237:7: alterStatementSuffixSerdeProperties
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_alterStatementSuffixSerdeProperties_in_alterStatementSuffix1042);
                    alterStatementSuffixSerdeProperties49=alterStatementSuffixSerdeProperties();
                    _fsp--;

                    adaptor.addChild(root_0, alterStatementSuffixSerdeProperties49.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end alterStatementSuffix

    public static class alterStatementSuffixRename_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start alterStatementSuffixRename
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:240:1: alterStatementSuffixRename : oldName= Identifier KW_RENAME KW_TO newName= Identifier -> ^( TOK_ALTERTABLE_RENAME $oldName $newName) ;
    public final alterStatementSuffixRename_return alterStatementSuffixRename() throws RecognitionException {
        alterStatementSuffixRename_return retval = new alterStatementSuffixRename_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token oldName=null;
        Token newName=null;
        Token KW_RENAME50=null;
        Token KW_TO51=null;

        CommonTree oldName_tree=null;
        CommonTree newName_tree=null;
        CommonTree KW_RENAME50_tree=null;
        CommonTree KW_TO51_tree=null;
        RewriteRuleTokenStream stream_KW_RENAME=new RewriteRuleTokenStream(adaptor,"token KW_RENAME");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_KW_TO=new RewriteRuleTokenStream(adaptor,"token KW_TO");

         msgs.push("rename statement"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:243:5: (oldName= Identifier KW_RENAME KW_TO newName= Identifier -> ^( TOK_ALTERTABLE_RENAME $oldName $newName) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:243:7: oldName= Identifier KW_RENAME KW_TO newName= Identifier
            {
            oldName=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_alterStatementSuffixRename1071); 
            stream_Identifier.add(oldName);

            KW_RENAME50=(Token)input.LT(1);
            match(input,KW_RENAME,FOLLOW_KW_RENAME_in_alterStatementSuffixRename1073); 
            stream_KW_RENAME.add(KW_RENAME50);

            KW_TO51=(Token)input.LT(1);
            match(input,KW_TO,FOLLOW_KW_TO_in_alterStatementSuffixRename1075); 
            stream_KW_TO.add(KW_TO51);

            newName=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_alterStatementSuffixRename1079); 
            stream_Identifier.add(newName);


            // AST REWRITE
            // elements: oldName, newName
            // token labels: newName, oldName
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_newName=new RewriteRuleTokenStream(adaptor,"token newName",newName);
            RewriteRuleTokenStream stream_oldName=new RewriteRuleTokenStream(adaptor,"token oldName",oldName);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 244:5: -> ^( TOK_ALTERTABLE_RENAME $oldName $newName)
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:244:8: ^( TOK_ALTERTABLE_RENAME $oldName $newName)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_ALTERTABLE_RENAME, "TOK_ALTERTABLE_RENAME"), root_1);

                adaptor.addChild(root_1, stream_oldName.next());
                adaptor.addChild(root_1, stream_newName.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end alterStatementSuffixRename

    public static class alterStatementSuffixAddCol_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start alterStatementSuffixAddCol
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:247:1: alterStatementSuffixAddCol : Identifier (add= KW_ADD | replace= KW_REPLACE ) KW_COLUMNS LPAREN columnNameTypeList RPAREN -> {$add != null}? ^( TOK_ALTERTABLE_ADDCOLS Identifier columnNameTypeList ) -> ^( TOK_ALTERTABLE_REPLACECOLS Identifier columnNameTypeList ) ;
    public final alterStatementSuffixAddCol_return alterStatementSuffixAddCol() throws RecognitionException {
        alterStatementSuffixAddCol_return retval = new alterStatementSuffixAddCol_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token add=null;
        Token replace=null;
        Token Identifier52=null;
        Token KW_COLUMNS53=null;
        Token LPAREN54=null;
        Token RPAREN56=null;
        columnNameTypeList_return columnNameTypeList55 = null;


        CommonTree add_tree=null;
        CommonTree replace_tree=null;
        CommonTree Identifier52_tree=null;
        CommonTree KW_COLUMNS53_tree=null;
        CommonTree LPAREN54_tree=null;
        CommonTree RPAREN56_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_KW_REPLACE=new RewriteRuleTokenStream(adaptor,"token KW_REPLACE");
        RewriteRuleTokenStream stream_KW_COLUMNS=new RewriteRuleTokenStream(adaptor,"token KW_COLUMNS");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_ADD=new RewriteRuleTokenStream(adaptor,"token KW_ADD");
        RewriteRuleSubtreeStream stream_columnNameTypeList=new RewriteRuleSubtreeStream(adaptor,"rule columnNameTypeList");
         msgs.push("add column statement"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:250:5: ( Identifier (add= KW_ADD | replace= KW_REPLACE ) KW_COLUMNS LPAREN columnNameTypeList RPAREN -> {$add != null}? ^( TOK_ALTERTABLE_ADDCOLS Identifier columnNameTypeList ) -> ^( TOK_ALTERTABLE_REPLACECOLS Identifier columnNameTypeList ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:250:7: Identifier (add= KW_ADD | replace= KW_REPLACE ) KW_COLUMNS LPAREN columnNameTypeList RPAREN
            {
            Identifier52=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_alterStatementSuffixAddCol1123); 
            stream_Identifier.add(Identifier52);

            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:250:18: (add= KW_ADD | replace= KW_REPLACE )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==KW_ADD) ) {
                alt18=1;
            }
            else if ( (LA18_0==KW_REPLACE) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("250:18: (add= KW_ADD | replace= KW_REPLACE )", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:250:19: add= KW_ADD
                    {
                    add=(Token)input.LT(1);
                    match(input,KW_ADD,FOLLOW_KW_ADD_in_alterStatementSuffixAddCol1128); 
                    stream_KW_ADD.add(add);


                    }
                    break;
                case 2 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:250:32: replace= KW_REPLACE
                    {
                    replace=(Token)input.LT(1);
                    match(input,KW_REPLACE,FOLLOW_KW_REPLACE_in_alterStatementSuffixAddCol1134); 
                    stream_KW_REPLACE.add(replace);


                    }
                    break;

            }

            KW_COLUMNS53=(Token)input.LT(1);
            match(input,KW_COLUMNS,FOLLOW_KW_COLUMNS_in_alterStatementSuffixAddCol1137); 
            stream_KW_COLUMNS.add(KW_COLUMNS53);

            LPAREN54=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_alterStatementSuffixAddCol1139); 
            stream_LPAREN.add(LPAREN54);

            pushFollow(FOLLOW_columnNameTypeList_in_alterStatementSuffixAddCol1141);
            columnNameTypeList55=columnNameTypeList();
            _fsp--;

            stream_columnNameTypeList.add(columnNameTypeList55.getTree());
            RPAREN56=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_alterStatementSuffixAddCol1143); 
            stream_RPAREN.add(RPAREN56);


            // AST REWRITE
            // elements: Identifier, columnNameTypeList, Identifier, columnNameTypeList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 251:5: -> {$add != null}? ^( TOK_ALTERTABLE_ADDCOLS Identifier columnNameTypeList )
            if (add != null) {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:251:24: ^( TOK_ALTERTABLE_ADDCOLS Identifier columnNameTypeList )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_ALTERTABLE_ADDCOLS, "TOK_ALTERTABLE_ADDCOLS"), root_1);

                adaptor.addChild(root_1, stream_Identifier.next());
                adaptor.addChild(root_1, stream_columnNameTypeList.next());

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 252:5: -> ^( TOK_ALTERTABLE_REPLACECOLS Identifier columnNameTypeList )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:252:24: ^( TOK_ALTERTABLE_REPLACECOLS Identifier columnNameTypeList )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_ALTERTABLE_REPLACECOLS, "TOK_ALTERTABLE_REPLACECOLS"), root_1);

                adaptor.addChild(root_1, stream_Identifier.next());
                adaptor.addChild(root_1, stream_columnNameTypeList.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end alterStatementSuffixAddCol

    public static class alterStatementSuffixAddPartitions_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start alterStatementSuffixAddPartitions
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:255:1: alterStatementSuffixAddPartitions : Identifier KW_ADD partitionSpec ( partitionLocation )? ( partitionSpec ( partitionLocation )? )* -> ^( TOK_ALTERTABLE_ADDPARTS Identifier ( partitionSpec ( partitionLocation )? )+ ) ;
    public final alterStatementSuffixAddPartitions_return alterStatementSuffixAddPartitions() throws RecognitionException {
        alterStatementSuffixAddPartitions_return retval = new alterStatementSuffixAddPartitions_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier57=null;
        Token KW_ADD58=null;
        partitionSpec_return partitionSpec59 = null;

        partitionLocation_return partitionLocation60 = null;

        partitionSpec_return partitionSpec61 = null;

        partitionLocation_return partitionLocation62 = null;


        CommonTree Identifier57_tree=null;
        CommonTree KW_ADD58_tree=null;
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_KW_ADD=new RewriteRuleTokenStream(adaptor,"token KW_ADD");
        RewriteRuleSubtreeStream stream_partitionSpec=new RewriteRuleSubtreeStream(adaptor,"rule partitionSpec");
        RewriteRuleSubtreeStream stream_partitionLocation=new RewriteRuleSubtreeStream(adaptor,"rule partitionLocation");
         msgs.push("add partition statement"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:258:5: ( Identifier KW_ADD partitionSpec ( partitionLocation )? ( partitionSpec ( partitionLocation )? )* -> ^( TOK_ALTERTABLE_ADDPARTS Identifier ( partitionSpec ( partitionLocation )? )+ ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:258:7: Identifier KW_ADD partitionSpec ( partitionLocation )? ( partitionSpec ( partitionLocation )? )*
            {
            Identifier57=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_alterStatementSuffixAddPartitions1216); 
            stream_Identifier.add(Identifier57);

            KW_ADD58=(Token)input.LT(1);
            match(input,KW_ADD,FOLLOW_KW_ADD_in_alterStatementSuffixAddPartitions1218); 
            stream_KW_ADD.add(KW_ADD58);

            pushFollow(FOLLOW_partitionSpec_in_alterStatementSuffixAddPartitions1220);
            partitionSpec59=partitionSpec();
            _fsp--;

            stream_partitionSpec.add(partitionSpec59.getTree());
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:258:39: ( partitionLocation )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==KW_LOCATION) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:258:39: partitionLocation
                    {
                    pushFollow(FOLLOW_partitionLocation_in_alterStatementSuffixAddPartitions1222);
                    partitionLocation60=partitionLocation();
                    _fsp--;

                    stream_partitionLocation.add(partitionLocation60.getTree());

                    }
                    break;

            }

            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:258:58: ( partitionSpec ( partitionLocation )? )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==KW_PARTITION) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:258:59: partitionSpec ( partitionLocation )?
            	    {
            	    pushFollow(FOLLOW_partitionSpec_in_alterStatementSuffixAddPartitions1226);
            	    partitionSpec61=partitionSpec();
            	    _fsp--;

            	    stream_partitionSpec.add(partitionSpec61.getTree());
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:258:73: ( partitionLocation )?
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==KW_LOCATION) ) {
            	        alt20=1;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:258:73: partitionLocation
            	            {
            	            pushFollow(FOLLOW_partitionLocation_in_alterStatementSuffixAddPartitions1228);
            	            partitionLocation62=partitionLocation();
            	            _fsp--;

            	            stream_partitionLocation.add(partitionLocation62.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            // AST REWRITE
            // elements: Identifier, partitionLocation, partitionSpec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 259:5: -> ^( TOK_ALTERTABLE_ADDPARTS Identifier ( partitionSpec ( partitionLocation )? )+ )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:259:8: ^( TOK_ALTERTABLE_ADDPARTS Identifier ( partitionSpec ( partitionLocation )? )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_ALTERTABLE_ADDPARTS, "TOK_ALTERTABLE_ADDPARTS"), root_1);

                adaptor.addChild(root_1, stream_Identifier.next());
                if ( !(stream_partitionSpec.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_partitionSpec.hasNext() ) {
                    adaptor.addChild(root_1, stream_partitionSpec.next());
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:259:60: ( partitionLocation )?
                    if ( stream_partitionLocation.hasNext() ) {
                        adaptor.addChild(root_1, stream_partitionLocation.next());

                    }
                    stream_partitionLocation.reset();

                }
                stream_partitionSpec.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end alterStatementSuffixAddPartitions

    public static class partitionLocation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start partitionLocation
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:262:1: partitionLocation : KW_LOCATION locn= StringLiteral -> ^( TOK_PARTITIONLOCATION $locn) ;
    public final partitionLocation_return partitionLocation() throws RecognitionException {
        partitionLocation_return retval = new partitionLocation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token locn=null;
        Token KW_LOCATION63=null;

        CommonTree locn_tree=null;
        CommonTree KW_LOCATION63_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_KW_LOCATION=new RewriteRuleTokenStream(adaptor,"token KW_LOCATION");

         msgs.push("partition location"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:265:5: ( KW_LOCATION locn= StringLiteral -> ^( TOK_PARTITIONLOCATION $locn) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:266:7: KW_LOCATION locn= StringLiteral
            {
            KW_LOCATION63=(Token)input.LT(1);
            match(input,KW_LOCATION,FOLLOW_KW_LOCATION_in_partitionLocation1284); 
            stream_KW_LOCATION.add(KW_LOCATION63);

            locn=(Token)input.LT(1);
            match(input,StringLiteral,FOLLOW_StringLiteral_in_partitionLocation1288); 
            stream_StringLiteral.add(locn);


            // AST REWRITE
            // elements: locn
            // token labels: locn
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_locn=new RewriteRuleTokenStream(adaptor,"token locn",locn);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 266:38: -> ^( TOK_PARTITIONLOCATION $locn)
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:266:41: ^( TOK_PARTITIONLOCATION $locn)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_PARTITIONLOCATION, "TOK_PARTITIONLOCATION"), root_1);

                adaptor.addChild(root_1, stream_locn.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end partitionLocation

    public static class alterStatementSuffixDropPartitions_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start alterStatementSuffixDropPartitions
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:269:1: alterStatementSuffixDropPartitions : Identifier KW_DROP partitionSpec ( COMMA partitionSpec )* -> ^( TOK_ALTERTABLE_DROPPARTS Identifier ( partitionSpec )+ ) ;
    public final alterStatementSuffixDropPartitions_return alterStatementSuffixDropPartitions() throws RecognitionException {
        alterStatementSuffixDropPartitions_return retval = new alterStatementSuffixDropPartitions_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier64=null;
        Token KW_DROP65=null;
        Token COMMA67=null;
        partitionSpec_return partitionSpec66 = null;

        partitionSpec_return partitionSpec68 = null;


        CommonTree Identifier64_tree=null;
        CommonTree KW_DROP65_tree=null;
        CommonTree COMMA67_tree=null;
        RewriteRuleTokenStream stream_KW_DROP=new RewriteRuleTokenStream(adaptor,"token KW_DROP");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_partitionSpec=new RewriteRuleSubtreeStream(adaptor,"rule partitionSpec");
         msgs.push("drop partition statement"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:272:5: ( Identifier KW_DROP partitionSpec ( COMMA partitionSpec )* -> ^( TOK_ALTERTABLE_DROPPARTS Identifier ( partitionSpec )+ ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:272:7: Identifier KW_DROP partitionSpec ( COMMA partitionSpec )*
            {
            Identifier64=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_alterStatementSuffixDropPartitions1324); 
            stream_Identifier.add(Identifier64);

            KW_DROP65=(Token)input.LT(1);
            match(input,KW_DROP,FOLLOW_KW_DROP_in_alterStatementSuffixDropPartitions1326); 
            stream_KW_DROP.add(KW_DROP65);

            pushFollow(FOLLOW_partitionSpec_in_alterStatementSuffixDropPartitions1328);
            partitionSpec66=partitionSpec();
            _fsp--;

            stream_partitionSpec.add(partitionSpec66.getTree());
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:272:40: ( COMMA partitionSpec )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==COMMA) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:272:41: COMMA partitionSpec
            	    {
            	    COMMA67=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_alterStatementSuffixDropPartitions1331); 
            	    stream_COMMA.add(COMMA67);

            	    pushFollow(FOLLOW_partitionSpec_in_alterStatementSuffixDropPartitions1333);
            	    partitionSpec68=partitionSpec();
            	    _fsp--;

            	    stream_partitionSpec.add(partitionSpec68.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            // AST REWRITE
            // elements: Identifier, partitionSpec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 273:5: -> ^( TOK_ALTERTABLE_DROPPARTS Identifier ( partitionSpec )+ )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:273:8: ^( TOK_ALTERTABLE_DROPPARTS Identifier ( partitionSpec )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_ALTERTABLE_DROPPARTS, "TOK_ALTERTABLE_DROPPARTS"), root_1);

                adaptor.addChild(root_1, stream_Identifier.next());
                if ( !(stream_partitionSpec.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_partitionSpec.hasNext() ) {
                    adaptor.addChild(root_1, stream_partitionSpec.next());

                }
                stream_partitionSpec.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end alterStatementSuffixDropPartitions

    public static class alterStatementSuffixProperties_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start alterStatementSuffixProperties
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:276:1: alterStatementSuffixProperties : name= Identifier KW_SET KW_PROPERTIES tableProperties -> ^( TOK_ALTERTABLE_PROPERTIES $name tableProperties ) ;
    public final alterStatementSuffixProperties_return alterStatementSuffixProperties() throws RecognitionException {
        alterStatementSuffixProperties_return retval = new alterStatementSuffixProperties_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token name=null;
        Token KW_SET69=null;
        Token KW_PROPERTIES70=null;
        tableProperties_return tableProperties71 = null;


        CommonTree name_tree=null;
        CommonTree KW_SET69_tree=null;
        CommonTree KW_PROPERTIES70_tree=null;
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_KW_PROPERTIES=new RewriteRuleTokenStream(adaptor,"token KW_PROPERTIES");
        RewriteRuleTokenStream stream_KW_SET=new RewriteRuleTokenStream(adaptor,"token KW_SET");
        RewriteRuleSubtreeStream stream_tableProperties=new RewriteRuleSubtreeStream(adaptor,"rule tableProperties");
         msgs.push("alter properties statement"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:279:5: (name= Identifier KW_SET KW_PROPERTIES tableProperties -> ^( TOK_ALTERTABLE_PROPERTIES $name tableProperties ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:279:7: name= Identifier KW_SET KW_PROPERTIES tableProperties
            {
            name=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_alterStatementSuffixProperties1379); 
            stream_Identifier.add(name);

            KW_SET69=(Token)input.LT(1);
            match(input,KW_SET,FOLLOW_KW_SET_in_alterStatementSuffixProperties1381); 
            stream_KW_SET.add(KW_SET69);

            KW_PROPERTIES70=(Token)input.LT(1);
            match(input,KW_PROPERTIES,FOLLOW_KW_PROPERTIES_in_alterStatementSuffixProperties1383); 
            stream_KW_PROPERTIES.add(KW_PROPERTIES70);

            pushFollow(FOLLOW_tableProperties_in_alterStatementSuffixProperties1385);
            tableProperties71=tableProperties();
            _fsp--;

            stream_tableProperties.add(tableProperties71.getTree());

            // AST REWRITE
            // elements: tableProperties, name
            // token labels: name
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 280:5: -> ^( TOK_ALTERTABLE_PROPERTIES $name tableProperties )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:280:8: ^( TOK_ALTERTABLE_PROPERTIES $name tableProperties )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_ALTERTABLE_PROPERTIES, "TOK_ALTERTABLE_PROPERTIES"), root_1);

                adaptor.addChild(root_1, stream_name.next());
                adaptor.addChild(root_1, stream_tableProperties.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end alterStatementSuffixProperties

    public static class alterStatementSuffixSerdeProperties_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start alterStatementSuffixSerdeProperties
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:283:1: alterStatementSuffixSerdeProperties : (name= Identifier KW_SET KW_SERDE serdeName= StringLiteral ( KW_WITH KW_SERDEPROPERTIES tableProperties )? -> ^( TOK_ALTERTABLE_SERIALIZER $name $serdeName ( tableProperties )? ) | name= Identifier KW_SET KW_SERDEPROPERTIES tableProperties -> ^( TOK_ALTERTABLE_SERDEPROPERTIES $name tableProperties ) );
    public final alterStatementSuffixSerdeProperties_return alterStatementSuffixSerdeProperties() throws RecognitionException {
        alterStatementSuffixSerdeProperties_return retval = new alterStatementSuffixSerdeProperties_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token name=null;
        Token serdeName=null;
        Token KW_SET72=null;
        Token KW_SERDE73=null;
        Token KW_WITH74=null;
        Token KW_SERDEPROPERTIES75=null;
        Token KW_SET77=null;
        Token KW_SERDEPROPERTIES78=null;
        tableProperties_return tableProperties76 = null;

        tableProperties_return tableProperties79 = null;


        CommonTree name_tree=null;
        CommonTree serdeName_tree=null;
        CommonTree KW_SET72_tree=null;
        CommonTree KW_SERDE73_tree=null;
        CommonTree KW_WITH74_tree=null;
        CommonTree KW_SERDEPROPERTIES75_tree=null;
        CommonTree KW_SET77_tree=null;
        CommonTree KW_SERDEPROPERTIES78_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_KW_WITH=new RewriteRuleTokenStream(adaptor,"token KW_WITH");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_KW_SERDE=new RewriteRuleTokenStream(adaptor,"token KW_SERDE");
        RewriteRuleTokenStream stream_KW_SET=new RewriteRuleTokenStream(adaptor,"token KW_SET");
        RewriteRuleTokenStream stream_KW_SERDEPROPERTIES=new RewriteRuleTokenStream(adaptor,"token KW_SERDEPROPERTIES");
        RewriteRuleSubtreeStream stream_tableProperties=new RewriteRuleSubtreeStream(adaptor,"rule tableProperties");
         msgs.push("alter serdes statement"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:286:5: (name= Identifier KW_SET KW_SERDE serdeName= StringLiteral ( KW_WITH KW_SERDEPROPERTIES tableProperties )? -> ^( TOK_ALTERTABLE_SERIALIZER $name $serdeName ( tableProperties )? ) | name= Identifier KW_SET KW_SERDEPROPERTIES tableProperties -> ^( TOK_ALTERTABLE_SERDEPROPERTIES $name tableProperties ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Identifier) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==KW_SET) ) {
                    int LA24_2 = input.LA(3);

                    if ( (LA24_2==KW_SERDE) ) {
                        alt24=1;
                    }
                    else if ( (LA24_2==KW_SERDEPROPERTIES) ) {
                        alt24=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("283:1: alterStatementSuffixSerdeProperties : (name= Identifier KW_SET KW_SERDE serdeName= StringLiteral ( KW_WITH KW_SERDEPROPERTIES tableProperties )? -> ^( TOK_ALTERTABLE_SERIALIZER $name $serdeName ( tableProperties )? ) | name= Identifier KW_SET KW_SERDEPROPERTIES tableProperties -> ^( TOK_ALTERTABLE_SERDEPROPERTIES $name tableProperties ) );", 24, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("283:1: alterStatementSuffixSerdeProperties : (name= Identifier KW_SET KW_SERDE serdeName= StringLiteral ( KW_WITH KW_SERDEPROPERTIES tableProperties )? -> ^( TOK_ALTERTABLE_SERIALIZER $name $serdeName ( tableProperties )? ) | name= Identifier KW_SET KW_SERDEPROPERTIES tableProperties -> ^( TOK_ALTERTABLE_SERDEPROPERTIES $name tableProperties ) );", 24, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("283:1: alterStatementSuffixSerdeProperties : (name= Identifier KW_SET KW_SERDE serdeName= StringLiteral ( KW_WITH KW_SERDEPROPERTIES tableProperties )? -> ^( TOK_ALTERTABLE_SERIALIZER $name $serdeName ( tableProperties )? ) | name= Identifier KW_SET KW_SERDEPROPERTIES tableProperties -> ^( TOK_ALTERTABLE_SERDEPROPERTIES $name tableProperties ) );", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:286:7: name= Identifier KW_SET KW_SERDE serdeName= StringLiteral ( KW_WITH KW_SERDEPROPERTIES tableProperties )?
                    {
                    name=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_alterStatementSuffixSerdeProperties1429); 
                    stream_Identifier.add(name);

                    KW_SET72=(Token)input.LT(1);
                    match(input,KW_SET,FOLLOW_KW_SET_in_alterStatementSuffixSerdeProperties1431); 
                    stream_KW_SET.add(KW_SET72);

                    KW_SERDE73=(Token)input.LT(1);
                    match(input,KW_SERDE,FOLLOW_KW_SERDE_in_alterStatementSuffixSerdeProperties1433); 
                    stream_KW_SERDE.add(KW_SERDE73);

                    serdeName=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_alterStatementSuffixSerdeProperties1437); 
                    stream_StringLiteral.add(serdeName);

                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:286:63: ( KW_WITH KW_SERDEPROPERTIES tableProperties )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==KW_WITH) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:286:64: KW_WITH KW_SERDEPROPERTIES tableProperties
                            {
                            KW_WITH74=(Token)input.LT(1);
                            match(input,KW_WITH,FOLLOW_KW_WITH_in_alterStatementSuffixSerdeProperties1440); 
                            stream_KW_WITH.add(KW_WITH74);

                            KW_SERDEPROPERTIES75=(Token)input.LT(1);
                            match(input,KW_SERDEPROPERTIES,FOLLOW_KW_SERDEPROPERTIES_in_alterStatementSuffixSerdeProperties1442); 
                            stream_KW_SERDEPROPERTIES.add(KW_SERDEPROPERTIES75);

                            pushFollow(FOLLOW_tableProperties_in_alterStatementSuffixSerdeProperties1444);
                            tableProperties76=tableProperties();
                            _fsp--;

                            stream_tableProperties.add(tableProperties76.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: tableProperties, serdeName, name
                    // token labels: name, serdeName
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
                    RewriteRuleTokenStream stream_serdeName=new RewriteRuleTokenStream(adaptor,"token serdeName",serdeName);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 287:5: -> ^( TOK_ALTERTABLE_SERIALIZER $name $serdeName ( tableProperties )? )
                    {
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:287:8: ^( TOK_ALTERTABLE_SERIALIZER $name $serdeName ( tableProperties )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_ALTERTABLE_SERIALIZER, "TOK_ALTERTABLE_SERIALIZER"), root_1);

                        adaptor.addChild(root_1, stream_name.next());
                        adaptor.addChild(root_1, stream_serdeName.next());
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:287:53: ( tableProperties )?
                        if ( stream_tableProperties.hasNext() ) {
                            adaptor.addChild(root_1, stream_tableProperties.next());

                        }
                        stream_tableProperties.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;
                case 2 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:288:7: name= Identifier KW_SET KW_SERDEPROPERTIES tableProperties
                    {
                    name=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_alterStatementSuffixSerdeProperties1475); 
                    stream_Identifier.add(name);

                    KW_SET77=(Token)input.LT(1);
                    match(input,KW_SET,FOLLOW_KW_SET_in_alterStatementSuffixSerdeProperties1477); 
                    stream_KW_SET.add(KW_SET77);

                    KW_SERDEPROPERTIES78=(Token)input.LT(1);
                    match(input,KW_SERDEPROPERTIES,FOLLOW_KW_SERDEPROPERTIES_in_alterStatementSuffixSerdeProperties1479); 
                    stream_KW_SERDEPROPERTIES.add(KW_SERDEPROPERTIES78);

                    pushFollow(FOLLOW_tableProperties_in_alterStatementSuffixSerdeProperties1481);
                    tableProperties79=tableProperties();
                    _fsp--;

                    stream_tableProperties.add(tableProperties79.getTree());

                    // AST REWRITE
                    // elements: tableProperties, name
                    // token labels: name
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 289:5: -> ^( TOK_ALTERTABLE_SERDEPROPERTIES $name tableProperties )
                    {
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:289:8: ^( TOK_ALTERTABLE_SERDEPROPERTIES $name tableProperties )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_ALTERTABLE_SERDEPROPERTIES, "TOK_ALTERTABLE_SERDEPROPERTIES"), root_1);

                        adaptor.addChild(root_1, stream_name.next());
                        adaptor.addChild(root_1, stream_tableProperties.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end alterStatementSuffixSerdeProperties

    public static class tabTypeExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start tabTypeExpr
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:292:1: tabTypeExpr : Identifier ( DOT ( Identifier | KW_ELEM_TYPE | KW_KEY_TYPE | KW_VALUE_TYPE ) )* ;
    public final tabTypeExpr_return tabTypeExpr() throws RecognitionException {
        tabTypeExpr_return retval = new tabTypeExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier80=null;
        Token DOT81=null;
        Token set82=null;

        CommonTree Identifier80_tree=null;
        CommonTree DOT81_tree=null;
        CommonTree set82_tree=null;

         msgs.push("specifying table types"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:296:4: ( Identifier ( DOT ( Identifier | KW_ELEM_TYPE | KW_KEY_TYPE | KW_VALUE_TYPE ) )* )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:296:6: Identifier ( DOT ( Identifier | KW_ELEM_TYPE | KW_KEY_TYPE | KW_VALUE_TYPE ) )*
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier80=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_tabTypeExpr1523); 
            Identifier80_tree = (CommonTree)adaptor.create(Identifier80);
            adaptor.addChild(root_0, Identifier80_tree);

            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:296:17: ( DOT ( Identifier | KW_ELEM_TYPE | KW_KEY_TYPE | KW_VALUE_TYPE ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==DOT) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:296:18: DOT ( Identifier | KW_ELEM_TYPE | KW_KEY_TYPE | KW_VALUE_TYPE )
            	    {
            	    DOT81=(Token)input.LT(1);
            	    match(input,DOT,FOLLOW_DOT_in_tabTypeExpr1526); 
            	    DOT81_tree = (CommonTree)adaptor.create(DOT81);
            	    root_0 = (CommonTree)adaptor.becomeRoot(DOT81_tree, root_0);

            	    set82=(Token)input.LT(1);
            	    if ( input.LA(1)==Identifier||(input.LA(1)>=KW_ELEM_TYPE && input.LA(1)<=KW_VALUE_TYPE) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, adaptor.create(set82));
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_tabTypeExpr1529);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end tabTypeExpr

    public static class partTypeExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start partTypeExpr
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:299:1: partTypeExpr : tabTypeExpr ( partitionSpec )? -> ^( TOK_TABTYPE tabTypeExpr ( partitionSpec )? ) ;
    public final partTypeExpr_return partTypeExpr() throws RecognitionException {
        partTypeExpr_return retval = new partTypeExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        tabTypeExpr_return tabTypeExpr83 = null;

        partitionSpec_return partitionSpec84 = null;


        RewriteRuleSubtreeStream stream_tabTypeExpr=new RewriteRuleSubtreeStream(adaptor,"rule tabTypeExpr");
        RewriteRuleSubtreeStream stream_partitionSpec=new RewriteRuleSubtreeStream(adaptor,"rule partitionSpec");
         msgs.push("specifying table partitions"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:302:5: ( tabTypeExpr ( partitionSpec )? -> ^( TOK_TABTYPE tabTypeExpr ( partitionSpec )? ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:302:8: tabTypeExpr ( partitionSpec )?
            {
            pushFollow(FOLLOW_tabTypeExpr_in_partTypeExpr1575);
            tabTypeExpr83=tabTypeExpr();
            _fsp--;

            stream_tabTypeExpr.add(tabTypeExpr83.getTree());
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:302:20: ( partitionSpec )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==KW_PARTITION) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:302:20: partitionSpec
                    {
                    pushFollow(FOLLOW_partitionSpec_in_partTypeExpr1577);
                    partitionSpec84=partitionSpec();
                    _fsp--;

                    stream_partitionSpec.add(partitionSpec84.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: tabTypeExpr, partitionSpec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 302:35: -> ^( TOK_TABTYPE tabTypeExpr ( partitionSpec )? )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:302:38: ^( TOK_TABTYPE tabTypeExpr ( partitionSpec )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_TABTYPE, "TOK_TABTYPE"), root_1);

                adaptor.addChild(root_1, stream_tabTypeExpr.next());
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:302:64: ( partitionSpec )?
                if ( stream_partitionSpec.hasNext() ) {
                    adaptor.addChild(root_1, stream_partitionSpec.next());

                }
                stream_partitionSpec.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end partTypeExpr

    public static class descStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start descStatement
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:305:1: descStatement : ( KW_DESCRIBE (isExtended= KW_EXTENDED )? (parttype= partTypeExpr ) -> ^( TOK_DESCTABLE $parttype ( $isExtended)? ) | KW_DESCRIBE KW_FUNCTION ( KW_EXTENDED )? Identifier -> ^( TOK_DESCFUNCTION Identifier ( KW_EXTENDED )? ) );
    public final descStatement_return descStatement() throws RecognitionException {
        descStatement_return retval = new descStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token isExtended=null;
        Token KW_DESCRIBE85=null;
        Token KW_DESCRIBE86=null;
        Token KW_FUNCTION87=null;
        Token KW_EXTENDED88=null;
        Token Identifier89=null;
        partTypeExpr_return parttype = null;


        CommonTree isExtended_tree=null;
        CommonTree KW_DESCRIBE85_tree=null;
        CommonTree KW_DESCRIBE86_tree=null;
        CommonTree KW_FUNCTION87_tree=null;
        CommonTree KW_EXTENDED88_tree=null;
        CommonTree Identifier89_tree=null;
        RewriteRuleTokenStream stream_KW_FUNCTION=new RewriteRuleTokenStream(adaptor,"token KW_FUNCTION");
        RewriteRuleTokenStream stream_KW_EXTENDED=new RewriteRuleTokenStream(adaptor,"token KW_EXTENDED");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_KW_DESCRIBE=new RewriteRuleTokenStream(adaptor,"token KW_DESCRIBE");
        RewriteRuleSubtreeStream stream_partTypeExpr=new RewriteRuleSubtreeStream(adaptor,"rule partTypeExpr");
         msgs.push("describe statement"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:308:5: ( KW_DESCRIBE (isExtended= KW_EXTENDED )? (parttype= partTypeExpr ) -> ^( TOK_DESCTABLE $parttype ( $isExtended)? ) | KW_DESCRIBE KW_FUNCTION ( KW_EXTENDED )? Identifier -> ^( TOK_DESCFUNCTION Identifier ( KW_EXTENDED )? ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==KW_DESCRIBE) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==KW_FUNCTION) ) {
                    alt29=2;
                }
                else if ( (LA29_1==KW_EXTENDED||LA29_1==Identifier) ) {
                    alt29=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("305:1: descStatement : ( KW_DESCRIBE (isExtended= KW_EXTENDED )? (parttype= partTypeExpr ) -> ^( TOK_DESCTABLE $parttype ( $isExtended)? ) | KW_DESCRIBE KW_FUNCTION ( KW_EXTENDED )? Identifier -> ^( TOK_DESCFUNCTION Identifier ( KW_EXTENDED )? ) );", 29, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("305:1: descStatement : ( KW_DESCRIBE (isExtended= KW_EXTENDED )? (parttype= partTypeExpr ) -> ^( TOK_DESCTABLE $parttype ( $isExtended)? ) | KW_DESCRIBE KW_FUNCTION ( KW_EXTENDED )? Identifier -> ^( TOK_DESCFUNCTION Identifier ( KW_EXTENDED )? ) );", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:308:7: KW_DESCRIBE (isExtended= KW_EXTENDED )? (parttype= partTypeExpr )
                    {
                    KW_DESCRIBE85=(Token)input.LT(1);
                    match(input,KW_DESCRIBE,FOLLOW_KW_DESCRIBE_in_descStatement1616); 
                    stream_KW_DESCRIBE.add(KW_DESCRIBE85);

                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:308:19: (isExtended= KW_EXTENDED )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==KW_EXTENDED) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:308:20: isExtended= KW_EXTENDED
                            {
                            isExtended=(Token)input.LT(1);
                            match(input,KW_EXTENDED,FOLLOW_KW_EXTENDED_in_descStatement1621); 
                            stream_KW_EXTENDED.add(isExtended);


                            }
                            break;

                    }

                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:308:45: (parttype= partTypeExpr )
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:308:46: parttype= partTypeExpr
                    {
                    pushFollow(FOLLOW_partTypeExpr_in_descStatement1628);
                    parttype=partTypeExpr();
                    _fsp--;

                    stream_partTypeExpr.add(parttype.getTree());

                    }


                    // AST REWRITE
                    // elements: parttype, isExtended
                    // token labels: isExtended
                    // rule labels: retval, parttype
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_isExtended=new RewriteRuleTokenStream(adaptor,"token isExtended",isExtended);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_parttype=new RewriteRuleSubtreeStream(adaptor,"token parttype",parttype!=null?parttype.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 308:69: -> ^( TOK_DESCTABLE $parttype ( $isExtended)? )
                    {
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:308:72: ^( TOK_DESCTABLE $parttype ( $isExtended)? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_DESCTABLE, "TOK_DESCTABLE"), root_1);

                        adaptor.addChild(root_1, stream_parttype.next());
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:308:98: ( $isExtended)?
                        if ( stream_isExtended.hasNext() ) {
                            adaptor.addChild(root_1, stream_isExtended.next());

                        }
                        stream_isExtended.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;
                case 2 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:309:7: KW_DESCRIBE KW_FUNCTION ( KW_EXTENDED )? Identifier
                    {
                    KW_DESCRIBE86=(Token)input.LT(1);
                    match(input,KW_DESCRIBE,FOLLOW_KW_DESCRIBE_in_descStatement1650); 
                    stream_KW_DESCRIBE.add(KW_DESCRIBE86);

                    KW_FUNCTION87=(Token)input.LT(1);
                    match(input,KW_FUNCTION,FOLLOW_KW_FUNCTION_in_descStatement1652); 
                    stream_KW_FUNCTION.add(KW_FUNCTION87);

                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:309:31: ( KW_EXTENDED )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==KW_EXTENDED) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:309:31: KW_EXTENDED
                            {
                            KW_EXTENDED88=(Token)input.LT(1);
                            match(input,KW_EXTENDED,FOLLOW_KW_EXTENDED_in_descStatement1654); 
                            stream_KW_EXTENDED.add(KW_EXTENDED88);


                            }
                            break;

                    }

                    Identifier89=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_descStatement1657); 
                    stream_Identifier.add(Identifier89);


                    // AST REWRITE
                    // elements: KW_EXTENDED, Identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 309:55: -> ^( TOK_DESCFUNCTION Identifier ( KW_EXTENDED )? )
                    {
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:309:58: ^( TOK_DESCFUNCTION Identifier ( KW_EXTENDED )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_DESCFUNCTION, "TOK_DESCFUNCTION"), root_1);

                        adaptor.addChild(root_1, stream_Identifier.next());
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:309:88: ( KW_EXTENDED )?
                        if ( stream_KW_EXTENDED.hasNext() ) {
                            adaptor.addChild(root_1, stream_KW_EXTENDED.next());

                        }
                        stream_KW_EXTENDED.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end descStatement

    public static class showStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start showStatement
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:312:1: showStatement : ( KW_SHOW KW_TABLES ( showStmtIdentifier )? -> ^( TOK_SHOWTABLES ( showStmtIdentifier )? ) | KW_SHOW KW_FUNCTIONS ( showStmtIdentifier )? -> ^( TOK_SHOWFUNCTIONS ( showStmtIdentifier )? ) | KW_SHOW KW_PARTITIONS Identifier -> ^( TOK_SHOWPARTITIONS Identifier ) );
    public final showStatement_return showStatement() throws RecognitionException {
        showStatement_return retval = new showStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_SHOW90=null;
        Token KW_TABLES91=null;
        Token KW_SHOW93=null;
        Token KW_FUNCTIONS94=null;
        Token KW_SHOW96=null;
        Token KW_PARTITIONS97=null;
        Token Identifier98=null;
        showStmtIdentifier_return showStmtIdentifier92 = null;

        showStmtIdentifier_return showStmtIdentifier95 = null;


        CommonTree KW_SHOW90_tree=null;
        CommonTree KW_TABLES91_tree=null;
        CommonTree KW_SHOW93_tree=null;
        CommonTree KW_FUNCTIONS94_tree=null;
        CommonTree KW_SHOW96_tree=null;
        CommonTree KW_PARTITIONS97_tree=null;
        CommonTree Identifier98_tree=null;
        RewriteRuleTokenStream stream_KW_SHOW=new RewriteRuleTokenStream(adaptor,"token KW_SHOW");
        RewriteRuleTokenStream stream_KW_TABLES=new RewriteRuleTokenStream(adaptor,"token KW_TABLES");
        RewriteRuleTokenStream stream_KW_PARTITIONS=new RewriteRuleTokenStream(adaptor,"token KW_PARTITIONS");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_KW_FUNCTIONS=new RewriteRuleTokenStream(adaptor,"token KW_FUNCTIONS");
        RewriteRuleSubtreeStream stream_showStmtIdentifier=new RewriteRuleSubtreeStream(adaptor,"rule showStmtIdentifier");
         msgs.push("show statement"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:315:5: ( KW_SHOW KW_TABLES ( showStmtIdentifier )? -> ^( TOK_SHOWTABLES ( showStmtIdentifier )? ) | KW_SHOW KW_FUNCTIONS ( showStmtIdentifier )? -> ^( TOK_SHOWFUNCTIONS ( showStmtIdentifier )? ) | KW_SHOW KW_PARTITIONS Identifier -> ^( TOK_SHOWPARTITIONS Identifier ) )
            int alt32=3;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==KW_SHOW) ) {
                switch ( input.LA(2) ) {
                case KW_PARTITIONS:
                    {
                    alt32=3;
                    }
                    break;
                case KW_FUNCTIONS:
                    {
                    alt32=2;
                    }
                    break;
                case KW_TABLES:
                    {
                    alt32=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("312:1: showStatement : ( KW_SHOW KW_TABLES ( showStmtIdentifier )? -> ^( TOK_SHOWTABLES ( showStmtIdentifier )? ) | KW_SHOW KW_FUNCTIONS ( showStmtIdentifier )? -> ^( TOK_SHOWFUNCTIONS ( showStmtIdentifier )? ) | KW_SHOW KW_PARTITIONS Identifier -> ^( TOK_SHOWPARTITIONS Identifier ) );", 32, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("312:1: showStatement : ( KW_SHOW KW_TABLES ( showStmtIdentifier )? -> ^( TOK_SHOWTABLES ( showStmtIdentifier )? ) | KW_SHOW KW_FUNCTIONS ( showStmtIdentifier )? -> ^( TOK_SHOWFUNCTIONS ( showStmtIdentifier )? ) | KW_SHOW KW_PARTITIONS Identifier -> ^( TOK_SHOWPARTITIONS Identifier ) );", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:315:7: KW_SHOW KW_TABLES ( showStmtIdentifier )?
                    {
                    KW_SHOW90=(Token)input.LT(1);
                    match(input,KW_SHOW,FOLLOW_KW_SHOW_in_showStatement1696); 
                    stream_KW_SHOW.add(KW_SHOW90);

                    KW_TABLES91=(Token)input.LT(1);
                    match(input,KW_TABLES,FOLLOW_KW_TABLES_in_showStatement1698); 
                    stream_KW_TABLES.add(KW_TABLES91);

                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:315:25: ( showStmtIdentifier )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==StringLiteral||LA30_0==Identifier) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:315:25: showStmtIdentifier
                            {
                            pushFollow(FOLLOW_showStmtIdentifier_in_showStatement1700);
                            showStmtIdentifier92=showStmtIdentifier();
                            _fsp--;

                            stream_showStmtIdentifier.add(showStmtIdentifier92.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: showStmtIdentifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 315:46: -> ^( TOK_SHOWTABLES ( showStmtIdentifier )? )
                    {
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:315:49: ^( TOK_SHOWTABLES ( showStmtIdentifier )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_SHOWTABLES, "TOK_SHOWTABLES"), root_1);

                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:315:66: ( showStmtIdentifier )?
                        if ( stream_showStmtIdentifier.hasNext() ) {
                            adaptor.addChild(root_1, stream_showStmtIdentifier.next());

                        }
                        stream_showStmtIdentifier.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;
                case 2 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:316:7: KW_SHOW KW_FUNCTIONS ( showStmtIdentifier )?
                    {
                    KW_SHOW93=(Token)input.LT(1);
                    match(input,KW_SHOW,FOLLOW_KW_SHOW_in_showStatement1719); 
                    stream_KW_SHOW.add(KW_SHOW93);

                    KW_FUNCTIONS94=(Token)input.LT(1);
                    match(input,KW_FUNCTIONS,FOLLOW_KW_FUNCTIONS_in_showStatement1721); 
                    stream_KW_FUNCTIONS.add(KW_FUNCTIONS94);

                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:316:28: ( showStmtIdentifier )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==StringLiteral||LA31_0==Identifier) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:316:28: showStmtIdentifier
                            {
                            pushFollow(FOLLOW_showStmtIdentifier_in_showStatement1723);
                            showStmtIdentifier95=showStmtIdentifier();
                            _fsp--;

                            stream_showStmtIdentifier.add(showStmtIdentifier95.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: showStmtIdentifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 316:49: -> ^( TOK_SHOWFUNCTIONS ( showStmtIdentifier )? )
                    {
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:316:52: ^( TOK_SHOWFUNCTIONS ( showStmtIdentifier )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_SHOWFUNCTIONS, "TOK_SHOWFUNCTIONS"), root_1);

                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:316:72: ( showStmtIdentifier )?
                        if ( stream_showStmtIdentifier.hasNext() ) {
                            adaptor.addChild(root_1, stream_showStmtIdentifier.next());

                        }
                        stream_showStmtIdentifier.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;
                case 3 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:317:7: KW_SHOW KW_PARTITIONS Identifier
                    {
                    KW_SHOW96=(Token)input.LT(1);
                    match(input,KW_SHOW,FOLLOW_KW_SHOW_in_showStatement1742); 
                    stream_KW_SHOW.add(KW_SHOW96);

                    KW_PARTITIONS97=(Token)input.LT(1);
                    match(input,KW_PARTITIONS,FOLLOW_KW_PARTITIONS_in_showStatement1744); 
                    stream_KW_PARTITIONS.add(KW_PARTITIONS97);

                    Identifier98=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_showStatement1746); 
                    stream_Identifier.add(Identifier98);


                    // AST REWRITE
                    // elements: Identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 317:40: -> ^( TOK_SHOWPARTITIONS Identifier )
                    {
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:317:43: ^( TOK_SHOWPARTITIONS Identifier )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_SHOWPARTITIONS, "TOK_SHOWPARTITIONS"), root_1);

                        adaptor.addChild(root_1, stream_Identifier.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end showStatement

    public static class metastoreCheck_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start metastoreCheck
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:320:1: metastoreCheck : KW_MSCK ( KW_TABLE table= Identifier ( partitionSpec )? ( COMMA partitionSpec )* )? -> ^( TOK_MSCK ( $table ( partitionSpec )* )? ) ;
    public final metastoreCheck_return metastoreCheck() throws RecognitionException {
        metastoreCheck_return retval = new metastoreCheck_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token table=null;
        Token KW_MSCK99=null;
        Token KW_TABLE100=null;
        Token COMMA102=null;
        partitionSpec_return partitionSpec101 = null;

        partitionSpec_return partitionSpec103 = null;


        CommonTree table_tree=null;
        CommonTree KW_MSCK99_tree=null;
        CommonTree KW_TABLE100_tree=null;
        CommonTree COMMA102_tree=null;
        RewriteRuleTokenStream stream_KW_MSCK=new RewriteRuleTokenStream(adaptor,"token KW_MSCK");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_TABLE=new RewriteRuleTokenStream(adaptor,"token KW_TABLE");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_partitionSpec=new RewriteRuleSubtreeStream(adaptor,"rule partitionSpec");
         msgs.push("metastore check statement"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:323:5: ( KW_MSCK ( KW_TABLE table= Identifier ( partitionSpec )? ( COMMA partitionSpec )* )? -> ^( TOK_MSCK ( $table ( partitionSpec )* )? ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:323:7: KW_MSCK ( KW_TABLE table= Identifier ( partitionSpec )? ( COMMA partitionSpec )* )?
            {
            KW_MSCK99=(Token)input.LT(1);
            match(input,KW_MSCK,FOLLOW_KW_MSCK_in_metastoreCheck1785); 
            stream_KW_MSCK.add(KW_MSCK99);

            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:323:15: ( KW_TABLE table= Identifier ( partitionSpec )? ( COMMA partitionSpec )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==KW_TABLE) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:323:16: KW_TABLE table= Identifier ( partitionSpec )? ( COMMA partitionSpec )*
                    {
                    KW_TABLE100=(Token)input.LT(1);
                    match(input,KW_TABLE,FOLLOW_KW_TABLE_in_metastoreCheck1788); 
                    stream_KW_TABLE.add(KW_TABLE100);

                    table=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_metastoreCheck1792); 
                    stream_Identifier.add(table);

                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:323:42: ( partitionSpec )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==KW_PARTITION) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:323:42: partitionSpec
                            {
                            pushFollow(FOLLOW_partitionSpec_in_metastoreCheck1794);
                            partitionSpec101=partitionSpec();
                            _fsp--;

                            stream_partitionSpec.add(partitionSpec101.getTree());

                            }
                            break;

                    }

                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:323:57: ( COMMA partitionSpec )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==COMMA) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:323:58: COMMA partitionSpec
                    	    {
                    	    COMMA102=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_metastoreCheck1798); 
                    	    stream_COMMA.add(COMMA102);

                    	    pushFollow(FOLLOW_partitionSpec_in_metastoreCheck1800);
                    	    partitionSpec103=partitionSpec();
                    	    _fsp--;

                    	    stream_partitionSpec.add(partitionSpec103.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }


            // AST REWRITE
            // elements: partitionSpec, table
            // token labels: table
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_table=new RewriteRuleTokenStream(adaptor,"token table",table);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 324:5: -> ^( TOK_MSCK ( $table ( partitionSpec )* )? )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:324:8: ^( TOK_MSCK ( $table ( partitionSpec )* )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_MSCK, "TOK_MSCK"), root_1);

                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:324:19: ( $table ( partitionSpec )* )?
                if ( stream_partitionSpec.hasNext()||stream_table.hasNext() ) {
                    adaptor.addChild(root_1, stream_table.next());
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:324:27: ( partitionSpec )*
                    while ( stream_partitionSpec.hasNext() ) {
                        adaptor.addChild(root_1, stream_partitionSpec.next());

                    }
                    stream_partitionSpec.reset();

                }
                stream_partitionSpec.reset();
                stream_table.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end metastoreCheck

    public static class createFunctionStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start createFunctionStatement
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:327:1: createFunctionStatement : KW_CREATE KW_TEMPORARY KW_FUNCTION Identifier KW_AS StringLiteral -> ^( TOK_CREATEFUNCTION Identifier StringLiteral ) ;
    public final createFunctionStatement_return createFunctionStatement() throws RecognitionException {
        createFunctionStatement_return retval = new createFunctionStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_CREATE104=null;
        Token KW_TEMPORARY105=null;
        Token KW_FUNCTION106=null;
        Token Identifier107=null;
        Token KW_AS108=null;
        Token StringLiteral109=null;

        CommonTree KW_CREATE104_tree=null;
        CommonTree KW_TEMPORARY105_tree=null;
        CommonTree KW_FUNCTION106_tree=null;
        CommonTree Identifier107_tree=null;
        CommonTree KW_AS108_tree=null;
        CommonTree StringLiteral109_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleTokenStream stream_KW_CREATE=new RewriteRuleTokenStream(adaptor,"token KW_CREATE");
        RewriteRuleTokenStream stream_KW_FUNCTION=new RewriteRuleTokenStream(adaptor,"token KW_FUNCTION");
        RewriteRuleTokenStream stream_KW_TEMPORARY=new RewriteRuleTokenStream(adaptor,"token KW_TEMPORARY");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

         msgs.push("create function statement"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:330:5: ( KW_CREATE KW_TEMPORARY KW_FUNCTION Identifier KW_AS StringLiteral -> ^( TOK_CREATEFUNCTION Identifier StringLiteral ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:330:7: KW_CREATE KW_TEMPORARY KW_FUNCTION Identifier KW_AS StringLiteral
            {
            KW_CREATE104=(Token)input.LT(1);
            match(input,KW_CREATE,FOLLOW_KW_CREATE_in_createFunctionStatement1859); 
            stream_KW_CREATE.add(KW_CREATE104);

            KW_TEMPORARY105=(Token)input.LT(1);
            match(input,KW_TEMPORARY,FOLLOW_KW_TEMPORARY_in_createFunctionStatement1861); 
            stream_KW_TEMPORARY.add(KW_TEMPORARY105);

            KW_FUNCTION106=(Token)input.LT(1);
            match(input,KW_FUNCTION,FOLLOW_KW_FUNCTION_in_createFunctionStatement1863); 
            stream_KW_FUNCTION.add(KW_FUNCTION106);

            Identifier107=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_createFunctionStatement1865); 
            stream_Identifier.add(Identifier107);

            KW_AS108=(Token)input.LT(1);
            match(input,KW_AS,FOLLOW_KW_AS_in_createFunctionStatement1867); 
            stream_KW_AS.add(KW_AS108);

            StringLiteral109=(Token)input.LT(1);
            match(input,StringLiteral,FOLLOW_StringLiteral_in_createFunctionStatement1869); 
            stream_StringLiteral.add(StringLiteral109);


            // AST REWRITE
            // elements: StringLiteral, Identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 331:5: -> ^( TOK_CREATEFUNCTION Identifier StringLiteral )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:331:8: ^( TOK_CREATEFUNCTION Identifier StringLiteral )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_CREATEFUNCTION, "TOK_CREATEFUNCTION"), root_1);

                adaptor.addChild(root_1, stream_Identifier.next());
                adaptor.addChild(root_1, stream_StringLiteral.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end createFunctionStatement

    public static class dropFunctionStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start dropFunctionStatement
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:334:1: dropFunctionStatement : KW_DROP KW_TEMPORARY KW_FUNCTION Identifier -> ^( TOK_DROPFUNCTION Identifier ) ;
    public final dropFunctionStatement_return dropFunctionStatement() throws RecognitionException {
        dropFunctionStatement_return retval = new dropFunctionStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_DROP110=null;
        Token KW_TEMPORARY111=null;
        Token KW_FUNCTION112=null;
        Token Identifier113=null;

        CommonTree KW_DROP110_tree=null;
        CommonTree KW_TEMPORARY111_tree=null;
        CommonTree KW_FUNCTION112_tree=null;
        CommonTree Identifier113_tree=null;
        RewriteRuleTokenStream stream_KW_FUNCTION=new RewriteRuleTokenStream(adaptor,"token KW_FUNCTION");
        RewriteRuleTokenStream stream_KW_DROP=new RewriteRuleTokenStream(adaptor,"token KW_DROP");
        RewriteRuleTokenStream stream_KW_TEMPORARY=new RewriteRuleTokenStream(adaptor,"token KW_TEMPORARY");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

         msgs.push("drop temporary function statement"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:337:5: ( KW_DROP KW_TEMPORARY KW_FUNCTION Identifier -> ^( TOK_DROPFUNCTION Identifier ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:337:7: KW_DROP KW_TEMPORARY KW_FUNCTION Identifier
            {
            KW_DROP110=(Token)input.LT(1);
            match(input,KW_DROP,FOLLOW_KW_DROP_in_dropFunctionStatement1910); 
            stream_KW_DROP.add(KW_DROP110);

            KW_TEMPORARY111=(Token)input.LT(1);
            match(input,KW_TEMPORARY,FOLLOW_KW_TEMPORARY_in_dropFunctionStatement1912); 
            stream_KW_TEMPORARY.add(KW_TEMPORARY111);

            KW_FUNCTION112=(Token)input.LT(1);
            match(input,KW_FUNCTION,FOLLOW_KW_FUNCTION_in_dropFunctionStatement1914); 
            stream_KW_FUNCTION.add(KW_FUNCTION112);

            Identifier113=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_dropFunctionStatement1916); 
            stream_Identifier.add(Identifier113);


            // AST REWRITE
            // elements: Identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 338:5: -> ^( TOK_DROPFUNCTION Identifier )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:338:8: ^( TOK_DROPFUNCTION Identifier )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_DROPFUNCTION, "TOK_DROPFUNCTION"), root_1);

                adaptor.addChild(root_1, stream_Identifier.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end dropFunctionStatement

    public static class showStmtIdentifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start showStmtIdentifier
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:341:1: showStmtIdentifier : ( Identifier | StringLiteral );
    public final showStmtIdentifier_return showStmtIdentifier() throws RecognitionException {
        showStmtIdentifier_return retval = new showStmtIdentifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set114=null;

        CommonTree set114_tree=null;

         msgs.push("identifier for show statement"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:344:5: ( Identifier | StringLiteral )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set114=(Token)input.LT(1);
            if ( input.LA(1)==StringLiteral||input.LA(1)==Identifier ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set114));
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_showStmtIdentifier0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end showStmtIdentifier

    public static class tableComment_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start tableComment
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:348:1: tableComment : KW_COMMENT comment= StringLiteral -> ^( TOK_TABLECOMMENT $comment) ;
    public final tableComment_return tableComment() throws RecognitionException {
        tableComment_return retval = new tableComment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token comment=null;
        Token KW_COMMENT115=null;

        CommonTree comment_tree=null;
        CommonTree KW_COMMENT115_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_KW_COMMENT=new RewriteRuleTokenStream(adaptor,"token KW_COMMENT");

         msgs.push("table's comment"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:351:5: ( KW_COMMENT comment= StringLiteral -> ^( TOK_TABLECOMMENT $comment) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:352:7: KW_COMMENT comment= StringLiteral
            {
            KW_COMMENT115=(Token)input.LT(1);
            match(input,KW_COMMENT,FOLLOW_KW_COMMENT_in_tableComment1996); 
            stream_KW_COMMENT.add(KW_COMMENT115);

            comment=(Token)input.LT(1);
            match(input,StringLiteral,FOLLOW_StringLiteral_in_tableComment2000); 
            stream_StringLiteral.add(comment);


            // AST REWRITE
            // elements: comment
            // token labels: comment
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_comment=new RewriteRuleTokenStream(adaptor,"token comment",comment);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 352:41: -> ^( TOK_TABLECOMMENT $comment)
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:352:44: ^( TOK_TABLECOMMENT $comment)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_TABLECOMMENT, "TOK_TABLECOMMENT"), root_1);

                adaptor.addChild(root_1, stream_comment.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end tableComment

    public static class tablePartition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start tablePartition
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:355:1: tablePartition : KW_PARTITIONED KW_BY LPAREN columnNameTypeList RPAREN -> ^( TOK_TABLEPARTCOLS columnNameTypeList ) ;
    public final tablePartition_return tablePartition() throws RecognitionException {
        tablePartition_return retval = new tablePartition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_PARTITIONED116=null;
        Token KW_BY117=null;
        Token LPAREN118=null;
        Token RPAREN120=null;
        columnNameTypeList_return columnNameTypeList119 = null;


        CommonTree KW_PARTITIONED116_tree=null;
        CommonTree KW_BY117_tree=null;
        CommonTree LPAREN118_tree=null;
        CommonTree RPAREN120_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_KW_PARTITIONED=new RewriteRuleTokenStream(adaptor,"token KW_PARTITIONED");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_BY=new RewriteRuleTokenStream(adaptor,"token KW_BY");
        RewriteRuleSubtreeStream stream_columnNameTypeList=new RewriteRuleSubtreeStream(adaptor,"rule columnNameTypeList");
         msgs.push("table partition specification"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:358:5: ( KW_PARTITIONED KW_BY LPAREN columnNameTypeList RPAREN -> ^( TOK_TABLEPARTCOLS columnNameTypeList ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:358:7: KW_PARTITIONED KW_BY LPAREN columnNameTypeList RPAREN
            {
            KW_PARTITIONED116=(Token)input.LT(1);
            match(input,KW_PARTITIONED,FOLLOW_KW_PARTITIONED_in_tablePartition2037); 
            stream_KW_PARTITIONED.add(KW_PARTITIONED116);

            KW_BY117=(Token)input.LT(1);
            match(input,KW_BY,FOLLOW_KW_BY_in_tablePartition2039); 
            stream_KW_BY.add(KW_BY117);

            LPAREN118=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_tablePartition2041); 
            stream_LPAREN.add(LPAREN118);

            pushFollow(FOLLOW_columnNameTypeList_in_tablePartition2043);
            columnNameTypeList119=columnNameTypeList();
            _fsp--;

            stream_columnNameTypeList.add(columnNameTypeList119.getTree());
            RPAREN120=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_tablePartition2045); 
            stream_RPAREN.add(RPAREN120);


            // AST REWRITE
            // elements: columnNameTypeList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 359:5: -> ^( TOK_TABLEPARTCOLS columnNameTypeList )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:359:8: ^( TOK_TABLEPARTCOLS columnNameTypeList )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_TABLEPARTCOLS, "TOK_TABLEPARTCOLS"), root_1);

                adaptor.addChild(root_1, stream_columnNameTypeList.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end tablePartition

    public static class tableBuckets_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start tableBuckets
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:362:1: tableBuckets : KW_CLUSTERED KW_BY LPAREN bucketCols= columnNameList RPAREN ( KW_SORTED KW_BY LPAREN sortCols= columnNameOrderList RPAREN )? KW_INTO num= Number KW_BUCKETS -> ^( TOK_TABLEBUCKETS $bucketCols ( $sortCols)? $num) ;
    public final tableBuckets_return tableBuckets() throws RecognitionException {
        tableBuckets_return retval = new tableBuckets_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token num=null;
        Token KW_CLUSTERED121=null;
        Token KW_BY122=null;
        Token LPAREN123=null;
        Token RPAREN124=null;
        Token KW_SORTED125=null;
        Token KW_BY126=null;
        Token LPAREN127=null;
        Token RPAREN128=null;
        Token KW_INTO129=null;
        Token KW_BUCKETS130=null;
        columnNameList_return bucketCols = null;

        columnNameOrderList_return sortCols = null;


        CommonTree num_tree=null;
        CommonTree KW_CLUSTERED121_tree=null;
        CommonTree KW_BY122_tree=null;
        CommonTree LPAREN123_tree=null;
        CommonTree RPAREN124_tree=null;
        CommonTree KW_SORTED125_tree=null;
        CommonTree KW_BY126_tree=null;
        CommonTree LPAREN127_tree=null;
        CommonTree RPAREN128_tree=null;
        CommonTree KW_INTO129_tree=null;
        CommonTree KW_BUCKETS130_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_KW_INTO=new RewriteRuleTokenStream(adaptor,"token KW_INTO");
        RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
        RewriteRuleTokenStream stream_KW_BUCKETS=new RewriteRuleTokenStream(adaptor,"token KW_BUCKETS");
        RewriteRuleTokenStream stream_KW_CLUSTERED=new RewriteRuleTokenStream(adaptor,"token KW_CLUSTERED");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_BY=new RewriteRuleTokenStream(adaptor,"token KW_BY");
        RewriteRuleTokenStream stream_KW_SORTED=new RewriteRuleTokenStream(adaptor,"token KW_SORTED");
        RewriteRuleSubtreeStream stream_columnNameList=new RewriteRuleSubtreeStream(adaptor,"rule columnNameList");
        RewriteRuleSubtreeStream stream_columnNameOrderList=new RewriteRuleSubtreeStream(adaptor,"rule columnNameOrderList");
         msgs.push("table buckets specification"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:365:5: ( KW_CLUSTERED KW_BY LPAREN bucketCols= columnNameList RPAREN ( KW_SORTED KW_BY LPAREN sortCols= columnNameOrderList RPAREN )? KW_INTO num= Number KW_BUCKETS -> ^( TOK_TABLEBUCKETS $bucketCols ( $sortCols)? $num) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:366:7: KW_CLUSTERED KW_BY LPAREN bucketCols= columnNameList RPAREN ( KW_SORTED KW_BY LPAREN sortCols= columnNameOrderList RPAREN )? KW_INTO num= Number KW_BUCKETS
            {
            KW_CLUSTERED121=(Token)input.LT(1);
            match(input,KW_CLUSTERED,FOLLOW_KW_CLUSTERED_in_tableBuckets2091); 
            stream_KW_CLUSTERED.add(KW_CLUSTERED121);

            KW_BY122=(Token)input.LT(1);
            match(input,KW_BY,FOLLOW_KW_BY_in_tableBuckets2093); 
            stream_KW_BY.add(KW_BY122);

            LPAREN123=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_tableBuckets2095); 
            stream_LPAREN.add(LPAREN123);

            pushFollow(FOLLOW_columnNameList_in_tableBuckets2099);
            bucketCols=columnNameList();
            _fsp--;

            stream_columnNameList.add(bucketCols.getTree());
            RPAREN124=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_tableBuckets2101); 
            stream_RPAREN.add(RPAREN124);

            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:366:66: ( KW_SORTED KW_BY LPAREN sortCols= columnNameOrderList RPAREN )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==KW_SORTED) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:366:67: KW_SORTED KW_BY LPAREN sortCols= columnNameOrderList RPAREN
                    {
                    KW_SORTED125=(Token)input.LT(1);
                    match(input,KW_SORTED,FOLLOW_KW_SORTED_in_tableBuckets2104); 
                    stream_KW_SORTED.add(KW_SORTED125);

                    KW_BY126=(Token)input.LT(1);
                    match(input,KW_BY,FOLLOW_KW_BY_in_tableBuckets2106); 
                    stream_KW_BY.add(KW_BY126);

                    LPAREN127=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_tableBuckets2108); 
                    stream_LPAREN.add(LPAREN127);

                    pushFollow(FOLLOW_columnNameOrderList_in_tableBuckets2112);
                    sortCols=columnNameOrderList();
                    _fsp--;

                    stream_columnNameOrderList.add(sortCols.getTree());
                    RPAREN128=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_tableBuckets2114); 
                    stream_RPAREN.add(RPAREN128);


                    }
                    break;

            }

            KW_INTO129=(Token)input.LT(1);
            match(input,KW_INTO,FOLLOW_KW_INTO_in_tableBuckets2118); 
            stream_KW_INTO.add(KW_INTO129);

            num=(Token)input.LT(1);
            match(input,Number,FOLLOW_Number_in_tableBuckets2122); 
            stream_Number.add(num);

            KW_BUCKETS130=(Token)input.LT(1);
            match(input,KW_BUCKETS,FOLLOW_KW_BUCKETS_in_tableBuckets2124); 
            stream_KW_BUCKETS.add(KW_BUCKETS130);


            // AST REWRITE
            // elements: bucketCols, sortCols, num
            // token labels: num
            // rule labels: sortCols, retval, bucketCols
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_num=new RewriteRuleTokenStream(adaptor,"token num",num);
            RewriteRuleSubtreeStream stream_sortCols=new RewriteRuleSubtreeStream(adaptor,"token sortCols",sortCols!=null?sortCols.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_bucketCols=new RewriteRuleSubtreeStream(adaptor,"token bucketCols",bucketCols!=null?bucketCols.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 367:5: -> ^( TOK_TABLEBUCKETS $bucketCols ( $sortCols)? $num)
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:367:8: ^( TOK_TABLEBUCKETS $bucketCols ( $sortCols)? $num)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_TABLEBUCKETS, "TOK_TABLEBUCKETS"), root_1);

                adaptor.addChild(root_1, stream_bucketCols.next());
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:367:39: ( $sortCols)?
                if ( stream_sortCols.hasNext() ) {
                    adaptor.addChild(root_1, stream_sortCols.next());

                }
                stream_sortCols.reset();
                adaptor.addChild(root_1, stream_num.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end tableBuckets

    public static class serde_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start serde
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:370:1: serde : ( serdeFormat -> ^( TOK_SERDE serdeFormat ) | serdePropertiesFormat -> ^( TOK_SERDE serdePropertiesFormat ) | -> ^( TOK_SERDE ) );
    public final serde_return serde() throws RecognitionException {
        serde_return retval = new serde_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        serdeFormat_return serdeFormat131 = null;

        serdePropertiesFormat_return serdePropertiesFormat132 = null;


        RewriteRuleSubtreeStream stream_serdeFormat=new RewriteRuleSubtreeStream(adaptor,"rule serdeFormat");
        RewriteRuleSubtreeStream stream_serdePropertiesFormat=new RewriteRuleSubtreeStream(adaptor,"rule serdePropertiesFormat");
         msgs.push("serde specification"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:373:5: ( serdeFormat -> ^( TOK_SERDE serdeFormat ) | serdePropertiesFormat -> ^( TOK_SERDE serdePropertiesFormat ) | -> ^( TOK_SERDE ) )
            int alt37=3;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==KW_ROW) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==KW_FORMAT) ) {
                    int LA37_19 = input.LA(3);

                    if ( (LA37_19==KW_DELIMITED) ) {
                        alt37=2;
                    }
                    else if ( (LA37_19==KW_SERDE) ) {
                        alt37=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("370:1: serde : ( serdeFormat -> ^( TOK_SERDE serdeFormat ) | serdePropertiesFormat -> ^( TOK_SERDE serdePropertiesFormat ) | -> ^( TOK_SERDE ) );", 37, 19, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("370:1: serde : ( serdeFormat -> ^( TOK_SERDE serdeFormat ) | serdePropertiesFormat -> ^( TOK_SERDE serdePropertiesFormat ) | -> ^( TOK_SERDE ) );", 37, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA37_0==EOF||LA37_0==RPAREN||LA37_0==KW_RECORDREADER||LA37_0==KW_MAP||LA37_0==KW_UNION||LA37_0==KW_INSERT||(LA37_0>=KW_LIMIT && LA37_0<=KW_SELECT)||(LA37_0>=KW_REDUCE && LA37_0<=KW_FROM)||(LA37_0>=KW_WHERE && LA37_0<=KW_SORT)) ) {
                alt37=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("370:1: serde : ( serdeFormat -> ^( TOK_SERDE serdeFormat ) | serdePropertiesFormat -> ^( TOK_SERDE serdePropertiesFormat ) | -> ^( TOK_SERDE ) );", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:373:7: serdeFormat
                    {
                    pushFollow(FOLLOW_serdeFormat_in_serde2172);
                    serdeFormat131=serdeFormat();
                    _fsp--;

                    stream_serdeFormat.add(serdeFormat131.getTree());

                    // AST REWRITE
                    // elements: serdeFormat
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 373:19: -> ^( TOK_SERDE serdeFormat )
                    {
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:373:22: ^( TOK_SERDE serdeFormat )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_SERDE, "TOK_SERDE"), root_1);

                        adaptor.addChild(root_1, stream_serdeFormat.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;
                case 2 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:374:7: serdePropertiesFormat
                    {
                    pushFollow(FOLLOW_serdePropertiesFormat_in_serde2188);
                    serdePropertiesFormat132=serdePropertiesFormat();
                    _fsp--;

                    stream_serdePropertiesFormat.add(serdePropertiesFormat132.getTree());

                    // AST REWRITE
                    // elements: serdePropertiesFormat
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 374:29: -> ^( TOK_SERDE serdePropertiesFormat )
                    {
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:374:32: ^( TOK_SERDE serdePropertiesFormat )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_SERDE, "TOK_SERDE"), root_1);

                        adaptor.addChild(root_1, stream_serdePropertiesFormat.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;
                case 3 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:375:9: 
                    {

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 375:9: -> ^( TOK_SERDE )
                    {
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:375:12: ^( TOK_SERDE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_SERDE, "TOK_SERDE"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end serde

    public static class recordReader_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start recordReader
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:378:1: recordReader : ( KW_RECORDREADER StringLiteral -> ^( TOK_RECORDREADER StringLiteral ) | -> ^( TOK_RECORDREADER ) );
    public final recordReader_return recordReader() throws RecognitionException {
        recordReader_return retval = new recordReader_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_RECORDREADER133=null;
        Token StringLiteral134=null;

        CommonTree KW_RECORDREADER133_tree=null;
        CommonTree StringLiteral134_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_KW_RECORDREADER=new RewriteRuleTokenStream(adaptor,"token KW_RECORDREADER");

         msgs.push("record reader specification"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:381:5: ( KW_RECORDREADER StringLiteral -> ^( TOK_RECORDREADER StringLiteral ) | -> ^( TOK_RECORDREADER ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==KW_RECORDREADER) ) {
                alt38=1;
            }
            else if ( (LA38_0==EOF||LA38_0==RPAREN||LA38_0==KW_MAP||LA38_0==KW_UNION||LA38_0==KW_INSERT||(LA38_0>=KW_LIMIT && LA38_0<=KW_SELECT)||LA38_0==KW_REDUCE||LA38_0==KW_FROM||(LA38_0>=KW_WHERE && LA38_0<=KW_SORT)) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("378:1: recordReader : ( KW_RECORDREADER StringLiteral -> ^( TOK_RECORDREADER StringLiteral ) | -> ^( TOK_RECORDREADER ) );", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:381:7: KW_RECORDREADER StringLiteral
                    {
                    KW_RECORDREADER133=(Token)input.LT(1);
                    match(input,KW_RECORDREADER,FOLLOW_KW_RECORDREADER_in_recordReader2237); 
                    stream_KW_RECORDREADER.add(KW_RECORDREADER133);

                    StringLiteral134=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_recordReader2239); 
                    stream_StringLiteral.add(StringLiteral134);


                    // AST REWRITE
                    // elements: StringLiteral
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 381:37: -> ^( TOK_RECORDREADER StringLiteral )
                    {
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:381:40: ^( TOK_RECORDREADER StringLiteral )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_RECORDREADER, "TOK_RECORDREADER"), root_1);

                        adaptor.addChild(root_1, stream_StringLiteral.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;
                case 2 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:382:9: 
                    {

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 382:9: -> ^( TOK_RECORDREADER )
                    {
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:382:12: ^( TOK_RECORDREADER )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_RECORDREADER, "TOK_RECORDREADER"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end recordReader

    public static class serdeFormat_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start serdeFormat
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:385:1: serdeFormat : KW_ROW KW_FORMAT KW_SERDE name= StringLiteral ( KW_WITH KW_SERDEPROPERTIES serdeprops= tableProperties )? -> ^( TOK_SERDENAME $name ( $serdeprops)? ) ;
    public final serdeFormat_return serdeFormat() throws RecognitionException {
        serdeFormat_return retval = new serdeFormat_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token name=null;
        Token KW_ROW135=null;
        Token KW_FORMAT136=null;
        Token KW_SERDE137=null;
        Token KW_WITH138=null;
        Token KW_SERDEPROPERTIES139=null;
        tableProperties_return serdeprops = null;


        CommonTree name_tree=null;
        CommonTree KW_ROW135_tree=null;
        CommonTree KW_FORMAT136_tree=null;
        CommonTree KW_SERDE137_tree=null;
        CommonTree KW_WITH138_tree=null;
        CommonTree KW_SERDEPROPERTIES139_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_KW_ROW=new RewriteRuleTokenStream(adaptor,"token KW_ROW");
        RewriteRuleTokenStream stream_KW_FORMAT=new RewriteRuleTokenStream(adaptor,"token KW_FORMAT");
        RewriteRuleTokenStream stream_KW_WITH=new RewriteRuleTokenStream(adaptor,"token KW_WITH");
        RewriteRuleTokenStream stream_KW_SERDE=new RewriteRuleTokenStream(adaptor,"token KW_SERDE");
        RewriteRuleTokenStream stream_KW_SERDEPROPERTIES=new RewriteRuleTokenStream(adaptor,"token KW_SERDEPROPERTIES");
        RewriteRuleSubtreeStream stream_tableProperties=new RewriteRuleSubtreeStream(adaptor,"rule tableProperties");
         msgs.push("serde format specification"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:388:5: ( KW_ROW KW_FORMAT KW_SERDE name= StringLiteral ( KW_WITH KW_SERDEPROPERTIES serdeprops= tableProperties )? -> ^( TOK_SERDENAME $name ( $serdeprops)? ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:388:7: KW_ROW KW_FORMAT KW_SERDE name= StringLiteral ( KW_WITH KW_SERDEPROPERTIES serdeprops= tableProperties )?
            {
            KW_ROW135=(Token)input.LT(1);
            match(input,KW_ROW,FOLLOW_KW_ROW_in_serdeFormat2288); 
            stream_KW_ROW.add(KW_ROW135);

            KW_FORMAT136=(Token)input.LT(1);
            match(input,KW_FORMAT,FOLLOW_KW_FORMAT_in_serdeFormat2290); 
            stream_KW_FORMAT.add(KW_FORMAT136);

            KW_SERDE137=(Token)input.LT(1);
            match(input,KW_SERDE,FOLLOW_KW_SERDE_in_serdeFormat2292); 
            stream_KW_SERDE.add(KW_SERDE137);

            name=(Token)input.LT(1);
            match(input,StringLiteral,FOLLOW_StringLiteral_in_serdeFormat2296); 
            stream_StringLiteral.add(name);

            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:388:52: ( KW_WITH KW_SERDEPROPERTIES serdeprops= tableProperties )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==KW_WITH) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:388:53: KW_WITH KW_SERDEPROPERTIES serdeprops= tableProperties
                    {
                    KW_WITH138=(Token)input.LT(1);
                    match(input,KW_WITH,FOLLOW_KW_WITH_in_serdeFormat2299); 
                    stream_KW_WITH.add(KW_WITH138);

                    KW_SERDEPROPERTIES139=(Token)input.LT(1);
                    match(input,KW_SERDEPROPERTIES,FOLLOW_KW_SERDEPROPERTIES_in_serdeFormat2301); 
                    stream_KW_SERDEPROPERTIES.add(KW_SERDEPROPERTIES139);

                    pushFollow(FOLLOW_tableProperties_in_serdeFormat2305);
                    serdeprops=tableProperties();
                    _fsp--;

                    stream_tableProperties.add(serdeprops.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: serdeprops, name
            // token labels: name
            // rule labels: serdeprops, retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleSubtreeStream stream_serdeprops=new RewriteRuleSubtreeStream(adaptor,"token serdeprops",serdeprops!=null?serdeprops.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 389:5: -> ^( TOK_SERDENAME $name ( $serdeprops)? )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:389:8: ^( TOK_SERDENAME $name ( $serdeprops)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_SERDENAME, "TOK_SERDENAME"), root_1);

                adaptor.addChild(root_1, stream_name.next());
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:389:30: ( $serdeprops)?
                if ( stream_serdeprops.hasNext() ) {
                    adaptor.addChild(root_1, stream_serdeprops.next());

                }
                stream_serdeprops.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end serdeFormat

    public static class serdePropertiesFormat_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start serdePropertiesFormat
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:392:1: serdePropertiesFormat : KW_ROW KW_FORMAT KW_DELIMITED ( tableRowFormatFieldIdentifier )? ( tableRowFormatCollItemsIdentifier )? ( tableRowFormatMapKeysIdentifier )? ( tableRowFormatLinesIdentifier )? -> ^( TOK_SERDEPROPS ( tableRowFormatFieldIdentifier )? ( tableRowFormatCollItemsIdentifier )? ( tableRowFormatMapKeysIdentifier )? ( tableRowFormatLinesIdentifier )? ) ;
    public final serdePropertiesFormat_return serdePropertiesFormat() throws RecognitionException {
        serdePropertiesFormat_return retval = new serdePropertiesFormat_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_ROW140=null;
        Token KW_FORMAT141=null;
        Token KW_DELIMITED142=null;
        tableRowFormatFieldIdentifier_return tableRowFormatFieldIdentifier143 = null;

        tableRowFormatCollItemsIdentifier_return tableRowFormatCollItemsIdentifier144 = null;

        tableRowFormatMapKeysIdentifier_return tableRowFormatMapKeysIdentifier145 = null;

        tableRowFormatLinesIdentifier_return tableRowFormatLinesIdentifier146 = null;


        CommonTree KW_ROW140_tree=null;
        CommonTree KW_FORMAT141_tree=null;
        CommonTree KW_DELIMITED142_tree=null;
        RewriteRuleTokenStream stream_KW_DELIMITED=new RewriteRuleTokenStream(adaptor,"token KW_DELIMITED");
        RewriteRuleTokenStream stream_KW_ROW=new RewriteRuleTokenStream(adaptor,"token KW_ROW");
        RewriteRuleTokenStream stream_KW_FORMAT=new RewriteRuleTokenStream(adaptor,"token KW_FORMAT");
        RewriteRuleSubtreeStream stream_tableRowFormatMapKeysIdentifier=new RewriteRuleSubtreeStream(adaptor,"rule tableRowFormatMapKeysIdentifier");
        RewriteRuleSubtreeStream stream_tableRowFormatFieldIdentifier=new RewriteRuleSubtreeStream(adaptor,"rule tableRowFormatFieldIdentifier");
        RewriteRuleSubtreeStream stream_tableRowFormatCollItemsIdentifier=new RewriteRuleSubtreeStream(adaptor,"rule tableRowFormatCollItemsIdentifier");
        RewriteRuleSubtreeStream stream_tableRowFormatLinesIdentifier=new RewriteRuleSubtreeStream(adaptor,"rule tableRowFormatLinesIdentifier");
         msgs.push("serde properties specification"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:395:5: ( KW_ROW KW_FORMAT KW_DELIMITED ( tableRowFormatFieldIdentifier )? ( tableRowFormatCollItemsIdentifier )? ( tableRowFormatMapKeysIdentifier )? ( tableRowFormatLinesIdentifier )? -> ^( TOK_SERDEPROPS ( tableRowFormatFieldIdentifier )? ( tableRowFormatCollItemsIdentifier )? ( tableRowFormatMapKeysIdentifier )? ( tableRowFormatLinesIdentifier )? ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:396:7: KW_ROW KW_FORMAT KW_DELIMITED ( tableRowFormatFieldIdentifier )? ( tableRowFormatCollItemsIdentifier )? ( tableRowFormatMapKeysIdentifier )? ( tableRowFormatLinesIdentifier )?
            {
            KW_ROW140=(Token)input.LT(1);
            match(input,KW_ROW,FOLLOW_KW_ROW_in_serdePropertiesFormat2357); 
            stream_KW_ROW.add(KW_ROW140);

            KW_FORMAT141=(Token)input.LT(1);
            match(input,KW_FORMAT,FOLLOW_KW_FORMAT_in_serdePropertiesFormat2359); 
            stream_KW_FORMAT.add(KW_FORMAT141);

            KW_DELIMITED142=(Token)input.LT(1);
            match(input,KW_DELIMITED,FOLLOW_KW_DELIMITED_in_serdePropertiesFormat2361); 
            stream_KW_DELIMITED.add(KW_DELIMITED142);

            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:396:37: ( tableRowFormatFieldIdentifier )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==KW_FIELDS) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:396:37: tableRowFormatFieldIdentifier
                    {
                    pushFollow(FOLLOW_tableRowFormatFieldIdentifier_in_serdePropertiesFormat2363);
                    tableRowFormatFieldIdentifier143=tableRowFormatFieldIdentifier();
                    _fsp--;

                    stream_tableRowFormatFieldIdentifier.add(tableRowFormatFieldIdentifier143.getTree());

                    }
                    break;

            }

            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:396:68: ( tableRowFormatCollItemsIdentifier )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==KW_COLLECTION) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:396:68: tableRowFormatCollItemsIdentifier
                    {
                    pushFollow(FOLLOW_tableRowFormatCollItemsIdentifier_in_serdePropertiesFormat2366);
                    tableRowFormatCollItemsIdentifier144=tableRowFormatCollItemsIdentifier();
                    _fsp--;

                    stream_tableRowFormatCollItemsIdentifier.add(tableRowFormatCollItemsIdentifier144.getTree());

                    }
                    break;

            }

            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:396:103: ( tableRowFormatMapKeysIdentifier )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==KW_MAP) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==KW_KEYS) ) {
                    alt42=1;
                }
            }
            switch (alt42) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:396:103: tableRowFormatMapKeysIdentifier
                    {
                    pushFollow(FOLLOW_tableRowFormatMapKeysIdentifier_in_serdePropertiesFormat2369);
                    tableRowFormatMapKeysIdentifier145=tableRowFormatMapKeysIdentifier();
                    _fsp--;

                    stream_tableRowFormatMapKeysIdentifier.add(tableRowFormatMapKeysIdentifier145.getTree());

                    }
                    break;

            }

            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:396:136: ( tableRowFormatLinesIdentifier )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==KW_LINES) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:396:136: tableRowFormatLinesIdentifier
                    {
                    pushFollow(FOLLOW_tableRowFormatLinesIdentifier_in_serdePropertiesFormat2372);
                    tableRowFormatLinesIdentifier146=tableRowFormatLinesIdentifier();
                    _fsp--;

                    stream_tableRowFormatLinesIdentifier.add(tableRowFormatLinesIdentifier146.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: tableRowFormatFieldIdentifier, tableRowFormatMapKeysIdentifier, tableRowFormatLinesIdentifier, tableRowFormatCollItemsIdentifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 397:5: -> ^( TOK_SERDEPROPS ( tableRowFormatFieldIdentifier )? ( tableRowFormatCollItemsIdentifier )? ( tableRowFormatMapKeysIdentifier )? ( tableRowFormatLinesIdentifier )? )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:397:8: ^( TOK_SERDEPROPS ( tableRowFormatFieldIdentifier )? ( tableRowFormatCollItemsIdentifier )? ( tableRowFormatMapKeysIdentifier )? ( tableRowFormatLinesIdentifier )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_SERDEPROPS, "TOK_SERDEPROPS"), root_1);

                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:397:25: ( tableRowFormatFieldIdentifier )?
                if ( stream_tableRowFormatFieldIdentifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_tableRowFormatFieldIdentifier.next());

                }
                stream_tableRowFormatFieldIdentifier.reset();
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:397:56: ( tableRowFormatCollItemsIdentifier )?
                if ( stream_tableRowFormatCollItemsIdentifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_tableRowFormatCollItemsIdentifier.next());

                }
                stream_tableRowFormatCollItemsIdentifier.reset();
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:397:91: ( tableRowFormatMapKeysIdentifier )?
                if ( stream_tableRowFormatMapKeysIdentifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_tableRowFormatMapKeysIdentifier.next());

                }
                stream_tableRowFormatMapKeysIdentifier.reset();
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:397:124: ( tableRowFormatLinesIdentifier )?
                if ( stream_tableRowFormatLinesIdentifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_tableRowFormatLinesIdentifier.next());

                }
                stream_tableRowFormatLinesIdentifier.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end serdePropertiesFormat

    public static class tableRowFormat_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start tableRowFormat
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:400:1: tableRowFormat : ( serdePropertiesFormat -> ^( TOK_TABLEROWFORMAT serdePropertiesFormat ) | serdeFormat -> ^( TOK_TABLESERIALIZER serdeFormat ) );
    public final tableRowFormat_return tableRowFormat() throws RecognitionException {
        tableRowFormat_return retval = new tableRowFormat_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        serdePropertiesFormat_return serdePropertiesFormat147 = null;

        serdeFormat_return serdeFormat148 = null;


        RewriteRuleSubtreeStream stream_serdeFormat=new RewriteRuleSubtreeStream(adaptor,"rule serdeFormat");
        RewriteRuleSubtreeStream stream_serdePropertiesFormat=new RewriteRuleSubtreeStream(adaptor,"rule serdePropertiesFormat");
         msgs.push("table row format specification"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:403:5: ( serdePropertiesFormat -> ^( TOK_TABLEROWFORMAT serdePropertiesFormat ) | serdeFormat -> ^( TOK_TABLESERIALIZER serdeFormat ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==KW_ROW) ) {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==KW_FORMAT) ) {
                    int LA44_2 = input.LA(3);

                    if ( (LA44_2==KW_DELIMITED) ) {
                        alt44=1;
                    }
                    else if ( (LA44_2==KW_SERDE) ) {
                        alt44=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("400:1: tableRowFormat : ( serdePropertiesFormat -> ^( TOK_TABLEROWFORMAT serdePropertiesFormat ) | serdeFormat -> ^( TOK_TABLESERIALIZER serdeFormat ) );", 44, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("400:1: tableRowFormat : ( serdePropertiesFormat -> ^( TOK_TABLEROWFORMAT serdePropertiesFormat ) | serdeFormat -> ^( TOK_TABLESERIALIZER serdeFormat ) );", 44, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("400:1: tableRowFormat : ( serdePropertiesFormat -> ^( TOK_TABLEROWFORMAT serdePropertiesFormat ) | serdeFormat -> ^( TOK_TABLESERIALIZER serdeFormat ) );", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:404:7: serdePropertiesFormat
                    {
                    pushFollow(FOLLOW_serdePropertiesFormat_in_tableRowFormat2429);
                    serdePropertiesFormat147=serdePropertiesFormat();
                    _fsp--;

                    stream_serdePropertiesFormat.add(serdePropertiesFormat147.getTree());

                    // AST REWRITE
                    // elements: serdePropertiesFormat
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 405:5: -> ^( TOK_TABLEROWFORMAT serdePropertiesFormat )
                    {
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:405:8: ^( TOK_TABLEROWFORMAT serdePropertiesFormat )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_TABLEROWFORMAT, "TOK_TABLEROWFORMAT"), root_1);

                        adaptor.addChild(root_1, stream_serdePropertiesFormat.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;
                case 2 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:406:7: serdeFormat
                    {
                    pushFollow(FOLLOW_serdeFormat_in_tableRowFormat2449);
                    serdeFormat148=serdeFormat();
                    _fsp--;

                    stream_serdeFormat.add(serdeFormat148.getTree());

                    // AST REWRITE
                    // elements: serdeFormat
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 407:5: -> ^( TOK_TABLESERIALIZER serdeFormat )
                    {
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:407:8: ^( TOK_TABLESERIALIZER serdeFormat )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_TABLESERIALIZER, "TOK_TABLESERIALIZER"), root_1);

                        adaptor.addChild(root_1, stream_serdeFormat.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end tableRowFormat

    public static class tableProperties_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start tableProperties
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:410:1: tableProperties : LPAREN propertiesList RPAREN -> ^( TOK_TABLEPROPERTIES propertiesList ) ;
    public final tableProperties_return tableProperties() throws RecognitionException {
        tableProperties_return retval = new tableProperties_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN149=null;
        Token RPAREN151=null;
        propertiesList_return propertiesList150 = null;


        CommonTree LPAREN149_tree=null;
        CommonTree RPAREN151_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_propertiesList=new RewriteRuleSubtreeStream(adaptor,"rule propertiesList");
         msgs.push("table properties"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:413:5: ( LPAREN propertiesList RPAREN -> ^( TOK_TABLEPROPERTIES propertiesList ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:414:7: LPAREN propertiesList RPAREN
            {
            LPAREN149=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_tableProperties2494); 
            stream_LPAREN.add(LPAREN149);

            pushFollow(FOLLOW_propertiesList_in_tableProperties2496);
            propertiesList150=propertiesList();
            _fsp--;

            stream_propertiesList.add(propertiesList150.getTree());
            RPAREN151=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_tableProperties2498); 
            stream_RPAREN.add(RPAREN151);


            // AST REWRITE
            // elements: propertiesList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 414:36: -> ^( TOK_TABLEPROPERTIES propertiesList )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:414:39: ^( TOK_TABLEPROPERTIES propertiesList )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_TABLEPROPERTIES, "TOK_TABLEPROPERTIES"), root_1);

                adaptor.addChild(root_1, stream_propertiesList.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end tableProperties

    public static class propertiesList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start propertiesList
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:417:1: propertiesList : keyValueProperty ( COMMA keyValueProperty )* -> ^( TOK_TABLEPROPLIST ( keyValueProperty )+ ) ;
    public final propertiesList_return propertiesList() throws RecognitionException {
        propertiesList_return retval = new propertiesList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA153=null;
        keyValueProperty_return keyValueProperty152 = null;

        keyValueProperty_return keyValueProperty154 = null;


        CommonTree COMMA153_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_keyValueProperty=new RewriteRuleSubtreeStream(adaptor,"rule keyValueProperty");
         msgs.push("properties list"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:420:5: ( keyValueProperty ( COMMA keyValueProperty )* -> ^( TOK_TABLEPROPLIST ( keyValueProperty )+ ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:421:7: keyValueProperty ( COMMA keyValueProperty )*
            {
            pushFollow(FOLLOW_keyValueProperty_in_propertiesList2539);
            keyValueProperty152=keyValueProperty();
            _fsp--;

            stream_keyValueProperty.add(keyValueProperty152.getTree());
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:421:24: ( COMMA keyValueProperty )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==COMMA) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:421:25: COMMA keyValueProperty
            	    {
            	    COMMA153=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_propertiesList2542); 
            	    stream_COMMA.add(COMMA153);

            	    pushFollow(FOLLOW_keyValueProperty_in_propertiesList2544);
            	    keyValueProperty154=keyValueProperty();
            	    _fsp--;

            	    stream_keyValueProperty.add(keyValueProperty154.getTree());

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            // AST REWRITE
            // elements: keyValueProperty
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 421:50: -> ^( TOK_TABLEPROPLIST ( keyValueProperty )+ )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:421:53: ^( TOK_TABLEPROPLIST ( keyValueProperty )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_TABLEPROPLIST, "TOK_TABLEPROPLIST"), root_1);

                if ( !(stream_keyValueProperty.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_keyValueProperty.hasNext() ) {
                    adaptor.addChild(root_1, stream_keyValueProperty.next());

                }
                stream_keyValueProperty.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end propertiesList

    public static class keyValueProperty_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start keyValueProperty
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:424:1: keyValueProperty : key= StringLiteral EQUAL value= StringLiteral -> ^( TOK_TABLEPROPERTY $key $value) ;
    public final keyValueProperty_return keyValueProperty() throws RecognitionException {
        keyValueProperty_return retval = new keyValueProperty_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token key=null;
        Token value=null;
        Token EQUAL155=null;

        CommonTree key_tree=null;
        CommonTree value_tree=null;
        CommonTree EQUAL155_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");

         msgs.push("specifying key/value property"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:427:5: (key= StringLiteral EQUAL value= StringLiteral -> ^( TOK_TABLEPROPERTY $key $value) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:428:7: key= StringLiteral EQUAL value= StringLiteral
            {
            key=(Token)input.LT(1);
            match(input,StringLiteral,FOLLOW_StringLiteral_in_keyValueProperty2590); 
            stream_StringLiteral.add(key);

            EQUAL155=(Token)input.LT(1);
            match(input,EQUAL,FOLLOW_EQUAL_in_keyValueProperty2592); 
            stream_EQUAL.add(EQUAL155);

            value=(Token)input.LT(1);
            match(input,StringLiteral,FOLLOW_StringLiteral_in_keyValueProperty2596); 
            stream_StringLiteral.add(value);


            // AST REWRITE
            // elements: key, value
            // token labels: value, key
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_value=new RewriteRuleTokenStream(adaptor,"token value",value);
            RewriteRuleTokenStream stream_key=new RewriteRuleTokenStream(adaptor,"token key",key);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 428:51: -> ^( TOK_TABLEPROPERTY $key $value)
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:428:54: ^( TOK_TABLEPROPERTY $key $value)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_TABLEPROPERTY, "TOK_TABLEPROPERTY"), root_1);

                adaptor.addChild(root_1, stream_key.next());
                adaptor.addChild(root_1, stream_value.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end keyValueProperty

    public static class tableRowFormatFieldIdentifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start tableRowFormatFieldIdentifier
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:431:1: tableRowFormatFieldIdentifier : KW_FIELDS KW_TERMINATED KW_BY fldIdnt= StringLiteral ( KW_ESCAPED KW_BY fldEscape= StringLiteral )? -> ^( TOK_TABLEROWFORMATFIELD $fldIdnt ( $fldEscape)? ) ;
    public final tableRowFormatFieldIdentifier_return tableRowFormatFieldIdentifier() throws RecognitionException {
        tableRowFormatFieldIdentifier_return retval = new tableRowFormatFieldIdentifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token fldIdnt=null;
        Token fldEscape=null;
        Token KW_FIELDS156=null;
        Token KW_TERMINATED157=null;
        Token KW_BY158=null;
        Token KW_ESCAPED159=null;
        Token KW_BY160=null;

        CommonTree fldIdnt_tree=null;
        CommonTree fldEscape_tree=null;
        CommonTree KW_FIELDS156_tree=null;
        CommonTree KW_TERMINATED157_tree=null;
        CommonTree KW_BY158_tree=null;
        CommonTree KW_ESCAPED159_tree=null;
        CommonTree KW_BY160_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_KW_ESCAPED=new RewriteRuleTokenStream(adaptor,"token KW_ESCAPED");
        RewriteRuleTokenStream stream_KW_FIELDS=new RewriteRuleTokenStream(adaptor,"token KW_FIELDS");
        RewriteRuleTokenStream stream_KW_TERMINATED=new RewriteRuleTokenStream(adaptor,"token KW_TERMINATED");
        RewriteRuleTokenStream stream_KW_BY=new RewriteRuleTokenStream(adaptor,"token KW_BY");

         msgs.push("table row format's field separator"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:434:5: ( KW_FIELDS KW_TERMINATED KW_BY fldIdnt= StringLiteral ( KW_ESCAPED KW_BY fldEscape= StringLiteral )? -> ^( TOK_TABLEROWFORMATFIELD $fldIdnt ( $fldEscape)? ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:435:7: KW_FIELDS KW_TERMINATED KW_BY fldIdnt= StringLiteral ( KW_ESCAPED KW_BY fldEscape= StringLiteral )?
            {
            KW_FIELDS156=(Token)input.LT(1);
            match(input,KW_FIELDS,FOLLOW_KW_FIELDS_in_tableRowFormatFieldIdentifier2641); 
            stream_KW_FIELDS.add(KW_FIELDS156);

            KW_TERMINATED157=(Token)input.LT(1);
            match(input,KW_TERMINATED,FOLLOW_KW_TERMINATED_in_tableRowFormatFieldIdentifier2643); 
            stream_KW_TERMINATED.add(KW_TERMINATED157);

            KW_BY158=(Token)input.LT(1);
            match(input,KW_BY,FOLLOW_KW_BY_in_tableRowFormatFieldIdentifier2645); 
            stream_KW_BY.add(KW_BY158);

            fldIdnt=(Token)input.LT(1);
            match(input,StringLiteral,FOLLOW_StringLiteral_in_tableRowFormatFieldIdentifier2649); 
            stream_StringLiteral.add(fldIdnt);

            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:435:59: ( KW_ESCAPED KW_BY fldEscape= StringLiteral )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==KW_ESCAPED) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:435:60: KW_ESCAPED KW_BY fldEscape= StringLiteral
                    {
                    KW_ESCAPED159=(Token)input.LT(1);
                    match(input,KW_ESCAPED,FOLLOW_KW_ESCAPED_in_tableRowFormatFieldIdentifier2652); 
                    stream_KW_ESCAPED.add(KW_ESCAPED159);

                    KW_BY160=(Token)input.LT(1);
                    match(input,KW_BY,FOLLOW_KW_BY_in_tableRowFormatFieldIdentifier2654); 
                    stream_KW_BY.add(KW_BY160);

                    fldEscape=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_tableRowFormatFieldIdentifier2658); 
                    stream_StringLiteral.add(fldEscape);


                    }
                    break;

            }


            // AST REWRITE
            // elements: fldEscape, fldIdnt
            // token labels: fldEscape, fldIdnt
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_fldEscape=new RewriteRuleTokenStream(adaptor,"token fldEscape",fldEscape);
            RewriteRuleTokenStream stream_fldIdnt=new RewriteRuleTokenStream(adaptor,"token fldIdnt",fldIdnt);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 436:5: -> ^( TOK_TABLEROWFORMATFIELD $fldIdnt ( $fldEscape)? )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:436:8: ^( TOK_TABLEROWFORMATFIELD $fldIdnt ( $fldEscape)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_TABLEROWFORMATFIELD, "TOK_TABLEROWFORMATFIELD"), root_1);

                adaptor.addChild(root_1, stream_fldIdnt.next());
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:436:43: ( $fldEscape)?
                if ( stream_fldEscape.hasNext() ) {
                    adaptor.addChild(root_1, stream_fldEscape.next());

                }
                stream_fldEscape.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end tableRowFormatFieldIdentifier

    public static class tableRowFormatCollItemsIdentifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start tableRowFormatCollItemsIdentifier
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:439:1: tableRowFormatCollItemsIdentifier : KW_COLLECTION KW_ITEMS KW_TERMINATED KW_BY collIdnt= StringLiteral -> ^( TOK_TABLEROWFORMATCOLLITEMS $collIdnt) ;
    public final tableRowFormatCollItemsIdentifier_return tableRowFormatCollItemsIdentifier() throws RecognitionException {
        tableRowFormatCollItemsIdentifier_return retval = new tableRowFormatCollItemsIdentifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token collIdnt=null;
        Token KW_COLLECTION161=null;
        Token KW_ITEMS162=null;
        Token KW_TERMINATED163=null;
        Token KW_BY164=null;

        CommonTree collIdnt_tree=null;
        CommonTree KW_COLLECTION161_tree=null;
        CommonTree KW_ITEMS162_tree=null;
        CommonTree KW_TERMINATED163_tree=null;
        CommonTree KW_BY164_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_KW_ITEMS=new RewriteRuleTokenStream(adaptor,"token KW_ITEMS");
        RewriteRuleTokenStream stream_KW_COLLECTION=new RewriteRuleTokenStream(adaptor,"token KW_COLLECTION");
        RewriteRuleTokenStream stream_KW_TERMINATED=new RewriteRuleTokenStream(adaptor,"token KW_TERMINATED");
        RewriteRuleTokenStream stream_KW_BY=new RewriteRuleTokenStream(adaptor,"token KW_BY");

         msgs.push("table row format's column separator"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:442:5: ( KW_COLLECTION KW_ITEMS KW_TERMINATED KW_BY collIdnt= StringLiteral -> ^( TOK_TABLEROWFORMATCOLLITEMS $collIdnt) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:443:7: KW_COLLECTION KW_ITEMS KW_TERMINATED KW_BY collIdnt= StringLiteral
            {
            KW_COLLECTION161=(Token)input.LT(1);
            match(input,KW_COLLECTION,FOLLOW_KW_COLLECTION_in_tableRowFormatCollItemsIdentifier2710); 
            stream_KW_COLLECTION.add(KW_COLLECTION161);

            KW_ITEMS162=(Token)input.LT(1);
            match(input,KW_ITEMS,FOLLOW_KW_ITEMS_in_tableRowFormatCollItemsIdentifier2712); 
            stream_KW_ITEMS.add(KW_ITEMS162);

            KW_TERMINATED163=(Token)input.LT(1);
            match(input,KW_TERMINATED,FOLLOW_KW_TERMINATED_in_tableRowFormatCollItemsIdentifier2714); 
            stream_KW_TERMINATED.add(KW_TERMINATED163);

            KW_BY164=(Token)input.LT(1);
            match(input,KW_BY,FOLLOW_KW_BY_in_tableRowFormatCollItemsIdentifier2716); 
            stream_KW_BY.add(KW_BY164);

            collIdnt=(Token)input.LT(1);
            match(input,StringLiteral,FOLLOW_StringLiteral_in_tableRowFormatCollItemsIdentifier2720); 
            stream_StringLiteral.add(collIdnt);


            // AST REWRITE
            // elements: collIdnt
            // token labels: collIdnt
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_collIdnt=new RewriteRuleTokenStream(adaptor,"token collIdnt",collIdnt);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 444:5: -> ^( TOK_TABLEROWFORMATCOLLITEMS $collIdnt)
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:444:8: ^( TOK_TABLEROWFORMATCOLLITEMS $collIdnt)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_TABLEROWFORMATCOLLITEMS, "TOK_TABLEROWFORMATCOLLITEMS"), root_1);

                adaptor.addChild(root_1, stream_collIdnt.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end tableRowFormatCollItemsIdentifier

    public static class tableRowFormatMapKeysIdentifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start tableRowFormatMapKeysIdentifier
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:447:1: tableRowFormatMapKeysIdentifier : KW_MAP KW_KEYS KW_TERMINATED KW_BY mapKeysIdnt= StringLiteral -> ^( TOK_TABLEROWFORMATMAPKEYS $mapKeysIdnt) ;
    public final tableRowFormatMapKeysIdentifier_return tableRowFormatMapKeysIdentifier() throws RecognitionException {
        tableRowFormatMapKeysIdentifier_return retval = new tableRowFormatMapKeysIdentifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token mapKeysIdnt=null;
        Token KW_MAP165=null;
        Token KW_KEYS166=null;
        Token KW_TERMINATED167=null;
        Token KW_BY168=null;

        CommonTree mapKeysIdnt_tree=null;
        CommonTree KW_MAP165_tree=null;
        CommonTree KW_KEYS166_tree=null;
        CommonTree KW_TERMINATED167_tree=null;
        CommonTree KW_BY168_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_KW_KEYS=new RewriteRuleTokenStream(adaptor,"token KW_KEYS");
        RewriteRuleTokenStream stream_KW_MAP=new RewriteRuleTokenStream(adaptor,"token KW_MAP");
        RewriteRuleTokenStream stream_KW_TERMINATED=new RewriteRuleTokenStream(adaptor,"token KW_TERMINATED");
        RewriteRuleTokenStream stream_KW_BY=new RewriteRuleTokenStream(adaptor,"token KW_BY");

         msgs.push("table row format's map key separator"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:450:5: ( KW_MAP KW_KEYS KW_TERMINATED KW_BY mapKeysIdnt= StringLiteral -> ^( TOK_TABLEROWFORMATMAPKEYS $mapKeysIdnt) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:451:7: KW_MAP KW_KEYS KW_TERMINATED KW_BY mapKeysIdnt= StringLiteral
            {
            KW_MAP165=(Token)input.LT(1);
            match(input,KW_MAP,FOLLOW_KW_MAP_in_tableRowFormatMapKeysIdentifier2766); 
            stream_KW_MAP.add(KW_MAP165);

            KW_KEYS166=(Token)input.LT(1);
            match(input,KW_KEYS,FOLLOW_KW_KEYS_in_tableRowFormatMapKeysIdentifier2768); 
            stream_KW_KEYS.add(KW_KEYS166);

            KW_TERMINATED167=(Token)input.LT(1);
            match(input,KW_TERMINATED,FOLLOW_KW_TERMINATED_in_tableRowFormatMapKeysIdentifier2770); 
            stream_KW_TERMINATED.add(KW_TERMINATED167);

            KW_BY168=(Token)input.LT(1);
            match(input,KW_BY,FOLLOW_KW_BY_in_tableRowFormatMapKeysIdentifier2772); 
            stream_KW_BY.add(KW_BY168);

            mapKeysIdnt=(Token)input.LT(1);
            match(input,StringLiteral,FOLLOW_StringLiteral_in_tableRowFormatMapKeysIdentifier2776); 
            stream_StringLiteral.add(mapKeysIdnt);


            // AST REWRITE
            // elements: mapKeysIdnt
            // token labels: mapKeysIdnt
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_mapKeysIdnt=new RewriteRuleTokenStream(adaptor,"token mapKeysIdnt",mapKeysIdnt);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 452:5: -> ^( TOK_TABLEROWFORMATMAPKEYS $mapKeysIdnt)
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:452:8: ^( TOK_TABLEROWFORMATMAPKEYS $mapKeysIdnt)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_TABLEROWFORMATMAPKEYS, "TOK_TABLEROWFORMATMAPKEYS"), root_1);

                adaptor.addChild(root_1, stream_mapKeysIdnt.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end tableRowFormatMapKeysIdentifier

    public static class tableRowFormatLinesIdentifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start tableRowFormatLinesIdentifier
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:455:1: tableRowFormatLinesIdentifier : KW_LINES KW_TERMINATED KW_BY linesIdnt= StringLiteral -> ^( TOK_TABLEROWFORMATLINES $linesIdnt) ;
    public final tableRowFormatLinesIdentifier_return tableRowFormatLinesIdentifier() throws RecognitionException {
        tableRowFormatLinesIdentifier_return retval = new tableRowFormatLinesIdentifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token linesIdnt=null;
        Token KW_LINES169=null;
        Token KW_TERMINATED170=null;
        Token KW_BY171=null;

        CommonTree linesIdnt_tree=null;
        CommonTree KW_LINES169_tree=null;
        CommonTree KW_TERMINATED170_tree=null;
        CommonTree KW_BY171_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_KW_LINES=new RewriteRuleTokenStream(adaptor,"token KW_LINES");
        RewriteRuleTokenStream stream_KW_TERMINATED=new RewriteRuleTokenStream(adaptor,"token KW_TERMINATED");
        RewriteRuleTokenStream stream_KW_BY=new RewriteRuleTokenStream(adaptor,"token KW_BY");

         msgs.push("table row format's line separator"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:458:5: ( KW_LINES KW_TERMINATED KW_BY linesIdnt= StringLiteral -> ^( TOK_TABLEROWFORMATLINES $linesIdnt) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:459:7: KW_LINES KW_TERMINATED KW_BY linesIdnt= StringLiteral
            {
            KW_LINES169=(Token)input.LT(1);
            match(input,KW_LINES,FOLLOW_KW_LINES_in_tableRowFormatLinesIdentifier2822); 
            stream_KW_LINES.add(KW_LINES169);

            KW_TERMINATED170=(Token)input.LT(1);
            match(input,KW_TERMINATED,FOLLOW_KW_TERMINATED_in_tableRowFormatLinesIdentifier2824); 
            stream_KW_TERMINATED.add(KW_TERMINATED170);

            KW_BY171=(Token)input.LT(1);
            match(input,KW_BY,FOLLOW_KW_BY_in_tableRowFormatLinesIdentifier2826); 
            stream_KW_BY.add(KW_BY171);

            linesIdnt=(Token)input.LT(1);
            match(input,StringLiteral,FOLLOW_StringLiteral_in_tableRowFormatLinesIdentifier2830); 
            stream_StringLiteral.add(linesIdnt);


            // AST REWRITE
            // elements: linesIdnt
            // token labels: linesIdnt
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_linesIdnt=new RewriteRuleTokenStream(adaptor,"token linesIdnt",linesIdnt);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 460:5: -> ^( TOK_TABLEROWFORMATLINES $linesIdnt)
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:460:8: ^( TOK_TABLEROWFORMATLINES $linesIdnt)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_TABLEROWFORMATLINES, "TOK_TABLEROWFORMATLINES"), root_1);

                adaptor.addChild(root_1, stream_linesIdnt.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end tableRowFormatLinesIdentifier

    public static class tableFileFormat_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start tableFileFormat
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:463:1: tableFileFormat : ( KW_STORED KW_AS KW_SEQUENCEFILE -> TOK_TBLSEQUENCEFILE | KW_STORED KW_AS KW_TEXTFILE -> TOK_TBLTEXTFILE | KW_STORED KW_AS KW_RCFILE -> TOK_TBLRCFILE | KW_STORED KW_AS KW_INPUTFORMAT inFmt= StringLiteral KW_OUTPUTFORMAT outFmt= StringLiteral -> ^( TOK_TABLEFILEFORMAT $inFmt $outFmt) );
    public final tableFileFormat_return tableFileFormat() throws RecognitionException {
        tableFileFormat_return retval = new tableFileFormat_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token inFmt=null;
        Token outFmt=null;
        Token KW_STORED172=null;
        Token KW_AS173=null;
        Token KW_SEQUENCEFILE174=null;
        Token KW_STORED175=null;
        Token KW_AS176=null;
        Token KW_TEXTFILE177=null;
        Token KW_STORED178=null;
        Token KW_AS179=null;
        Token KW_RCFILE180=null;
        Token KW_STORED181=null;
        Token KW_AS182=null;
        Token KW_INPUTFORMAT183=null;
        Token KW_OUTPUTFORMAT184=null;

        CommonTree inFmt_tree=null;
        CommonTree outFmt_tree=null;
        CommonTree KW_STORED172_tree=null;
        CommonTree KW_AS173_tree=null;
        CommonTree KW_SEQUENCEFILE174_tree=null;
        CommonTree KW_STORED175_tree=null;
        CommonTree KW_AS176_tree=null;
        CommonTree KW_TEXTFILE177_tree=null;
        CommonTree KW_STORED178_tree=null;
        CommonTree KW_AS179_tree=null;
        CommonTree KW_RCFILE180_tree=null;
        CommonTree KW_STORED181_tree=null;
        CommonTree KW_AS182_tree=null;
        CommonTree KW_INPUTFORMAT183_tree=null;
        CommonTree KW_OUTPUTFORMAT184_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_KW_RCFILE=new RewriteRuleTokenStream(adaptor,"token KW_RCFILE");
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleTokenStream stream_KW_INPUTFORMAT=new RewriteRuleTokenStream(adaptor,"token KW_INPUTFORMAT");
        RewriteRuleTokenStream stream_KW_OUTPUTFORMAT=new RewriteRuleTokenStream(adaptor,"token KW_OUTPUTFORMAT");
        RewriteRuleTokenStream stream_KW_STORED=new RewriteRuleTokenStream(adaptor,"token KW_STORED");
        RewriteRuleTokenStream stream_KW_SEQUENCEFILE=new RewriteRuleTokenStream(adaptor,"token KW_SEQUENCEFILE");
        RewriteRuleTokenStream stream_KW_TEXTFILE=new RewriteRuleTokenStream(adaptor,"token KW_TEXTFILE");

         msgs.push("table file format specification"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:466:5: ( KW_STORED KW_AS KW_SEQUENCEFILE -> TOK_TBLSEQUENCEFILE | KW_STORED KW_AS KW_TEXTFILE -> TOK_TBLTEXTFILE | KW_STORED KW_AS KW_RCFILE -> TOK_TBLRCFILE | KW_STORED KW_AS KW_INPUTFORMAT inFmt= StringLiteral KW_OUTPUTFORMAT outFmt= StringLiteral -> ^( TOK_TABLEFILEFORMAT $inFmt $outFmt) )
            int alt47=4;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==KW_STORED) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==KW_AS) ) {
                    switch ( input.LA(3) ) {
                    case KW_SEQUENCEFILE:
                        {
                        alt47=1;
                        }
                        break;
                    case KW_INPUTFORMAT:
                        {
                        alt47=4;
                        }
                        break;
                    case KW_TEXTFILE:
                        {
                        alt47=2;
                        }
                        break;
                    case KW_RCFILE:
                        {
                        alt47=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("463:1: tableFileFormat : ( KW_STORED KW_AS KW_SEQUENCEFILE -> TOK_TBLSEQUENCEFILE | KW_STORED KW_AS KW_TEXTFILE -> TOK_TBLTEXTFILE | KW_STORED KW_AS KW_RCFILE -> TOK_TBLRCFILE | KW_STORED KW_AS KW_INPUTFORMAT inFmt= StringLiteral KW_OUTPUTFORMAT outFmt= StringLiteral -> ^( TOK_TABLEFILEFORMAT $inFmt $outFmt) );", 47, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("463:1: tableFileFormat : ( KW_STORED KW_AS KW_SEQUENCEFILE -> TOK_TBLSEQUENCEFILE | KW_STORED KW_AS KW_TEXTFILE -> TOK_TBLTEXTFILE | KW_STORED KW_AS KW_RCFILE -> TOK_TBLRCFILE | KW_STORED KW_AS KW_INPUTFORMAT inFmt= StringLiteral KW_OUTPUTFORMAT outFmt= StringLiteral -> ^( TOK_TABLEFILEFORMAT $inFmt $outFmt) );", 47, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("463:1: tableFileFormat : ( KW_STORED KW_AS KW_SEQUENCEFILE -> TOK_TBLSEQUENCEFILE | KW_STORED KW_AS KW_TEXTFILE -> TOK_TBLTEXTFILE | KW_STORED KW_AS KW_RCFILE -> TOK_TBLRCFILE | KW_STORED KW_AS KW_INPUTFORMAT inFmt= StringLiteral KW_OUTPUTFORMAT outFmt= StringLiteral -> ^( TOK_TABLEFILEFORMAT $inFmt $outFmt) );", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:467:7: KW_STORED KW_AS KW_SEQUENCEFILE
                    {
                    KW_STORED172=(Token)input.LT(1);
                    match(input,KW_STORED,FOLLOW_KW_STORED_in_tableFileFormat2876); 
                    stream_KW_STORED.add(KW_STORED172);

                    KW_AS173=(Token)input.LT(1);
                    match(input,KW_AS,FOLLOW_KW_AS_in_tableFileFormat2878); 
                    stream_KW_AS.add(KW_AS173);

                    KW_SEQUENCEFILE174=(Token)input.LT(1);
                    match(input,KW_SEQUENCEFILE,FOLLOW_KW_SEQUENCEFILE_in_tableFileFormat2880); 
                    stream_KW_SEQUENCEFILE.add(KW_SEQUENCEFILE174);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 467:40: -> TOK_TBLSEQUENCEFILE
                    {
                        adaptor.addChild(root_0, adaptor.create(TOK_TBLSEQUENCEFILE, "TOK_TBLSEQUENCEFILE"));

                    }



                    }
                    break;
                case 2 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:468:9: KW_STORED KW_AS KW_TEXTFILE
                    {
                    KW_STORED175=(Token)input.LT(1);
                    match(input,KW_STORED,FOLLOW_KW_STORED_in_tableFileFormat2895); 
                    stream_KW_STORED.add(KW_STORED175);

                    KW_AS176=(Token)input.LT(1);
                    match(input,KW_AS,FOLLOW_KW_AS_in_tableFileFormat2897); 
                    stream_KW_AS.add(KW_AS176);

                    KW_TEXTFILE177=(Token)input.LT(1);
                    match(input,KW_TEXTFILE,FOLLOW_KW_TEXTFILE_in_tableFileFormat2899); 
                    stream_KW_TEXTFILE.add(KW_TEXTFILE177);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 468:38: -> TOK_TBLTEXTFILE
                    {
                        adaptor.addChild(root_0, adaptor.create(TOK_TBLTEXTFILE, "TOK_TBLTEXTFILE"));

                    }



                    }
                    break;
                case 3 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:469:9: KW_STORED KW_AS KW_RCFILE
                    {
                    KW_STORED178=(Token)input.LT(1);
                    match(input,KW_STORED,FOLLOW_KW_STORED_in_tableFileFormat2914); 
                    stream_KW_STORED.add(KW_STORED178);

                    KW_AS179=(Token)input.LT(1);
                    match(input,KW_AS,FOLLOW_KW_AS_in_tableFileFormat2916); 
                    stream_KW_AS.add(KW_AS179);

                    KW_RCFILE180=(Token)input.LT(1);
                    match(input,KW_RCFILE,FOLLOW_KW_RCFILE_in_tableFileFormat2918); 
                    stream_KW_RCFILE.add(KW_RCFILE180);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 469:36: -> TOK_TBLRCFILE
                    {
                        adaptor.addChild(root_0, adaptor.create(TOK_TBLRCFILE, "TOK_TBLRCFILE"));

                    }



                    }
                    break;
                case 4 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:470:9: KW_STORED KW_AS KW_INPUTFORMAT inFmt= StringLiteral KW_OUTPUTFORMAT outFmt= StringLiteral
                    {
                    KW_STORED181=(Token)input.LT(1);
                    match(input,KW_STORED,FOLLOW_KW_STORED_in_tableFileFormat2933); 
                    stream_KW_STORED.add(KW_STORED181);

                    KW_AS182=(Token)input.LT(1);
                    match(input,KW_AS,FOLLOW_KW_AS_in_tableFileFormat2935); 
                    stream_KW_AS.add(KW_AS182);

                    KW_INPUTFORMAT183=(Token)input.LT(1);
                    match(input,KW_INPUTFORMAT,FOLLOW_KW_INPUTFORMAT_in_tableFileFormat2937); 
                    stream_KW_INPUTFORMAT.add(KW_INPUTFORMAT183);

                    inFmt=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_tableFileFormat2941); 
                    stream_StringLiteral.add(inFmt);

                    KW_OUTPUTFORMAT184=(Token)input.LT(1);
                    match(input,KW_OUTPUTFORMAT,FOLLOW_KW_OUTPUTFORMAT_in_tableFileFormat2943); 
                    stream_KW_OUTPUTFORMAT.add(KW_OUTPUTFORMAT184);

                    outFmt=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_tableFileFormat2947); 
                    stream_StringLiteral.add(outFmt);


                    // AST REWRITE
                    // elements: outFmt, inFmt
                    // token labels: outFmt, inFmt
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_outFmt=new RewriteRuleTokenStream(adaptor,"token outFmt",outFmt);
                    RewriteRuleTokenStream stream_inFmt=new RewriteRuleTokenStream(adaptor,"token inFmt",inFmt);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 471:7: -> ^( TOK_TABLEFILEFORMAT $inFmt $outFmt)
                    {
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:471:10: ^( TOK_TABLEFILEFORMAT $inFmt $outFmt)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_TABLEFILEFORMAT, "TOK_TABLEFILEFORMAT"), root_1);

                        adaptor.addChild(root_1, stream_inFmt.next());
                        adaptor.addChild(root_1, stream_outFmt.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end tableFileFormat

    public static class tableLocation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start tableLocation
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:474:1: tableLocation : KW_LOCATION locn= StringLiteral -> ^( TOK_TABLELOCATION $locn) ;
    public final tableLocation_return tableLocation() throws RecognitionException {
        tableLocation_return retval = new tableLocation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token locn=null;
        Token KW_LOCATION185=null;

        CommonTree locn_tree=null;
        CommonTree KW_LOCATION185_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_KW_LOCATION=new RewriteRuleTokenStream(adaptor,"token KW_LOCATION");

         msgs.push("table location specification"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:477:5: ( KW_LOCATION locn= StringLiteral -> ^( TOK_TABLELOCATION $locn) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:478:7: KW_LOCATION locn= StringLiteral
            {
            KW_LOCATION185=(Token)input.LT(1);
            match(input,KW_LOCATION,FOLLOW_KW_LOCATION_in_tableLocation2998); 
            stream_KW_LOCATION.add(KW_LOCATION185);

            locn=(Token)input.LT(1);
            match(input,StringLiteral,FOLLOW_StringLiteral_in_tableLocation3002); 
            stream_StringLiteral.add(locn);


            // AST REWRITE
            // elements: locn
            // token labels: locn
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_locn=new RewriteRuleTokenStream(adaptor,"token locn",locn);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 478:38: -> ^( TOK_TABLELOCATION $locn)
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:478:41: ^( TOK_TABLELOCATION $locn)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_TABLELOCATION, "TOK_TABLELOCATION"), root_1);

                adaptor.addChild(root_1, stream_locn.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end tableLocation

    public static class columnNameTypeList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start columnNameTypeList
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:481:1: columnNameTypeList : columnNameType ( COMMA columnNameType )* -> ^( TOK_TABCOLLIST ( columnNameType )+ ) ;
    public final columnNameTypeList_return columnNameTypeList() throws RecognitionException {
        columnNameTypeList_return retval = new columnNameTypeList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA187=null;
        columnNameType_return columnNameType186 = null;

        columnNameType_return columnNameType188 = null;


        CommonTree COMMA187_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_columnNameType=new RewriteRuleSubtreeStream(adaptor,"rule columnNameType");
         msgs.push("column name type list"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:484:5: ( columnNameType ( COMMA columnNameType )* -> ^( TOK_TABCOLLIST ( columnNameType )+ ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:484:7: columnNameType ( COMMA columnNameType )*
            {
            pushFollow(FOLLOW_columnNameType_in_columnNameTypeList3040);
            columnNameType186=columnNameType();
            _fsp--;

            stream_columnNameType.add(columnNameType186.getTree());
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:484:22: ( COMMA columnNameType )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==COMMA) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:484:23: COMMA columnNameType
            	    {
            	    COMMA187=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_columnNameTypeList3043); 
            	    stream_COMMA.add(COMMA187);

            	    pushFollow(FOLLOW_columnNameType_in_columnNameTypeList3045);
            	    columnNameType188=columnNameType();
            	    _fsp--;

            	    stream_columnNameType.add(columnNameType188.getTree());

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            // AST REWRITE
            // elements: columnNameType
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 484:46: -> ^( TOK_TABCOLLIST ( columnNameType )+ )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:484:49: ^( TOK_TABCOLLIST ( columnNameType )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_TABCOLLIST, "TOK_TABCOLLIST"), root_1);

                if ( !(stream_columnNameType.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_columnNameType.hasNext() ) {
                    adaptor.addChild(root_1, stream_columnNameType.next());

                }
                stream_columnNameType.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end columnNameTypeList

    public static class columnNameList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start columnNameList
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:487:1: columnNameList : columnName ( COMMA columnName )* -> ^( TOK_TABCOLNAME ( columnName )+ ) ;
    public final columnNameList_return columnNameList() throws RecognitionException {
        columnNameList_return retval = new columnNameList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA190=null;
        columnName_return columnName189 = null;

        columnName_return columnName191 = null;


        CommonTree COMMA190_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_columnName=new RewriteRuleSubtreeStream(adaptor,"rule columnName");
         msgs.push("column name list"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:490:5: ( columnName ( COMMA columnName )* -> ^( TOK_TABCOLNAME ( columnName )+ ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:490:7: columnName ( COMMA columnName )*
            {
            pushFollow(FOLLOW_columnName_in_columnNameList3083);
            columnName189=columnName();
            _fsp--;

            stream_columnName.add(columnName189.getTree());
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:490:18: ( COMMA columnName )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==COMMA) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:490:19: COMMA columnName
            	    {
            	    COMMA190=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_columnNameList3086); 
            	    stream_COMMA.add(COMMA190);

            	    pushFollow(FOLLOW_columnName_in_columnNameList3088);
            	    columnName191=columnName();
            	    _fsp--;

            	    stream_columnName.add(columnName191.getTree());

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            // AST REWRITE
            // elements: columnName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 490:38: -> ^( TOK_TABCOLNAME ( columnName )+ )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:490:41: ^( TOK_TABCOLNAME ( columnName )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_TABCOLNAME, "TOK_TABCOLNAME"), root_1);

                if ( !(stream_columnName.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_columnName.hasNext() ) {
                    adaptor.addChild(root_1, stream_columnName.next());

                }
                stream_columnName.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end columnNameList

    public static class columnName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start columnName
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:493:1: columnName : Identifier ;
    public final columnName_return columnName() throws RecognitionException {
        columnName_return retval = new columnName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier192=null;

        CommonTree Identifier192_tree=null;

         msgs.push("column name"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:496:5: ( Identifier )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:497:7: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier192=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_columnName3132); 
            Identifier192_tree = (CommonTree)adaptor.create(Identifier192);
            adaptor.addChild(root_0, Identifier192_tree);


            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end columnName

    public static class columnNameOrderList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start columnNameOrderList
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:500:1: columnNameOrderList : columnNameOrder ( COMMA columnNameOrder )* -> ^( TOK_TABCOLNAME ( columnNameOrder )+ ) ;
    public final columnNameOrderList_return columnNameOrderList() throws RecognitionException {
        columnNameOrderList_return retval = new columnNameOrderList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA194=null;
        columnNameOrder_return columnNameOrder193 = null;

        columnNameOrder_return columnNameOrder195 = null;


        CommonTree COMMA194_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_columnNameOrder=new RewriteRuleSubtreeStream(adaptor,"rule columnNameOrder");
         msgs.push("column name order list"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:503:5: ( columnNameOrder ( COMMA columnNameOrder )* -> ^( TOK_TABCOLNAME ( columnNameOrder )+ ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:503:7: columnNameOrder ( COMMA columnNameOrder )*
            {
            pushFollow(FOLLOW_columnNameOrder_in_columnNameOrderList3159);
            columnNameOrder193=columnNameOrder();
            _fsp--;

            stream_columnNameOrder.add(columnNameOrder193.getTree());
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:503:23: ( COMMA columnNameOrder )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==COMMA) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:503:24: COMMA columnNameOrder
            	    {
            	    COMMA194=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_columnNameOrderList3162); 
            	    stream_COMMA.add(COMMA194);

            	    pushFollow(FOLLOW_columnNameOrder_in_columnNameOrderList3164);
            	    columnNameOrder195=columnNameOrder();
            	    _fsp--;

            	    stream_columnNameOrder.add(columnNameOrder195.getTree());

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            // AST REWRITE
            // elements: columnNameOrder
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 503:48: -> ^( TOK_TABCOLNAME ( columnNameOrder )+ )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:503:51: ^( TOK_TABCOLNAME ( columnNameOrder )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_TABCOLNAME, "TOK_TABCOLNAME"), root_1);

                if ( !(stream_columnNameOrder.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_columnNameOrder.hasNext() ) {
                    adaptor.addChild(root_1, stream_columnNameOrder.next());

                }
                stream_columnNameOrder.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end columnNameOrderList

    public static class columnNameOrder_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start columnNameOrder
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:506:1: columnNameOrder : Identifier (asc= KW_ASC | desc= KW_DESC )? -> {$desc == null}? ^( TOK_TABSORTCOLNAMEASC Identifier ) -> ^( TOK_TABSORTCOLNAMEDESC Identifier ) ;
    public final columnNameOrder_return columnNameOrder() throws RecognitionException {
        columnNameOrder_return retval = new columnNameOrder_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token asc=null;
        Token desc=null;
        Token Identifier196=null;

        CommonTree asc_tree=null;
        CommonTree desc_tree=null;
        CommonTree Identifier196_tree=null;
        RewriteRuleTokenStream stream_KW_DESC=new RewriteRuleTokenStream(adaptor,"token KW_DESC");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_KW_ASC=new RewriteRuleTokenStream(adaptor,"token KW_ASC");

         msgs.push("column name order"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:509:5: ( Identifier (asc= KW_ASC | desc= KW_DESC )? -> {$desc == null}? ^( TOK_TABSORTCOLNAMEASC Identifier ) -> ^( TOK_TABSORTCOLNAMEDESC Identifier ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:509:7: Identifier (asc= KW_ASC | desc= KW_DESC )?
            {
            Identifier196=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_columnNameOrder3202); 
            stream_Identifier.add(Identifier196);

            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:509:18: (asc= KW_ASC | desc= KW_DESC )?
            int alt51=3;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==KW_ASC) ) {
                alt51=1;
            }
            else if ( (LA51_0==KW_DESC) ) {
                alt51=2;
            }
            switch (alt51) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:509:19: asc= KW_ASC
                    {
                    asc=(Token)input.LT(1);
                    match(input,KW_ASC,FOLLOW_KW_ASC_in_columnNameOrder3207); 
                    stream_KW_ASC.add(asc);


                    }
                    break;
                case 2 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:509:32: desc= KW_DESC
                    {
                    desc=(Token)input.LT(1);
                    match(input,KW_DESC,FOLLOW_KW_DESC_in_columnNameOrder3213); 
                    stream_KW_DESC.add(desc);


                    }
                    break;

            }


            // AST REWRITE
            // elements: Identifier, Identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 510:5: -> {$desc == null}? ^( TOK_TABSORTCOLNAMEASC Identifier )
            if (desc == null) {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:510:25: ^( TOK_TABSORTCOLNAMEASC Identifier )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_TABSORTCOLNAMEASC, "TOK_TABSORTCOLNAMEASC"), root_1);

                adaptor.addChild(root_1, stream_Identifier.next());

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 511:5: -> ^( TOK_TABSORTCOLNAMEDESC Identifier )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:511:25: ^( TOK_TABSORTCOLNAMEDESC Identifier )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_TABSORTCOLNAMEDESC, "TOK_TABSORTCOLNAMEDESC"), root_1);

                adaptor.addChild(root_1, stream_Identifier.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end columnNameOrder

    public static class columnRefOrder_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start columnRefOrder
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:514:1: columnRefOrder : expression (asc= KW_ASC | desc= KW_DESC )? -> {$desc == null}? ^( TOK_TABSORTCOLNAMEASC expression ) -> ^( TOK_TABSORTCOLNAMEDESC expression ) ;
    public final columnRefOrder_return columnRefOrder() throws RecognitionException {
        columnRefOrder_return retval = new columnRefOrder_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token asc=null;
        Token desc=null;
        expression_return expression197 = null;


        CommonTree asc_tree=null;
        CommonTree desc_tree=null;
        RewriteRuleTokenStream stream_KW_DESC=new RewriteRuleTokenStream(adaptor,"token KW_DESC");
        RewriteRuleTokenStream stream_KW_ASC=new RewriteRuleTokenStream(adaptor,"token KW_ASC");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
         msgs.push("column order"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:517:5: ( expression (asc= KW_ASC | desc= KW_DESC )? -> {$desc == null}? ^( TOK_TABSORTCOLNAMEASC expression ) -> ^( TOK_TABSORTCOLNAMEDESC expression ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:517:7: expression (asc= KW_ASC | desc= KW_DESC )?
            {
            pushFollow(FOLLOW_expression_in_columnRefOrder3286);
            expression197=expression();
            _fsp--;

            stream_expression.add(expression197.getTree());
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:517:18: (asc= KW_ASC | desc= KW_DESC )?
            int alt52=3;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==KW_ASC) ) {
                alt52=1;
            }
            else if ( (LA52_0==KW_DESC) ) {
                alt52=2;
            }
            switch (alt52) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:517:19: asc= KW_ASC
                    {
                    asc=(Token)input.LT(1);
                    match(input,KW_ASC,FOLLOW_KW_ASC_in_columnRefOrder3291); 
                    stream_KW_ASC.add(asc);


                    }
                    break;
                case 2 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:517:32: desc= KW_DESC
                    {
                    desc=(Token)input.LT(1);
                    match(input,KW_DESC,FOLLOW_KW_DESC_in_columnRefOrder3297); 
                    stream_KW_DESC.add(desc);


                    }
                    break;

            }


            // AST REWRITE
            // elements: expression, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 518:5: -> {$desc == null}? ^( TOK_TABSORTCOLNAMEASC expression )
            if (desc == null) {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:518:25: ^( TOK_TABSORTCOLNAMEASC expression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_TABSORTCOLNAMEASC, "TOK_TABSORTCOLNAMEASC"), root_1);

                adaptor.addChild(root_1, stream_expression.next());

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 519:5: -> ^( TOK_TABSORTCOLNAMEDESC expression )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:519:25: ^( TOK_TABSORTCOLNAMEDESC expression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_TABSORTCOLNAMEDESC, "TOK_TABSORTCOLNAMEDESC"), root_1);

                adaptor.addChild(root_1, stream_expression.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end columnRefOrder

    public static class columnNameType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start columnNameType
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:522:1: columnNameType : colName= Identifier colType ( KW_COMMENT comment= StringLiteral )? -> {$comment == null}? ^( TOK_TABCOL $colName colType ) -> ^( TOK_TABCOL $colName colType $comment) ;
    public final columnNameType_return columnNameType() throws RecognitionException {
        columnNameType_return retval = new columnNameType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token colName=null;
        Token comment=null;
        Token KW_COMMENT199=null;
        colType_return colType198 = null;


        CommonTree colName_tree=null;
        CommonTree comment_tree=null;
        CommonTree KW_COMMENT199_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_KW_COMMENT=new RewriteRuleTokenStream(adaptor,"token KW_COMMENT");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_colType=new RewriteRuleSubtreeStream(adaptor,"rule colType");
         msgs.push("column specification"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:525:5: (colName= Identifier colType ( KW_COMMENT comment= StringLiteral )? -> {$comment == null}? ^( TOK_TABCOL $colName colType ) -> ^( TOK_TABCOL $colName colType $comment) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:525:7: colName= Identifier colType ( KW_COMMENT comment= StringLiteral )?
            {
            colName=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_columnNameType3372); 
            stream_Identifier.add(colName);

            pushFollow(FOLLOW_colType_in_columnNameType3374);
            colType198=colType();
            _fsp--;

            stream_colType.add(colType198.getTree());
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:525:34: ( KW_COMMENT comment= StringLiteral )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==KW_COMMENT) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:525:35: KW_COMMENT comment= StringLiteral
                    {
                    KW_COMMENT199=(Token)input.LT(1);
                    match(input,KW_COMMENT,FOLLOW_KW_COMMENT_in_columnNameType3377); 
                    stream_KW_COMMENT.add(KW_COMMENT199);

                    comment=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_columnNameType3381); 
                    stream_StringLiteral.add(comment);


                    }
                    break;

            }


            // AST REWRITE
            // elements: colName, comment, colType, colType, colName
            // token labels: comment, colName
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_comment=new RewriteRuleTokenStream(adaptor,"token comment",comment);
            RewriteRuleTokenStream stream_colName=new RewriteRuleTokenStream(adaptor,"token colName",colName);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 526:5: -> {$comment == null}? ^( TOK_TABCOL $colName colType )
            if (comment == null) {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:526:28: ^( TOK_TABCOL $colName colType )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_TABCOL, "TOK_TABCOL"), root_1);

                adaptor.addChild(root_1, stream_colName.next());
                adaptor.addChild(root_1, stream_colType.next());

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 527:5: -> ^( TOK_TABCOL $colName colType $comment)
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:527:28: ^( TOK_TABCOL $colName colType $comment)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_TABCOL, "TOK_TABCOL"), root_1);

                adaptor.addChild(root_1, stream_colName.next());
                adaptor.addChild(root_1, stream_colType.next());
                adaptor.addChild(root_1, stream_comment.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end columnNameType

    public static class colType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start colType
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:530:1: colType : type ;
    public final colType_return colType() throws RecognitionException {
        colType_return retval = new colType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        type_return type200 = null;



         msgs.push("column type"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:533:5: ( type )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:533:7: type
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_type_in_colType3469);
            type200=type();
            _fsp--;

            adaptor.addChild(root_0, type200.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end colType

    public static class type_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start type
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:536:1: type : ( primitiveType | listType | mapType );
    public final type_return type() throws RecognitionException {
        type_return retval = new type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        primitiveType_return primitiveType201 = null;

        listType_return listType202 = null;

        mapType_return mapType203 = null;



        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:537:5: ( primitiveType | listType | mapType )
            int alt54=3;
            switch ( input.LA(1) ) {
            case KW_TINYINT:
            case KW_SMALLINT:
            case KW_INT:
            case KW_BIGINT:
            case KW_BOOLEAN:
            case KW_FLOAT:
            case KW_DOUBLE:
            case KW_DATE:
            case KW_DATETIME:
            case KW_TIMESTAMP:
            case KW_STRING:
                {
                alt54=1;
                }
                break;
            case KW_ARRAY:
                {
                alt54=2;
                }
                break;
            case KW_MAP:
                {
                alt54=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("536:1: type : ( primitiveType | listType | mapType );", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:537:7: primitiveType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_primitiveType_in_type3486);
                    primitiveType201=primitiveType();
                    _fsp--;

                    adaptor.addChild(root_0, primitiveType201.getTree());

                    }
                    break;
                case 2 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:538:7: listType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_listType_in_type3494);
                    listType202=listType();
                    _fsp--;

                    adaptor.addChild(root_0, listType202.getTree());

                    }
                    break;
                case 3 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:539:7: mapType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_mapType_in_type3502);
                    mapType203=mapType();
                    _fsp--;

                    adaptor.addChild(root_0, mapType203.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end type

    public static class primitiveType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start primitiveType
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:541:1: primitiveType : ( KW_TINYINT -> TOK_TINYINT | KW_SMALLINT -> TOK_SMALLINT | KW_INT -> TOK_INT | KW_BIGINT -> TOK_BIGINT | KW_BOOLEAN -> TOK_BOOLEAN | KW_FLOAT -> TOK_FLOAT | KW_DOUBLE -> TOK_DOUBLE | KW_DATE -> TOK_DATE | KW_DATETIME -> TOK_DATETIME | KW_TIMESTAMP -> TOK_TIMESTAMP | KW_STRING -> TOK_STRING );
    public final primitiveType_return primitiveType() throws RecognitionException {
        primitiveType_return retval = new primitiveType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_TINYINT204=null;
        Token KW_SMALLINT205=null;
        Token KW_INT206=null;
        Token KW_BIGINT207=null;
        Token KW_BOOLEAN208=null;
        Token KW_FLOAT209=null;
        Token KW_DOUBLE210=null;
        Token KW_DATE211=null;
        Token KW_DATETIME212=null;
        Token KW_TIMESTAMP213=null;
        Token KW_STRING214=null;

        CommonTree KW_TINYINT204_tree=null;
        CommonTree KW_SMALLINT205_tree=null;
        CommonTree KW_INT206_tree=null;
        CommonTree KW_BIGINT207_tree=null;
        CommonTree KW_BOOLEAN208_tree=null;
        CommonTree KW_FLOAT209_tree=null;
        CommonTree KW_DOUBLE210_tree=null;
        CommonTree KW_DATE211_tree=null;
        CommonTree KW_DATETIME212_tree=null;
        CommonTree KW_TIMESTAMP213_tree=null;
        CommonTree KW_STRING214_tree=null;
        RewriteRuleTokenStream stream_KW_DATETIME=new RewriteRuleTokenStream(adaptor,"token KW_DATETIME");
        RewriteRuleTokenStream stream_KW_STRING=new RewriteRuleTokenStream(adaptor,"token KW_STRING");
        RewriteRuleTokenStream stream_KW_TIMESTAMP=new RewriteRuleTokenStream(adaptor,"token KW_TIMESTAMP");
        RewriteRuleTokenStream stream_KW_DATE=new RewriteRuleTokenStream(adaptor,"token KW_DATE");
        RewriteRuleTokenStream stream_KW_FLOAT=new RewriteRuleTokenStream(adaptor,"token KW_FLOAT");
        RewriteRuleTokenStream stream_KW_INT=new RewriteRuleTokenStream(adaptor,"token KW_INT");
        RewriteRuleTokenStream stream_KW_SMALLINT=new RewriteRuleTokenStream(adaptor,"token KW_SMALLINT");
        RewriteRuleTokenStream stream_KW_DOUBLE=new RewriteRuleTokenStream(adaptor,"token KW_DOUBLE");
        RewriteRuleTokenStream stream_KW_BIGINT=new RewriteRuleTokenStream(adaptor,"token KW_BIGINT");
        RewriteRuleTokenStream stream_KW_TINYINT=new RewriteRuleTokenStream(adaptor,"token KW_TINYINT");
        RewriteRuleTokenStream stream_KW_BOOLEAN=new RewriteRuleTokenStream(adaptor,"token KW_BOOLEAN");

         msgs.push("primitive type specification"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:544:5: ( KW_TINYINT -> TOK_TINYINT | KW_SMALLINT -> TOK_SMALLINT | KW_INT -> TOK_INT | KW_BIGINT -> TOK_BIGINT | KW_BOOLEAN -> TOK_BOOLEAN | KW_FLOAT -> TOK_FLOAT | KW_DOUBLE -> TOK_DOUBLE | KW_DATE -> TOK_DATE | KW_DATETIME -> TOK_DATETIME | KW_TIMESTAMP -> TOK_TIMESTAMP | KW_STRING -> TOK_STRING )
            int alt55=11;
            switch ( input.LA(1) ) {
            case KW_TINYINT:
                {
                alt55=1;
                }
                break;
            case KW_SMALLINT:
                {
                alt55=2;
                }
                break;
            case KW_INT:
                {
                alt55=3;
                }
                break;
            case KW_BIGINT:
                {
                alt55=4;
                }
                break;
            case KW_BOOLEAN:
                {
                alt55=5;
                }
                break;
            case KW_FLOAT:
                {
                alt55=6;
                }
                break;
            case KW_DOUBLE:
                {
                alt55=7;
                }
                break;
            case KW_DATE:
                {
                alt55=8;
                }
                break;
            case KW_DATETIME:
                {
                alt55=9;
                }
                break;
            case KW_TIMESTAMP:
                {
                alt55=10;
                }
                break;
            case KW_STRING:
                {
                alt55=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("541:1: primitiveType : ( KW_TINYINT -> TOK_TINYINT | KW_SMALLINT -> TOK_SMALLINT | KW_INT -> TOK_INT | KW_BIGINT -> TOK_BIGINT | KW_BOOLEAN -> TOK_BOOLEAN | KW_FLOAT -> TOK_FLOAT | KW_DOUBLE -> TOK_DOUBLE | KW_DATE -> TOK_DATE | KW_DATETIME -> TOK_DATETIME | KW_TIMESTAMP -> TOK_TIMESTAMP | KW_STRING -> TOK_STRING );", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:544:7: KW_TINYINT
                    {
                    KW_TINYINT204=(Token)input.LT(1);
                    match(input,KW_TINYINT,FOLLOW_KW_TINYINT_in_primitiveType3524); 
                    stream_KW_TINYINT.add(KW_TINYINT204);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 544:24: -> TOK_TINYINT
                    {
                        adaptor.addChild(root_0, adaptor.create(TOK_TINYINT, "TOK_TINYINT"));

                    }



                    }
                    break;
                case 2 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:545:7: KW_SMALLINT
                    {
                    KW_SMALLINT205=(Token)input.LT(1);
                    match(input,KW_SMALLINT,FOLLOW_KW_SMALLINT_in_primitiveType3545); 
                    stream_KW_SMALLINT.add(KW_SMALLINT205);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 545:24: -> TOK_SMALLINT
                    {
                        adaptor.addChild(root_0, adaptor.create(TOK_SMALLINT, "TOK_SMALLINT"));

                    }



                    }
                    break;
                case 3 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:546:7: KW_INT
                    {
                    KW_INT206=(Token)input.LT(1);
                    match(input,KW_INT,FOLLOW_KW_INT_in_primitiveType3565); 
                    stream_KW_INT.add(KW_INT206);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 546:24: -> TOK_INT
                    {
                        adaptor.addChild(root_0, adaptor.create(TOK_INT, "TOK_INT"));

                    }



                    }
                    break;
                case 4 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:547:7: KW_BIGINT
                    {
                    KW_BIGINT207=(Token)input.LT(1);
                    match(input,KW_BIGINT,FOLLOW_KW_BIGINT_in_primitiveType3590); 
                    stream_KW_BIGINT.add(KW_BIGINT207);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 547:24: -> TOK_BIGINT
                    {
                        adaptor.addChild(root_0, adaptor.create(TOK_BIGINT, "TOK_BIGINT"));

                    }



                    }
                    break;
                case 5 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:548:7: KW_BOOLEAN
                    {
                    KW_BOOLEAN208=(Token)input.LT(1);
                    match(input,KW_BOOLEAN,FOLLOW_KW_BOOLEAN_in_primitiveType3612); 
                    stream_KW_BOOLEAN.add(KW_BOOLEAN208);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 548:24: -> TOK_BOOLEAN
                    {
                        adaptor.addChild(root_0, adaptor.create(TOK_BOOLEAN, "TOK_BOOLEAN"));

                    }



                    }
                    break;
                case 6 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:549:7: KW_FLOAT
                    {
                    KW_FLOAT209=(Token)input.LT(1);
                    match(input,KW_FLOAT,FOLLOW_KW_FLOAT_in_primitiveType3633); 
                    stream_KW_FLOAT.add(KW_FLOAT209);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 549:24: -> TOK_FLOAT
                    {
                        adaptor.addChild(root_0, adaptor.create(TOK_FLOAT, "TOK_FLOAT"));

                    }



                    }
                    break;
                case 7 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:550:7: KW_DOUBLE
                    {
                    KW_DOUBLE210=(Token)input.LT(1);
                    match(input,KW_DOUBLE,FOLLOW_KW_DOUBLE_in_primitiveType3656); 
                    stream_KW_DOUBLE.add(KW_DOUBLE210);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 550:24: -> TOK_DOUBLE
                    {
                        adaptor.addChild(root_0, adaptor.create(TOK_DOUBLE, "TOK_DOUBLE"));

                    }



                    }
                    break;
                case 8 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:551:7: KW_DATE
                    {
                    KW_DATE211=(Token)input.LT(1);
                    match(input,KW_DATE,FOLLOW_KW_DATE_in_primitiveType3678); 
                    stream_KW_DATE.add(KW_DATE211);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 551:24: -> TOK_DATE
                    {
                        adaptor.addChild(root_0, adaptor.create(TOK_DATE, "TOK_DATE"));

                    }



                    }
                    break;
                case 9 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:552:7: KW_DATETIME
                    {
                    KW_DATETIME212=(Token)input.LT(1);
                    match(input,KW_DATETIME,FOLLOW_KW_DATETIME_in_primitiveType3702); 
                    stream_KW_DATETIME.add(KW_DATETIME212);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 552:24: -> TOK_DATETIME
                    {
                        adaptor.addChild(root_0, adaptor.create(TOK_DATETIME, "TOK_DATETIME"));

                    }



                    }
                    break;
                case 10 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:553:7: KW_TIMESTAMP
                    {
                    KW_TIMESTAMP213=(Token)input.LT(1);
                    match(input,KW_TIMESTAMP,FOLLOW_KW_TIMESTAMP_in_primitiveType3722); 
                    stream_KW_TIMESTAMP.add(KW_TIMESTAMP213);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 553:24: -> TOK_TIMESTAMP
                    {
                        adaptor.addChild(root_0, adaptor.create(TOK_TIMESTAMP, "TOK_TIMESTAMP"));

                    }



                    }
                    break;
                case 11 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:554:7: KW_STRING
                    {
                    KW_STRING214=(Token)input.LT(1);
                    match(input,KW_STRING,FOLLOW_KW_STRING_in_primitiveType3741); 
                    stream_KW_STRING.add(KW_STRING214);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 554:24: -> TOK_STRING
                    {
                        adaptor.addChild(root_0, adaptor.create(TOK_STRING, "TOK_STRING"));

                    }



                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end primitiveType

    public static class listType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start listType
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:557:1: listType : KW_ARRAY LESSTHAN type GREATERTHAN -> ^( TOK_LIST type ) ;
    public final listType_return listType() throws RecognitionException {
        listType_return retval = new listType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_ARRAY215=null;
        Token LESSTHAN216=null;
        Token GREATERTHAN218=null;
        type_return type217 = null;


        CommonTree KW_ARRAY215_tree=null;
        CommonTree LESSTHAN216_tree=null;
        CommonTree GREATERTHAN218_tree=null;
        RewriteRuleTokenStream stream_LESSTHAN=new RewriteRuleTokenStream(adaptor,"token LESSTHAN");
        RewriteRuleTokenStream stream_KW_ARRAY=new RewriteRuleTokenStream(adaptor,"token KW_ARRAY");
        RewriteRuleTokenStream stream_GREATERTHAN=new RewriteRuleTokenStream(adaptor,"token GREATERTHAN");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
         msgs.push("list type"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:560:5: ( KW_ARRAY LESSTHAN type GREATERTHAN -> ^( TOK_LIST type ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:560:7: KW_ARRAY LESSTHAN type GREATERTHAN
            {
            KW_ARRAY215=(Token)input.LT(1);
            match(input,KW_ARRAY,FOLLOW_KW_ARRAY_in_listType3782); 
            stream_KW_ARRAY.add(KW_ARRAY215);

            LESSTHAN216=(Token)input.LT(1);
            match(input,LESSTHAN,FOLLOW_LESSTHAN_in_listType3784); 
            stream_LESSTHAN.add(LESSTHAN216);

            pushFollow(FOLLOW_type_in_listType3786);
            type217=type();
            _fsp--;

            stream_type.add(type217.getTree());
            GREATERTHAN218=(Token)input.LT(1);
            match(input,GREATERTHAN,FOLLOW_GREATERTHAN_in_listType3788); 
            stream_GREATERTHAN.add(GREATERTHAN218);


            // AST REWRITE
            // elements: type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 560:44: -> ^( TOK_LIST type )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:560:47: ^( TOK_LIST type )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_LIST, "TOK_LIST"), root_1);

                adaptor.addChild(root_1, stream_type.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end listType

    public static class mapType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start mapType
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:563:1: mapType : KW_MAP LESSTHAN left= primitiveType COMMA right= type GREATERTHAN -> ^( TOK_MAP $left $right) ;
    public final mapType_return mapType() throws RecognitionException {
        mapType_return retval = new mapType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_MAP219=null;
        Token LESSTHAN220=null;
        Token COMMA221=null;
        Token GREATERTHAN222=null;
        primitiveType_return left = null;

        type_return right = null;


        CommonTree KW_MAP219_tree=null;
        CommonTree LESSTHAN220_tree=null;
        CommonTree COMMA221_tree=null;
        CommonTree GREATERTHAN222_tree=null;
        RewriteRuleTokenStream stream_LESSTHAN=new RewriteRuleTokenStream(adaptor,"token LESSTHAN");
        RewriteRuleTokenStream stream_KW_MAP=new RewriteRuleTokenStream(adaptor,"token KW_MAP");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_GREATERTHAN=new RewriteRuleTokenStream(adaptor,"token GREATERTHAN");
        RewriteRuleSubtreeStream stream_primitiveType=new RewriteRuleSubtreeStream(adaptor,"rule primitiveType");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
         msgs.push("map type"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:566:5: ( KW_MAP LESSTHAN left= primitiveType COMMA right= type GREATERTHAN -> ^( TOK_MAP $left $right) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:566:7: KW_MAP LESSTHAN left= primitiveType COMMA right= type GREATERTHAN
            {
            KW_MAP219=(Token)input.LT(1);
            match(input,KW_MAP,FOLLOW_KW_MAP_in_mapType3825); 
            stream_KW_MAP.add(KW_MAP219);

            LESSTHAN220=(Token)input.LT(1);
            match(input,LESSTHAN,FOLLOW_LESSTHAN_in_mapType3827); 
            stream_LESSTHAN.add(LESSTHAN220);

            pushFollow(FOLLOW_primitiveType_in_mapType3831);
            left=primitiveType();
            _fsp--;

            stream_primitiveType.add(left.getTree());
            COMMA221=(Token)input.LT(1);
            match(input,COMMA,FOLLOW_COMMA_in_mapType3833); 
            stream_COMMA.add(COMMA221);

            pushFollow(FOLLOW_type_in_mapType3837);
            right=type();
            _fsp--;

            stream_type.add(right.getTree());
            GREATERTHAN222=(Token)input.LT(1);
            match(input,GREATERTHAN,FOLLOW_GREATERTHAN_in_mapType3839); 
            stream_GREATERTHAN.add(GREATERTHAN222);


            // AST REWRITE
            // elements: left, right
            // token labels: 
            // rule labels: retval, left, right
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_left=new RewriteRuleSubtreeStream(adaptor,"token left",left!=null?left.tree:null);
            RewriteRuleSubtreeStream stream_right=new RewriteRuleSubtreeStream(adaptor,"token right",right!=null?right.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 567:5: -> ^( TOK_MAP $left $right)
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:567:8: ^( TOK_MAP $left $right)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_MAP, "TOK_MAP"), root_1);

                adaptor.addChild(root_1, stream_left.next());
                adaptor.addChild(root_1, stream_right.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end mapType

    public static class queryOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start queryOperator
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:570:1: queryOperator : KW_UNION KW_ALL -> ^( TOK_UNION ) ;
    public final queryOperator_return queryOperator() throws RecognitionException {
        queryOperator_return retval = new queryOperator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_UNION223=null;
        Token KW_ALL224=null;

        CommonTree KW_UNION223_tree=null;
        CommonTree KW_ALL224_tree=null;
        RewriteRuleTokenStream stream_KW_ALL=new RewriteRuleTokenStream(adaptor,"token KW_ALL");
        RewriteRuleTokenStream stream_KW_UNION=new RewriteRuleTokenStream(adaptor,"token KW_UNION");

         msgs.push("query operator"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:573:5: ( KW_UNION KW_ALL -> ^( TOK_UNION ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:573:7: KW_UNION KW_ALL
            {
            KW_UNION223=(Token)input.LT(1);
            match(input,KW_UNION,FOLLOW_KW_UNION_in_queryOperator3882); 
            stream_KW_UNION.add(KW_UNION223);

            KW_ALL224=(Token)input.LT(1);
            match(input,KW_ALL,FOLLOW_KW_ALL_in_queryOperator3884); 
            stream_KW_ALL.add(KW_ALL224);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 573:23: -> ^( TOK_UNION )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:573:26: ^( TOK_UNION )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_UNION, "TOK_UNION"), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end queryOperator

    public static class queryStatementExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start queryStatementExpression
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:577:1: queryStatementExpression : queryStatement ( queryOperator queryStatement )* ;
    public final queryStatementExpression_return queryStatementExpression() throws RecognitionException {
        queryStatementExpression_return retval = new queryStatementExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        queryStatement_return queryStatement225 = null;

        queryOperator_return queryOperator226 = null;

        queryStatement_return queryStatement227 = null;



        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:578:5: ( queryStatement ( queryOperator queryStatement )* )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:578:7: queryStatement ( queryOperator queryStatement )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_queryStatement_in_queryStatementExpression3908);
            queryStatement225=queryStatement();
            _fsp--;

            adaptor.addChild(root_0, queryStatement225.getTree());
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:578:22: ( queryOperator queryStatement )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==KW_UNION) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:578:23: queryOperator queryStatement
            	    {
            	    pushFollow(FOLLOW_queryOperator_in_queryStatementExpression3911);
            	    queryOperator226=queryOperator();
            	    _fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(queryOperator226.getTree(), root_0);
            	    pushFollow(FOLLOW_queryStatement_in_queryStatementExpression3914);
            	    queryStatement227=queryStatement();
            	    _fsp--;

            	    adaptor.addChild(root_0, queryStatement227.getTree());

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end queryStatementExpression

    public static class queryStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start queryStatement
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:581:1: queryStatement : ( fromClause (b+= body )+ -> ^( TOK_QUERY fromClause ( body )+ ) | regular_body );
    public final queryStatement_return queryStatement() throws RecognitionException {
        queryStatement_return retval = new queryStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        List list_b=null;
        fromClause_return fromClause228 = null;

        regular_body_return regular_body229 = null;

        RuleReturnScope b = null;
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_fromClause=new RewriteRuleSubtreeStream(adaptor,"rule fromClause");
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:582:5: ( fromClause (b+= body )+ -> ^( TOK_QUERY fromClause ( body )+ ) | regular_body )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==KW_FROM) ) {
                alt58=1;
            }
            else if ( (LA58_0==KW_MAP||LA58_0==KW_INSERT||LA58_0==KW_SELECT||LA58_0==KW_REDUCE) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("581:1: queryStatement : ( fromClause (b+= body )+ -> ^( TOK_QUERY fromClause ( body )+ ) | regular_body );", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:583:5: fromClause (b+= body )+
                    {
                    pushFollow(FOLLOW_fromClause_in_queryStatement3937);
                    fromClause228=fromClause();
                    _fsp--;

                    stream_fromClause.add(fromClause228.getTree());
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:584:5: (b+= body )+
                    int cnt57=0;
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==KW_MAP||LA57_0==KW_INSERT||LA57_0==KW_SELECT||LA57_0==KW_REDUCE) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:584:7: b+= body
                    	    {
                    	    pushFollow(FOLLOW_body_in_queryStatement3947);
                    	    b=body();
                    	    _fsp--;

                    	    stream_body.add(b.getTree());
                    	    if (list_b==null) list_b=new ArrayList();
                    	    list_b.add(b);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt57 >= 1 ) break loop57;
                                EarlyExitException eee =
                                    new EarlyExitException(57, input);
                                throw eee;
                        }
                        cnt57++;
                    } while (true);


                    // AST REWRITE
                    // elements: body, fromClause
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 584:18: -> ^( TOK_QUERY fromClause ( body )+ )
                    {
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:584:21: ^( TOK_QUERY fromClause ( body )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_QUERY, "TOK_QUERY"), root_1);

                        adaptor.addChild(root_1, stream_fromClause.next());
                        if ( !(stream_body.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_body.hasNext() ) {
                            adaptor.addChild(root_1, stream_body.next());

                        }
                        stream_body.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;
                case 2 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:585:7: regular_body
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_regular_body_in_queryStatement3969);
                    regular_body229=regular_body();
                    _fsp--;

                    adaptor.addChild(root_0, regular_body229.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end queryStatement

    public static class regular_body_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start regular_body
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:588:1: regular_body : ( insertClause selectClause fromClause ( whereClause )? ( groupByClause )? ( orderByClause )? ( clusterByClause )? ( distributeByClause )? ( sortByClause )? ( limitClause )? -> ^( TOK_QUERY fromClause ^( TOK_INSERT insertClause selectClause ( whereClause )? ( groupByClause )? ( orderByClause )? ( clusterByClause )? ( distributeByClause )? ( sortByClause )? ( limitClause )? ) ) | selectClause fromClause ( whereClause )? ( groupByClause )? ( orderByClause )? ( clusterByClause )? ( distributeByClause )? ( sortByClause )? ( limitClause )? -> ^( TOK_QUERY fromClause ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) selectClause ( whereClause )? ( groupByClause )? ( orderByClause )? ( clusterByClause )? ( distributeByClause )? ( sortByClause )? ( limitClause )? ) ) );
    public final regular_body_return regular_body() throws RecognitionException {
        regular_body_return retval = new regular_body_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        insertClause_return insertClause230 = null;

        selectClause_return selectClause231 = null;

        fromClause_return fromClause232 = null;

        whereClause_return whereClause233 = null;

        groupByClause_return groupByClause234 = null;

        orderByClause_return orderByClause235 = null;

        clusterByClause_return clusterByClause236 = null;

        distributeByClause_return distributeByClause237 = null;

        sortByClause_return sortByClause238 = null;

        limitClause_return limitClause239 = null;

        selectClause_return selectClause240 = null;

        fromClause_return fromClause241 = null;

        whereClause_return whereClause242 = null;

        groupByClause_return groupByClause243 = null;

        orderByClause_return orderByClause244 = null;

        clusterByClause_return clusterByClause245 = null;

        distributeByClause_return distributeByClause246 = null;

        sortByClause_return sortByClause247 = null;

        limitClause_return limitClause248 = null;


        RewriteRuleSubtreeStream stream_whereClause=new RewriteRuleSubtreeStream(adaptor,"rule whereClause");
        RewriteRuleSubtreeStream stream_clusterByClause=new RewriteRuleSubtreeStream(adaptor,"rule clusterByClause");
        RewriteRuleSubtreeStream stream_distributeByClause=new RewriteRuleSubtreeStream(adaptor,"rule distributeByClause");
        RewriteRuleSubtreeStream stream_limitClause=new RewriteRuleSubtreeStream(adaptor,"rule limitClause");
        RewriteRuleSubtreeStream stream_orderByClause=new RewriteRuleSubtreeStream(adaptor,"rule orderByClause");
        RewriteRuleSubtreeStream stream_sortByClause=new RewriteRuleSubtreeStream(adaptor,"rule sortByClause");
        RewriteRuleSubtreeStream stream_insertClause=new RewriteRuleSubtreeStream(adaptor,"rule insertClause");
        RewriteRuleSubtreeStream stream_groupByClause=new RewriteRuleSubtreeStream(adaptor,"rule groupByClause");
        RewriteRuleSubtreeStream stream_selectClause=new RewriteRuleSubtreeStream(adaptor,"rule selectClause");
        RewriteRuleSubtreeStream stream_fromClause=new RewriteRuleSubtreeStream(adaptor,"rule fromClause");
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:589:4: ( insertClause selectClause fromClause ( whereClause )? ( groupByClause )? ( orderByClause )? ( clusterByClause )? ( distributeByClause )? ( sortByClause )? ( limitClause )? -> ^( TOK_QUERY fromClause ^( TOK_INSERT insertClause selectClause ( whereClause )? ( groupByClause )? ( orderByClause )? ( clusterByClause )? ( distributeByClause )? ( sortByClause )? ( limitClause )? ) ) | selectClause fromClause ( whereClause )? ( groupByClause )? ( orderByClause )? ( clusterByClause )? ( distributeByClause )? ( sortByClause )? ( limitClause )? -> ^( TOK_QUERY fromClause ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) selectClause ( whereClause )? ( groupByClause )? ( orderByClause )? ( clusterByClause )? ( distributeByClause )? ( sortByClause )? ( limitClause )? ) ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==KW_INSERT) ) {
                alt73=1;
            }
            else if ( (LA73_0==KW_MAP||LA73_0==KW_SELECT||LA73_0==KW_REDUCE) ) {
                alt73=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("588:1: regular_body : ( insertClause selectClause fromClause ( whereClause )? ( groupByClause )? ( orderByClause )? ( clusterByClause )? ( distributeByClause )? ( sortByClause )? ( limitClause )? -> ^( TOK_QUERY fromClause ^( TOK_INSERT insertClause selectClause ( whereClause )? ( groupByClause )? ( orderByClause )? ( clusterByClause )? ( distributeByClause )? ( sortByClause )? ( limitClause )? ) ) | selectClause fromClause ( whereClause )? ( groupByClause )? ( orderByClause )? ( clusterByClause )? ( distributeByClause )? ( sortByClause )? ( limitClause )? -> ^( TOK_QUERY fromClause ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) selectClause ( whereClause )? ( groupByClause )? ( orderByClause )? ( clusterByClause )? ( distributeByClause )? ( sortByClause )? ( limitClause )? ) ) );", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:590:4: insertClause selectClause fromClause ( whereClause )? ( groupByClause )? ( orderByClause )? ( clusterByClause )? ( distributeByClause )? ( sortByClause )? ( limitClause )?
                    {
                    pushFollow(FOLLOW_insertClause_in_regular_body3988);
                    insertClause230=insertClause();
                    _fsp--;

                    stream_insertClause.add(insertClause230.getTree());
                    pushFollow(FOLLOW_selectClause_in_regular_body3993);
                    selectClause231=selectClause();
                    _fsp--;

                    stream_selectClause.add(selectClause231.getTree());
                    pushFollow(FOLLOW_fromClause_in_regular_body3998);
                    fromClause232=fromClause();
                    _fsp--;

                    stream_fromClause.add(fromClause232.getTree());
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:593:4: ( whereClause )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==KW_WHERE) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:593:4: whereClause
                            {
                            pushFollow(FOLLOW_whereClause_in_regular_body4003);
                            whereClause233=whereClause();
                            _fsp--;

                            stream_whereClause.add(whereClause233.getTree());

                            }
                            break;

                    }

                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:594:4: ( groupByClause )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==KW_GROUP) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:594:4: groupByClause
                            {
                            pushFollow(FOLLOW_groupByClause_in_regular_body4009);
                            groupByClause234=groupByClause();
                            _fsp--;

                            stream_groupByClause.add(groupByClause234.getTree());

                            }
                            break;

                    }

                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:595:4: ( orderByClause )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==KW_ORDER) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:595:4: orderByClause
                            {
                            pushFollow(FOLLOW_orderByClause_in_regular_body4015);
                            orderByClause235=orderByClause();
                            _fsp--;

                            stream_orderByClause.add(orderByClause235.getTree());

                            }
                            break;

                    }

                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:596:4: ( clusterByClause )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==KW_CLUSTER) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:596:4: clusterByClause
                            {
                            pushFollow(FOLLOW_clusterByClause_in_regular_body4021);
                            clusterByClause236=clusterByClause();
                            _fsp--;

                            stream_clusterByClause.add(clusterByClause236.getTree());

                            }
                            break;

                    }

                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:597:4: ( distributeByClause )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==KW_DISTRIBUTE) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:597:4: distributeByClause
                            {
                            pushFollow(FOLLOW_distributeByClause_in_regular_body4027);
                            distributeByClause237=distributeByClause();
                            _fsp--;

                            stream_distributeByClause.add(distributeByClause237.getTree());

                            }
                            break;

                    }

                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:598:4: ( sortByClause )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==KW_SORT) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:598:4: sortByClause
                            {
                            pushFollow(FOLLOW_sortByClause_in_regular_body4033);
                            sortByClause238=sortByClause();
                            _fsp--;

                            stream_sortByClause.add(sortByClause238.getTree());

                            }
                            break;

                    }

                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:599:4: ( limitClause )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==KW_LIMIT) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:599:4: limitClause
                            {
                            pushFollow(FOLLOW_limitClause_in_regular_body4039);
                            limitClause239=limitClause();
                            _fsp--;

                            stream_limitClause.add(limitClause239.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: fromClause, clusterByClause, distributeByClause, sortByClause, insertClause, whereClause, limitClause, orderByClause, groupByClause, selectClause
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 599:17: -> ^( TOK_QUERY fromClause ^( TOK_INSERT insertClause selectClause ( whereClause )? ( groupByClause )? ( orderByClause )? ( clusterByClause )? ( distributeByClause )? ( sortByClause )? ( limitClause )? ) )
                    {
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:599:20: ^( TOK_QUERY fromClause ^( TOK_INSERT insertClause selectClause ( whereClause )? ( groupByClause )? ( orderByClause )? ( clusterByClause )? ( distributeByClause )? ( sortByClause )? ( limitClause )? ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_QUERY, "TOK_QUERY"), root_1);

                        adaptor.addChild(root_1, stream_fromClause.next());
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:599:43: ^( TOK_INSERT insertClause selectClause ( whereClause )? ( groupByClause )? ( orderByClause )? ( clusterByClause )? ( distributeByClause )? ( sortByClause )? ( limitClause )? )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_INSERT, "TOK_INSERT"), root_2);

                        adaptor.addChild(root_2, stream_insertClause.next());
                        adaptor.addChild(root_2, stream_selectClause.next());
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:600:35: ( whereClause )?
                        if ( stream_whereClause.hasNext() ) {
                            adaptor.addChild(root_2, stream_whereClause.next());

                        }
                        stream_whereClause.reset();
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:600:48: ( groupByClause )?
                        if ( stream_groupByClause.hasNext() ) {
                            adaptor.addChild(root_2, stream_groupByClause.next());

                        }
                        stream_groupByClause.reset();
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:600:63: ( orderByClause )?
                        if ( stream_orderByClause.hasNext() ) {
                            adaptor.addChild(root_2, stream_orderByClause.next());

                        }
                        stream_orderByClause.reset();
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:600:78: ( clusterByClause )?
                        if ( stream_clusterByClause.hasNext() ) {
                            adaptor.addChild(root_2, stream_clusterByClause.next());

                        }
                        stream_clusterByClause.reset();
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:601:22: ( distributeByClause )?
                        if ( stream_distributeByClause.hasNext() ) {
                            adaptor.addChild(root_2, stream_distributeByClause.next());

                        }
                        stream_distributeByClause.reset();
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:601:42: ( sortByClause )?
                        if ( stream_sortByClause.hasNext() ) {
                            adaptor.addChild(root_2, stream_sortByClause.next());

                        }
                        stream_sortByClause.reset();
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:601:56: ( limitClause )?
                        if ( stream_limitClause.hasNext() ) {
                            adaptor.addChild(root_2, stream_limitClause.next());

                        }
                        stream_limitClause.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;
                case 2 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:603:4: selectClause fromClause ( whereClause )? ( groupByClause )? ( orderByClause )? ( clusterByClause )? ( distributeByClause )? ( sortByClause )? ( limitClause )?
                    {
                    pushFollow(FOLLOW_selectClause_in_regular_body4129);
                    selectClause240=selectClause();
                    _fsp--;

                    stream_selectClause.add(selectClause240.getTree());
                    pushFollow(FOLLOW_fromClause_in_regular_body4134);
                    fromClause241=fromClause();
                    _fsp--;

                    stream_fromClause.add(fromClause241.getTree());
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:605:4: ( whereClause )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==KW_WHERE) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:605:4: whereClause
                            {
                            pushFollow(FOLLOW_whereClause_in_regular_body4139);
                            whereClause242=whereClause();
                            _fsp--;

                            stream_whereClause.add(whereClause242.getTree());

                            }
                            break;

                    }

                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:606:4: ( groupByClause )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==KW_GROUP) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:606:4: groupByClause
                            {
                            pushFollow(FOLLOW_groupByClause_in_regular_body4145);
                            groupByClause243=groupByClause();
                            _fsp--;

                            stream_groupByClause.add(groupByClause243.getTree());

                            }
                            break;

                    }

                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:607:4: ( orderByClause )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==KW_ORDER) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:607:4: orderByClause
                            {
                            pushFollow(FOLLOW_orderByClause_in_regular_body4151);
                            orderByClause244=orderByClause();
                            _fsp--;

                            stream_orderByClause.add(orderByClause244.getTree());

                            }
                            break;

                    }

                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:608:4: ( clusterByClause )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==KW_CLUSTER) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:608:4: clusterByClause
                            {
                            pushFollow(FOLLOW_clusterByClause_in_regular_body4157);
                            clusterByClause245=clusterByClause();
                            _fsp--;

                            stream_clusterByClause.add(clusterByClause245.getTree());

                            }
                            break;

                    }

                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:609:4: ( distributeByClause )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==KW_DISTRIBUTE) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:609:4: distributeByClause
                            {
                            pushFollow(FOLLOW_distributeByClause_in_regular_body4163);
                            distributeByClause246=distributeByClause();
                            _fsp--;

                            stream_distributeByClause.add(distributeByClause246.getTree());

                            }
                            break;

                    }

                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:610:4: ( sortByClause )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==KW_SORT) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:610:4: sortByClause
                            {
                            pushFollow(FOLLOW_sortByClause_in_regular_body4169);
                            sortByClause247=sortByClause();
                            _fsp--;

                            stream_sortByClause.add(sortByClause247.getTree());

                            }
                            break;

                    }

                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:611:4: ( limitClause )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==KW_LIMIT) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:611:4: limitClause
                            {
                            pushFollow(FOLLOW_limitClause_in_regular_body4175);
                            limitClause248=limitClause();
                            _fsp--;

                            stream_limitClause.add(limitClause248.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: whereClause, fromClause, groupByClause, orderByClause, limitClause, clusterByClause, distributeByClause, sortByClause, selectClause
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 611:17: -> ^( TOK_QUERY fromClause ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) selectClause ( whereClause )? ( groupByClause )? ( orderByClause )? ( clusterByClause )? ( distributeByClause )? ( sortByClause )? ( limitClause )? ) )
                    {
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:611:20: ^( TOK_QUERY fromClause ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) selectClause ( whereClause )? ( groupByClause )? ( orderByClause )? ( clusterByClause )? ( distributeByClause )? ( sortByClause )? ( limitClause )? ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_QUERY, "TOK_QUERY"), root_1);

                        adaptor.addChild(root_1, stream_fromClause.next());
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:611:43: ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) selectClause ( whereClause )? ( groupByClause )? ( orderByClause )? ( clusterByClause )? ( distributeByClause )? ( sortByClause )? ( limitClause )? )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_INSERT, "TOK_INSERT"), root_2);

                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:611:56: ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) )
                        {
                        CommonTree root_3 = (CommonTree)adaptor.nil();
                        root_3 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_DESTINATION, "TOK_DESTINATION"), root_3);

                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:611:74: ^( TOK_DIR TOK_TMP_FILE )
                        {
                        CommonTree root_4 = (CommonTree)adaptor.nil();
                        root_4 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_DIR, "TOK_DIR"), root_4);

                        adaptor.addChild(root_4, adaptor.create(TOK_TMP_FILE, "TOK_TMP_FILE"));

                        adaptor.addChild(root_3, root_4);
                        }

                        adaptor.addChild(root_2, root_3);
                        }
                        adaptor.addChild(root_2, stream_selectClause.next());
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:612:35: ( whereClause )?
                        if ( stream_whereClause.hasNext() ) {
                            adaptor.addChild(root_2, stream_whereClause.next());

                        }
                        stream_whereClause.reset();
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:612:48: ( groupByClause )?
                        if ( stream_groupByClause.hasNext() ) {
                            adaptor.addChild(root_2, stream_groupByClause.next());

                        }
                        stream_groupByClause.reset();
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:612:63: ( orderByClause )?
                        if ( stream_orderByClause.hasNext() ) {
                            adaptor.addChild(root_2, stream_orderByClause.next());

                        }
                        stream_orderByClause.reset();
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:612:78: ( clusterByClause )?
                        if ( stream_clusterByClause.hasNext() ) {
                            adaptor.addChild(root_2, stream_clusterByClause.next());

                        }
                        stream_clusterByClause.reset();
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:613:22: ( distributeByClause )?
                        if ( stream_distributeByClause.hasNext() ) {
                            adaptor.addChild(root_2, stream_distributeByClause.next());

                        }
                        stream_distributeByClause.reset();
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:613:42: ( sortByClause )?
                        if ( stream_sortByClause.hasNext() ) {
                            adaptor.addChild(root_2, stream_sortByClause.next());

                        }
                        stream_sortByClause.reset();
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:613:56: ( limitClause )?
                        if ( stream_limitClause.hasNext() ) {
                            adaptor.addChild(root_2, stream_limitClause.next());

                        }
                        stream_limitClause.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end regular_body

    public static class body_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start body
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:617:1: body : ( insertClause selectClause ( whereClause )? ( groupByClause )? ( orderByClause )? ( clusterByClause )? ( distributeByClause )? ( sortByClause )? ( limitClause )? -> ^( TOK_INSERT ( insertClause )? selectClause ( whereClause )? ( groupByClause )? ( orderByClause )? ( clusterByClause )? ( distributeByClause )? ( sortByClause )? ( limitClause )? ) | selectClause ( whereClause )? ( groupByClause )? ( orderByClause )? ( clusterByClause )? ( distributeByClause )? ( sortByClause )? ( limitClause )? -> ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) selectClause ( whereClause )? ( groupByClause )? ( orderByClause )? ( clusterByClause )? ( distributeByClause )? ( sortByClause )? ( limitClause )? ) );
    public final body_return body() throws RecognitionException {
        body_return retval = new body_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        insertClause_return insertClause249 = null;

        selectClause_return selectClause250 = null;

        whereClause_return whereClause251 = null;

        groupByClause_return groupByClause252 = null;

        orderByClause_return orderByClause253 = null;

        clusterByClause_return clusterByClause254 = null;

        distributeByClause_return distributeByClause255 = null;

        sortByClause_return sortByClause256 = null;

        limitClause_return limitClause257 = null;

        selectClause_return selectClause258 = null;

        whereClause_return whereClause259 = null;

        groupByClause_return groupByClause260 = null;

        orderByClause_return orderByClause261 = null;

        clusterByClause_return clusterByClause262 = null;

        distributeByClause_return distributeByClause263 = null;

        sortByClause_return sortByClause264 = null;

        limitClause_return limitClause265 = null;


        RewriteRuleSubtreeStream stream_whereClause=new RewriteRuleSubtreeStream(adaptor,"rule whereClause");
        RewriteRuleSubtreeStream stream_clusterByClause=new RewriteRuleSubtreeStream(adaptor,"rule clusterByClause");
        RewriteRuleSubtreeStream stream_distributeByClause=new RewriteRuleSubtreeStream(adaptor,"rule distributeByClause");
        RewriteRuleSubtreeStream stream_limitClause=new RewriteRuleSubtreeStream(adaptor,"rule limitClause");
        RewriteRuleSubtreeStream stream_orderByClause=new RewriteRuleSubtreeStream(adaptor,"rule orderByClause");
        RewriteRuleSubtreeStream stream_sortByClause=new RewriteRuleSubtreeStream(adaptor,"rule sortByClause");
        RewriteRuleSubtreeStream stream_insertClause=new RewriteRuleSubtreeStream(adaptor,"rule insertClause");
        RewriteRuleSubtreeStream stream_groupByClause=new RewriteRuleSubtreeStream(adaptor,"rule groupByClause");
        RewriteRuleSubtreeStream stream_selectClause=new RewriteRuleSubtreeStream(adaptor,"rule selectClause");
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:618:4: ( insertClause selectClause ( whereClause )? ( groupByClause )? ( orderByClause )? ( clusterByClause )? ( distributeByClause )? ( sortByClause )? ( limitClause )? -> ^( TOK_INSERT ( insertClause )? selectClause ( whereClause )? ( groupByClause )? ( orderByClause )? ( clusterByClause )? ( distributeByClause )? ( sortByClause )? ( limitClause )? ) | selectClause ( whereClause )? ( groupByClause )? ( orderByClause )? ( clusterByClause )? ( distributeByClause )? ( sortByClause )? ( limitClause )? -> ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) selectClause ( whereClause )? ( groupByClause )? ( orderByClause )? ( clusterByClause )? ( distributeByClause )? ( sortByClause )? ( limitClause )? ) )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==KW_INSERT) ) {
                alt88=1;
            }
            else if ( (LA88_0==KW_MAP||LA88_0==KW_SELECT||LA88_0==KW_REDUCE) ) {
                alt88=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("617:1: body : ( insertClause selectClause ( whereClause )? ( groupByClause )? ( orderByClause )? ( clusterByClause )? ( distributeByClause )? ( sortByClause )? ( limitClause )? -> ^( TOK_INSERT ( insertClause )? selectClause ( whereClause )? ( groupByClause )? ( orderByClause )? ( clusterByClause )? ( distributeByClause )? ( sortByClause )? ( limitClause )? ) | selectClause ( whereClause )? ( groupByClause )? ( orderByClause )? ( clusterByClause )? ( distributeByClause )? ( sortByClause )? ( limitClause )? -> ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) selectClause ( whereClause )? ( groupByClause )? ( orderByClause )? ( clusterByClause )? ( distributeByClause )? ( sortByClause )? ( limitClause )? ) );", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:619:4: insertClause selectClause ( whereClause )? ( groupByClause )? ( orderByClause )? ( clusterByClause )? ( distributeByClause )? ( sortByClause )? ( limitClause )?
                    {
                    pushFollow(FOLLOW_insertClause_in_body4282);
                    insertClause249=insertClause();
                    _fsp--;

                    stream_insertClause.add(insertClause249.getTree());
                    pushFollow(FOLLOW_selectClause_in_body4287);
                    selectClause250=selectClause();
                    _fsp--;

                    stream_selectClause.add(selectClause250.getTree());
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:621:4: ( whereClause )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==KW_WHERE) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:621:4: whereClause
                            {
                            pushFollow(FOLLOW_whereClause_in_body4292);
                            whereClause251=whereClause();
                            _fsp--;

                            stream_whereClause.add(whereClause251.getTree());

                            }
                            break;

                    }

                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:622:4: ( groupByClause )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==KW_GROUP) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:622:4: groupByClause
                            {
                            pushFollow(FOLLOW_groupByClause_in_body4298);
                            groupByClause252=groupByClause();
                            _fsp--;

                            stream_groupByClause.add(groupByClause252.getTree());

                            }
                            break;

                    }

                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:623:4: ( orderByClause )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==KW_ORDER) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:623:4: orderByClause
                            {
                            pushFollow(FOLLOW_orderByClause_in_body4304);
                            orderByClause253=orderByClause();
                            _fsp--;

                            stream_orderByClause.add(orderByClause253.getTree());

                            }
                            break;

                    }

                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:624:4: ( clusterByClause )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==KW_CLUSTER) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:624:4: clusterByClause
                            {
                            pushFollow(FOLLOW_clusterByClause_in_body4310);
                            clusterByClause254=clusterByClause();
                            _fsp--;

                            stream_clusterByClause.add(clusterByClause254.getTree());

                            }
                            break;

                    }

                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:625:4: ( distributeByClause )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==KW_DISTRIBUTE) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:625:4: distributeByClause
                            {
                            pushFollow(FOLLOW_distributeByClause_in_body4316);
                            distributeByClause255=distributeByClause();
                            _fsp--;

                            stream_distributeByClause.add(distributeByClause255.getTree());

                            }
                            break;

                    }

                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:626:4: ( sortByClause )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==KW_SORT) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:626:4: sortByClause
                            {
                            pushFollow(FOLLOW_sortByClause_in_body4322);
                            sortByClause256=sortByClause();
                            _fsp--;

                            stream_sortByClause.add(sortByClause256.getTree());

                            }
                            break;

                    }

                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:627:4: ( limitClause )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==KW_LIMIT) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:627:4: limitClause
                            {
                            pushFollow(FOLLOW_limitClause_in_body4328);
                            limitClause257=limitClause();
                            _fsp--;

                            stream_limitClause.add(limitClause257.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: distributeByClause, orderByClause, clusterByClause, selectClause, whereClause, sortByClause, limitClause, insertClause, groupByClause
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 627:17: -> ^( TOK_INSERT ( insertClause )? selectClause ( whereClause )? ( groupByClause )? ( orderByClause )? ( clusterByClause )? ( distributeByClause )? ( sortByClause )? ( limitClause )? )
                    {
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:627:20: ^( TOK_INSERT ( insertClause )? selectClause ( whereClause )? ( groupByClause )? ( orderByClause )? ( clusterByClause )? ( distributeByClause )? ( sortByClause )? ( limitClause )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_INSERT, "TOK_INSERT"), root_1);

                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:627:33: ( insertClause )?
                        if ( stream_insertClause.hasNext() ) {
                            adaptor.addChild(root_1, stream_insertClause.next());

                        }
                        stream_insertClause.reset();
                        adaptor.addChild(root_1, stream_selectClause.next());
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:628:35: ( whereClause )?
                        if ( stream_whereClause.hasNext() ) {
                            adaptor.addChild(root_1, stream_whereClause.next());

                        }
                        stream_whereClause.reset();
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:628:48: ( groupByClause )?
                        if ( stream_groupByClause.hasNext() ) {
                            adaptor.addChild(root_1, stream_groupByClause.next());

                        }
                        stream_groupByClause.reset();
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:628:63: ( orderByClause )?
                        if ( stream_orderByClause.hasNext() ) {
                            adaptor.addChild(root_1, stream_orderByClause.next());

                        }
                        stream_orderByClause.reset();
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:628:78: ( clusterByClause )?
                        if ( stream_clusterByClause.hasNext() ) {
                            adaptor.addChild(root_1, stream_clusterByClause.next());

                        }
                        stream_clusterByClause.reset();
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:629:22: ( distributeByClause )?
                        if ( stream_distributeByClause.hasNext() ) {
                            adaptor.addChild(root_1, stream_distributeByClause.next());

                        }
                        stream_distributeByClause.reset();
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:629:42: ( sortByClause )?
                        if ( stream_sortByClause.hasNext() ) {
                            adaptor.addChild(root_1, stream_sortByClause.next());

                        }
                        stream_sortByClause.reset();
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:629:56: ( limitClause )?
                        if ( stream_limitClause.hasNext() ) {
                            adaptor.addChild(root_1, stream_limitClause.next());

                        }
                        stream_limitClause.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;
                case 2 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:631:4: selectClause ( whereClause )? ( groupByClause )? ( orderByClause )? ( clusterByClause )? ( distributeByClause )? ( sortByClause )? ( limitClause )?
                    {
                    pushFollow(FOLLOW_selectClause_in_body4413);
                    selectClause258=selectClause();
                    _fsp--;

                    stream_selectClause.add(selectClause258.getTree());
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:632:4: ( whereClause )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==KW_WHERE) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:632:4: whereClause
                            {
                            pushFollow(FOLLOW_whereClause_in_body4418);
                            whereClause259=whereClause();
                            _fsp--;

                            stream_whereClause.add(whereClause259.getTree());

                            }
                            break;

                    }

                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:633:4: ( groupByClause )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==KW_GROUP) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:633:4: groupByClause
                            {
                            pushFollow(FOLLOW_groupByClause_in_body4424);
                            groupByClause260=groupByClause();
                            _fsp--;

                            stream_groupByClause.add(groupByClause260.getTree());

                            }
                            break;

                    }

                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:634:4: ( orderByClause )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==KW_ORDER) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:634:4: orderByClause
                            {
                            pushFollow(FOLLOW_orderByClause_in_body4430);
                            orderByClause261=orderByClause();
                            _fsp--;

                            stream_orderByClause.add(orderByClause261.getTree());

                            }
                            break;

                    }

                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:635:4: ( clusterByClause )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==KW_CLUSTER) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:635:4: clusterByClause
                            {
                            pushFollow(FOLLOW_clusterByClause_in_body4436);
                            clusterByClause262=clusterByClause();
                            _fsp--;

                            stream_clusterByClause.add(clusterByClause262.getTree());

                            }
                            break;

                    }

                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:636:4: ( distributeByClause )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==KW_DISTRIBUTE) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:636:4: distributeByClause
                            {
                            pushFollow(FOLLOW_distributeByClause_in_body4442);
                            distributeByClause263=distributeByClause();
                            _fsp--;

                            stream_distributeByClause.add(distributeByClause263.getTree());

                            }
                            break;

                    }

                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:637:4: ( sortByClause )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==KW_SORT) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:637:4: sortByClause
                            {
                            pushFollow(FOLLOW_sortByClause_in_body4448);
                            sortByClause264=sortByClause();
                            _fsp--;

                            stream_sortByClause.add(sortByClause264.getTree());

                            }
                            break;

                    }

                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:638:4: ( limitClause )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==KW_LIMIT) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:638:4: limitClause
                            {
                            pushFollow(FOLLOW_limitClause_in_body4454);
                            limitClause265=limitClause();
                            _fsp--;

                            stream_limitClause.add(limitClause265.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: groupByClause, selectClause, sortByClause, whereClause, distributeByClause, clusterByClause, orderByClause, limitClause
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 638:17: -> ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) selectClause ( whereClause )? ( groupByClause )? ( orderByClause )? ( clusterByClause )? ( distributeByClause )? ( sortByClause )? ( limitClause )? )
                    {
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:638:20: ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) selectClause ( whereClause )? ( groupByClause )? ( orderByClause )? ( clusterByClause )? ( distributeByClause )? ( sortByClause )? ( limitClause )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_INSERT, "TOK_INSERT"), root_1);

                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:638:33: ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_DESTINATION, "TOK_DESTINATION"), root_2);

                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:638:51: ^( TOK_DIR TOK_TMP_FILE )
                        {
                        CommonTree root_3 = (CommonTree)adaptor.nil();
                        root_3 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_DIR, "TOK_DIR"), root_3);

                        adaptor.addChild(root_3, adaptor.create(TOK_TMP_FILE, "TOK_TMP_FILE"));

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_selectClause.next());
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:639:35: ( whereClause )?
                        if ( stream_whereClause.hasNext() ) {
                            adaptor.addChild(root_1, stream_whereClause.next());

                        }
                        stream_whereClause.reset();
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:639:48: ( groupByClause )?
                        if ( stream_groupByClause.hasNext() ) {
                            adaptor.addChild(root_1, stream_groupByClause.next());

                        }
                        stream_groupByClause.reset();
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:639:63: ( orderByClause )?
                        if ( stream_orderByClause.hasNext() ) {
                            adaptor.addChild(root_1, stream_orderByClause.next());

                        }
                        stream_orderByClause.reset();
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:639:78: ( clusterByClause )?
                        if ( stream_clusterByClause.hasNext() ) {
                            adaptor.addChild(root_1, stream_clusterByClause.next());

                        }
                        stream_clusterByClause.reset();
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:640:22: ( distributeByClause )?
                        if ( stream_distributeByClause.hasNext() ) {
                            adaptor.addChild(root_1, stream_distributeByClause.next());

                        }
                        stream_distributeByClause.reset();
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:640:42: ( sortByClause )?
                        if ( stream_sortByClause.hasNext() ) {
                            adaptor.addChild(root_1, stream_sortByClause.next());

                        }
                        stream_sortByClause.reset();
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:640:56: ( limitClause )?
                        if ( stream_limitClause.hasNext() ) {
                            adaptor.addChild(root_1, stream_limitClause.next());

                        }
                        stream_limitClause.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end body

    public static class insertClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start insertClause
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:643:1: insertClause : KW_INSERT KW_OVERWRITE destination -> ^( TOK_DESTINATION destination ) ;
    public final insertClause_return insertClause() throws RecognitionException {
        insertClause_return retval = new insertClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_INSERT266=null;
        Token KW_OVERWRITE267=null;
        destination_return destination268 = null;


        CommonTree KW_INSERT266_tree=null;
        CommonTree KW_OVERWRITE267_tree=null;
        RewriteRuleTokenStream stream_KW_OVERWRITE=new RewriteRuleTokenStream(adaptor,"token KW_OVERWRITE");
        RewriteRuleTokenStream stream_KW_INSERT=new RewriteRuleTokenStream(adaptor,"token KW_INSERT");
        RewriteRuleSubtreeStream stream_destination=new RewriteRuleSubtreeStream(adaptor,"rule destination");
         msgs.push("insert clause"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:646:4: ( KW_INSERT KW_OVERWRITE destination -> ^( TOK_DESTINATION destination ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:647:4: KW_INSERT KW_OVERWRITE destination
            {
            KW_INSERT266=(Token)input.LT(1);
            match(input,KW_INSERT,FOLLOW_KW_INSERT_in_insertClause4564); 
            stream_KW_INSERT.add(KW_INSERT266);

            KW_OVERWRITE267=(Token)input.LT(1);
            match(input,KW_OVERWRITE,FOLLOW_KW_OVERWRITE_in_insertClause4566); 
            stream_KW_OVERWRITE.add(KW_OVERWRITE267);

            pushFollow(FOLLOW_destination_in_insertClause4568);
            destination268=destination();
            _fsp--;

            stream_destination.add(destination268.getTree());

            // AST REWRITE
            // elements: destination
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 647:39: -> ^( TOK_DESTINATION destination )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:647:42: ^( TOK_DESTINATION destination )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_DESTINATION, "TOK_DESTINATION"), root_1);

                adaptor.addChild(root_1, stream_destination.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end insertClause

    public static class destination_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start destination
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:650:1: destination : ( KW_LOCAL KW_DIRECTORY StringLiteral -> ^( TOK_LOCAL_DIR StringLiteral ) | KW_DIRECTORY StringLiteral -> ^( TOK_DIR StringLiteral ) | KW_TABLE tabName -> ^( tabName ) );
    public final destination_return destination() throws RecognitionException {
        destination_return retval = new destination_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_LOCAL269=null;
        Token KW_DIRECTORY270=null;
        Token StringLiteral271=null;
        Token KW_DIRECTORY272=null;
        Token StringLiteral273=null;
        Token KW_TABLE274=null;
        tabName_return tabName275 = null;


        CommonTree KW_LOCAL269_tree=null;
        CommonTree KW_DIRECTORY270_tree=null;
        CommonTree StringLiteral271_tree=null;
        CommonTree KW_DIRECTORY272_tree=null;
        CommonTree StringLiteral273_tree=null;
        CommonTree KW_TABLE274_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_KW_DIRECTORY=new RewriteRuleTokenStream(adaptor,"token KW_DIRECTORY");
        RewriteRuleTokenStream stream_KW_LOCAL=new RewriteRuleTokenStream(adaptor,"token KW_LOCAL");
        RewriteRuleTokenStream stream_KW_TABLE=new RewriteRuleTokenStream(adaptor,"token KW_TABLE");
        RewriteRuleSubtreeStream stream_tabName=new RewriteRuleSubtreeStream(adaptor,"rule tabName");
         msgs.push("destination specification"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:653:4: ( KW_LOCAL KW_DIRECTORY StringLiteral -> ^( TOK_LOCAL_DIR StringLiteral ) | KW_DIRECTORY StringLiteral -> ^( TOK_DIR StringLiteral ) | KW_TABLE tabName -> ^( tabName ) )
            int alt89=3;
            switch ( input.LA(1) ) {
            case KW_LOCAL:
                {
                alt89=1;
                }
                break;
            case KW_DIRECTORY:
                {
                alt89=2;
                }
                break;
            case KW_TABLE:
                {
                alt89=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("650:1: destination : ( KW_LOCAL KW_DIRECTORY StringLiteral -> ^( TOK_LOCAL_DIR StringLiteral ) | KW_DIRECTORY StringLiteral -> ^( TOK_DIR StringLiteral ) | KW_TABLE tabName -> ^( tabName ) );", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:654:6: KW_LOCAL KW_DIRECTORY StringLiteral
                    {
                    KW_LOCAL269=(Token)input.LT(1);
                    match(input,KW_LOCAL,FOLLOW_KW_LOCAL_in_destination4606); 
                    stream_KW_LOCAL.add(KW_LOCAL269);

                    KW_DIRECTORY270=(Token)input.LT(1);
                    match(input,KW_DIRECTORY,FOLLOW_KW_DIRECTORY_in_destination4608); 
                    stream_KW_DIRECTORY.add(KW_DIRECTORY270);

                    StringLiteral271=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_destination4610); 
                    stream_StringLiteral.add(StringLiteral271);


                    // AST REWRITE
                    // elements: StringLiteral
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 654:42: -> ^( TOK_LOCAL_DIR StringLiteral )
                    {
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:654:45: ^( TOK_LOCAL_DIR StringLiteral )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_LOCAL_DIR, "TOK_LOCAL_DIR"), root_1);

                        adaptor.addChild(root_1, stream_StringLiteral.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;
                case 2 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:655:6: KW_DIRECTORY StringLiteral
                    {
                    KW_DIRECTORY272=(Token)input.LT(1);
                    match(input,KW_DIRECTORY,FOLLOW_KW_DIRECTORY_in_destination4625); 
                    stream_KW_DIRECTORY.add(KW_DIRECTORY272);

                    StringLiteral273=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_destination4627); 
                    stream_StringLiteral.add(StringLiteral273);


                    // AST REWRITE
                    // elements: StringLiteral
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 655:33: -> ^( TOK_DIR StringLiteral )
                    {
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:655:36: ^( TOK_DIR StringLiteral )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_DIR, "TOK_DIR"), root_1);

                        adaptor.addChild(root_1, stream_StringLiteral.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;
                case 3 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:656:6: KW_TABLE tabName
                    {
                    KW_TABLE274=(Token)input.LT(1);
                    match(input,KW_TABLE,FOLLOW_KW_TABLE_in_destination4642); 
                    stream_KW_TABLE.add(KW_TABLE274);

                    pushFollow(FOLLOW_tabName_in_destination4644);
                    tabName275=tabName();
                    _fsp--;

                    stream_tabName.add(tabName275.getTree());

                    // AST REWRITE
                    // elements: tabName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 656:23: -> ^( tabName )
                    {
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:656:26: ^( tabName )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_tabName.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end destination

    public static class limitClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start limitClause
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:659:1: limitClause : KW_LIMIT num= Number -> ^( TOK_LIMIT $num) ;
    public final limitClause_return limitClause() throws RecognitionException {
        limitClause_return retval = new limitClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token num=null;
        Token KW_LIMIT276=null;

        CommonTree num_tree=null;
        CommonTree KW_LIMIT276_tree=null;
        RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
        RewriteRuleTokenStream stream_KW_LIMIT=new RewriteRuleTokenStream(adaptor,"token KW_LIMIT");

         msgs.push("limit clause"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:662:4: ( KW_LIMIT num= Number -> ^( TOK_LIMIT $num) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:663:4: KW_LIMIT num= Number
            {
            KW_LIMIT276=(Token)input.LT(1);
            match(input,KW_LIMIT,FOLLOW_KW_LIMIT_in_limitClause4678); 
            stream_KW_LIMIT.add(KW_LIMIT276);

            num=(Token)input.LT(1);
            match(input,Number,FOLLOW_Number_in_limitClause4682); 
            stream_Number.add(num);


            // AST REWRITE
            // elements: num
            // token labels: num
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_num=new RewriteRuleTokenStream(adaptor,"token num",num);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 663:24: -> ^( TOK_LIMIT $num)
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:663:27: ^( TOK_LIMIT $num)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_LIMIT, "TOK_LIMIT"), root_1);

                adaptor.addChild(root_1, stream_num.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end limitClause

    public static class selectClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start selectClause
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:668:1: selectClause : ( KW_SELECT ( KW_ALL | dist= KW_DISTINCT )? selectList -> {$dist == null}? ^( TOK_SELECT selectList ) -> ^( TOK_SELECTDI selectList ) | trfmClause -> ^( TOK_SELECT ^( TOK_SELEXPR trfmClause ) ) );
    public final selectClause_return selectClause() throws RecognitionException {
        selectClause_return retval = new selectClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token dist=null;
        Token KW_SELECT277=null;
        Token KW_ALL278=null;
        selectList_return selectList279 = null;

        trfmClause_return trfmClause280 = null;


        CommonTree dist_tree=null;
        CommonTree KW_SELECT277_tree=null;
        CommonTree KW_ALL278_tree=null;
        RewriteRuleTokenStream stream_KW_ALL=new RewriteRuleTokenStream(adaptor,"token KW_ALL");
        RewriteRuleTokenStream stream_KW_SELECT=new RewriteRuleTokenStream(adaptor,"token KW_SELECT");
        RewriteRuleTokenStream stream_KW_DISTINCT=new RewriteRuleTokenStream(adaptor,"token KW_DISTINCT");
        RewriteRuleSubtreeStream stream_selectList=new RewriteRuleSubtreeStream(adaptor,"rule selectList");
        RewriteRuleSubtreeStream stream_trfmClause=new RewriteRuleSubtreeStream(adaptor,"rule trfmClause");
         msgs.push("select clause"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:671:5: ( KW_SELECT ( KW_ALL | dist= KW_DISTINCT )? selectList -> {$dist == null}? ^( TOK_SELECT selectList ) -> ^( TOK_SELECTDI selectList ) | trfmClause -> ^( TOK_SELECT ^( TOK_SELEXPR trfmClause ) ) )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==KW_SELECT) ) {
                int LA91_1 = input.LA(2);

                if ( (LA91_1==KW_TRANSFORM) ) {
                    alt91=2;
                }
                else if ( (LA91_1==StringLiteral||(LA91_1>=KW_IF && LA91_1<=KW_NOT)||LA91_1==Identifier||LA91_1==LPAREN||LA91_1==Number||LA91_1==KW_ALL||(LA91_1>=KW_DISTINCT && LA91_1<=PLUS)||(LA91_1>=KW_CAST && LA91_1<=KW_CASE)||LA91_1==CharSetName||LA91_1==KW_NULL||(LA91_1>=MINUS && LA91_1<=TILDE)||(LA91_1>=KW_TRUE && LA91_1<=KW_FALSE)) ) {
                    alt91=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("668:1: selectClause : ( KW_SELECT ( KW_ALL | dist= KW_DISTINCT )? selectList -> {$dist == null}? ^( TOK_SELECT selectList ) -> ^( TOK_SELECTDI selectList ) | trfmClause -> ^( TOK_SELECT ^( TOK_SELEXPR trfmClause ) ) );", 91, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA91_0==KW_MAP||LA91_0==KW_REDUCE) ) {
                alt91=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("668:1: selectClause : ( KW_SELECT ( KW_ALL | dist= KW_DISTINCT )? selectList -> {$dist == null}? ^( TOK_SELECT selectList ) -> ^( TOK_SELECTDI selectList ) | trfmClause -> ^( TOK_SELECT ^( TOK_SELEXPR trfmClause ) ) );", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:672:5: KW_SELECT ( KW_ALL | dist= KW_DISTINCT )? selectList
                    {
                    KW_SELECT277=(Token)input.LT(1);
                    match(input,KW_SELECT,FOLLOW_KW_SELECT_in_selectClause4723); 
                    stream_KW_SELECT.add(KW_SELECT277);

                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:672:15: ( KW_ALL | dist= KW_DISTINCT )?
                    int alt90=3;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==KW_ALL) ) {
                        alt90=1;
                    }
                    else if ( (LA90_0==KW_DISTINCT) ) {
                        alt90=2;
                    }
                    switch (alt90) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:672:16: KW_ALL
                            {
                            KW_ALL278=(Token)input.LT(1);
                            match(input,KW_ALL,FOLLOW_KW_ALL_in_selectClause4726); 
                            stream_KW_ALL.add(KW_ALL278);


                            }
                            break;
                        case 2 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:672:25: dist= KW_DISTINCT
                            {
                            dist=(Token)input.LT(1);
                            match(input,KW_DISTINCT,FOLLOW_KW_DISTINCT_in_selectClause4732); 
                            stream_KW_DISTINCT.add(dist);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_selectList_in_selectClause4740);
                    selectList279=selectList();
                    _fsp--;

                    stream_selectList.add(selectList279.getTree());

                    // AST REWRITE
                    // elements: selectList, selectList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 673:16: -> {$dist == null}? ^( TOK_SELECT selectList )
                    if (dist == null) {
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:673:36: ^( TOK_SELECT selectList )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_SELECT, "TOK_SELECT"), root_1);

                        adaptor.addChild(root_1, stream_selectList.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 674:16: -> ^( TOK_SELECTDI selectList )
                    {
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:674:36: ^( TOK_SELECTDI selectList )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_SELECTDI, "TOK_SELECTDI"), root_1);

                        adaptor.addChild(root_1, stream_selectList.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;
                case 2 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:676:5: trfmClause
                    {
                    pushFollow(FOLLOW_trfmClause_in_selectClause4802);
                    trfmClause280=trfmClause();
                    _fsp--;

                    stream_trfmClause.add(trfmClause280.getTree());

                    // AST REWRITE
                    // elements: trfmClause
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 676:17: -> ^( TOK_SELECT ^( TOK_SELEXPR trfmClause ) )
                    {
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:676:19: ^( TOK_SELECT ^( TOK_SELEXPR trfmClause ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_SELECT, "TOK_SELECT"), root_1);

                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:676:32: ^( TOK_SELEXPR trfmClause )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_SELEXPR, "TOK_SELEXPR"), root_2);

                        adaptor.addChild(root_2, stream_trfmClause.next());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end selectClause

    public static class selectList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start selectList
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:679:1: selectList : ( hintClause )? selectItem ( COMMA selectItem )* -> ( hintClause )? ( selectItem )+ ;
    public final selectList_return selectList() throws RecognitionException {
        selectList_return retval = new selectList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA283=null;
        hintClause_return hintClause281 = null;

        selectItem_return selectItem282 = null;

        selectItem_return selectItem284 = null;


        CommonTree COMMA283_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_selectItem=new RewriteRuleSubtreeStream(adaptor,"rule selectItem");
        RewriteRuleSubtreeStream stream_hintClause=new RewriteRuleSubtreeStream(adaptor,"rule hintClause");
         msgs.push("select list"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:682:5: ( ( hintClause )? selectItem ( COMMA selectItem )* -> ( hintClause )? ( selectItem )+ )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:683:5: ( hintClause )? selectItem ( COMMA selectItem )*
            {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:683:5: ( hintClause )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==DIVIDE) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:683:5: hintClause
                    {
                    pushFollow(FOLLOW_hintClause_in_selectList4846);
                    hintClause281=hintClause();
                    _fsp--;

                    stream_hintClause.add(hintClause281.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_selectItem_in_selectList4849);
            selectItem282=selectItem();
            _fsp--;

            stream_selectItem.add(selectItem282.getTree());
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:683:28: ( COMMA selectItem )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==COMMA) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:683:30: COMMA selectItem
            	    {
            	    COMMA283=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_selectList4853); 
            	    stream_COMMA.add(COMMA283);

            	    pushFollow(FOLLOW_selectItem_in_selectList4856);
            	    selectItem284=selectItem();
            	    _fsp--;

            	    stream_selectItem.add(selectItem284.getTree());

            	    }
            	    break;

            	default :
            	    break loop93;
                }
            } while (true);


            // AST REWRITE
            // elements: hintClause, selectItem
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 683:51: -> ( hintClause )? ( selectItem )+
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:683:54: ( hintClause )?
                if ( stream_hintClause.hasNext() ) {
                    adaptor.addChild(root_0, stream_hintClause.next());

                }
                stream_hintClause.reset();
                if ( !(stream_selectItem.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_selectItem.hasNext() ) {
                    adaptor.addChild(root_0, stream_selectItem.next());

                }
                stream_selectItem.reset();

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end selectList

    public static class hintClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start hintClause
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:686:1: hintClause : DIVIDE STAR PLUS hintList STAR DIVIDE -> ^( TOK_HINTLIST hintList ) ;
    public final hintClause_return hintClause() throws RecognitionException {
        hintClause_return retval = new hintClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DIVIDE285=null;
        Token STAR286=null;
        Token PLUS287=null;
        Token STAR289=null;
        Token DIVIDE290=null;
        hintList_return hintList288 = null;


        CommonTree DIVIDE285_tree=null;
        CommonTree STAR286_tree=null;
        CommonTree PLUS287_tree=null;
        CommonTree STAR289_tree=null;
        CommonTree DIVIDE290_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleTokenStream stream_DIVIDE=new RewriteRuleTokenStream(adaptor,"token DIVIDE");
        RewriteRuleSubtreeStream stream_hintList=new RewriteRuleSubtreeStream(adaptor,"rule hintList");
         msgs.push("hint clause"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:689:5: ( DIVIDE STAR PLUS hintList STAR DIVIDE -> ^( TOK_HINTLIST hintList ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:690:5: DIVIDE STAR PLUS hintList STAR DIVIDE
            {
            DIVIDE285=(Token)input.LT(1);
            match(input,DIVIDE,FOLLOW_DIVIDE_in_hintClause4898); 
            stream_DIVIDE.add(DIVIDE285);

            STAR286=(Token)input.LT(1);
            match(input,STAR,FOLLOW_STAR_in_hintClause4900); 
            stream_STAR.add(STAR286);

            PLUS287=(Token)input.LT(1);
            match(input,PLUS,FOLLOW_PLUS_in_hintClause4902); 
            stream_PLUS.add(PLUS287);

            pushFollow(FOLLOW_hintList_in_hintClause4904);
            hintList288=hintList();
            _fsp--;

            stream_hintList.add(hintList288.getTree());
            STAR289=(Token)input.LT(1);
            match(input,STAR,FOLLOW_STAR_in_hintClause4906); 
            stream_STAR.add(STAR289);

            DIVIDE290=(Token)input.LT(1);
            match(input,DIVIDE,FOLLOW_DIVIDE_in_hintClause4908); 
            stream_DIVIDE.add(DIVIDE290);


            // AST REWRITE
            // elements: hintList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 690:43: -> ^( TOK_HINTLIST hintList )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:690:46: ^( TOK_HINTLIST hintList )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_HINTLIST, "TOK_HINTLIST"), root_1);

                adaptor.addChild(root_1, stream_hintList.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end hintClause

    public static class hintList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start hintList
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:693:1: hintList : hintItem ( COMMA hintItem )* -> ( hintItem )+ ;
    public final hintList_return hintList() throws RecognitionException {
        hintList_return retval = new hintList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA292=null;
        hintItem_return hintItem291 = null;

        hintItem_return hintItem293 = null;


        CommonTree COMMA292_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_hintItem=new RewriteRuleSubtreeStream(adaptor,"rule hintItem");
         msgs.push("hint list"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:696:5: ( hintItem ( COMMA hintItem )* -> ( hintItem )+ )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:697:5: hintItem ( COMMA hintItem )*
            {
            pushFollow(FOLLOW_hintItem_in_hintList4947);
            hintItem291=hintItem();
            _fsp--;

            stream_hintItem.add(hintItem291.getTree());
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:697:14: ( COMMA hintItem )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==COMMA) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:697:15: COMMA hintItem
            	    {
            	    COMMA292=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_hintList4950); 
            	    stream_COMMA.add(COMMA292);

            	    pushFollow(FOLLOW_hintItem_in_hintList4952);
            	    hintItem293=hintItem();
            	    _fsp--;

            	    stream_hintItem.add(hintItem293.getTree());

            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);


            // AST REWRITE
            // elements: hintItem
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 697:32: -> ( hintItem )+
            {
                if ( !(stream_hintItem.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_hintItem.hasNext() ) {
                    adaptor.addChild(root_0, stream_hintItem.next());

                }
                stream_hintItem.reset();

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end hintList

    public static class hintItem_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start hintItem
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:700:1: hintItem : hintName ( LPAREN hintArgs RPAREN )? -> ^( TOK_HINT hintName hintArgs ) ;
    public final hintItem_return hintItem() throws RecognitionException {
        hintItem_return retval = new hintItem_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN295=null;
        Token RPAREN297=null;
        hintName_return hintName294 = null;

        hintArgs_return hintArgs296 = null;


        CommonTree LPAREN295_tree=null;
        CommonTree RPAREN297_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_hintName=new RewriteRuleSubtreeStream(adaptor,"rule hintName");
        RewriteRuleSubtreeStream stream_hintArgs=new RewriteRuleSubtreeStream(adaptor,"rule hintArgs");
         msgs.push("hint item"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:703:5: ( hintName ( LPAREN hintArgs RPAREN )? -> ^( TOK_HINT hintName hintArgs ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:704:5: hintName ( LPAREN hintArgs RPAREN )?
            {
            pushFollow(FOLLOW_hintName_in_hintItem4990);
            hintName294=hintName();
            _fsp--;

            stream_hintName.add(hintName294.getTree());
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:704:14: ( LPAREN hintArgs RPAREN )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==LPAREN) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:704:15: LPAREN hintArgs RPAREN
                    {
                    LPAREN295=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_hintItem4993); 
                    stream_LPAREN.add(LPAREN295);

                    pushFollow(FOLLOW_hintArgs_in_hintItem4995);
                    hintArgs296=hintArgs();
                    _fsp--;

                    stream_hintArgs.add(hintArgs296.getTree());
                    RPAREN297=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_hintItem4997); 
                    stream_RPAREN.add(RPAREN297);


                    }
                    break;

            }


            // AST REWRITE
            // elements: hintName, hintArgs
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 704:40: -> ^( TOK_HINT hintName hintArgs )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:704:43: ^( TOK_HINT hintName hintArgs )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_HINT, "TOK_HINT"), root_1);

                adaptor.addChild(root_1, stream_hintName.next());
                adaptor.addChild(root_1, stream_hintArgs.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end hintItem

    public static class hintName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start hintName
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:707:1: hintName : KW_MAPJOIN -> TOK_MAPJOIN ;
    public final hintName_return hintName() throws RecognitionException {
        hintName_return retval = new hintName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_MAPJOIN298=null;

        CommonTree KW_MAPJOIN298_tree=null;
        RewriteRuleTokenStream stream_KW_MAPJOIN=new RewriteRuleTokenStream(adaptor,"token KW_MAPJOIN");

         msgs.push("hint name"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:710:5: ( KW_MAPJOIN -> TOK_MAPJOIN )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:711:5: KW_MAPJOIN
            {
            KW_MAPJOIN298=(Token)input.LT(1);
            match(input,KW_MAPJOIN,FOLLOW_KW_MAPJOIN_in_hintName5040); 
            stream_KW_MAPJOIN.add(KW_MAPJOIN298);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 711:16: -> TOK_MAPJOIN
            {
                adaptor.addChild(root_0, adaptor.create(TOK_MAPJOIN, "TOK_MAPJOIN"));

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end hintName

    public static class hintArgs_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start hintArgs
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:714:1: hintArgs : hintArgName ( COMMA hintArgName )* -> ^( TOK_HINTARGLIST ( hintArgName )+ ) ;
    public final hintArgs_return hintArgs() throws RecognitionException {
        hintArgs_return retval = new hintArgs_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA300=null;
        hintArgName_return hintArgName299 = null;

        hintArgName_return hintArgName301 = null;


        CommonTree COMMA300_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_hintArgName=new RewriteRuleSubtreeStream(adaptor,"rule hintArgName");
         msgs.push("hint arguments"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:717:5: ( hintArgName ( COMMA hintArgName )* -> ^( TOK_HINTARGLIST ( hintArgName )+ ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:718:5: hintArgName ( COMMA hintArgName )*
            {
            pushFollow(FOLLOW_hintArgName_in_hintArgs5075);
            hintArgName299=hintArgName();
            _fsp--;

            stream_hintArgName.add(hintArgName299.getTree());
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:718:17: ( COMMA hintArgName )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==COMMA) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:718:18: COMMA hintArgName
            	    {
            	    COMMA300=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_hintArgs5078); 
            	    stream_COMMA.add(COMMA300);

            	    pushFollow(FOLLOW_hintArgName_in_hintArgs5080);
            	    hintArgName301=hintArgName();
            	    _fsp--;

            	    stream_hintArgName.add(hintArgName301.getTree());

            	    }
            	    break;

            	default :
            	    break loop96;
                }
            } while (true);


            // AST REWRITE
            // elements: hintArgName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 718:38: -> ^( TOK_HINTARGLIST ( hintArgName )+ )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:718:41: ^( TOK_HINTARGLIST ( hintArgName )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_HINTARGLIST, "TOK_HINTARGLIST"), root_1);

                if ( !(stream_hintArgName.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_hintArgName.hasNext() ) {
                    adaptor.addChild(root_1, stream_hintArgName.next());

                }
                stream_hintArgName.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end hintArgs

    public static class hintArgName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start hintArgName
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:721:1: hintArgName : Identifier ;
    public final hintArgName_return hintArgName() throws RecognitionException {
        hintArgName_return retval = new hintArgName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier302=null;

        CommonTree Identifier302_tree=null;

         msgs.push("hint argument name"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:724:5: ( Identifier )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:725:5: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier302=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_hintArgName5122); 
            Identifier302_tree = (CommonTree)adaptor.create(Identifier302);
            adaptor.addChild(root_0, Identifier302_tree);


            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end hintArgName

    public static class selectItem_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start selectItem
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:728:1: selectItem : ( selectExpression ( ( KW_AS )? Identifier )? ) -> ^( TOK_SELEXPR selectExpression ( Identifier )? ) ;
    public final selectItem_return selectItem() throws RecognitionException {
        selectItem_return retval = new selectItem_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_AS304=null;
        Token Identifier305=null;
        selectExpression_return selectExpression303 = null;


        CommonTree KW_AS304_tree=null;
        CommonTree Identifier305_tree=null;
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_selectExpression=new RewriteRuleSubtreeStream(adaptor,"rule selectExpression");
         msgs.push("selection target"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:731:5: ( ( selectExpression ( ( KW_AS )? Identifier )? ) -> ^( TOK_SELEXPR selectExpression ( Identifier )? ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:732:5: ( selectExpression ( ( KW_AS )? Identifier )? )
            {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:732:5: ( selectExpression ( ( KW_AS )? Identifier )? )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:732:7: selectExpression ( ( KW_AS )? Identifier )?
            {
            pushFollow(FOLLOW_selectExpression_in_selectItem5155);
            selectExpression303=selectExpression();
            _fsp--;

            stream_selectExpression.add(selectExpression303.getTree());
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:732:25: ( ( KW_AS )? Identifier )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==Identifier||LA98_0==KW_AS) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:732:26: ( KW_AS )? Identifier
                    {
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:732:26: ( KW_AS )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==KW_AS) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:732:26: KW_AS
                            {
                            KW_AS304=(Token)input.LT(1);
                            match(input,KW_AS,FOLLOW_KW_AS_in_selectItem5159); 
                            stream_KW_AS.add(KW_AS304);


                            }
                            break;

                    }

                    Identifier305=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_selectItem5162); 
                    stream_Identifier.add(Identifier305);


                    }
                    break;

            }


            }


            // AST REWRITE
            // elements: Identifier, selectExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 732:47: -> ^( TOK_SELEXPR selectExpression ( Identifier )? )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:732:50: ^( TOK_SELEXPR selectExpression ( Identifier )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_SELEXPR, "TOK_SELEXPR"), root_1);

                adaptor.addChild(root_1, stream_selectExpression.next());
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:732:81: ( Identifier )?
                if ( stream_Identifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_Identifier.next());

                }
                stream_Identifier.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end selectItem

    public static class trfmClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start trfmClause
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:735:1: trfmClause : ( KW_SELECT KW_TRANSFORM LPAREN selectExpressionList RPAREN | KW_MAP selectExpressionList | KW_REDUCE selectExpressionList ) inSerde= serde KW_USING StringLiteral ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )? outSerde= serde outRec= recordReader -> ^( TOK_TRANSFORM selectExpressionList $inSerde StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? ) ;
    public final trfmClause_return trfmClause() throws RecognitionException {
        trfmClause_return retval = new trfmClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_SELECT306=null;
        Token KW_TRANSFORM307=null;
        Token LPAREN308=null;
        Token RPAREN310=null;
        Token KW_MAP311=null;
        Token KW_REDUCE313=null;
        Token KW_USING315=null;
        Token StringLiteral316=null;
        Token KW_AS317=null;
        Token LPAREN318=null;
        Token RPAREN321=null;
        serde_return inSerde = null;

        serde_return outSerde = null;

        recordReader_return outRec = null;

        selectExpressionList_return selectExpressionList309 = null;

        selectExpressionList_return selectExpressionList312 = null;

        selectExpressionList_return selectExpressionList314 = null;

        aliasList_return aliasList319 = null;

        columnNameTypeList_return columnNameTypeList320 = null;

        aliasList_return aliasList322 = null;

        columnNameTypeList_return columnNameTypeList323 = null;


        CommonTree KW_SELECT306_tree=null;
        CommonTree KW_TRANSFORM307_tree=null;
        CommonTree LPAREN308_tree=null;
        CommonTree RPAREN310_tree=null;
        CommonTree KW_MAP311_tree=null;
        CommonTree KW_REDUCE313_tree=null;
        CommonTree KW_USING315_tree=null;
        CommonTree StringLiteral316_tree=null;
        CommonTree KW_AS317_tree=null;
        CommonTree LPAREN318_tree=null;
        CommonTree RPAREN321_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_KW_SELECT=new RewriteRuleTokenStream(adaptor,"token KW_SELECT");
        RewriteRuleTokenStream stream_KW_REDUCE=new RewriteRuleTokenStream(adaptor,"token KW_REDUCE");
        RewriteRuleTokenStream stream_KW_USING=new RewriteRuleTokenStream(adaptor,"token KW_USING");
        RewriteRuleTokenStream stream_KW_TRANSFORM=new RewriteRuleTokenStream(adaptor,"token KW_TRANSFORM");
        RewriteRuleTokenStream stream_KW_MAP=new RewriteRuleTokenStream(adaptor,"token KW_MAP");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_columnNameTypeList=new RewriteRuleSubtreeStream(adaptor,"rule columnNameTypeList");
        RewriteRuleSubtreeStream stream_serde=new RewriteRuleSubtreeStream(adaptor,"rule serde");
        RewriteRuleSubtreeStream stream_recordReader=new RewriteRuleSubtreeStream(adaptor,"rule recordReader");
        RewriteRuleSubtreeStream stream_aliasList=new RewriteRuleSubtreeStream(adaptor,"rule aliasList");
        RewriteRuleSubtreeStream stream_selectExpressionList=new RewriteRuleSubtreeStream(adaptor,"rule selectExpressionList");
         msgs.push("transform clause"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:738:5: ( ( KW_SELECT KW_TRANSFORM LPAREN selectExpressionList RPAREN | KW_MAP selectExpressionList | KW_REDUCE selectExpressionList ) inSerde= serde KW_USING StringLiteral ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )? outSerde= serde outRec= recordReader -> ^( TOK_TRANSFORM selectExpressionList $inSerde StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:739:5: ( KW_SELECT KW_TRANSFORM LPAREN selectExpressionList RPAREN | KW_MAP selectExpressionList | KW_REDUCE selectExpressionList ) inSerde= serde KW_USING StringLiteral ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )? outSerde= serde outRec= recordReader
            {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:739:5: ( KW_SELECT KW_TRANSFORM LPAREN selectExpressionList RPAREN | KW_MAP selectExpressionList | KW_REDUCE selectExpressionList )
            int alt99=3;
            switch ( input.LA(1) ) {
            case KW_SELECT:
                {
                alt99=1;
                }
                break;
            case KW_MAP:
                {
                alt99=2;
                }
                break;
            case KW_REDUCE:
                {
                alt99=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("739:5: ( KW_SELECT KW_TRANSFORM LPAREN selectExpressionList RPAREN | KW_MAP selectExpressionList | KW_REDUCE selectExpressionList )", 99, 0, input);

                throw nvae;
            }

            switch (alt99) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:739:7: KW_SELECT KW_TRANSFORM LPAREN selectExpressionList RPAREN
                    {
                    KW_SELECT306=(Token)input.LT(1);
                    match(input,KW_SELECT,FOLLOW_KW_SELECT_in_trfmClause5209); 
                    stream_KW_SELECT.add(KW_SELECT306);

                    KW_TRANSFORM307=(Token)input.LT(1);
                    match(input,KW_TRANSFORM,FOLLOW_KW_TRANSFORM_in_trfmClause5211); 
                    stream_KW_TRANSFORM.add(KW_TRANSFORM307);

                    LPAREN308=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_trfmClause5213); 
                    stream_LPAREN.add(LPAREN308);

                    pushFollow(FOLLOW_selectExpressionList_in_trfmClause5215);
                    selectExpressionList309=selectExpressionList();
                    _fsp--;

                    stream_selectExpressionList.add(selectExpressionList309.getTree());
                    RPAREN310=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_trfmClause5217); 
                    stream_RPAREN.add(RPAREN310);


                    }
                    break;
                case 2 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:740:9: KW_MAP selectExpressionList
                    {
                    KW_MAP311=(Token)input.LT(1);
                    match(input,KW_MAP,FOLLOW_KW_MAP_in_trfmClause5227); 
                    stream_KW_MAP.add(KW_MAP311);

                    pushFollow(FOLLOW_selectExpressionList_in_trfmClause5232);
                    selectExpressionList312=selectExpressionList();
                    _fsp--;

                    stream_selectExpressionList.add(selectExpressionList312.getTree());

                    }
                    break;
                case 3 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:741:9: KW_REDUCE selectExpressionList
                    {
                    KW_REDUCE313=(Token)input.LT(1);
                    match(input,KW_REDUCE,FOLLOW_KW_REDUCE_in_trfmClause5242); 
                    stream_KW_REDUCE.add(KW_REDUCE313);

                    pushFollow(FOLLOW_selectExpressionList_in_trfmClause5244);
                    selectExpressionList314=selectExpressionList();
                    _fsp--;

                    stream_selectExpressionList.add(selectExpressionList314.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_serde_in_trfmClause5254);
            inSerde=serde();
            _fsp--;

            stream_serde.add(inSerde.getTree());
            KW_USING315=(Token)input.LT(1);
            match(input,KW_USING,FOLLOW_KW_USING_in_trfmClause5261); 
            stream_KW_USING.add(KW_USING315);

            StringLiteral316=(Token)input.LT(1);
            match(input,StringLiteral,FOLLOW_StringLiteral_in_trfmClause5263); 
            stream_StringLiteral.add(StringLiteral316);

            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:744:5: ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==KW_AS) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:744:7: KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) )
                    {
                    KW_AS317=(Token)input.LT(1);
                    match(input,KW_AS,FOLLOW_KW_AS_in_trfmClause5272); 
                    stream_KW_AS.add(KW_AS317);

                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:744:13: ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) )
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==LPAREN) ) {
                        alt102=1;
                    }
                    else if ( (LA102_0==Identifier) ) {
                        alt102=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("744:13: ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) )", 102, 0, input);

                        throw nvae;
                    }
                    switch (alt102) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:744:14: ( LPAREN ( aliasList | columnNameTypeList ) RPAREN )
                            {
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:744:14: ( LPAREN ( aliasList | columnNameTypeList ) RPAREN )
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:744:15: LPAREN ( aliasList | columnNameTypeList ) RPAREN
                            {
                            LPAREN318=(Token)input.LT(1);
                            match(input,LPAREN,FOLLOW_LPAREN_in_trfmClause5276); 
                            stream_LPAREN.add(LPAREN318);

                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:744:22: ( aliasList | columnNameTypeList )
                            int alt100=2;
                            int LA100_0 = input.LA(1);

                            if ( (LA100_0==Identifier) ) {
                                int LA100_1 = input.LA(2);

                                if ( (LA100_1==KW_MAP||(LA100_1>=KW_TINYINT && LA100_1<=KW_ARRAY)) ) {
                                    alt100=2;
                                }
                                else if ( (LA100_1==RPAREN||LA100_1==COMMA) ) {
                                    alt100=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("744:22: ( aliasList | columnNameTypeList )", 100, 1, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("744:22: ( aliasList | columnNameTypeList )", 100, 0, input);

                                throw nvae;
                            }
                            switch (alt100) {
                                case 1 :
                                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:744:23: aliasList
                                    {
                                    pushFollow(FOLLOW_aliasList_in_trfmClause5279);
                                    aliasList319=aliasList();
                                    _fsp--;

                                    stream_aliasList.add(aliasList319.getTree());

                                    }
                                    break;
                                case 2 :
                                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:744:35: columnNameTypeList
                                    {
                                    pushFollow(FOLLOW_columnNameTypeList_in_trfmClause5283);
                                    columnNameTypeList320=columnNameTypeList();
                                    _fsp--;

                                    stream_columnNameTypeList.add(columnNameTypeList320.getTree());

                                    }
                                    break;

                            }

                            RPAREN321=(Token)input.LT(1);
                            match(input,RPAREN,FOLLOW_RPAREN_in_trfmClause5286); 
                            stream_RPAREN.add(RPAREN321);


                            }


                            }
                            break;
                        case 2 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:744:65: ( aliasList | columnNameTypeList )
                            {
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:744:65: ( aliasList | columnNameTypeList )
                            int alt101=2;
                            int LA101_0 = input.LA(1);

                            if ( (LA101_0==Identifier) ) {
                                switch ( input.LA(2) ) {
                                case EOF:
                                case RPAREN:
                                case COMMA:
                                case KW_RECORDREADER:
                                case KW_ROW:
                                case KW_UNION:
                                case KW_INSERT:
                                case KW_LIMIT:
                                case KW_SELECT:
                                case KW_REDUCE:
                                case KW_FROM:
                                case KW_WHERE:
                                case KW_GROUP:
                                case KW_ORDER:
                                case KW_CLUSTER:
                                case KW_DISTRIBUTE:
                                case KW_SORT:
                                    {
                                    alt101=1;
                                    }
                                    break;
                                case KW_MAP:
                                    {
                                    int LA101_18 = input.LA(3);

                                    if ( (LA101_18==LESSTHAN) ) {
                                        alt101=2;
                                    }
                                    else if ( (LA101_18==StringLiteral||(LA101_18>=KW_IF && LA101_18<=KW_NOT)||LA101_18==Identifier||LA101_18==LPAREN||LA101_18==Number||(LA101_18>=STAR && LA101_18<=PLUS)||(LA101_18>=KW_CAST && LA101_18<=KW_CASE)||LA101_18==CharSetName||LA101_18==KW_NULL||(LA101_18>=MINUS && LA101_18<=TILDE)||(LA101_18>=KW_TRUE && LA101_18<=KW_FALSE)) ) {
                                        alt101=1;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("744:65: ( aliasList | columnNameTypeList )", 101, 18, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case KW_TINYINT:
                                case KW_SMALLINT:
                                case KW_INT:
                                case KW_BIGINT:
                                case KW_BOOLEAN:
                                case KW_FLOAT:
                                case KW_DOUBLE:
                                case KW_DATE:
                                case KW_DATETIME:
                                case KW_TIMESTAMP:
                                case KW_STRING:
                                case KW_ARRAY:
                                    {
                                    alt101=2;
                                    }
                                    break;
                                default:
                                    NoViableAltException nvae =
                                        new NoViableAltException("744:65: ( aliasList | columnNameTypeList )", 101, 1, input);

                                    throw nvae;
                                }

                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("744:65: ( aliasList | columnNameTypeList )", 101, 0, input);

                                throw nvae;
                            }
                            switch (alt101) {
                                case 1 :
                                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:744:66: aliasList
                                    {
                                    pushFollow(FOLLOW_aliasList_in_trfmClause5292);
                                    aliasList322=aliasList();
                                    _fsp--;

                                    stream_aliasList.add(aliasList322.getTree());

                                    }
                                    break;
                                case 2 :
                                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:744:78: columnNameTypeList
                                    {
                                    pushFollow(FOLLOW_columnNameTypeList_in_trfmClause5296);
                                    columnNameTypeList323=columnNameTypeList();
                                    _fsp--;

                                    stream_columnNameTypeList.add(columnNameTypeList323.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_serde_in_trfmClause5309);
            outSerde=serde();
            _fsp--;

            stream_serde.add(outSerde.getTree());
            pushFollow(FOLLOW_recordReader_in_trfmClause5313);
            outRec=recordReader();
            _fsp--;

            stream_recordReader.add(outRec.getTree());

            // AST REWRITE
            // elements: StringLiteral, selectExpressionList, aliasList, outRec, outSerde, columnNameTypeList, inSerde
            // token labels: 
            // rule labels: retval, inSerde, outRec, outSerde
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_inSerde=new RewriteRuleSubtreeStream(adaptor,"token inSerde",inSerde!=null?inSerde.tree:null);
            RewriteRuleSubtreeStream stream_outRec=new RewriteRuleSubtreeStream(adaptor,"token outRec",outRec!=null?outRec.tree:null);
            RewriteRuleSubtreeStream stream_outSerde=new RewriteRuleSubtreeStream(adaptor,"token outSerde",outSerde!=null?outSerde.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 746:5: -> ^( TOK_TRANSFORM selectExpressionList $inSerde StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:746:8: ^( TOK_TRANSFORM selectExpressionList $inSerde StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_TRANSFORM, "TOK_TRANSFORM"), root_1);

                adaptor.addChild(root_1, stream_selectExpressionList.next());
                adaptor.addChild(root_1, stream_inSerde.next());
                adaptor.addChild(root_1, stream_StringLiteral.next());
                adaptor.addChild(root_1, stream_outSerde.next());
                adaptor.addChild(root_1, stream_outRec.next());
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:746:86: ( aliasList )?
                if ( stream_aliasList.hasNext() ) {
                    adaptor.addChild(root_1, stream_aliasList.next());

                }
                stream_aliasList.reset();
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:746:97: ( columnNameTypeList )?
                if ( stream_columnNameTypeList.hasNext() ) {
                    adaptor.addChild(root_1, stream_columnNameTypeList.next());

                }
                stream_columnNameTypeList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end trfmClause

    public static class selectExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start selectExpression
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:749:1: selectExpression : ( expression | tableAllColumns );
    public final selectExpression_return selectExpression() throws RecognitionException {
        selectExpression_return retval = new selectExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        expression_return expression324 = null;

        tableAllColumns_return tableAllColumns325 = null;



         msgs.push("select expression"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:752:5: ( expression | tableAllColumns )
            int alt104=2;
            switch ( input.LA(1) ) {
            case StringLiteral:
            case KW_IF:
            case KW_NOT:
            case LPAREN:
            case Number:
            case PLUS:
            case KW_CAST:
            case KW_CASE:
            case CharSetName:
            case KW_NULL:
            case MINUS:
            case TILDE:
            case KW_TRUE:
            case KW_FALSE:
                {
                alt104=1;
                }
                break;
            case Identifier:
                {
                int LA104_9 = input.LA(2);

                if ( (LA104_9==DOT) ) {
                    int LA104_15 = input.LA(3);

                    if ( (LA104_15==Identifier) ) {
                        alt104=1;
                    }
                    else if ( (LA104_15==STAR) ) {
                        alt104=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("749:1: selectExpression : ( expression | tableAllColumns );", 104, 15, input);

                        throw nvae;
                    }
                }
                else if ( (LA104_9==EOF||(LA104_9>=Identifier && LA104_9<=RPAREN)||LA104_9==COMMA||LA104_9==KW_AS||LA104_9==KW_ROW||LA104_9==EQUAL||LA104_9==KW_MAP||(LA104_9>=LESSTHAN && LA104_9<=KW_UNION)||LA104_9==KW_INSERT||(LA104_9>=KW_LIMIT && LA104_9<=KW_SELECT)||(LA104_9>=DIVIDE && LA104_9<=PLUS)||(LA104_9>=KW_REDUCE && LA104_9<=KW_FROM)||(LA104_9>=KW_WHERE && LA104_9<=KW_SORT)||LA104_9==LSQUARE||LA104_9==MINUS||(LA104_9>=KW_IS && LA104_9<=KW_OR)) ) {
                    alt104=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("749:1: selectExpression : ( expression | tableAllColumns );", 104, 9, input);

                    throw nvae;
                }
                }
                break;
            case STAR:
                {
                alt104=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("749:1: selectExpression : ( expression | tableAllColumns );", 104, 0, input);

                throw nvae;
            }

            switch (alt104) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:753:5: expression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_selectExpression5377);
                    expression324=expression();
                    _fsp--;

                    adaptor.addChild(root_0, expression324.getTree());

                    }
                    break;
                case 2 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:753:18: tableAllColumns
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_tableAllColumns_in_selectExpression5381);
                    tableAllColumns325=tableAllColumns();
                    _fsp--;

                    adaptor.addChild(root_0, tableAllColumns325.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end selectExpression

    public static class selectExpressionList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start selectExpressionList
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:756:1: selectExpressionList : selectExpression ( COMMA selectExpression )* -> ^( TOK_EXPLIST ( selectExpression )+ ) ;
    public final selectExpressionList_return selectExpressionList() throws RecognitionException {
        selectExpressionList_return retval = new selectExpressionList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA327=null;
        selectExpression_return selectExpression326 = null;

        selectExpression_return selectExpression328 = null;


        CommonTree COMMA327_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_selectExpression=new RewriteRuleSubtreeStream(adaptor,"rule selectExpression");
         msgs.push("select expression list"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:759:5: ( selectExpression ( COMMA selectExpression )* -> ^( TOK_EXPLIST ( selectExpression )+ ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:760:5: selectExpression ( COMMA selectExpression )*
            {
            pushFollow(FOLLOW_selectExpression_in_selectExpressionList5412);
            selectExpression326=selectExpression();
            _fsp--;

            stream_selectExpression.add(selectExpression326.getTree());
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:760:22: ( COMMA selectExpression )*
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==COMMA) ) {
                    alt105=1;
                }


                switch (alt105) {
            	case 1 :
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:760:23: COMMA selectExpression
            	    {
            	    COMMA327=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_selectExpressionList5415); 
            	    stream_COMMA.add(COMMA327);

            	    pushFollow(FOLLOW_selectExpression_in_selectExpressionList5417);
            	    selectExpression328=selectExpression();
            	    _fsp--;

            	    stream_selectExpression.add(selectExpression328.getTree());

            	    }
            	    break;

            	default :
            	    break loop105;
                }
            } while (true);


            // AST REWRITE
            // elements: selectExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 760:48: -> ^( TOK_EXPLIST ( selectExpression )+ )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:760:51: ^( TOK_EXPLIST ( selectExpression )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_EXPLIST, "TOK_EXPLIST"), root_1);

                if ( !(stream_selectExpression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_selectExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_selectExpression.next());

                }
                stream_selectExpression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end selectExpressionList

    public static class tableAllColumns_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start tableAllColumns
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:766:1: tableAllColumns : ( STAR -> ^( TOK_ALLCOLREF ) | Identifier DOT STAR -> ^( TOK_ALLCOLREF Identifier ) );
    public final tableAllColumns_return tableAllColumns() throws RecognitionException {
        tableAllColumns_return retval = new tableAllColumns_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token STAR329=null;
        Token Identifier330=null;
        Token DOT331=null;
        Token STAR332=null;

        CommonTree STAR329_tree=null;
        CommonTree Identifier330_tree=null;
        CommonTree DOT331_tree=null;
        CommonTree STAR332_tree=null;
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:767:5: ( STAR -> ^( TOK_ALLCOLREF ) | Identifier DOT STAR -> ^( TOK_ALLCOLREF Identifier ) )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==STAR) ) {
                alt106=1;
            }
            else if ( (LA106_0==Identifier) ) {
                alt106=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("766:1: tableAllColumns : ( STAR -> ^( TOK_ALLCOLREF ) | Identifier DOT STAR -> ^( TOK_ALLCOLREF Identifier ) );", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:768:5: STAR
                    {
                    STAR329=(Token)input.LT(1);
                    match(input,STAR,FOLLOW_STAR_in_tableAllColumns5452); 
                    stream_STAR.add(STAR329);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 768:10: -> ^( TOK_ALLCOLREF )
                    {
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:768:13: ^( TOK_ALLCOLREF )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_ALLCOLREF, "TOK_ALLCOLREF"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;
                case 2 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:769:7: Identifier DOT STAR
                    {
                    Identifier330=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_tableAllColumns5466); 
                    stream_Identifier.add(Identifier330);

                    DOT331=(Token)input.LT(1);
                    match(input,DOT,FOLLOW_DOT_in_tableAllColumns5468); 
                    stream_DOT.add(DOT331);

                    STAR332=(Token)input.LT(1);
                    match(input,STAR,FOLLOW_STAR_in_tableAllColumns5470); 
                    stream_STAR.add(STAR332);


                    // AST REWRITE
                    // elements: Identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 769:27: -> ^( TOK_ALLCOLREF Identifier )
                    {
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:769:30: ^( TOK_ALLCOLREF Identifier )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_ALLCOLREF, "TOK_ALLCOLREF"), root_1);

                        adaptor.addChild(root_1, stream_Identifier.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end tableAllColumns

    public static class tableOrColumn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start tableOrColumn
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:773:1: tableOrColumn : Identifier -> ^( TOK_TABLE_OR_COL Identifier ) ;
    public final tableOrColumn_return tableOrColumn() throws RecognitionException {
        tableOrColumn_return retval = new tableOrColumn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier333=null;

        CommonTree Identifier333_tree=null;
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

         msgs.push("table or column identifier"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:776:5: ( Identifier -> ^( TOK_TABLE_OR_COL Identifier ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:777:5: Identifier
            {
            Identifier333=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_tableOrColumn5514); 
            stream_Identifier.add(Identifier333);


            // AST REWRITE
            // elements: Identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 777:16: -> ^( TOK_TABLE_OR_COL Identifier )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:777:19: ^( TOK_TABLE_OR_COL Identifier )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_TABLE_OR_COL, "TOK_TABLE_OR_COL"), root_1);

                adaptor.addChild(root_1, stream_Identifier.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end tableOrColumn

    public static class expressionList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start expressionList
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:780:1: expressionList : expression ( COMMA expression )* -> ^( TOK_EXPLIST ( expression )+ ) ;
    public final expressionList_return expressionList() throws RecognitionException {
        expressionList_return retval = new expressionList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA335=null;
        expression_return expression334 = null;

        expression_return expression336 = null;


        CommonTree COMMA335_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
         msgs.push("expression list"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:783:5: ( expression ( COMMA expression )* -> ^( TOK_EXPLIST ( expression )+ ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:784:5: expression ( COMMA expression )*
            {
            pushFollow(FOLLOW_expression_in_expressionList5553);
            expression334=expression();
            _fsp--;

            stream_expression.add(expression334.getTree());
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:784:16: ( COMMA expression )*
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==COMMA) ) {
                    alt107=1;
                }


                switch (alt107) {
            	case 1 :
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:784:17: COMMA expression
            	    {
            	    COMMA335=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_expressionList5556); 
            	    stream_COMMA.add(COMMA335);

            	    pushFollow(FOLLOW_expression_in_expressionList5558);
            	    expression336=expression();
            	    _fsp--;

            	    stream_expression.add(expression336.getTree());

            	    }
            	    break;

            	default :
            	    break loop107;
                }
            } while (true);


            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 784:36: -> ^( TOK_EXPLIST ( expression )+ )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:784:39: ^( TOK_EXPLIST ( expression )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_EXPLIST, "TOK_EXPLIST"), root_1);

                if ( !(stream_expression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.next());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end expressionList

    public static class aliasList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start aliasList
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:787:1: aliasList : Identifier ( COMMA Identifier )* -> ^( TOK_ALIASLIST ( Identifier )+ ) ;
    public final aliasList_return aliasList() throws RecognitionException {
        aliasList_return retval = new aliasList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier337=null;
        Token COMMA338=null;
        Token Identifier339=null;

        CommonTree Identifier337_tree=null;
        CommonTree COMMA338_tree=null;
        CommonTree Identifier339_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

         msgs.push("alias list"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:790:5: ( Identifier ( COMMA Identifier )* -> ^( TOK_ALIASLIST ( Identifier )+ ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:791:5: Identifier ( COMMA Identifier )*
            {
            Identifier337=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_aliasList5600); 
            stream_Identifier.add(Identifier337);

            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:791:16: ( COMMA Identifier )*
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( (LA108_0==COMMA) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:791:17: COMMA Identifier
            	    {
            	    COMMA338=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_aliasList5603); 
            	    stream_COMMA.add(COMMA338);

            	    Identifier339=(Token)input.LT(1);
            	    match(input,Identifier,FOLLOW_Identifier_in_aliasList5605); 
            	    stream_Identifier.add(Identifier339);


            	    }
            	    break;

            	default :
            	    break loop108;
                }
            } while (true);


            // AST REWRITE
            // elements: Identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 791:36: -> ^( TOK_ALIASLIST ( Identifier )+ )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:791:39: ^( TOK_ALIASLIST ( Identifier )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_ALIASLIST, "TOK_ALIASLIST"), root_1);

                if ( !(stream_Identifier.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_Identifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_Identifier.next());

                }
                stream_Identifier.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end aliasList

    public static class fromClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start fromClause
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:796:1: fromClause : KW_FROM joinSource -> ^( TOK_FROM joinSource ) ;
    public final fromClause_return fromClause() throws RecognitionException {
        fromClause_return retval = new fromClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_FROM340=null;
        joinSource_return joinSource341 = null;


        CommonTree KW_FROM340_tree=null;
        RewriteRuleTokenStream stream_KW_FROM=new RewriteRuleTokenStream(adaptor,"token KW_FROM");
        RewriteRuleSubtreeStream stream_joinSource=new RewriteRuleSubtreeStream(adaptor,"rule joinSource");
         msgs.push("from clause"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:799:5: ( KW_FROM joinSource -> ^( TOK_FROM joinSource ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:800:5: KW_FROM joinSource
            {
            KW_FROM340=(Token)input.LT(1);
            match(input,KW_FROM,FOLLOW_KW_FROM_in_fromClause5652); 
            stream_KW_FROM.add(KW_FROM340);

            pushFollow(FOLLOW_joinSource_in_fromClause5654);
            joinSource341=joinSource();
            _fsp--;

            stream_joinSource.add(joinSource341.getTree());

            // AST REWRITE
            // elements: joinSource
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 800:24: -> ^( TOK_FROM joinSource )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:800:27: ^( TOK_FROM joinSource )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_FROM, "TOK_FROM"), root_1);

                adaptor.addChild(root_1, stream_joinSource.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end fromClause

    public static class joinSource_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start joinSource
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:803:1: joinSource : fromSource ( joinToken fromSource ( KW_ON expression )? )* ;
    public final joinSource_return joinSource() throws RecognitionException {
        joinSource_return retval = new joinSource_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_ON345=null;
        fromSource_return fromSource342 = null;

        joinToken_return joinToken343 = null;

        fromSource_return fromSource344 = null;

        expression_return expression346 = null;


        CommonTree KW_ON345_tree=null;

         msgs.push("join source"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:806:5: ( fromSource ( joinToken fromSource ( KW_ON expression )? )* )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:807:5: fromSource ( joinToken fromSource ( KW_ON expression )? )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_fromSource_in_joinSource5693);
            fromSource342=fromSource();
            _fsp--;

            adaptor.addChild(root_0, fromSource342.getTree());
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:808:5: ( joinToken fromSource ( KW_ON expression )? )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( ((LA110_0>=KW_JOIN && LA110_0<=KW_LEFT)||(LA110_0>=KW_RIGHT && LA110_0<=KW_FULL)) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:808:7: joinToken fromSource ( KW_ON expression )?
            	    {
            	    pushFollow(FOLLOW_joinToken_in_joinSource5701);
            	    joinToken343=joinToken();
            	    _fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(joinToken343.getTree(), root_0);
            	    pushFollow(FOLLOW_fromSource_in_joinSource5704);
            	    fromSource344=fromSource();
            	    _fsp--;

            	    adaptor.addChild(root_0, fromSource344.getTree());
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:808:29: ( KW_ON expression )?
            	    int alt109=2;
            	    int LA109_0 = input.LA(1);

            	    if ( (LA109_0==KW_ON) ) {
            	        alt109=1;
            	    }
            	    switch (alt109) {
            	        case 1 :
            	            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:808:30: KW_ON expression
            	            {
            	            KW_ON345=(Token)input.LT(1);
            	            match(input,KW_ON,FOLLOW_KW_ON_in_joinSource5707); 
            	            pushFollow(FOLLOW_expression_in_joinSource5710);
            	            expression346=expression();
            	            _fsp--;

            	            adaptor.addChild(root_0, expression346.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop110;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end joinSource

    public static class joinToken_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start joinToken
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:811:1: joinToken : ( KW_JOIN -> TOK_JOIN | KW_LEFT KW_OUTER KW_JOIN -> TOK_LEFTOUTERJOIN | KW_RIGHT KW_OUTER KW_JOIN -> TOK_RIGHTOUTERJOIN | KW_FULL KW_OUTER KW_JOIN -> TOK_FULLOUTERJOIN );
    public final joinToken_return joinToken() throws RecognitionException {
        joinToken_return retval = new joinToken_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_JOIN347=null;
        Token KW_LEFT348=null;
        Token KW_OUTER349=null;
        Token KW_JOIN350=null;
        Token KW_RIGHT351=null;
        Token KW_OUTER352=null;
        Token KW_JOIN353=null;
        Token KW_FULL354=null;
        Token KW_OUTER355=null;
        Token KW_JOIN356=null;

        CommonTree KW_JOIN347_tree=null;
        CommonTree KW_LEFT348_tree=null;
        CommonTree KW_OUTER349_tree=null;
        CommonTree KW_JOIN350_tree=null;
        CommonTree KW_RIGHT351_tree=null;
        CommonTree KW_OUTER352_tree=null;
        CommonTree KW_JOIN353_tree=null;
        CommonTree KW_FULL354_tree=null;
        CommonTree KW_OUTER355_tree=null;
        CommonTree KW_JOIN356_tree=null;
        RewriteRuleTokenStream stream_KW_RIGHT=new RewriteRuleTokenStream(adaptor,"token KW_RIGHT");
        RewriteRuleTokenStream stream_KW_OUTER=new RewriteRuleTokenStream(adaptor,"token KW_OUTER");
        RewriteRuleTokenStream stream_KW_JOIN=new RewriteRuleTokenStream(adaptor,"token KW_JOIN");
        RewriteRuleTokenStream stream_KW_LEFT=new RewriteRuleTokenStream(adaptor,"token KW_LEFT");
        RewriteRuleTokenStream stream_KW_FULL=new RewriteRuleTokenStream(adaptor,"token KW_FULL");

         msgs.push("join type specifier"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:814:5: ( KW_JOIN -> TOK_JOIN | KW_LEFT KW_OUTER KW_JOIN -> TOK_LEFTOUTERJOIN | KW_RIGHT KW_OUTER KW_JOIN -> TOK_RIGHTOUTERJOIN | KW_FULL KW_OUTER KW_JOIN -> TOK_FULLOUTERJOIN )
            int alt111=4;
            switch ( input.LA(1) ) {
            case KW_JOIN:
                {
                alt111=1;
                }
                break;
            case KW_LEFT:
                {
                alt111=2;
                }
                break;
            case KW_RIGHT:
                {
                alt111=3;
                }
                break;
            case KW_FULL:
                {
                alt111=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("811:1: joinToken : ( KW_JOIN -> TOK_JOIN | KW_LEFT KW_OUTER KW_JOIN -> TOK_LEFTOUTERJOIN | KW_RIGHT KW_OUTER KW_JOIN -> TOK_RIGHTOUTERJOIN | KW_FULL KW_OUTER KW_JOIN -> TOK_FULLOUTERJOIN );", 111, 0, input);

                throw nvae;
            }

            switch (alt111) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:815:7: KW_JOIN
                    {
                    KW_JOIN347=(Token)input.LT(1);
                    match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken5748); 
                    stream_KW_JOIN.add(KW_JOIN347);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 815:35: -> TOK_JOIN
                    {
                        adaptor.addChild(root_0, adaptor.create(TOK_JOIN, "TOK_JOIN"));

                    }



                    }
                    break;
                case 2 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:816:7: KW_LEFT KW_OUTER KW_JOIN
                    {
                    KW_LEFT348=(Token)input.LT(1);
                    match(input,KW_LEFT,FOLLOW_KW_LEFT_in_joinToken5780); 
                    stream_KW_LEFT.add(KW_LEFT348);

                    KW_OUTER349=(Token)input.LT(1);
                    match(input,KW_OUTER,FOLLOW_KW_OUTER_in_joinToken5782); 
                    stream_KW_OUTER.add(KW_OUTER349);

                    KW_JOIN350=(Token)input.LT(1);
                    match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken5784); 
                    stream_KW_JOIN.add(KW_JOIN350);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 816:35: -> TOK_LEFTOUTERJOIN
                    {
                        adaptor.addChild(root_0, adaptor.create(TOK_LEFTOUTERJOIN, "TOK_LEFTOUTERJOIN"));

                    }



                    }
                    break;
                case 3 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:817:7: KW_RIGHT KW_OUTER KW_JOIN
                    {
                    KW_RIGHT351=(Token)input.LT(1);
                    match(input,KW_RIGHT,FOLLOW_KW_RIGHT_in_joinToken5799); 
                    stream_KW_RIGHT.add(KW_RIGHT351);

                    KW_OUTER352=(Token)input.LT(1);
                    match(input,KW_OUTER,FOLLOW_KW_OUTER_in_joinToken5801); 
                    stream_KW_OUTER.add(KW_OUTER352);

                    KW_JOIN353=(Token)input.LT(1);
                    match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken5803); 
                    stream_KW_JOIN.add(KW_JOIN353);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 817:35: -> TOK_RIGHTOUTERJOIN
                    {
                        adaptor.addChild(root_0, adaptor.create(TOK_RIGHTOUTERJOIN, "TOK_RIGHTOUTERJOIN"));

                    }



                    }
                    break;
                case 4 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:818:7: KW_FULL KW_OUTER KW_JOIN
                    {
                    KW_FULL354=(Token)input.LT(1);
                    match(input,KW_FULL,FOLLOW_KW_FULL_in_joinToken5817); 
                    stream_KW_FULL.add(KW_FULL354);

                    KW_OUTER355=(Token)input.LT(1);
                    match(input,KW_OUTER,FOLLOW_KW_OUTER_in_joinToken5819); 
                    stream_KW_OUTER.add(KW_OUTER355);

                    KW_JOIN356=(Token)input.LT(1);
                    match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken5821); 
                    stream_KW_JOIN.add(KW_JOIN356);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 818:35: -> TOK_FULLOUTERJOIN
                    {
                        adaptor.addChild(root_0, adaptor.create(TOK_FULLOUTERJOIN, "TOK_FULLOUTERJOIN"));

                    }



                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end joinToken

    public static class fromSource_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start fromSource
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:821:1: fromSource : ( tableSource | subQuerySource ) ;
    public final fromSource_return fromSource() throws RecognitionException {
        fromSource_return retval = new fromSource_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        tableSource_return tableSource357 = null;

        subQuerySource_return subQuerySource358 = null;



         msgs.push("from source"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:824:5: ( ( tableSource | subQuerySource ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:825:5: ( tableSource | subQuerySource )
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:825:5: ( tableSource | subQuerySource )
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==Identifier) ) {
                alt112=1;
            }
            else if ( (LA112_0==LPAREN) ) {
                alt112=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("825:5: ( tableSource | subQuerySource )", 112, 0, input);

                throw nvae;
            }
            switch (alt112) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:825:6: tableSource
                    {
                    pushFollow(FOLLOW_tableSource_in_fromSource5860);
                    tableSource357=tableSource();
                    _fsp--;

                    adaptor.addChild(root_0, tableSource357.getTree());

                    }
                    break;
                case 2 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:825:20: subQuerySource
                    {
                    pushFollow(FOLLOW_subQuerySource_in_fromSource5864);
                    subQuerySource358=subQuerySource();
                    _fsp--;

                    adaptor.addChild(root_0, subQuerySource358.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end fromSource

    public static class tableSample_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start tableSample
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:828:1: tableSample : KW_TABLESAMPLE LPAREN KW_BUCKET (numerator= Number ) KW_OUT KW_OF (denominator= Number ) ( KW_ON expr+= expression ( COMMA expr+= expression )* )? RPAREN -> ^( TOK_TABLESAMPLE $numerator $denominator ( $expr)* ) ;
    public final tableSample_return tableSample() throws RecognitionException {
        tableSample_return retval = new tableSample_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token numerator=null;
        Token denominator=null;
        Token KW_TABLESAMPLE359=null;
        Token LPAREN360=null;
        Token KW_BUCKET361=null;
        Token KW_OUT362=null;
        Token KW_OF363=null;
        Token KW_ON364=null;
        Token COMMA365=null;
        Token RPAREN366=null;
        List list_expr=null;
        RuleReturnScope expr = null;
        CommonTree numerator_tree=null;
        CommonTree denominator_tree=null;
        CommonTree KW_TABLESAMPLE359_tree=null;
        CommonTree LPAREN360_tree=null;
        CommonTree KW_BUCKET361_tree=null;
        CommonTree KW_OUT362_tree=null;
        CommonTree KW_OF363_tree=null;
        CommonTree KW_ON364_tree=null;
        CommonTree COMMA365_tree=null;
        CommonTree RPAREN366_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_KW_OUT=new RewriteRuleTokenStream(adaptor,"token KW_OUT");
        RewriteRuleTokenStream stream_KW_OF=new RewriteRuleTokenStream(adaptor,"token KW_OF");
        RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_BUCKET=new RewriteRuleTokenStream(adaptor,"token KW_BUCKET");
        RewriteRuleTokenStream stream_KW_TABLESAMPLE=new RewriteRuleTokenStream(adaptor,"token KW_TABLESAMPLE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_ON=new RewriteRuleTokenStream(adaptor,"token KW_ON");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
         msgs.push("table sample specification"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:831:5: ( KW_TABLESAMPLE LPAREN KW_BUCKET (numerator= Number ) KW_OUT KW_OF (denominator= Number ) ( KW_ON expr+= expression ( COMMA expr+= expression )* )? RPAREN -> ^( TOK_TABLESAMPLE $numerator $denominator ( $expr)* ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:832:5: KW_TABLESAMPLE LPAREN KW_BUCKET (numerator= Number ) KW_OUT KW_OF (denominator= Number ) ( KW_ON expr+= expression ( COMMA expr+= expression )* )? RPAREN
            {
            KW_TABLESAMPLE359=(Token)input.LT(1);
            match(input,KW_TABLESAMPLE,FOLLOW_KW_TABLESAMPLE_in_tableSample5900); 
            stream_KW_TABLESAMPLE.add(KW_TABLESAMPLE359);

            LPAREN360=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_tableSample5902); 
            stream_LPAREN.add(LPAREN360);

            KW_BUCKET361=(Token)input.LT(1);
            match(input,KW_BUCKET,FOLLOW_KW_BUCKET_in_tableSample5904); 
            stream_KW_BUCKET.add(KW_BUCKET361);

            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:832:37: (numerator= Number )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:832:38: numerator= Number
            {
            numerator=(Token)input.LT(1);
            match(input,Number,FOLLOW_Number_in_tableSample5909); 
            stream_Number.add(numerator);


            }

            KW_OUT362=(Token)input.LT(1);
            match(input,KW_OUT,FOLLOW_KW_OUT_in_tableSample5912); 
            stream_KW_OUT.add(KW_OUT362);

            KW_OF363=(Token)input.LT(1);
            match(input,KW_OF,FOLLOW_KW_OF_in_tableSample5914); 
            stream_KW_OF.add(KW_OF363);

            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:832:69: (denominator= Number )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:832:70: denominator= Number
            {
            denominator=(Token)input.LT(1);
            match(input,Number,FOLLOW_Number_in_tableSample5919); 
            stream_Number.add(denominator);


            }

            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:832:90: ( KW_ON expr+= expression ( COMMA expr+= expression )* )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==KW_ON) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:832:91: KW_ON expr+= expression ( COMMA expr+= expression )*
                    {
                    KW_ON364=(Token)input.LT(1);
                    match(input,KW_ON,FOLLOW_KW_ON_in_tableSample5923); 
                    stream_KW_ON.add(KW_ON364);

                    pushFollow(FOLLOW_expression_in_tableSample5927);
                    expr=expression();
                    _fsp--;

                    stream_expression.add(expr.getTree());
                    if (list_expr==null) list_expr=new ArrayList();
                    list_expr.add(expr);

                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:832:114: ( COMMA expr+= expression )*
                    loop113:
                    do {
                        int alt113=2;
                        int LA113_0 = input.LA(1);

                        if ( (LA113_0==COMMA) ) {
                            alt113=1;
                        }


                        switch (alt113) {
                    	case 1 :
                    	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:832:115: COMMA expr+= expression
                    	    {
                    	    COMMA365=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_tableSample5930); 
                    	    stream_COMMA.add(COMMA365);

                    	    pushFollow(FOLLOW_expression_in_tableSample5934);
                    	    expr=expression();
                    	    _fsp--;

                    	    stream_expression.add(expr.getTree());
                    	    if (list_expr==null) list_expr=new ArrayList();
                    	    list_expr.add(expr);


                    	    }
                    	    break;

                    	default :
                    	    break loop113;
                        }
                    } while (true);


                    }
                    break;

            }

            RPAREN366=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_tableSample5940); 
            stream_RPAREN.add(RPAREN366);


            // AST REWRITE
            // elements: denominator, numerator, expr
            // token labels: numerator, denominator
            // rule labels: retval
            // token list labels: 
            // rule list labels: expr
            retval.tree = root_0;
            RewriteRuleTokenStream stream_numerator=new RewriteRuleTokenStream(adaptor,"token numerator",numerator);
            RewriteRuleTokenStream stream_denominator=new RewriteRuleTokenStream(adaptor,"token denominator",denominator);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"token expr",list_expr);
            root_0 = (CommonTree)adaptor.nil();
            // 832:149: -> ^( TOK_TABLESAMPLE $numerator $denominator ( $expr)* )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:832:152: ^( TOK_TABLESAMPLE $numerator $denominator ( $expr)* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_TABLESAMPLE, "TOK_TABLESAMPLE"), root_1);

                adaptor.addChild(root_1, stream_numerator.next());
                adaptor.addChild(root_1, stream_denominator.next());
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:832:194: ( $expr)*
                while ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, ((ParserRuleReturnScope)stream_expr.next()).getTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end tableSample

    public static class tableSource_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start tableSource
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:835:1: tableSource : tabname= Identifier (ts= tableSample )? (alias= Identifier )? -> ^( TOK_TABREF $tabname ( $ts)? ( $alias)? ) ;
    public final tableSource_return tableSource() throws RecognitionException {
        tableSource_return retval = new tableSource_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token tabname=null;
        Token alias=null;
        tableSample_return ts = null;


        CommonTree tabname_tree=null;
        CommonTree alias_tree=null;
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_tableSample=new RewriteRuleSubtreeStream(adaptor,"rule tableSample");
         msgs.push("table source"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:838:5: (tabname= Identifier (ts= tableSample )? (alias= Identifier )? -> ^( TOK_TABREF $tabname ( $ts)? ( $alias)? ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:839:5: tabname= Identifier (ts= tableSample )? (alias= Identifier )?
            {
            tabname=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_tableSource5989); 
            stream_Identifier.add(tabname);

            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:839:24: (ts= tableSample )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==KW_TABLESAMPLE) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:839:25: ts= tableSample
                    {
                    pushFollow(FOLLOW_tableSample_in_tableSource5994);
                    ts=tableSample();
                    _fsp--;

                    stream_tableSample.add(ts.getTree());

                    }
                    break;

            }

            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:839:42: (alias= Identifier )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==Identifier) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:839:43: alias= Identifier
                    {
                    alias=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_tableSource6001); 
                    stream_Identifier.add(alias);


                    }
                    break;

            }


            // AST REWRITE
            // elements: ts, tabname, alias
            // token labels: alias, tabname
            // rule labels: retval, ts
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_alias=new RewriteRuleTokenStream(adaptor,"token alias",alias);
            RewriteRuleTokenStream stream_tabname=new RewriteRuleTokenStream(adaptor,"token tabname",tabname);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_ts=new RewriteRuleSubtreeStream(adaptor,"token ts",ts!=null?ts.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 839:62: -> ^( TOK_TABREF $tabname ( $ts)? ( $alias)? )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:839:65: ^( TOK_TABREF $tabname ( $ts)? ( $alias)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_TABREF, "TOK_TABREF"), root_1);

                adaptor.addChild(root_1, stream_tabname.next());
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:839:87: ( $ts)?
                if ( stream_ts.hasNext() ) {
                    adaptor.addChild(root_1, stream_ts.next());

                }
                stream_ts.reset();
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:839:92: ( $alias)?
                if ( stream_alias.hasNext() ) {
                    adaptor.addChild(root_1, stream_alias.next());

                }
                stream_alias.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end tableSource

    public static class subQuerySource_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start subQuerySource
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:843:1: subQuerySource : LPAREN queryStatementExpression RPAREN Identifier -> ^( TOK_SUBQUERY queryStatementExpression Identifier ) ;
    public final subQuerySource_return subQuerySource() throws RecognitionException {
        subQuerySource_return retval = new subQuerySource_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN367=null;
        Token RPAREN369=null;
        Token Identifier370=null;
        queryStatementExpression_return queryStatementExpression368 = null;


        CommonTree LPAREN367_tree=null;
        CommonTree RPAREN369_tree=null;
        CommonTree Identifier370_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_queryStatementExpression=new RewriteRuleSubtreeStream(adaptor,"rule queryStatementExpression");
         msgs.push("subquery source"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:846:5: ( LPAREN queryStatementExpression RPAREN Identifier -> ^( TOK_SUBQUERY queryStatementExpression Identifier ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:847:5: LPAREN queryStatementExpression RPAREN Identifier
            {
            LPAREN367=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_subQuerySource6053); 
            stream_LPAREN.add(LPAREN367);

            pushFollow(FOLLOW_queryStatementExpression_in_subQuerySource6055);
            queryStatementExpression368=queryStatementExpression();
            _fsp--;

            stream_queryStatementExpression.add(queryStatementExpression368.getTree());
            RPAREN369=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_subQuerySource6057); 
            stream_RPAREN.add(RPAREN369);

            Identifier370=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_subQuerySource6059); 
            stream_Identifier.add(Identifier370);


            // AST REWRITE
            // elements: queryStatementExpression, Identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 847:55: -> ^( TOK_SUBQUERY queryStatementExpression Identifier )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:847:58: ^( TOK_SUBQUERY queryStatementExpression Identifier )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_SUBQUERY, "TOK_SUBQUERY"), root_1);

                adaptor.addChild(root_1, stream_queryStatementExpression.next());
                adaptor.addChild(root_1, stream_Identifier.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end subQuerySource

    public static class whereClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start whereClause
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:852:1: whereClause : KW_WHERE searchCondition -> ^( TOK_WHERE searchCondition ) ;
    public final whereClause_return whereClause() throws RecognitionException {
        whereClause_return retval = new whereClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_WHERE371=null;
        searchCondition_return searchCondition372 = null;


        CommonTree KW_WHERE371_tree=null;
        RewriteRuleTokenStream stream_KW_WHERE=new RewriteRuleTokenStream(adaptor,"token KW_WHERE");
        RewriteRuleSubtreeStream stream_searchCondition=new RewriteRuleSubtreeStream(adaptor,"rule searchCondition");
         msgs.push("where clause"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:855:5: ( KW_WHERE searchCondition -> ^( TOK_WHERE searchCondition ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:856:5: KW_WHERE searchCondition
            {
            KW_WHERE371=(Token)input.LT(1);
            match(input,KW_WHERE,FOLLOW_KW_WHERE_in_whereClause6110); 
            stream_KW_WHERE.add(KW_WHERE371);

            pushFollow(FOLLOW_searchCondition_in_whereClause6112);
            searchCondition372=searchCondition();
            _fsp--;

            stream_searchCondition.add(searchCondition372.getTree());

            // AST REWRITE
            // elements: searchCondition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 856:30: -> ^( TOK_WHERE searchCondition )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:856:33: ^( TOK_WHERE searchCondition )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_WHERE, "TOK_WHERE"), root_1);

                adaptor.addChild(root_1, stream_searchCondition.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end whereClause

    public static class searchCondition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start searchCondition
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:859:1: searchCondition : expression ;
    public final searchCondition_return searchCondition() throws RecognitionException {
        searchCondition_return retval = new searchCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        expression_return expression373 = null;



         msgs.push("search condition"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:862:5: ( expression )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:863:5: expression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expression_in_searchCondition6151);
            expression373=expression();
            _fsp--;

            adaptor.addChild(root_0, expression373.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end searchCondition

    public static class groupByClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start groupByClause
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:869:1: groupByClause : KW_GROUP KW_BY groupByExpression ( COMMA groupByExpression )* -> ^( TOK_GROUPBY ( groupByExpression )+ ) ;
    public final groupByClause_return groupByClause() throws RecognitionException {
        groupByClause_return retval = new groupByClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_GROUP374=null;
        Token KW_BY375=null;
        Token COMMA377=null;
        groupByExpression_return groupByExpression376 = null;

        groupByExpression_return groupByExpression378 = null;


        CommonTree KW_GROUP374_tree=null;
        CommonTree KW_BY375_tree=null;
        CommonTree COMMA377_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_GROUP=new RewriteRuleTokenStream(adaptor,"token KW_GROUP");
        RewriteRuleTokenStream stream_KW_BY=new RewriteRuleTokenStream(adaptor,"token KW_BY");
        RewriteRuleSubtreeStream stream_groupByExpression=new RewriteRuleSubtreeStream(adaptor,"rule groupByExpression");
         msgs.push("group by clause"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:872:5: ( KW_GROUP KW_BY groupByExpression ( COMMA groupByExpression )* -> ^( TOK_GROUPBY ( groupByExpression )+ ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:873:5: KW_GROUP KW_BY groupByExpression ( COMMA groupByExpression )*
            {
            KW_GROUP374=(Token)input.LT(1);
            match(input,KW_GROUP,FOLLOW_KW_GROUP_in_groupByClause6185); 
            stream_KW_GROUP.add(KW_GROUP374);

            KW_BY375=(Token)input.LT(1);
            match(input,KW_BY,FOLLOW_KW_BY_in_groupByClause6187); 
            stream_KW_BY.add(KW_BY375);

            pushFollow(FOLLOW_groupByExpression_in_groupByClause6193);
            groupByExpression376=groupByExpression();
            _fsp--;

            stream_groupByExpression.add(groupByExpression376.getTree());
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:875:5: ( COMMA groupByExpression )*
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==COMMA) ) {
                    alt117=1;
                }


                switch (alt117) {
            	case 1 :
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:875:7: COMMA groupByExpression
            	    {
            	    COMMA377=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_groupByClause6201); 
            	    stream_COMMA.add(COMMA377);

            	    pushFollow(FOLLOW_groupByExpression_in_groupByClause6203);
            	    groupByExpression378=groupByExpression();
            	    _fsp--;

            	    stream_groupByExpression.add(groupByExpression378.getTree());

            	    }
            	    break;

            	default :
            	    break loop117;
                }
            } while (true);


            // AST REWRITE
            // elements: groupByExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 876:5: -> ^( TOK_GROUPBY ( groupByExpression )+ )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:876:8: ^( TOK_GROUPBY ( groupByExpression )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_GROUPBY, "TOK_GROUPBY"), root_1);

                if ( !(stream_groupByExpression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_groupByExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_groupByExpression.next());

                }
                stream_groupByExpression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end groupByClause

    public static class groupByExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start groupByExpression
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:879:1: groupByExpression : expression ;
    public final groupByExpression_return groupByExpression() throws RecognitionException {
        groupByExpression_return retval = new groupByExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        expression_return expression379 = null;



         msgs.push("group by expression"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:882:5: ( expression )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:883:5: expression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expression_in_groupByExpression6250);
            expression379=expression();
            _fsp--;

            adaptor.addChild(root_0, expression379.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end groupByExpression

    public static class orderByClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start orderByClause
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:887:1: orderByClause : KW_ORDER KW_BY columnRefOrder ( COMMA columnRefOrder )* -> ^( TOK_ORDERBY ( columnRefOrder )+ ) ;
    public final orderByClause_return orderByClause() throws RecognitionException {
        orderByClause_return retval = new orderByClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_ORDER380=null;
        Token KW_BY381=null;
        Token COMMA383=null;
        columnRefOrder_return columnRefOrder382 = null;

        columnRefOrder_return columnRefOrder384 = null;


        CommonTree KW_ORDER380_tree=null;
        CommonTree KW_BY381_tree=null;
        CommonTree COMMA383_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_ORDER=new RewriteRuleTokenStream(adaptor,"token KW_ORDER");
        RewriteRuleTokenStream stream_KW_BY=new RewriteRuleTokenStream(adaptor,"token KW_BY");
        RewriteRuleSubtreeStream stream_columnRefOrder=new RewriteRuleSubtreeStream(adaptor,"rule columnRefOrder");
         msgs.push("order by clause"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:890:5: ( KW_ORDER KW_BY columnRefOrder ( COMMA columnRefOrder )* -> ^( TOK_ORDERBY ( columnRefOrder )+ ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:891:5: KW_ORDER KW_BY columnRefOrder ( COMMA columnRefOrder )*
            {
            KW_ORDER380=(Token)input.LT(1);
            match(input,KW_ORDER,FOLLOW_KW_ORDER_in_orderByClause6282); 
            stream_KW_ORDER.add(KW_ORDER380);

            KW_BY381=(Token)input.LT(1);
            match(input,KW_BY,FOLLOW_KW_BY_in_orderByClause6284); 
            stream_KW_BY.add(KW_BY381);

            pushFollow(FOLLOW_columnRefOrder_in_orderByClause6290);
            columnRefOrder382=columnRefOrder();
            _fsp--;

            stream_columnRefOrder.add(columnRefOrder382.getTree());
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:893:5: ( COMMA columnRefOrder )*
            loop118:
            do {
                int alt118=2;
                int LA118_0 = input.LA(1);

                if ( (LA118_0==COMMA) ) {
                    alt118=1;
                }


                switch (alt118) {
            	case 1 :
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:893:7: COMMA columnRefOrder
            	    {
            	    COMMA383=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_orderByClause6298); 
            	    stream_COMMA.add(COMMA383);

            	    pushFollow(FOLLOW_columnRefOrder_in_orderByClause6300);
            	    columnRefOrder384=columnRefOrder();
            	    _fsp--;

            	    stream_columnRefOrder.add(columnRefOrder384.getTree());

            	    }
            	    break;

            	default :
            	    break loop118;
                }
            } while (true);


            // AST REWRITE
            // elements: columnRefOrder
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 893:30: -> ^( TOK_ORDERBY ( columnRefOrder )+ )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:893:33: ^( TOK_ORDERBY ( columnRefOrder )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_ORDERBY, "TOK_ORDERBY"), root_1);

                if ( !(stream_columnRefOrder.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_columnRefOrder.hasNext() ) {
                    adaptor.addChild(root_1, stream_columnRefOrder.next());

                }
                stream_columnRefOrder.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end orderByClause

    public static class clusterByClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start clusterByClause
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:896:1: clusterByClause : KW_CLUSTER KW_BY expression ( COMMA expression )* -> ^( TOK_CLUSTERBY ( expression )+ ) ;
    public final clusterByClause_return clusterByClause() throws RecognitionException {
        clusterByClause_return retval = new clusterByClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_CLUSTER385=null;
        Token KW_BY386=null;
        Token COMMA388=null;
        expression_return expression387 = null;

        expression_return expression389 = null;


        CommonTree KW_CLUSTER385_tree=null;
        CommonTree KW_BY386_tree=null;
        CommonTree COMMA388_tree=null;
        RewriteRuleTokenStream stream_KW_CLUSTER=new RewriteRuleTokenStream(adaptor,"token KW_CLUSTER");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_BY=new RewriteRuleTokenStream(adaptor,"token KW_BY");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
         msgs.push("cluster by clause"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:899:5: ( KW_CLUSTER KW_BY expression ( COMMA expression )* -> ^( TOK_CLUSTERBY ( expression )+ ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:900:5: KW_CLUSTER KW_BY expression ( COMMA expression )*
            {
            KW_CLUSTER385=(Token)input.LT(1);
            match(input,KW_CLUSTER,FOLLOW_KW_CLUSTER_in_clusterByClause6342); 
            stream_KW_CLUSTER.add(KW_CLUSTER385);

            KW_BY386=(Token)input.LT(1);
            match(input,KW_BY,FOLLOW_KW_BY_in_clusterByClause6344); 
            stream_KW_BY.add(KW_BY386);

            pushFollow(FOLLOW_expression_in_clusterByClause6350);
            expression387=expression();
            _fsp--;

            stream_expression.add(expression387.getTree());
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:902:5: ( COMMA expression )*
            loop119:
            do {
                int alt119=2;
                int LA119_0 = input.LA(1);

                if ( (LA119_0==COMMA) ) {
                    alt119=1;
                }


                switch (alt119) {
            	case 1 :
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:902:7: COMMA expression
            	    {
            	    COMMA388=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_clusterByClause6358); 
            	    stream_COMMA.add(COMMA388);

            	    pushFollow(FOLLOW_expression_in_clusterByClause6360);
            	    expression389=expression();
            	    _fsp--;

            	    stream_expression.add(expression389.getTree());

            	    }
            	    break;

            	default :
            	    break loop119;
                }
            } while (true);


            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 902:27: -> ^( TOK_CLUSTERBY ( expression )+ )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:902:30: ^( TOK_CLUSTERBY ( expression )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_CLUSTERBY, "TOK_CLUSTERBY"), root_1);

                if ( !(stream_expression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.next());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end clusterByClause

    public static class distributeByClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start distributeByClause
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:905:1: distributeByClause : KW_DISTRIBUTE KW_BY expression ( COMMA expression )* -> ^( TOK_DISTRIBUTEBY ( expression )+ ) ;
    public final distributeByClause_return distributeByClause() throws RecognitionException {
        distributeByClause_return retval = new distributeByClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_DISTRIBUTE390=null;
        Token KW_BY391=null;
        Token COMMA393=null;
        expression_return expression392 = null;

        expression_return expression394 = null;


        CommonTree KW_DISTRIBUTE390_tree=null;
        CommonTree KW_BY391_tree=null;
        CommonTree COMMA393_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_DISTRIBUTE=new RewriteRuleTokenStream(adaptor,"token KW_DISTRIBUTE");
        RewriteRuleTokenStream stream_KW_BY=new RewriteRuleTokenStream(adaptor,"token KW_BY");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
         msgs.push("distribute by clause"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:908:5: ( KW_DISTRIBUTE KW_BY expression ( COMMA expression )* -> ^( TOK_DISTRIBUTEBY ( expression )+ ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:909:5: KW_DISTRIBUTE KW_BY expression ( COMMA expression )*
            {
            KW_DISTRIBUTE390=(Token)input.LT(1);
            match(input,KW_DISTRIBUTE,FOLLOW_KW_DISTRIBUTE_in_distributeByClause6403); 
            stream_KW_DISTRIBUTE.add(KW_DISTRIBUTE390);

            KW_BY391=(Token)input.LT(1);
            match(input,KW_BY,FOLLOW_KW_BY_in_distributeByClause6405); 
            stream_KW_BY.add(KW_BY391);

            pushFollow(FOLLOW_expression_in_distributeByClause6411);
            expression392=expression();
            _fsp--;

            stream_expression.add(expression392.getTree());
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:910:16: ( COMMA expression )*
            loop120:
            do {
                int alt120=2;
                int LA120_0 = input.LA(1);

                if ( (LA120_0==COMMA) ) {
                    alt120=1;
                }


                switch (alt120) {
            	case 1 :
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:910:17: COMMA expression
            	    {
            	    COMMA393=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_distributeByClause6414); 
            	    stream_COMMA.add(COMMA393);

            	    pushFollow(FOLLOW_expression_in_distributeByClause6416);
            	    expression394=expression();
            	    _fsp--;

            	    stream_expression.add(expression394.getTree());

            	    }
            	    break;

            	default :
            	    break loop120;
                }
            } while (true);


            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 910:36: -> ^( TOK_DISTRIBUTEBY ( expression )+ )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:910:39: ^( TOK_DISTRIBUTEBY ( expression )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_DISTRIBUTEBY, "TOK_DISTRIBUTEBY"), root_1);

                if ( !(stream_expression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.next());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end distributeByClause

    public static class sortByClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start sortByClause
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:913:1: sortByClause : KW_SORT KW_BY columnRefOrder ( COMMA columnRefOrder )* -> ^( TOK_SORTBY ( columnRefOrder )+ ) ;
    public final sortByClause_return sortByClause() throws RecognitionException {
        sortByClause_return retval = new sortByClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_SORT395=null;
        Token KW_BY396=null;
        Token COMMA398=null;
        columnRefOrder_return columnRefOrder397 = null;

        columnRefOrder_return columnRefOrder399 = null;


        CommonTree KW_SORT395_tree=null;
        CommonTree KW_BY396_tree=null;
        CommonTree COMMA398_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_SORT=new RewriteRuleTokenStream(adaptor,"token KW_SORT");
        RewriteRuleTokenStream stream_KW_BY=new RewriteRuleTokenStream(adaptor,"token KW_BY");
        RewriteRuleSubtreeStream stream_columnRefOrder=new RewriteRuleSubtreeStream(adaptor,"rule columnRefOrder");
         msgs.push("sort by clause"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:916:5: ( KW_SORT KW_BY columnRefOrder ( COMMA columnRefOrder )* -> ^( TOK_SORTBY ( columnRefOrder )+ ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:917:5: KW_SORT KW_BY columnRefOrder ( COMMA columnRefOrder )*
            {
            KW_SORT395=(Token)input.LT(1);
            match(input,KW_SORT,FOLLOW_KW_SORT_in_sortByClause6458); 
            stream_KW_SORT.add(KW_SORT395);

            KW_BY396=(Token)input.LT(1);
            match(input,KW_BY,FOLLOW_KW_BY_in_sortByClause6460); 
            stream_KW_BY.add(KW_BY396);

            pushFollow(FOLLOW_columnRefOrder_in_sortByClause6466);
            columnRefOrder397=columnRefOrder();
            _fsp--;

            stream_columnRefOrder.add(columnRefOrder397.getTree());
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:919:5: ( COMMA columnRefOrder )*
            loop121:
            do {
                int alt121=2;
                int LA121_0 = input.LA(1);

                if ( (LA121_0==COMMA) ) {
                    alt121=1;
                }


                switch (alt121) {
            	case 1 :
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:919:7: COMMA columnRefOrder
            	    {
            	    COMMA398=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_sortByClause6474); 
            	    stream_COMMA.add(COMMA398);

            	    pushFollow(FOLLOW_columnRefOrder_in_sortByClause6476);
            	    columnRefOrder399=columnRefOrder();
            	    _fsp--;

            	    stream_columnRefOrder.add(columnRefOrder399.getTree());

            	    }
            	    break;

            	default :
            	    break loop121;
                }
            } while (true);


            // AST REWRITE
            // elements: columnRefOrder
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 919:30: -> ^( TOK_SORTBY ( columnRefOrder )+ )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:919:33: ^( TOK_SORTBY ( columnRefOrder )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_SORTBY, "TOK_SORTBY"), root_1);

                if ( !(stream_columnRefOrder.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_columnRefOrder.hasNext() ) {
                    adaptor.addChild(root_1, stream_columnRefOrder.next());

                }
                stream_columnRefOrder.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end sortByClause

    public static class function_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start function
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:923:1: function : functionName LPAREN (dist= KW_DISTINCT )? ( expression ( COMMA expression )* )? RPAREN -> {$dist == null}? ^( TOK_FUNCTION functionName ( ( expression )+ )? ) -> ^( TOK_FUNCTIONDI functionName ( ( expression )+ )? ) ;
    public final function_return function() throws RecognitionException {
        function_return retval = new function_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token dist=null;
        Token LPAREN401=null;
        Token COMMA403=null;
        Token RPAREN405=null;
        functionName_return functionName400 = null;

        expression_return expression402 = null;

        expression_return expression404 = null;


        CommonTree dist_tree=null;
        CommonTree LPAREN401_tree=null;
        CommonTree COMMA403_tree=null;
        CommonTree RPAREN405_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_DISTINCT=new RewriteRuleTokenStream(adaptor,"token KW_DISTINCT");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_functionName=new RewriteRuleSubtreeStream(adaptor,"rule functionName");
         msgs.push("function specification"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:926:5: ( functionName LPAREN (dist= KW_DISTINCT )? ( expression ( COMMA expression )* )? RPAREN -> {$dist == null}? ^( TOK_FUNCTION functionName ( ( expression )+ )? ) -> ^( TOK_FUNCTIONDI functionName ( ( expression )+ )? ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:927:5: functionName LPAREN (dist= KW_DISTINCT )? ( expression ( COMMA expression )* )? RPAREN
            {
            pushFollow(FOLLOW_functionName_in_function6519);
            functionName400=functionName();
            _fsp--;

            stream_functionName.add(functionName400.getTree());
            LPAREN401=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_function6525); 
            stream_LPAREN.add(LPAREN401);

            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:929:7: (dist= KW_DISTINCT )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==KW_DISTINCT) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:929:8: dist= KW_DISTINCT
                    {
                    dist=(Token)input.LT(1);
                    match(input,KW_DISTINCT,FOLLOW_KW_DISTINCT_in_function6536); 
                    stream_KW_DISTINCT.add(dist);


                    }
                    break;

            }

            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:930:7: ( expression ( COMMA expression )* )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==StringLiteral||(LA124_0>=KW_IF && LA124_0<=KW_NOT)||LA124_0==Identifier||LA124_0==LPAREN||LA124_0==Number||LA124_0==PLUS||(LA124_0>=KW_CAST && LA124_0<=KW_CASE)||LA124_0==CharSetName||LA124_0==KW_NULL||(LA124_0>=MINUS && LA124_0<=TILDE)||(LA124_0>=KW_TRUE && LA124_0<=KW_FALSE)) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:930:8: expression ( COMMA expression )*
                    {
                    pushFollow(FOLLOW_expression_in_function6547);
                    expression402=expression();
                    _fsp--;

                    stream_expression.add(expression402.getTree());
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:930:19: ( COMMA expression )*
                    loop123:
                    do {
                        int alt123=2;
                        int LA123_0 = input.LA(1);

                        if ( (LA123_0==COMMA) ) {
                            alt123=1;
                        }


                        switch (alt123) {
                    	case 1 :
                    	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:930:20: COMMA expression
                    	    {
                    	    COMMA403=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_function6550); 
                    	    stream_COMMA.add(COMMA403);

                    	    pushFollow(FOLLOW_expression_in_function6552);
                    	    expression404=expression();
                    	    _fsp--;

                    	    stream_expression.add(expression404.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop123;
                        }
                    } while (true);


                    }
                    break;

            }

            RPAREN405=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_function6562); 
            stream_RPAREN.add(RPAREN405);


            // AST REWRITE
            // elements: functionName, expression, functionName, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 931:12: -> {$dist == null}? ^( TOK_FUNCTION functionName ( ( expression )+ )? )
            if (dist == null) {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:931:32: ^( TOK_FUNCTION functionName ( ( expression )+ )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_FUNCTION, "TOK_FUNCTION"), root_1);

                adaptor.addChild(root_1, stream_functionName.next());
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:931:60: ( ( expression )+ )?
                if ( stream_expression.hasNext() ) {
                    if ( !(stream_expression.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_expression.hasNext() ) {
                        adaptor.addChild(root_1, stream_expression.next());

                    }
                    stream_expression.reset();

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 932:27: -> ^( TOK_FUNCTIONDI functionName ( ( expression )+ )? )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:932:30: ^( TOK_FUNCTIONDI functionName ( ( expression )+ )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_FUNCTIONDI, "TOK_FUNCTIONDI"), root_1);

                adaptor.addChild(root_1, stream_functionName.next());
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:932:60: ( ( expression )+ )?
                if ( stream_expression.hasNext() ) {
                    if ( !(stream_expression.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_expression.hasNext() ) {
                        adaptor.addChild(root_1, stream_expression.next());

                    }
                    stream_expression.reset();

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end function

    public static class functionName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start functionName
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:936:1: functionName : ( Identifier | KW_IF );
    public final functionName_return functionName() throws RecognitionException {
        functionName_return retval = new functionName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set406=null;

        CommonTree set406_tree=null;

         msgs.push("function name"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:939:5: ( Identifier | KW_IF )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set406=(Token)input.LT(1);
            if ( input.LA(1)==KW_IF||input.LA(1)==Identifier ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set406));
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_functionName0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end functionName

    public static class castExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start castExpression
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:943:1: castExpression : KW_CAST LPAREN expression KW_AS primitiveType RPAREN -> ^( TOK_FUNCTION primitiveType expression ) ;
    public final castExpression_return castExpression() throws RecognitionException {
        castExpression_return retval = new castExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_CAST407=null;
        Token LPAREN408=null;
        Token KW_AS410=null;
        Token RPAREN412=null;
        expression_return expression409 = null;

        primitiveType_return primitiveType411 = null;


        CommonTree KW_CAST407_tree=null;
        CommonTree LPAREN408_tree=null;
        CommonTree KW_AS410_tree=null;
        CommonTree RPAREN412_tree=null;
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_KW_CAST=new RewriteRuleTokenStream(adaptor,"token KW_CAST");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_primitiveType=new RewriteRuleSubtreeStream(adaptor,"rule primitiveType");
         msgs.push("cast expression"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:946:5: ( KW_CAST LPAREN expression KW_AS primitiveType RPAREN -> ^( TOK_FUNCTION primitiveType expression ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:947:5: KW_CAST LPAREN expression KW_AS primitiveType RPAREN
            {
            KW_CAST407=(Token)input.LT(1);
            match(input,KW_CAST,FOLLOW_KW_CAST_in_castExpression6686); 
            stream_KW_CAST.add(KW_CAST407);

            LPAREN408=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_castExpression6692); 
            stream_LPAREN.add(LPAREN408);

            pushFollow(FOLLOW_expression_in_castExpression6705);
            expression409=expression();
            _fsp--;

            stream_expression.add(expression409.getTree());
            KW_AS410=(Token)input.LT(1);
            match(input,KW_AS,FOLLOW_KW_AS_in_castExpression6717); 
            stream_KW_AS.add(KW_AS410);

            pushFollow(FOLLOW_primitiveType_in_castExpression6729);
            primitiveType411=primitiveType();
            _fsp--;

            stream_primitiveType.add(primitiveType411.getTree());
            RPAREN412=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_castExpression6735); 
            stream_RPAREN.add(RPAREN412);


            // AST REWRITE
            // elements: primitiveType, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 952:12: -> ^( TOK_FUNCTION primitiveType expression )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:952:15: ^( TOK_FUNCTION primitiveType expression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_FUNCTION, "TOK_FUNCTION"), root_1);

                adaptor.addChild(root_1, stream_primitiveType.next());
                adaptor.addChild(root_1, stream_expression.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end castExpression

    public static class caseExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start caseExpression
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:955:1: caseExpression : KW_CASE expression ( KW_WHEN expression KW_THEN expression )+ ( KW_ELSE expression )? KW_END -> ^( TOK_FUNCTION KW_CASE ( expression )* ) ;
    public final caseExpression_return caseExpression() throws RecognitionException {
        caseExpression_return retval = new caseExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_CASE413=null;
        Token KW_WHEN415=null;
        Token KW_THEN417=null;
        Token KW_ELSE419=null;
        Token KW_END421=null;
        expression_return expression414 = null;

        expression_return expression416 = null;

        expression_return expression418 = null;

        expression_return expression420 = null;


        CommonTree KW_CASE413_tree=null;
        CommonTree KW_WHEN415_tree=null;
        CommonTree KW_THEN417_tree=null;
        CommonTree KW_ELSE419_tree=null;
        CommonTree KW_END421_tree=null;
        RewriteRuleTokenStream stream_KW_THEN=new RewriteRuleTokenStream(adaptor,"token KW_THEN");
        RewriteRuleTokenStream stream_KW_CASE=new RewriteRuleTokenStream(adaptor,"token KW_CASE");
        RewriteRuleTokenStream stream_KW_WHEN=new RewriteRuleTokenStream(adaptor,"token KW_WHEN");
        RewriteRuleTokenStream stream_KW_END=new RewriteRuleTokenStream(adaptor,"token KW_END");
        RewriteRuleTokenStream stream_KW_ELSE=new RewriteRuleTokenStream(adaptor,"token KW_ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
         msgs.push("case expression"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:958:5: ( KW_CASE expression ( KW_WHEN expression KW_THEN expression )+ ( KW_ELSE expression )? KW_END -> ^( TOK_FUNCTION KW_CASE ( expression )* ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:959:5: KW_CASE expression ( KW_WHEN expression KW_THEN expression )+ ( KW_ELSE expression )? KW_END
            {
            KW_CASE413=(Token)input.LT(1);
            match(input,KW_CASE,FOLLOW_KW_CASE_in_caseExpression6780); 
            stream_KW_CASE.add(KW_CASE413);

            pushFollow(FOLLOW_expression_in_caseExpression6782);
            expression414=expression();
            _fsp--;

            stream_expression.add(expression414.getTree());
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:960:5: ( KW_WHEN expression KW_THEN expression )+
            int cnt125=0;
            loop125:
            do {
                int alt125=2;
                int LA125_0 = input.LA(1);

                if ( (LA125_0==KW_WHEN) ) {
                    alt125=1;
                }


                switch (alt125) {
            	case 1 :
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:960:6: KW_WHEN expression KW_THEN expression
            	    {
            	    KW_WHEN415=(Token)input.LT(1);
            	    match(input,KW_WHEN,FOLLOW_KW_WHEN_in_caseExpression6789); 
            	    stream_KW_WHEN.add(KW_WHEN415);

            	    pushFollow(FOLLOW_expression_in_caseExpression6791);
            	    expression416=expression();
            	    _fsp--;

            	    stream_expression.add(expression416.getTree());
            	    KW_THEN417=(Token)input.LT(1);
            	    match(input,KW_THEN,FOLLOW_KW_THEN_in_caseExpression6793); 
            	    stream_KW_THEN.add(KW_THEN417);

            	    pushFollow(FOLLOW_expression_in_caseExpression6795);
            	    expression418=expression();
            	    _fsp--;

            	    stream_expression.add(expression418.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt125 >= 1 ) break loop125;
                        EarlyExitException eee =
                            new EarlyExitException(125, input);
                        throw eee;
                }
                cnt125++;
            } while (true);

            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:961:5: ( KW_ELSE expression )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==KW_ELSE) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:961:6: KW_ELSE expression
                    {
                    KW_ELSE419=(Token)input.LT(1);
                    match(input,KW_ELSE,FOLLOW_KW_ELSE_in_caseExpression6804); 
                    stream_KW_ELSE.add(KW_ELSE419);

                    pushFollow(FOLLOW_expression_in_caseExpression6806);
                    expression420=expression();
                    _fsp--;

                    stream_expression.add(expression420.getTree());

                    }
                    break;

            }

            KW_END421=(Token)input.LT(1);
            match(input,KW_END,FOLLOW_KW_END_in_caseExpression6814); 
            stream_KW_END.add(KW_END421);


            // AST REWRITE
            // elements: expression, KW_CASE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 962:12: -> ^( TOK_FUNCTION KW_CASE ( expression )* )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:962:15: ^( TOK_FUNCTION KW_CASE ( expression )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_FUNCTION, "TOK_FUNCTION"), root_1);

                adaptor.addChild(root_1, stream_KW_CASE.next());
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:962:38: ( expression )*
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.next());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end caseExpression

    public static class whenExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start whenExpression
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:965:1: whenExpression : KW_CASE ( KW_WHEN expression KW_THEN expression )+ ( KW_ELSE expression )? KW_END -> ^( TOK_FUNCTION KW_WHEN ( expression )* ) ;
    public final whenExpression_return whenExpression() throws RecognitionException {
        whenExpression_return retval = new whenExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_CASE422=null;
        Token KW_WHEN423=null;
        Token KW_THEN425=null;
        Token KW_ELSE427=null;
        Token KW_END429=null;
        expression_return expression424 = null;

        expression_return expression426 = null;

        expression_return expression428 = null;


        CommonTree KW_CASE422_tree=null;
        CommonTree KW_WHEN423_tree=null;
        CommonTree KW_THEN425_tree=null;
        CommonTree KW_ELSE427_tree=null;
        CommonTree KW_END429_tree=null;
        RewriteRuleTokenStream stream_KW_THEN=new RewriteRuleTokenStream(adaptor,"token KW_THEN");
        RewriteRuleTokenStream stream_KW_CASE=new RewriteRuleTokenStream(adaptor,"token KW_CASE");
        RewriteRuleTokenStream stream_KW_WHEN=new RewriteRuleTokenStream(adaptor,"token KW_WHEN");
        RewriteRuleTokenStream stream_KW_END=new RewriteRuleTokenStream(adaptor,"token KW_END");
        RewriteRuleTokenStream stream_KW_ELSE=new RewriteRuleTokenStream(adaptor,"token KW_ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
         msgs.push("case expression"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:968:5: ( KW_CASE ( KW_WHEN expression KW_THEN expression )+ ( KW_ELSE expression )? KW_END -> ^( TOK_FUNCTION KW_WHEN ( expression )* ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:969:5: KW_CASE ( KW_WHEN expression KW_THEN expression )+ ( KW_ELSE expression )? KW_END
            {
            KW_CASE422=(Token)input.LT(1);
            match(input,KW_CASE,FOLLOW_KW_CASE_in_whenExpression6860); 
            stream_KW_CASE.add(KW_CASE422);

            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:970:6: ( KW_WHEN expression KW_THEN expression )+
            int cnt127=0;
            loop127:
            do {
                int alt127=2;
                int LA127_0 = input.LA(1);

                if ( (LA127_0==KW_WHEN) ) {
                    alt127=1;
                }


                switch (alt127) {
            	case 1 :
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:970:8: KW_WHEN expression KW_THEN expression
            	    {
            	    KW_WHEN423=(Token)input.LT(1);
            	    match(input,KW_WHEN,FOLLOW_KW_WHEN_in_whenExpression6869); 
            	    stream_KW_WHEN.add(KW_WHEN423);

            	    pushFollow(FOLLOW_expression_in_whenExpression6871);
            	    expression424=expression();
            	    _fsp--;

            	    stream_expression.add(expression424.getTree());
            	    KW_THEN425=(Token)input.LT(1);
            	    match(input,KW_THEN,FOLLOW_KW_THEN_in_whenExpression6873); 
            	    stream_KW_THEN.add(KW_THEN425);

            	    pushFollow(FOLLOW_expression_in_whenExpression6875);
            	    expression426=expression();
            	    _fsp--;

            	    stream_expression.add(expression426.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt127 >= 1 ) break loop127;
                        EarlyExitException eee =
                            new EarlyExitException(127, input);
                        throw eee;
                }
                cnt127++;
            } while (true);

            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:971:5: ( KW_ELSE expression )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==KW_ELSE) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:971:6: KW_ELSE expression
                    {
                    KW_ELSE427=(Token)input.LT(1);
                    match(input,KW_ELSE,FOLLOW_KW_ELSE_in_whenExpression6884); 
                    stream_KW_ELSE.add(KW_ELSE427);

                    pushFollow(FOLLOW_expression_in_whenExpression6886);
                    expression428=expression();
                    _fsp--;

                    stream_expression.add(expression428.getTree());

                    }
                    break;

            }

            KW_END429=(Token)input.LT(1);
            match(input,KW_END,FOLLOW_KW_END_in_whenExpression6894); 
            stream_KW_END.add(KW_END429);


            // AST REWRITE
            // elements: expression, KW_WHEN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 972:12: -> ^( TOK_FUNCTION KW_WHEN ( expression )* )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:972:15: ^( TOK_FUNCTION KW_WHEN ( expression )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_FUNCTION, "TOK_FUNCTION"), root_1);

                adaptor.addChild(root_1, stream_KW_WHEN.next());
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:972:38: ( expression )*
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.next());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end whenExpression

    public static class constant_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start constant
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:975:1: constant : ( Number | StringLiteral | charSetStringLiteral | booleanValue );
    public final constant_return constant() throws RecognitionException {
        constant_return retval = new constant_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Number430=null;
        Token StringLiteral431=null;
        charSetStringLiteral_return charSetStringLiteral432 = null;

        booleanValue_return booleanValue433 = null;


        CommonTree Number430_tree=null;
        CommonTree StringLiteral431_tree=null;

         msgs.push("constant"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:978:5: ( Number | StringLiteral | charSetStringLiteral | booleanValue )
            int alt129=4;
            switch ( input.LA(1) ) {
            case Number:
                {
                alt129=1;
                }
                break;
            case StringLiteral:
                {
                alt129=2;
                }
                break;
            case CharSetName:
                {
                alt129=3;
                }
                break;
            case KW_TRUE:
            case KW_FALSE:
                {
                alt129=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("975:1: constant : ( Number | StringLiteral | charSetStringLiteral | booleanValue );", 129, 0, input);

                throw nvae;
            }

            switch (alt129) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:979:5: Number
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Number430=(Token)input.LT(1);
                    match(input,Number,FOLLOW_Number_in_constant6940); 
                    Number430_tree = (CommonTree)adaptor.create(Number430);
                    adaptor.addChild(root_0, Number430_tree);


                    }
                    break;
                case 2 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:980:7: StringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    StringLiteral431=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_constant6948); 
                    StringLiteral431_tree = (CommonTree)adaptor.create(StringLiteral431);
                    adaptor.addChild(root_0, StringLiteral431_tree);


                    }
                    break;
                case 3 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:981:7: charSetStringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_charSetStringLiteral_in_constant6956);
                    charSetStringLiteral432=charSetStringLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, charSetStringLiteral432.getTree());

                    }
                    break;
                case 4 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:982:7: booleanValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_booleanValue_in_constant6964);
                    booleanValue433=booleanValue();
                    _fsp--;

                    adaptor.addChild(root_0, booleanValue433.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end constant

    public static class charSetStringLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start charSetStringLiteral
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:985:1: charSetStringLiteral : csName= CharSetName csLiteral= CharSetLiteral -> ^( TOK_CHARSETLITERAL $csName $csLiteral) ;
    public final charSetStringLiteral_return charSetStringLiteral() throws RecognitionException {
        charSetStringLiteral_return retval = new charSetStringLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token csName=null;
        Token csLiteral=null;

        CommonTree csName_tree=null;
        CommonTree csLiteral_tree=null;
        RewriteRuleTokenStream stream_CharSetLiteral=new RewriteRuleTokenStream(adaptor,"token CharSetLiteral");
        RewriteRuleTokenStream stream_CharSetName=new RewriteRuleTokenStream(adaptor,"token CharSetName");

         msgs.push("character string literal"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:988:5: (csName= CharSetName csLiteral= CharSetLiteral -> ^( TOK_CHARSETLITERAL $csName $csLiteral) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:989:5: csName= CharSetName csLiteral= CharSetLiteral
            {
            csName=(Token)input.LT(1);
            match(input,CharSetName,FOLLOW_CharSetName_in_charSetStringLiteral6998); 
            stream_CharSetName.add(csName);

            csLiteral=(Token)input.LT(1);
            match(input,CharSetLiteral,FOLLOW_CharSetLiteral_in_charSetStringLiteral7002); 
            stream_CharSetLiteral.add(csLiteral);


            // AST REWRITE
            // elements: csLiteral, csName
            // token labels: csName, csLiteral
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_csName=new RewriteRuleTokenStream(adaptor,"token csName",csName);
            RewriteRuleTokenStream stream_csLiteral=new RewriteRuleTokenStream(adaptor,"token csLiteral",csLiteral);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 989:49: -> ^( TOK_CHARSETLITERAL $csName $csLiteral)
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:989:52: ^( TOK_CHARSETLITERAL $csName $csLiteral)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_CHARSETLITERAL, "TOK_CHARSETLITERAL"), root_1);

                adaptor.addChild(root_1, stream_csName.next());
                adaptor.addChild(root_1, stream_csLiteral.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end charSetStringLiteral

    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start expression
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:992:1: expression : precedenceOrExpression ;
    public final expression_return expression() throws RecognitionException {
        expression_return retval = new expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        precedenceOrExpression_return precedenceOrExpression434 = null;



         msgs.push("expression specification"); 
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:995:5: ( precedenceOrExpression )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:996:5: precedenceOrExpression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_precedenceOrExpression_in_expression7045);
            precedenceOrExpression434=precedenceOrExpression();
            _fsp--;

            adaptor.addChild(root_0, precedenceOrExpression434.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             msgs.pop(); 
        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end expression

    public static class atomExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start atomExpression
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:999:1: atomExpression : ( KW_NULL -> TOK_NULL | constant | function | castExpression | caseExpression | whenExpression | tableOrColumn | LPAREN expression RPAREN );
    public final atomExpression_return atomExpression() throws RecognitionException {
        atomExpression_return retval = new atomExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_NULL435=null;
        Token LPAREN442=null;
        Token RPAREN444=null;
        constant_return constant436 = null;

        function_return function437 = null;

        castExpression_return castExpression438 = null;

        caseExpression_return caseExpression439 = null;

        whenExpression_return whenExpression440 = null;

        tableOrColumn_return tableOrColumn441 = null;

        expression_return expression443 = null;


        CommonTree KW_NULL435_tree=null;
        CommonTree LPAREN442_tree=null;
        CommonTree RPAREN444_tree=null;
        RewriteRuleTokenStream stream_KW_NULL=new RewriteRuleTokenStream(adaptor,"token KW_NULL");

        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1000:5: ( KW_NULL -> TOK_NULL | constant | function | castExpression | caseExpression | whenExpression | tableOrColumn | LPAREN expression RPAREN )
            int alt130=8;
            switch ( input.LA(1) ) {
            case KW_NULL:
                {
                alt130=1;
                }
                break;
            case StringLiteral:
            case Number:
            case CharSetName:
            case KW_TRUE:
            case KW_FALSE:
                {
                alt130=2;
                }
                break;
            case Identifier:
                {
                int LA130_7 = input.LA(2);

                if ( (LA130_7==LPAREN) ) {
                    alt130=3;
                }
                else if ( (LA130_7==EOF||(LA130_7>=Identifier && LA130_7<=KW_LIKE)||LA130_7==RPAREN||LA130_7==COMMA||LA130_7==DOT||LA130_7==KW_AS||LA130_7==KW_ROW||LA130_7==EQUAL||LA130_7==KW_MAP||(LA130_7>=KW_ASC && LA130_7<=KW_DESC)||(LA130_7>=LESSTHAN && LA130_7<=KW_UNION)||LA130_7==KW_INSERT||(LA130_7>=KW_LIMIT && LA130_7<=KW_SELECT)||(LA130_7>=DIVIDE && LA130_7<=PLUS)||(LA130_7>=KW_REDUCE && LA130_7<=KW_FROM)||(LA130_7>=KW_JOIN && LA130_7<=KW_LEFT)||(LA130_7>=KW_RIGHT && LA130_7<=KW_FULL)||(LA130_7>=KW_WHERE && LA130_7<=KW_SORT)||(LA130_7>=KW_WHEN && LA130_7<=KW_END)||(LA130_7>=LSQUARE && LA130_7<=MINUS)||(LA130_7>=KW_IS && LA130_7<=KW_OR)) ) {
                    alt130=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("999:1: atomExpression : ( KW_NULL -> TOK_NULL | constant | function | castExpression | caseExpression | whenExpression | tableOrColumn | LPAREN expression RPAREN );", 130, 7, input);

                    throw nvae;
                }
                }
                break;
            case KW_CAST:
                {
                alt130=4;
                }
                break;
            case KW_CASE:
                {
                int LA130_9 = input.LA(2);

                if ( (LA130_9==StringLiteral||(LA130_9>=KW_IF && LA130_9<=KW_NOT)||LA130_9==Identifier||LA130_9==LPAREN||LA130_9==Number||LA130_9==PLUS||(LA130_9>=KW_CAST && LA130_9<=KW_CASE)||LA130_9==CharSetName||LA130_9==KW_NULL||(LA130_9>=MINUS && LA130_9<=TILDE)||(LA130_9>=KW_TRUE && LA130_9<=KW_FALSE)) ) {
                    alt130=5;
                }
                else if ( (LA130_9==KW_WHEN) ) {
                    alt130=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("999:1: atomExpression : ( KW_NULL -> TOK_NULL | constant | function | castExpression | caseExpression | whenExpression | tableOrColumn | LPAREN expression RPAREN );", 130, 9, input);

                    throw nvae;
                }
                }
                break;
            case KW_IF:
                {
                alt130=3;
                }
                break;
            case LPAREN:
                {
                alt130=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("999:1: atomExpression : ( KW_NULL -> TOK_NULL | constant | function | castExpression | caseExpression | whenExpression | tableOrColumn | LPAREN expression RPAREN );", 130, 0, input);

                throw nvae;
            }

            switch (alt130) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1001:5: KW_NULL
                    {
                    KW_NULL435=(Token)input.LT(1);
                    match(input,KW_NULL,FOLLOW_KW_NULL_in_atomExpression7066); 
                    stream_KW_NULL.add(KW_NULL435);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 1001:13: -> TOK_NULL
                    {
                        adaptor.addChild(root_0, adaptor.create(TOK_NULL, "TOK_NULL"));

                    }



                    }
                    break;
                case 2 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1002:7: constant
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_constant_in_atomExpression7078);
                    constant436=constant();
                    _fsp--;

                    adaptor.addChild(root_0, constant436.getTree());

                    }
                    break;
                case 3 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1003:7: function
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_function_in_atomExpression7086);
                    function437=function();
                    _fsp--;

                    adaptor.addChild(root_0, function437.getTree());

                    }
                    break;
                case 4 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1004:7: castExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_castExpression_in_atomExpression7094);
                    castExpression438=castExpression();
                    _fsp--;

                    adaptor.addChild(root_0, castExpression438.getTree());

                    }
                    break;
                case 5 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1005:7: caseExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_caseExpression_in_atomExpression7102);
                    caseExpression439=caseExpression();
                    _fsp--;

                    adaptor.addChild(root_0, caseExpression439.getTree());

                    }
                    break;
                case 6 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1006:7: whenExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_whenExpression_in_atomExpression7110);
                    whenExpression440=whenExpression();
                    _fsp--;

                    adaptor.addChild(root_0, whenExpression440.getTree());

                    }
                    break;
                case 7 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1007:7: tableOrColumn
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_tableOrColumn_in_atomExpression7118);
                    tableOrColumn441=tableOrColumn();
                    _fsp--;

                    adaptor.addChild(root_0, tableOrColumn441.getTree());

                    }
                    break;
                case 8 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1008:7: LPAREN expression RPAREN
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LPAREN442=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_atomExpression7126); 
                    pushFollow(FOLLOW_expression_in_atomExpression7129);
                    expression443=expression();
                    _fsp--;

                    adaptor.addChild(root_0, expression443.getTree());
                    RPAREN444=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_atomExpression7131); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end atomExpression

    public static class precedenceFieldExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start precedenceFieldExpression
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1012:1: precedenceFieldExpression : atomExpression ( ( LSQUARE expression RSQUARE ) | ( DOT Identifier ) )* ;
    public final precedenceFieldExpression_return precedenceFieldExpression() throws RecognitionException {
        precedenceFieldExpression_return retval = new precedenceFieldExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LSQUARE446=null;
        Token RSQUARE448=null;
        Token DOT449=null;
        Token Identifier450=null;
        atomExpression_return atomExpression445 = null;

        expression_return expression447 = null;


        CommonTree LSQUARE446_tree=null;
        CommonTree RSQUARE448_tree=null;
        CommonTree DOT449_tree=null;
        CommonTree Identifier450_tree=null;

        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1013:5: ( atomExpression ( ( LSQUARE expression RSQUARE ) | ( DOT Identifier ) )* )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1014:5: atomExpression ( ( LSQUARE expression RSQUARE ) | ( DOT Identifier ) )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_atomExpression_in_precedenceFieldExpression7154);
            atomExpression445=atomExpression();
            _fsp--;

            adaptor.addChild(root_0, atomExpression445.getTree());
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1014:20: ( ( LSQUARE expression RSQUARE ) | ( DOT Identifier ) )*
            loop131:
            do {
                int alt131=3;
                int LA131_0 = input.LA(1);

                if ( (LA131_0==LSQUARE) ) {
                    alt131=1;
                }
                else if ( (LA131_0==DOT) ) {
                    alt131=2;
                }


                switch (alt131) {
            	case 1 :
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1014:21: ( LSQUARE expression RSQUARE )
            	    {
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1014:21: ( LSQUARE expression RSQUARE )
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1014:22: LSQUARE expression RSQUARE
            	    {
            	    LSQUARE446=(Token)input.LT(1);
            	    match(input,LSQUARE,FOLLOW_LSQUARE_in_precedenceFieldExpression7158); 
            	    LSQUARE446_tree = (CommonTree)adaptor.create(LSQUARE446);
            	    root_0 = (CommonTree)adaptor.becomeRoot(LSQUARE446_tree, root_0);

            	    pushFollow(FOLLOW_expression_in_precedenceFieldExpression7161);
            	    expression447=expression();
            	    _fsp--;

            	    adaptor.addChild(root_0, expression447.getTree());
            	    RSQUARE448=(Token)input.LT(1);
            	    match(input,RSQUARE,FOLLOW_RSQUARE_in_precedenceFieldExpression7163); 

            	    }


            	    }
            	    break;
            	case 2 :
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1014:54: ( DOT Identifier )
            	    {
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1014:54: ( DOT Identifier )
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1014:55: DOT Identifier
            	    {
            	    DOT449=(Token)input.LT(1);
            	    match(input,DOT,FOLLOW_DOT_in_precedenceFieldExpression7170); 
            	    DOT449_tree = (CommonTree)adaptor.create(DOT449);
            	    root_0 = (CommonTree)adaptor.becomeRoot(DOT449_tree, root_0);

            	    Identifier450=(Token)input.LT(1);
            	    match(input,Identifier,FOLLOW_Identifier_in_precedenceFieldExpression7173); 
            	    Identifier450_tree = (CommonTree)adaptor.create(Identifier450);
            	    adaptor.addChild(root_0, Identifier450_tree);


            	    }


            	    }
            	    break;

            	default :
            	    break loop131;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end precedenceFieldExpression

    public static class precedenceUnaryOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start precedenceUnaryOperator
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1017:1: precedenceUnaryOperator : ( PLUS | MINUS | TILDE );
    public final precedenceUnaryOperator_return precedenceUnaryOperator() throws RecognitionException {
        precedenceUnaryOperator_return retval = new precedenceUnaryOperator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set451=null;

        CommonTree set451_tree=null;

        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1018:5: ( PLUS | MINUS | TILDE )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set451=(Token)input.LT(1);
            if ( input.LA(1)==PLUS||(input.LA(1)>=MINUS && input.LA(1)<=TILDE) ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set451));
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_precedenceUnaryOperator0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end precedenceUnaryOperator

    public static class nullCondition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start nullCondition
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1022:1: nullCondition : ( KW_NULL -> ^( TOK_ISNULL ) | KW_NOT KW_NULL -> ^( TOK_ISNOTNULL ) );
    public final nullCondition_return nullCondition() throws RecognitionException {
        nullCondition_return retval = new nullCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_NULL452=null;
        Token KW_NOT453=null;
        Token KW_NULL454=null;

        CommonTree KW_NULL452_tree=null;
        CommonTree KW_NOT453_tree=null;
        CommonTree KW_NULL454_tree=null;
        RewriteRuleTokenStream stream_KW_NULL=new RewriteRuleTokenStream(adaptor,"token KW_NULL");
        RewriteRuleTokenStream stream_KW_NOT=new RewriteRuleTokenStream(adaptor,"token KW_NOT");

        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1023:5: ( KW_NULL -> ^( TOK_ISNULL ) | KW_NOT KW_NULL -> ^( TOK_ISNOTNULL ) )
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==KW_NULL) ) {
                alt132=1;
            }
            else if ( (LA132_0==KW_NOT) ) {
                alt132=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1022:1: nullCondition : ( KW_NULL -> ^( TOK_ISNULL ) | KW_NOT KW_NULL -> ^( TOK_ISNOTNULL ) );", 132, 0, input);

                throw nvae;
            }
            switch (alt132) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1024:5: KW_NULL
                    {
                    KW_NULL452=(Token)input.LT(1);
                    match(input,KW_NULL,FOLLOW_KW_NULL_in_nullCondition7226); 
                    stream_KW_NULL.add(KW_NULL452);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 1024:13: -> ^( TOK_ISNULL )
                    {
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1024:16: ^( TOK_ISNULL )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_ISNULL, "TOK_ISNULL"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;
                case 2 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1025:7: KW_NOT KW_NULL
                    {
                    KW_NOT453=(Token)input.LT(1);
                    match(input,KW_NOT,FOLLOW_KW_NOT_in_nullCondition7240); 
                    stream_KW_NOT.add(KW_NOT453);

                    KW_NULL454=(Token)input.LT(1);
                    match(input,KW_NULL,FOLLOW_KW_NULL_in_nullCondition7242); 
                    stream_KW_NULL.add(KW_NULL454);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 1025:22: -> ^( TOK_ISNOTNULL )
                    {
                        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1025:25: ^( TOK_ISNOTNULL )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_ISNOTNULL, "TOK_ISNOTNULL"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end nullCondition

    public static class precedenceUnaryPrefixExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start precedenceUnaryPrefixExpression
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1028:1: precedenceUnaryPrefixExpression : ( precedenceUnaryOperator )* precedenceFieldExpression ;
    public final precedenceUnaryPrefixExpression_return precedenceUnaryPrefixExpression() throws RecognitionException {
        precedenceUnaryPrefixExpression_return retval = new precedenceUnaryPrefixExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        precedenceUnaryOperator_return precedenceUnaryOperator455 = null;

        precedenceFieldExpression_return precedenceFieldExpression456 = null;



        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1029:5: ( ( precedenceUnaryOperator )* precedenceFieldExpression )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1030:5: ( precedenceUnaryOperator )* precedenceFieldExpression
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1030:5: ( precedenceUnaryOperator )*
            loop133:
            do {
                int alt133=2;
                int LA133_0 = input.LA(1);

                if ( (LA133_0==PLUS||(LA133_0>=MINUS && LA133_0<=TILDE)) ) {
                    alt133=1;
                }


                switch (alt133) {
            	case 1 :
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1030:6: precedenceUnaryOperator
            	    {
            	    pushFollow(FOLLOW_precedenceUnaryOperator_in_precedenceUnaryPrefixExpression7270);
            	    precedenceUnaryOperator455=precedenceUnaryOperator();
            	    _fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(precedenceUnaryOperator455.getTree(), root_0);

            	    }
            	    break;

            	default :
            	    break loop133;
                }
            } while (true);

            pushFollow(FOLLOW_precedenceFieldExpression_in_precedenceUnaryPrefixExpression7275);
            precedenceFieldExpression456=precedenceFieldExpression();
            _fsp--;

            adaptor.addChild(root_0, precedenceFieldExpression456.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end precedenceUnaryPrefixExpression

    public static class precedenceUnarySuffixExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start precedenceUnarySuffixExpression
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1033:1: precedenceUnarySuffixExpression : precedenceUnaryPrefixExpression (a= KW_IS nullCondition )? -> {$a != null}? ^( TOK_FUNCTION nullCondition precedenceUnaryPrefixExpression ) -> precedenceUnaryPrefixExpression ;
    public final precedenceUnarySuffixExpression_return precedenceUnarySuffixExpression() throws RecognitionException {
        precedenceUnarySuffixExpression_return retval = new precedenceUnarySuffixExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token a=null;
        precedenceUnaryPrefixExpression_return precedenceUnaryPrefixExpression457 = null;

        nullCondition_return nullCondition458 = null;


        CommonTree a_tree=null;
        RewriteRuleTokenStream stream_KW_IS=new RewriteRuleTokenStream(adaptor,"token KW_IS");
        RewriteRuleSubtreeStream stream_precedenceUnaryPrefixExpression=new RewriteRuleSubtreeStream(adaptor,"rule precedenceUnaryPrefixExpression");
        RewriteRuleSubtreeStream stream_nullCondition=new RewriteRuleSubtreeStream(adaptor,"rule nullCondition");
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1034:5: ( precedenceUnaryPrefixExpression (a= KW_IS nullCondition )? -> {$a != null}? ^( TOK_FUNCTION nullCondition precedenceUnaryPrefixExpression ) -> precedenceUnaryPrefixExpression )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1034:7: precedenceUnaryPrefixExpression (a= KW_IS nullCondition )?
            {
            pushFollow(FOLLOW_precedenceUnaryPrefixExpression_in_precedenceUnarySuffixExpression7292);
            precedenceUnaryPrefixExpression457=precedenceUnaryPrefixExpression();
            _fsp--;

            stream_precedenceUnaryPrefixExpression.add(precedenceUnaryPrefixExpression457.getTree());
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1034:39: (a= KW_IS nullCondition )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==KW_IS) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1034:40: a= KW_IS nullCondition
                    {
                    a=(Token)input.LT(1);
                    match(input,KW_IS,FOLLOW_KW_IS_in_precedenceUnarySuffixExpression7297); 
                    stream_KW_IS.add(a);

                    pushFollow(FOLLOW_nullCondition_in_precedenceUnarySuffixExpression7299);
                    nullCondition458=nullCondition();
                    _fsp--;

                    stream_nullCondition.add(nullCondition458.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: precedenceUnaryPrefixExpression, precedenceUnaryPrefixExpression, nullCondition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1035:5: -> {$a != null}? ^( TOK_FUNCTION nullCondition precedenceUnaryPrefixExpression )
            if (a != null) {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1035:22: ^( TOK_FUNCTION nullCondition precedenceUnaryPrefixExpression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_FUNCTION, "TOK_FUNCTION"), root_1);

                adaptor.addChild(root_1, stream_nullCondition.next());
                adaptor.addChild(root_1, stream_precedenceUnaryPrefixExpression.next());

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 1036:5: -> precedenceUnaryPrefixExpression
            {
                adaptor.addChild(root_0, stream_precedenceUnaryPrefixExpression.next());

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end precedenceUnarySuffixExpression

    public static class precedenceBitwiseXorOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start precedenceBitwiseXorOperator
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1040:1: precedenceBitwiseXorOperator : BITWISEXOR ;
    public final precedenceBitwiseXorOperator_return precedenceBitwiseXorOperator() throws RecognitionException {
        precedenceBitwiseXorOperator_return retval = new precedenceBitwiseXorOperator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BITWISEXOR459=null;

        CommonTree BITWISEXOR459_tree=null;

        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1041:5: ( BITWISEXOR )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1042:5: BITWISEXOR
            {
            root_0 = (CommonTree)adaptor.nil();

            BITWISEXOR459=(Token)input.LT(1);
            match(input,BITWISEXOR,FOLLOW_BITWISEXOR_in_precedenceBitwiseXorOperator7347); 
            BITWISEXOR459_tree = (CommonTree)adaptor.create(BITWISEXOR459);
            adaptor.addChild(root_0, BITWISEXOR459_tree);


            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end precedenceBitwiseXorOperator

    public static class precedenceBitwiseXorExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start precedenceBitwiseXorExpression
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1045:1: precedenceBitwiseXorExpression : precedenceUnarySuffixExpression ( precedenceBitwiseXorOperator precedenceUnarySuffixExpression )* ;
    public final precedenceBitwiseXorExpression_return precedenceBitwiseXorExpression() throws RecognitionException {
        precedenceBitwiseXorExpression_return retval = new precedenceBitwiseXorExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        precedenceUnarySuffixExpression_return precedenceUnarySuffixExpression460 = null;

        precedenceBitwiseXorOperator_return precedenceBitwiseXorOperator461 = null;

        precedenceUnarySuffixExpression_return precedenceUnarySuffixExpression462 = null;



        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1046:5: ( precedenceUnarySuffixExpression ( precedenceBitwiseXorOperator precedenceUnarySuffixExpression )* )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1047:5: precedenceUnarySuffixExpression ( precedenceBitwiseXorOperator precedenceUnarySuffixExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_precedenceUnarySuffixExpression_in_precedenceBitwiseXorExpression7368);
            precedenceUnarySuffixExpression460=precedenceUnarySuffixExpression();
            _fsp--;

            adaptor.addChild(root_0, precedenceUnarySuffixExpression460.getTree());
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1047:37: ( precedenceBitwiseXorOperator precedenceUnarySuffixExpression )*
            loop135:
            do {
                int alt135=2;
                int LA135_0 = input.LA(1);

                if ( (LA135_0==BITWISEXOR) ) {
                    alt135=1;
                }


                switch (alt135) {
            	case 1 :
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1047:38: precedenceBitwiseXorOperator precedenceUnarySuffixExpression
            	    {
            	    pushFollow(FOLLOW_precedenceBitwiseXorOperator_in_precedenceBitwiseXorExpression7371);
            	    precedenceBitwiseXorOperator461=precedenceBitwiseXorOperator();
            	    _fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(precedenceBitwiseXorOperator461.getTree(), root_0);
            	    pushFollow(FOLLOW_precedenceUnarySuffixExpression_in_precedenceBitwiseXorExpression7374);
            	    precedenceUnarySuffixExpression462=precedenceUnarySuffixExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, precedenceUnarySuffixExpression462.getTree());

            	    }
            	    break;

            	default :
            	    break loop135;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end precedenceBitwiseXorExpression

    public static class precedenceStarOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start precedenceStarOperator
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1051:1: precedenceStarOperator : ( STAR | DIVIDE | MOD | DIV );
    public final precedenceStarOperator_return precedenceStarOperator() throws RecognitionException {
        precedenceStarOperator_return retval = new precedenceStarOperator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set463=null;

        CommonTree set463_tree=null;

        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1052:5: ( STAR | DIVIDE | MOD | DIV )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set463=(Token)input.LT(1);
            if ( (input.LA(1)>=DIVIDE && input.LA(1)<=STAR)||(input.LA(1)>=MOD && input.LA(1)<=DIV) ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set463));
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_precedenceStarOperator0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end precedenceStarOperator

    public static class precedenceStarExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start precedenceStarExpression
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1056:1: precedenceStarExpression : precedenceBitwiseXorExpression ( precedenceStarOperator precedenceBitwiseXorExpression )* ;
    public final precedenceStarExpression_return precedenceStarExpression() throws RecognitionException {
        precedenceStarExpression_return retval = new precedenceStarExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        precedenceBitwiseXorExpression_return precedenceBitwiseXorExpression464 = null;

        precedenceStarOperator_return precedenceStarOperator465 = null;

        precedenceBitwiseXorExpression_return precedenceBitwiseXorExpression466 = null;



        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1057:5: ( precedenceBitwiseXorExpression ( precedenceStarOperator precedenceBitwiseXorExpression )* )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1058:5: precedenceBitwiseXorExpression ( precedenceStarOperator precedenceBitwiseXorExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_precedenceBitwiseXorExpression_in_precedenceStarExpression7432);
            precedenceBitwiseXorExpression464=precedenceBitwiseXorExpression();
            _fsp--;

            adaptor.addChild(root_0, precedenceBitwiseXorExpression464.getTree());
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1058:36: ( precedenceStarOperator precedenceBitwiseXorExpression )*
            loop136:
            do {
                int alt136=2;
                int LA136_0 = input.LA(1);

                if ( ((LA136_0>=DIVIDE && LA136_0<=STAR)||(LA136_0>=MOD && LA136_0<=DIV)) ) {
                    alt136=1;
                }


                switch (alt136) {
            	case 1 :
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1058:37: precedenceStarOperator precedenceBitwiseXorExpression
            	    {
            	    pushFollow(FOLLOW_precedenceStarOperator_in_precedenceStarExpression7435);
            	    precedenceStarOperator465=precedenceStarOperator();
            	    _fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(precedenceStarOperator465.getTree(), root_0);
            	    pushFollow(FOLLOW_precedenceBitwiseXorExpression_in_precedenceStarExpression7438);
            	    precedenceBitwiseXorExpression466=precedenceBitwiseXorExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, precedenceBitwiseXorExpression466.getTree());

            	    }
            	    break;

            	default :
            	    break loop136;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end precedenceStarExpression

    public static class precedencePlusOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start precedencePlusOperator
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1062:1: precedencePlusOperator : ( PLUS | MINUS );
    public final precedencePlusOperator_return precedencePlusOperator() throws RecognitionException {
        precedencePlusOperator_return retval = new precedencePlusOperator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set467=null;

        CommonTree set467_tree=null;

        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1063:5: ( PLUS | MINUS )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set467=(Token)input.LT(1);
            if ( input.LA(1)==PLUS||input.LA(1)==MINUS ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set467));
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_precedencePlusOperator0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end precedencePlusOperator

    public static class precedencePlusExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start precedencePlusExpression
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1067:1: precedencePlusExpression : precedenceStarExpression ( precedencePlusOperator precedenceStarExpression )* ;
    public final precedencePlusExpression_return precedencePlusExpression() throws RecognitionException {
        precedencePlusExpression_return retval = new precedencePlusExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        precedenceStarExpression_return precedenceStarExpression468 = null;

        precedencePlusOperator_return precedencePlusOperator469 = null;

        precedenceStarExpression_return precedenceStarExpression470 = null;



        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1068:5: ( precedenceStarExpression ( precedencePlusOperator precedenceStarExpression )* )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1069:5: precedenceStarExpression ( precedencePlusOperator precedenceStarExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_precedenceStarExpression_in_precedencePlusExpression7487);
            precedenceStarExpression468=precedenceStarExpression();
            _fsp--;

            adaptor.addChild(root_0, precedenceStarExpression468.getTree());
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1069:30: ( precedencePlusOperator precedenceStarExpression )*
            loop137:
            do {
                int alt137=2;
                int LA137_0 = input.LA(1);

                if ( (LA137_0==PLUS||LA137_0==MINUS) ) {
                    alt137=1;
                }


                switch (alt137) {
            	case 1 :
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1069:31: precedencePlusOperator precedenceStarExpression
            	    {
            	    pushFollow(FOLLOW_precedencePlusOperator_in_precedencePlusExpression7490);
            	    precedencePlusOperator469=precedencePlusOperator();
            	    _fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(precedencePlusOperator469.getTree(), root_0);
            	    pushFollow(FOLLOW_precedenceStarExpression_in_precedencePlusExpression7493);
            	    precedenceStarExpression470=precedenceStarExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, precedenceStarExpression470.getTree());

            	    }
            	    break;

            	default :
            	    break loop137;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end precedencePlusExpression

    public static class precedenceAmpersandOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start precedenceAmpersandOperator
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1073:1: precedenceAmpersandOperator : AMPERSAND ;
    public final precedenceAmpersandOperator_return precedenceAmpersandOperator() throws RecognitionException {
        precedenceAmpersandOperator_return retval = new precedenceAmpersandOperator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token AMPERSAND471=null;

        CommonTree AMPERSAND471_tree=null;

        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1074:5: ( AMPERSAND )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1075:5: AMPERSAND
            {
            root_0 = (CommonTree)adaptor.nil();

            AMPERSAND471=(Token)input.LT(1);
            match(input,AMPERSAND,FOLLOW_AMPERSAND_in_precedenceAmpersandOperator7517); 
            AMPERSAND471_tree = (CommonTree)adaptor.create(AMPERSAND471);
            adaptor.addChild(root_0, AMPERSAND471_tree);


            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end precedenceAmpersandOperator

    public static class precedenceAmpersandExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start precedenceAmpersandExpression
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1078:1: precedenceAmpersandExpression : precedencePlusExpression ( precedenceAmpersandOperator precedencePlusExpression )* ;
    public final precedenceAmpersandExpression_return precedenceAmpersandExpression() throws RecognitionException {
        precedenceAmpersandExpression_return retval = new precedenceAmpersandExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        precedencePlusExpression_return precedencePlusExpression472 = null;

        precedenceAmpersandOperator_return precedenceAmpersandOperator473 = null;

        precedencePlusExpression_return precedencePlusExpression474 = null;



        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1079:5: ( precedencePlusExpression ( precedenceAmpersandOperator precedencePlusExpression )* )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1080:5: precedencePlusExpression ( precedenceAmpersandOperator precedencePlusExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_precedencePlusExpression_in_precedenceAmpersandExpression7538);
            precedencePlusExpression472=precedencePlusExpression();
            _fsp--;

            adaptor.addChild(root_0, precedencePlusExpression472.getTree());
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1080:30: ( precedenceAmpersandOperator precedencePlusExpression )*
            loop138:
            do {
                int alt138=2;
                int LA138_0 = input.LA(1);

                if ( (LA138_0==AMPERSAND) ) {
                    alt138=1;
                }


                switch (alt138) {
            	case 1 :
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1080:31: precedenceAmpersandOperator precedencePlusExpression
            	    {
            	    pushFollow(FOLLOW_precedenceAmpersandOperator_in_precedenceAmpersandExpression7541);
            	    precedenceAmpersandOperator473=precedenceAmpersandOperator();
            	    _fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(precedenceAmpersandOperator473.getTree(), root_0);
            	    pushFollow(FOLLOW_precedencePlusExpression_in_precedenceAmpersandExpression7544);
            	    precedencePlusExpression474=precedencePlusExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, precedencePlusExpression474.getTree());

            	    }
            	    break;

            	default :
            	    break loop138;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end precedenceAmpersandExpression

    public static class precedenceBitwiseOrOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start precedenceBitwiseOrOperator
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1084:1: precedenceBitwiseOrOperator : BITWISEOR ;
    public final precedenceBitwiseOrOperator_return precedenceBitwiseOrOperator() throws RecognitionException {
        precedenceBitwiseOrOperator_return retval = new precedenceBitwiseOrOperator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BITWISEOR475=null;

        CommonTree BITWISEOR475_tree=null;

        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1085:5: ( BITWISEOR )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1086:5: BITWISEOR
            {
            root_0 = (CommonTree)adaptor.nil();

            BITWISEOR475=(Token)input.LT(1);
            match(input,BITWISEOR,FOLLOW_BITWISEOR_in_precedenceBitwiseOrOperator7568); 
            BITWISEOR475_tree = (CommonTree)adaptor.create(BITWISEOR475);
            adaptor.addChild(root_0, BITWISEOR475_tree);


            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end precedenceBitwiseOrOperator

    public static class precedenceBitwiseOrExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start precedenceBitwiseOrExpression
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1089:1: precedenceBitwiseOrExpression : precedenceAmpersandExpression ( precedenceBitwiseOrOperator precedenceAmpersandExpression )* ;
    public final precedenceBitwiseOrExpression_return precedenceBitwiseOrExpression() throws RecognitionException {
        precedenceBitwiseOrExpression_return retval = new precedenceBitwiseOrExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        precedenceAmpersandExpression_return precedenceAmpersandExpression476 = null;

        precedenceBitwiseOrOperator_return precedenceBitwiseOrOperator477 = null;

        precedenceAmpersandExpression_return precedenceAmpersandExpression478 = null;



        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1090:5: ( precedenceAmpersandExpression ( precedenceBitwiseOrOperator precedenceAmpersandExpression )* )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1091:5: precedenceAmpersandExpression ( precedenceBitwiseOrOperator precedenceAmpersandExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_precedenceAmpersandExpression_in_precedenceBitwiseOrExpression7589);
            precedenceAmpersandExpression476=precedenceAmpersandExpression();
            _fsp--;

            adaptor.addChild(root_0, precedenceAmpersandExpression476.getTree());
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1091:35: ( precedenceBitwiseOrOperator precedenceAmpersandExpression )*
            loop139:
            do {
                int alt139=2;
                int LA139_0 = input.LA(1);

                if ( (LA139_0==BITWISEOR) ) {
                    alt139=1;
                }


                switch (alt139) {
            	case 1 :
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1091:36: precedenceBitwiseOrOperator precedenceAmpersandExpression
            	    {
            	    pushFollow(FOLLOW_precedenceBitwiseOrOperator_in_precedenceBitwiseOrExpression7592);
            	    precedenceBitwiseOrOperator477=precedenceBitwiseOrOperator();
            	    _fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(precedenceBitwiseOrOperator477.getTree(), root_0);
            	    pushFollow(FOLLOW_precedenceAmpersandExpression_in_precedenceBitwiseOrExpression7595);
            	    precedenceAmpersandExpression478=precedenceAmpersandExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, precedenceAmpersandExpression478.getTree());

            	    }
            	    break;

            	default :
            	    break loop139;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end precedenceBitwiseOrExpression

    public static class precedenceEqualOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start precedenceEqualOperator
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1095:1: precedenceEqualOperator : ( EQUAL | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | KW_LIKE | KW_RLIKE | KW_REGEXP );
    public final precedenceEqualOperator_return precedenceEqualOperator() throws RecognitionException {
        precedenceEqualOperator_return retval = new precedenceEqualOperator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set479=null;

        CommonTree set479_tree=null;

        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1096:5: ( EQUAL | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | KW_LIKE | KW_RLIKE | KW_REGEXP )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set479=(Token)input.LT(1);
            if ( input.LA(1)==KW_LIKE||input.LA(1)==EQUAL||(input.LA(1)>=LESSTHAN && input.LA(1)<=GREATERTHAN)||(input.LA(1)>=NOTEQUAL && input.LA(1)<=KW_REGEXP) ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set479));
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_precedenceEqualOperator0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end precedenceEqualOperator

    public static class precedenceEqualExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start precedenceEqualExpression
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1101:1: precedenceEqualExpression : precedenceBitwiseOrExpression ( precedenceEqualOperator precedenceBitwiseOrExpression )* ;
    public final precedenceEqualExpression_return precedenceEqualExpression() throws RecognitionException {
        precedenceEqualExpression_return retval = new precedenceEqualExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        precedenceBitwiseOrExpression_return precedenceBitwiseOrExpression480 = null;

        precedenceEqualOperator_return precedenceEqualOperator481 = null;

        precedenceBitwiseOrExpression_return precedenceBitwiseOrExpression482 = null;



        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1102:5: ( precedenceBitwiseOrExpression ( precedenceEqualOperator precedenceBitwiseOrExpression )* )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1103:5: precedenceBitwiseOrExpression ( precedenceEqualOperator precedenceBitwiseOrExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression7676);
            precedenceBitwiseOrExpression480=precedenceBitwiseOrExpression();
            _fsp--;

            adaptor.addChild(root_0, precedenceBitwiseOrExpression480.getTree());
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1103:35: ( precedenceEqualOperator precedenceBitwiseOrExpression )*
            loop140:
            do {
                int alt140=2;
                int LA140_0 = input.LA(1);

                if ( (LA140_0==KW_LIKE||LA140_0==EQUAL||(LA140_0>=LESSTHAN && LA140_0<=GREATERTHAN)||(LA140_0>=NOTEQUAL && LA140_0<=KW_REGEXP)) ) {
                    alt140=1;
                }


                switch (alt140) {
            	case 1 :
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1103:36: precedenceEqualOperator precedenceBitwiseOrExpression
            	    {
            	    pushFollow(FOLLOW_precedenceEqualOperator_in_precedenceEqualExpression7679);
            	    precedenceEqualOperator481=precedenceEqualOperator();
            	    _fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(precedenceEqualOperator481.getTree(), root_0);
            	    pushFollow(FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression7682);
            	    precedenceBitwiseOrExpression482=precedenceBitwiseOrExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, precedenceBitwiseOrExpression482.getTree());

            	    }
            	    break;

            	default :
            	    break loop140;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end precedenceEqualExpression

    public static class precedenceNotOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start precedenceNotOperator
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1107:1: precedenceNotOperator : KW_NOT ;
    public final precedenceNotOperator_return precedenceNotOperator() throws RecognitionException {
        precedenceNotOperator_return retval = new precedenceNotOperator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_NOT483=null;

        CommonTree KW_NOT483_tree=null;

        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1108:5: ( KW_NOT )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1109:5: KW_NOT
            {
            root_0 = (CommonTree)adaptor.nil();

            KW_NOT483=(Token)input.LT(1);
            match(input,KW_NOT,FOLLOW_KW_NOT_in_precedenceNotOperator7706); 
            KW_NOT483_tree = (CommonTree)adaptor.create(KW_NOT483);
            adaptor.addChild(root_0, KW_NOT483_tree);


            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end precedenceNotOperator

    public static class precedenceNotExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start precedenceNotExpression
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1112:1: precedenceNotExpression : ( precedenceNotOperator )* precedenceEqualExpression ;
    public final precedenceNotExpression_return precedenceNotExpression() throws RecognitionException {
        precedenceNotExpression_return retval = new precedenceNotExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        precedenceNotOperator_return precedenceNotOperator484 = null;

        precedenceEqualExpression_return precedenceEqualExpression485 = null;



        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1113:5: ( ( precedenceNotOperator )* precedenceEqualExpression )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1114:5: ( precedenceNotOperator )* precedenceEqualExpression
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1114:5: ( precedenceNotOperator )*
            loop141:
            do {
                int alt141=2;
                int LA141_0 = input.LA(1);

                if ( (LA141_0==KW_NOT) ) {
                    alt141=1;
                }


                switch (alt141) {
            	case 1 :
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1114:6: precedenceNotOperator
            	    {
            	    pushFollow(FOLLOW_precedenceNotOperator_in_precedenceNotExpression7728);
            	    precedenceNotOperator484=precedenceNotOperator();
            	    _fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(precedenceNotOperator484.getTree(), root_0);

            	    }
            	    break;

            	default :
            	    break loop141;
                }
            } while (true);

            pushFollow(FOLLOW_precedenceEqualExpression_in_precedenceNotExpression7733);
            precedenceEqualExpression485=precedenceEqualExpression();
            _fsp--;

            adaptor.addChild(root_0, precedenceEqualExpression485.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end precedenceNotExpression

    public static class precedenceAndOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start precedenceAndOperator
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1118:1: precedenceAndOperator : KW_AND ;
    public final precedenceAndOperator_return precedenceAndOperator() throws RecognitionException {
        precedenceAndOperator_return retval = new precedenceAndOperator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_AND486=null;

        CommonTree KW_AND486_tree=null;

        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1119:5: ( KW_AND )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1120:5: KW_AND
            {
            root_0 = (CommonTree)adaptor.nil();

            KW_AND486=(Token)input.LT(1);
            match(input,KW_AND,FOLLOW_KW_AND_in_precedenceAndOperator7755); 
            KW_AND486_tree = (CommonTree)adaptor.create(KW_AND486);
            adaptor.addChild(root_0, KW_AND486_tree);


            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end precedenceAndOperator

    public static class precedenceAndExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start precedenceAndExpression
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1123:1: precedenceAndExpression : precedenceNotExpression ( precedenceAndOperator precedenceNotExpression )* ;
    public final precedenceAndExpression_return precedenceAndExpression() throws RecognitionException {
        precedenceAndExpression_return retval = new precedenceAndExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        precedenceNotExpression_return precedenceNotExpression487 = null;

        precedenceAndOperator_return precedenceAndOperator488 = null;

        precedenceNotExpression_return precedenceNotExpression489 = null;



        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1124:5: ( precedenceNotExpression ( precedenceAndOperator precedenceNotExpression )* )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1125:5: precedenceNotExpression ( precedenceAndOperator precedenceNotExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_precedenceNotExpression_in_precedenceAndExpression7776);
            precedenceNotExpression487=precedenceNotExpression();
            _fsp--;

            adaptor.addChild(root_0, precedenceNotExpression487.getTree());
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1125:29: ( precedenceAndOperator precedenceNotExpression )*
            loop142:
            do {
                int alt142=2;
                int LA142_0 = input.LA(1);

                if ( (LA142_0==KW_AND) ) {
                    alt142=1;
                }


                switch (alt142) {
            	case 1 :
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1125:30: precedenceAndOperator precedenceNotExpression
            	    {
            	    pushFollow(FOLLOW_precedenceAndOperator_in_precedenceAndExpression7779);
            	    precedenceAndOperator488=precedenceAndOperator();
            	    _fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(precedenceAndOperator488.getTree(), root_0);
            	    pushFollow(FOLLOW_precedenceNotExpression_in_precedenceAndExpression7782);
            	    precedenceNotExpression489=precedenceNotExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, precedenceNotExpression489.getTree());

            	    }
            	    break;

            	default :
            	    break loop142;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end precedenceAndExpression

    public static class precedenceOrOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start precedenceOrOperator
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1129:1: precedenceOrOperator : KW_OR ;
    public final precedenceOrOperator_return precedenceOrOperator() throws RecognitionException {
        precedenceOrOperator_return retval = new precedenceOrOperator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_OR490=null;

        CommonTree KW_OR490_tree=null;

        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1130:5: ( KW_OR )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1131:5: KW_OR
            {
            root_0 = (CommonTree)adaptor.nil();

            KW_OR490=(Token)input.LT(1);
            match(input,KW_OR,FOLLOW_KW_OR_in_precedenceOrOperator7806); 
            KW_OR490_tree = (CommonTree)adaptor.create(KW_OR490);
            adaptor.addChild(root_0, KW_OR490_tree);


            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end precedenceOrOperator

    public static class precedenceOrExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start precedenceOrExpression
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1134:1: precedenceOrExpression : precedenceAndExpression ( precedenceOrOperator precedenceAndExpression )* ;
    public final precedenceOrExpression_return precedenceOrExpression() throws RecognitionException {
        precedenceOrExpression_return retval = new precedenceOrExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        precedenceAndExpression_return precedenceAndExpression491 = null;

        precedenceOrOperator_return precedenceOrOperator492 = null;

        precedenceAndExpression_return precedenceAndExpression493 = null;



        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1135:5: ( precedenceAndExpression ( precedenceOrOperator precedenceAndExpression )* )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1136:5: precedenceAndExpression ( precedenceOrOperator precedenceAndExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_precedenceAndExpression_in_precedenceOrExpression7827);
            precedenceAndExpression491=precedenceAndExpression();
            _fsp--;

            adaptor.addChild(root_0, precedenceAndExpression491.getTree());
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1136:29: ( precedenceOrOperator precedenceAndExpression )*
            loop143:
            do {
                int alt143=2;
                int LA143_0 = input.LA(1);

                if ( (LA143_0==KW_OR) ) {
                    alt143=1;
                }


                switch (alt143) {
            	case 1 :
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1136:30: precedenceOrOperator precedenceAndExpression
            	    {
            	    pushFollow(FOLLOW_precedenceOrOperator_in_precedenceOrExpression7830);
            	    precedenceOrOperator492=precedenceOrOperator();
            	    _fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(precedenceOrOperator492.getTree(), root_0);
            	    pushFollow(FOLLOW_precedenceAndExpression_in_precedenceOrExpression7833);
            	    precedenceAndExpression493=precedenceAndExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, precedenceAndExpression493.getTree());

            	    }
            	    break;

            	default :
            	    break loop143;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end precedenceOrExpression

    public static class booleanValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start booleanValue
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1140:1: booleanValue : ( KW_TRUE | KW_FALSE );
    public final booleanValue_return booleanValue() throws RecognitionException {
        booleanValue_return retval = new booleanValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_TRUE494=null;
        Token KW_FALSE495=null;

        CommonTree KW_TRUE494_tree=null;
        CommonTree KW_FALSE495_tree=null;

        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1141:5: ( KW_TRUE | KW_FALSE )
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==KW_TRUE) ) {
                alt144=1;
            }
            else if ( (LA144_0==KW_FALSE) ) {
                alt144=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1140:1: booleanValue : ( KW_TRUE | KW_FALSE );", 144, 0, input);

                throw nvae;
            }
            switch (alt144) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1142:5: KW_TRUE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    KW_TRUE494=(Token)input.LT(1);
                    match(input,KW_TRUE,FOLLOW_KW_TRUE_in_booleanValue7857); 
                    KW_TRUE494_tree = (CommonTree)adaptor.create(KW_TRUE494);
                    root_0 = (CommonTree)adaptor.becomeRoot(KW_TRUE494_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1142:16: KW_FALSE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    KW_FALSE495=(Token)input.LT(1);
                    match(input,KW_FALSE,FOLLOW_KW_FALSE_in_booleanValue7862); 
                    KW_FALSE495_tree = (CommonTree)adaptor.create(KW_FALSE495);
                    root_0 = (CommonTree)adaptor.becomeRoot(KW_FALSE495_tree, root_0);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end booleanValue

    public static class tabName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start tabName
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1145:1: tabName : Identifier ( partitionSpec )? -> ^( TOK_TAB Identifier ( partitionSpec )? ) ;
    public final tabName_return tabName() throws RecognitionException {
        tabName_return retval = new tabName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier496=null;
        partitionSpec_return partitionSpec497 = null;


        CommonTree Identifier496_tree=null;
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_partitionSpec=new RewriteRuleSubtreeStream(adaptor,"rule partitionSpec");
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1146:4: ( Identifier ( partitionSpec )? -> ^( TOK_TAB Identifier ( partitionSpec )? ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1147:4: Identifier ( partitionSpec )?
            {
            Identifier496=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_tabName7882); 
            stream_Identifier.add(Identifier496);

            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1147:15: ( partitionSpec )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==KW_PARTITION) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1147:15: partitionSpec
                    {
                    pushFollow(FOLLOW_partitionSpec_in_tabName7884);
                    partitionSpec497=partitionSpec();
                    _fsp--;

                    stream_partitionSpec.add(partitionSpec497.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: Identifier, partitionSpec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1147:30: -> ^( TOK_TAB Identifier ( partitionSpec )? )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1147:33: ^( TOK_TAB Identifier ( partitionSpec )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_TAB, "TOK_TAB"), root_1);

                adaptor.addChild(root_1, stream_Identifier.next());
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1147:54: ( partitionSpec )?
                if ( stream_partitionSpec.hasNext() ) {
                    adaptor.addChild(root_1, stream_partitionSpec.next());

                }
                stream_partitionSpec.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end tabName

    public static class partitionSpec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start partitionSpec
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1150:1: partitionSpec : KW_PARTITION LPAREN partitionVal ( COMMA partitionVal )* RPAREN -> ^( TOK_PARTSPEC ( partitionVal )+ ) ;
    public final partitionSpec_return partitionSpec() throws RecognitionException {
        partitionSpec_return retval = new partitionSpec_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_PARTITION498=null;
        Token LPAREN499=null;
        Token COMMA501=null;
        Token RPAREN503=null;
        partitionVal_return partitionVal500 = null;

        partitionVal_return partitionVal502 = null;


        CommonTree KW_PARTITION498_tree=null;
        CommonTree LPAREN499_tree=null;
        CommonTree COMMA501_tree=null;
        CommonTree RPAREN503_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_PARTITION=new RewriteRuleTokenStream(adaptor,"token KW_PARTITION");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_partitionVal=new RewriteRuleSubtreeStream(adaptor,"rule partitionVal");
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1151:5: ( KW_PARTITION LPAREN partitionVal ( COMMA partitionVal )* RPAREN -> ^( TOK_PARTSPEC ( partitionVal )+ ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1152:5: KW_PARTITION LPAREN partitionVal ( COMMA partitionVal )* RPAREN
            {
            KW_PARTITION498=(Token)input.LT(1);
            match(input,KW_PARTITION,FOLLOW_KW_PARTITION_in_partitionSpec7924); 
            stream_KW_PARTITION.add(KW_PARTITION498);

            LPAREN499=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_partitionSpec7931); 
            stream_LPAREN.add(LPAREN499);

            pushFollow(FOLLOW_partitionVal_in_partitionSpec7933);
            partitionVal500=partitionVal();
            _fsp--;

            stream_partitionVal.add(partitionVal500.getTree());
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1153:26: ( COMMA partitionVal )*
            loop146:
            do {
                int alt146=2;
                int LA146_0 = input.LA(1);

                if ( (LA146_0==COMMA) ) {
                    alt146=1;
                }


                switch (alt146) {
            	case 1 :
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1153:27: COMMA partitionVal
            	    {
            	    COMMA501=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_partitionSpec7936); 
            	    stream_COMMA.add(COMMA501);

            	    pushFollow(FOLLOW_partitionVal_in_partitionSpec7939);
            	    partitionVal502=partitionVal();
            	    _fsp--;

            	    stream_partitionVal.add(partitionVal502.getTree());

            	    }
            	    break;

            	default :
            	    break loop146;
                }
            } while (true);

            RPAREN503=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_partitionSpec7944); 
            stream_RPAREN.add(RPAREN503);


            // AST REWRITE
            // elements: partitionVal
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1153:57: -> ^( TOK_PARTSPEC ( partitionVal )+ )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1153:60: ^( TOK_PARTSPEC ( partitionVal )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_PARTSPEC, "TOK_PARTSPEC"), root_1);

                if ( !(stream_partitionVal.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_partitionVal.hasNext() ) {
                    adaptor.addChild(root_1, stream_partitionVal.next());

                }
                stream_partitionVal.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end partitionSpec

    public static class partitionVal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start partitionVal
    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1156:1: partitionVal : Identifier EQUAL constant -> ^( TOK_PARTVAL Identifier constant ) ;
    public final partitionVal_return partitionVal() throws RecognitionException {
        partitionVal_return retval = new partitionVal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier504=null;
        Token EQUAL505=null;
        constant_return constant506 = null;


        CommonTree Identifier504_tree=null;
        CommonTree EQUAL505_tree=null;
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_constant=new RewriteRuleSubtreeStream(adaptor,"rule constant");
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1157:5: ( Identifier EQUAL constant -> ^( TOK_PARTVAL Identifier constant ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1158:5: Identifier EQUAL constant
            {
            Identifier504=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_partitionVal7975); 
            stream_Identifier.add(Identifier504);

            EQUAL505=(Token)input.LT(1);
            match(input,EQUAL,FOLLOW_EQUAL_in_partitionVal7977); 
            stream_EQUAL.add(EQUAL505);

            pushFollow(FOLLOW_constant_in_partitionVal7979);
            constant506=constant();
            _fsp--;

            stream_constant.add(constant506.getTree());

            // AST REWRITE
            // elements: Identifier, constant
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1158:31: -> ^( TOK_PARTVAL Identifier constant )
            {
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1158:34: ^( TOK_PARTVAL Identifier constant )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(TOK_PARTVAL, "TOK_PARTVAL"), root_1);

                adaptor.addChild(root_1, stream_Identifier.next());
                adaptor.addChild(root_1, stream_constant.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
         reportError(e);
          throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end partitionVal


 

    public static final BitSet FOLLOW_explainStatement_in_statement460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_statement462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_execStatement_in_statement467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_statement469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_EXPLAIN_in_explainStatement490 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00011400030400C0L,0x00000A0480000010L});
    public static final BitSet FOLLOW_KW_EXTENDED_in_explainStatement495 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001140003040080L,0x00000A0480000010L});
    public static final BitSet FOLLOW_execStatement_in_explainStatement499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryStatementExpression_in_execStatement537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loadStatement_in_execStatement545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ddlStatement_in_execStatement553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_LOAD_in_loadStatement580 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KW_DATA_in_loadStatement582 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_KW_LOCAL_in_loadStatement587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_KW_INPATH_in_loadStatement591 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_StringLiteral_in_loadStatement596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_KW_OVERWRITE_in_loadStatement602 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_KW_INTO_in_loadStatement606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_KW_TABLE_in_loadStatement608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_tabName_in_loadStatement613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createStatement_in_ddlStatement666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropStatement_in_ddlStatement674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatement_in_ddlStatement682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_descStatement_in_ddlStatement690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showStatement_in_ddlStatement698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_metastoreCheck_in_ddlStatement706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createFunctionStatement_in_ddlStatement714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropFunctionStatement_in_ddlStatement722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IF_in_ifNotExists749 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_KW_NOT_in_ifNotExists751 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_KW_EXISTS_in_ifNotExists753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CREATE_in_createStatement790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000084000L});
    public static final BitSet FOLLOW_KW_EXTERNAL_in_createStatement795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_KW_TABLE_in_createStatement799 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000108000L});
    public static final BitSet FOLLOW_ifNotExists_in_createStatement801 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_Identifier_in_createStatement806 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0858000080600000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KW_LIKE_in_createStatement818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_Identifier_in_createStatement822 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_LPAREN_in_createStatement827 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_columnNameTypeList_in_createStatement829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_RPAREN_in_createStatement831 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0858000080000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_tableComment_in_createStatement835 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0850000080000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_tablePartition_in_createStatement838 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0840000080000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_tableBuckets_in_createStatement841 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0800000080000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_tableRowFormat_in_createStatement844 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000080000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_tableFileFormat_in_createStatement847 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_tableLocation_in_createStatement852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_DROP_in_dropStatement929 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_KW_TABLE_in_dropStatement931 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_Identifier_in_dropStatement933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ALTER_in_alterStatement969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_KW_TABLE_in_alterStatement972 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_alterStatementSuffix_in_alterStatement975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixRename_in_alterStatementSuffix1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixAddCol_in_alterStatementSuffix1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixDropPartitions_in_alterStatementSuffix1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixAddPartitions_in_alterStatementSuffix1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixProperties_in_alterStatementSuffix1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixSerdeProperties_in_alterStatementSuffix1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_alterStatementSuffixRename1071 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_KW_RENAME_in_alterStatementSuffixRename1073 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_KW_TO_in_alterStatementSuffixRename1075 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_Identifier_in_alterStatementSuffixRename1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_alterStatementSuffixAddCol1123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_KW_ADD_in_alterStatementSuffixAddCol1128 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_KW_REPLACE_in_alterStatementSuffixAddCol1134 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_KW_COLUMNS_in_alterStatementSuffixAddCol1137 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_LPAREN_in_alterStatementSuffixAddCol1139 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_columnNameTypeList_in_alterStatementSuffixAddCol1141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_RPAREN_in_alterStatementSuffixAddCol1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_alterStatementSuffixAddPartitions1216 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_KW_ADD_in_alterStatementSuffixAddPartitions1218 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_partitionSpec_in_alterStatementSuffixAddPartitions1220 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000080000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_partitionLocation_in_alterStatementSuffixAddPartitions1222 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_partitionSpec_in_alterStatementSuffixAddPartitions1226 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000080000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_partitionLocation_in_alterStatementSuffixAddPartitions1228 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_KW_LOCATION_in_partitionLocation1284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_StringLiteral_in_partitionLocation1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_alterStatementSuffixDropPartitions1324 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_KW_DROP_in_alterStatementSuffixDropPartitions1326 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_partitionSpec_in_alterStatementSuffixDropPartitions1328 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_COMMA_in_alterStatementSuffixDropPartitions1331 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_partitionSpec_in_alterStatementSuffixDropPartitions1333 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_Identifier_in_alterStatementSuffixProperties1379 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_KW_SET_in_alterStatementSuffixProperties1381 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_KW_PROPERTIES_in_alterStatementSuffixProperties1383 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_tableProperties_in_alterStatementSuffixProperties1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_alterStatementSuffixSerdeProperties1429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_KW_SET_in_alterStatementSuffixSerdeProperties1431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_KW_SERDE_in_alterStatementSuffixSerdeProperties1433 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_StringLiteral_in_alterStatementSuffixSerdeProperties1437 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_KW_WITH_in_alterStatementSuffixSerdeProperties1440 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_KW_SERDEPROPERTIES_in_alterStatementSuffixSerdeProperties1442 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_tableProperties_in_alterStatementSuffixSerdeProperties1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_alterStatementSuffixSerdeProperties1475 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_KW_SET_in_alterStatementSuffixSerdeProperties1477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_KW_SERDEPROPERTIES_in_alterStatementSuffixSerdeProperties1479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_tableProperties_in_alterStatementSuffixSerdeProperties1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_tabTypeExpr1523 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_DOT_in_tabTypeExpr1526 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000038000100000L});
    public static final BitSet FOLLOW_set_in_tabTypeExpr1529 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_tabTypeExpr_in_partTypeExpr1575 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_partitionSpec_in_partTypeExpr1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_DESCRIBE_in_descStatement1616 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100040L});
    public static final BitSet FOLLOW_KW_EXTENDED_in_descStatement1621 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_partTypeExpr_in_descStatement1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_DESCRIBE_in_descStatement1650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_KW_FUNCTION_in_descStatement1652 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100040L});
    public static final BitSet FOLLOW_KW_EXTENDED_in_descStatement1654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_Identifier_in_descStatement1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SHOW_in_showStatement1696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_KW_TABLES_in_showStatement1698 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100800L});
    public static final BitSet FOLLOW_showStmtIdentifier_in_showStatement1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SHOW_in_showStatement1719 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_KW_FUNCTIONS_in_showStatement1721 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100800L});
    public static final BitSet FOLLOW_showStmtIdentifier_in_showStatement1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SHOW_in_showStatement1742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_KW_PARTITIONS_in_showStatement1744 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_Identifier_in_showStatement1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_MSCK_in_metastoreCheck1785 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_KW_TABLE_in_metastoreCheck1788 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_Identifier_in_metastoreCheck1792 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_partitionSpec_in_metastoreCheck1794 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_COMMA_in_metastoreCheck1798 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_partitionSpec_in_metastoreCheck1800 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_KW_CREATE_in_createFunctionStatement1859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_KW_TEMPORARY_in_createFunctionStatement1861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_KW_FUNCTION_in_createFunctionStatement1863 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_Identifier_in_createFunctionStatement1865 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_KW_AS_in_createFunctionStatement1867 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_StringLiteral_in_createFunctionStatement1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_DROP_in_dropFunctionStatement1910 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_KW_TEMPORARY_in_dropFunctionStatement1912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_KW_FUNCTION_in_dropFunctionStatement1914 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_Identifier_in_dropFunctionStatement1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_showStmtIdentifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_COMMENT_in_tableComment1996 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_StringLiteral_in_tableComment2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_PARTITIONED_in_tablePartition2037 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_KW_BY_in_tablePartition2039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_LPAREN_in_tablePartition2041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_columnNameTypeList_in_tablePartition2043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_RPAREN_in_tablePartition2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CLUSTERED_in_tableBuckets2091 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_KW_BY_in_tableBuckets2093 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_LPAREN_in_tableBuckets2095 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_columnNameList_in_tableBuckets2099 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_RPAREN_in_tableBuckets2101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000002000L});
    public static final BitSet FOLLOW_KW_SORTED_in_tableBuckets2104 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_KW_BY_in_tableBuckets2106 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_LPAREN_in_tableBuckets2108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_columnNameOrderList_in_tableBuckets2112 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_RPAREN_in_tableBuckets2114 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_KW_INTO_in_tableBuckets2118 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_Number_in_tableBuckets2122 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_KW_BUCKETS_in_tableBuckets2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_serdeFormat_in_serde2172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_serdePropertiesFormat_in_serde2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_RECORDREADER_in_recordReader2237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_StringLiteral_in_recordReader2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ROW_in_serdeFormat2288 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_KW_FORMAT_in_serdeFormat2290 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_KW_SERDE_in_serdeFormat2292 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_StringLiteral_in_serdeFormat2296 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_KW_WITH_in_serdeFormat2299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_KW_SERDEPROPERTIES_in_serdeFormat2301 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_tableProperties_in_serdeFormat2305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ROW_in_serdePropertiesFormat2357 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_KW_FORMAT_in_serdePropertiesFormat2359 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_KW_DELIMITED_in_serdePropertiesFormat2361 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x8000000000000000L,0x0000000000000054L});
    public static final BitSet FOLLOW_tableRowFormatFieldIdentifier_in_serdePropertiesFormat2363 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000054L});
    public static final BitSet FOLLOW_tableRowFormatCollItemsIdentifier_in_serdePropertiesFormat2366 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000050L});
    public static final BitSet FOLLOW_tableRowFormatMapKeysIdentifier_in_serdePropertiesFormat2369 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_tableRowFormatLinesIdentifier_in_serdePropertiesFormat2372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_serdePropertiesFormat_in_tableRowFormat2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_serdeFormat_in_tableRowFormat2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_tableProperties2494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_propertiesList_in_tableProperties2496 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_RPAREN_in_tableProperties2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyValueProperty_in_propertiesList2539 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_COMMA_in_propertiesList2542 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_keyValueProperty_in_propertiesList2544 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_StringLiteral_in_keyValueProperty2590 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_EQUAL_in_keyValueProperty2592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_StringLiteral_in_keyValueProperty2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FIELDS_in_tableRowFormatFieldIdentifier2641 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KW_TERMINATED_in_tableRowFormatFieldIdentifier2643 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_KW_BY_in_tableRowFormatFieldIdentifier2645 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_StringLiteral_in_tableRowFormatFieldIdentifier2649 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ESCAPED_in_tableRowFormatFieldIdentifier2652 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_KW_BY_in_tableRowFormatFieldIdentifier2654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_StringLiteral_in_tableRowFormatFieldIdentifier2658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_COLLECTION_in_tableRowFormatCollItemsIdentifier2710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_KW_ITEMS_in_tableRowFormatCollItemsIdentifier2712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KW_TERMINATED_in_tableRowFormatCollItemsIdentifier2714 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_KW_BY_in_tableRowFormatCollItemsIdentifier2716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_StringLiteral_in_tableRowFormatCollItemsIdentifier2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_MAP_in_tableRowFormatMapKeysIdentifier2766 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KW_KEYS_in_tableRowFormatMapKeysIdentifier2768 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KW_TERMINATED_in_tableRowFormatMapKeysIdentifier2770 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_KW_BY_in_tableRowFormatMapKeysIdentifier2772 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_StringLiteral_in_tableRowFormatMapKeysIdentifier2776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_LINES_in_tableRowFormatLinesIdentifier2822 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KW_TERMINATED_in_tableRowFormatLinesIdentifier2824 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_KW_BY_in_tableRowFormatLinesIdentifier2826 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_StringLiteral_in_tableRowFormatLinesIdentifier2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STORED_in_tableFileFormat2876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_KW_AS_in_tableFileFormat2878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KW_SEQUENCEFILE_in_tableFileFormat2880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STORED_in_tableFileFormat2895 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_KW_AS_in_tableFileFormat2897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_KW_TEXTFILE_in_tableFileFormat2899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STORED_in_tableFileFormat2914 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_KW_AS_in_tableFileFormat2916 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_KW_RCFILE_in_tableFileFormat2918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STORED_in_tableFileFormat2933 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_KW_AS_in_tableFileFormat2935 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_KW_INPUTFORMAT_in_tableFileFormat2937 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_StringLiteral_in_tableFileFormat2941 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_KW_OUTPUTFORMAT_in_tableFileFormat2943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_StringLiteral_in_tableFileFormat2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_LOCATION_in_tableLocation2998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_StringLiteral_in_tableLocation3002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_columnNameType_in_columnNameTypeList3040 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_COMMA_in_columnNameTypeList3043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_columnNameType_in_columnNameTypeList3045 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_columnName_in_columnNameList3083 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_COMMA_in_columnNameList3086 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_columnName_in_columnNameList3088 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_Identifier_in_columnName3132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_columnNameOrder_in_columnNameOrderList3159 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_COMMA_in_columnNameOrderList3162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_columnNameOrder_in_columnNameOrderList3164 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_Identifier_in_columnNameOrder3202 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_KW_ASC_in_columnNameOrder3207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_DESC_in_columnNameOrder3213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_columnRefOrder3286 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_KW_ASC_in_columnRefOrder3291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_DESC_in_columnRefOrder3297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_columnNameType3372 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000007FF8010L});
    public static final BitSet FOLLOW_colType_in_columnNameType3374 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_KW_COMMENT_in_columnNameType3377 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_StringLiteral_in_columnNameType3381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_colType3469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type3486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listType_in_type3494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapType_in_type3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TINYINT_in_primitiveType3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SMALLINT_in_primitiveType3545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_INT_in_primitiveType3565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_BIGINT_in_primitiveType3590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_BOOLEAN_in_primitiveType3612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FLOAT_in_primitiveType3633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_DOUBLE_in_primitiveType3656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_DATE_in_primitiveType3678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_DATETIME_in_primitiveType3702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TIMESTAMP_in_primitiveType3722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STRING_in_primitiveType3741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ARRAY_in_listType3782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_LESSTHAN_in_listType3784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000007FF8010L});
    public static final BitSet FOLLOW_type_in_listType3786 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_GREATERTHAN_in_listType3788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_MAP_in_mapType3825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_LESSTHAN_in_mapType3827 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000003FF8000L});
    public static final BitSet FOLLOW_primitiveType_in_mapType3831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_COMMA_in_mapType3833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000007FF8010L});
    public static final BitSet FOLLOW_type_in_mapType3837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_GREATERTHAN_in_mapType3839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_UNION_in_queryOperator3882 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_KW_ALL_in_queryOperator3884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryStatement_in_queryStatementExpression3908 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_queryOperator_in_queryStatementExpression3911 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000A0480000010L});
    public static final BitSet FOLLOW_queryStatement_in_queryStatementExpression3914 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_fromClause_in_queryStatement3937 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020480000010L});
    public static final BitSet FOLLOW_body_in_queryStatement3947 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000020480000010L});
    public static final BitSet FOLLOW_regular_body_in_queryStatement3969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insertClause_in_regular_body3988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020400000010L});
    public static final BitSet FOLLOW_selectClause_in_regular_body3993 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_fromClause_in_regular_body3998 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0FC0000200000000L});
    public static final BitSet FOLLOW_whereClause_in_regular_body4003 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0F80000200000000L});
    public static final BitSet FOLLOW_groupByClause_in_regular_body4009 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0F00000200000000L});
    public static final BitSet FOLLOW_orderByClause_in_regular_body4015 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0E00000200000000L});
    public static final BitSet FOLLOW_clusterByClause_in_regular_body4021 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0C00000200000000L});
    public static final BitSet FOLLOW_distributeByClause_in_regular_body4027 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0800000200000000L});
    public static final BitSet FOLLOW_sortByClause_in_regular_body4033 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_limitClause_in_regular_body4039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectClause_in_regular_body4129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_fromClause_in_regular_body4134 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0FC0000200000000L});
    public static final BitSet FOLLOW_whereClause_in_regular_body4139 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0F80000200000000L});
    public static final BitSet FOLLOW_groupByClause_in_regular_body4145 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0F00000200000000L});
    public static final BitSet FOLLOW_orderByClause_in_regular_body4151 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0E00000200000000L});
    public static final BitSet FOLLOW_clusterByClause_in_regular_body4157 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0C00000200000000L});
    public static final BitSet FOLLOW_distributeByClause_in_regular_body4163 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0800000200000000L});
    public static final BitSet FOLLOW_sortByClause_in_regular_body4169 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_limitClause_in_regular_body4175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insertClause_in_body4282 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020400000010L});
    public static final BitSet FOLLOW_selectClause_in_body4287 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0FC0000200000000L});
    public static final BitSet FOLLOW_whereClause_in_body4292 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0F80000200000000L});
    public static final BitSet FOLLOW_groupByClause_in_body4298 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0F00000200000000L});
    public static final BitSet FOLLOW_orderByClause_in_body4304 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0E00000200000000L});
    public static final BitSet FOLLOW_clusterByClause_in_body4310 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0C00000200000000L});
    public static final BitSet FOLLOW_distributeByClause_in_body4316 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0800000200000000L});
    public static final BitSet FOLLOW_sortByClause_in_body4322 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_limitClause_in_body4328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectClause_in_body4413 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0FC0000200000000L});
    public static final BitSet FOLLOW_whereClause_in_body4418 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0F80000200000000L});
    public static final BitSet FOLLOW_groupByClause_in_body4424 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0F00000200000000L});
    public static final BitSet FOLLOW_orderByClause_in_body4430 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0E00000200000000L});
    public static final BitSet FOLLOW_clusterByClause_in_body4436 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0C00000200000000L});
    public static final BitSet FOLLOW_distributeByClause_in_body4442 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0800000200000000L});
    public static final BitSet FOLLOW_sortByClause_in_body4448 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_limitClause_in_body4454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_INSERT_in_insertClause4564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_KW_OVERWRITE_in_insertClause4566 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004200L,0x0000000100000000L});
    public static final BitSet FOLLOW_destination_in_insertClause4568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_LOCAL_in_destination4606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_KW_DIRECTORY_in_destination4608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_StringLiteral_in_destination4610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_DIRECTORY_in_destination4625 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_StringLiteral_in_destination4627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TABLE_in_destination4642 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_tabName_in_destination4644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_LIMIT_in_limitClause4678 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_Number_in_limitClause4682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SELECT_in_selectClause4723 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000518800L,0x3000007840000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_KW_ALL_in_selectClause4726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000518800L,0x3000007000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_KW_DISTINCT_in_selectClause4732 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000518800L,0x3000007000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_selectList_in_selectClause4740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_trfmClause_in_selectClause4802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hintClause_in_selectList4846 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000518800L,0x3000006000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_selectItem_in_selectList4849 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_COMMA_in_selectList4853 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000518800L,0x3000006000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_selectItem_in_selectList4856 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_DIVIDE_in_hintClause4898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_STAR_in_hintClause4900 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_PLUS_in_hintClause4902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_hintList_in_hintClause4904 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_STAR_in_hintClause4906 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_DIVIDE_in_hintClause4908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hintItem_in_hintList4947 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_COMMA_in_hintList4950 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_hintItem_in_hintList4952 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_hintName_in_hintItem4990 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_LPAREN_in_hintItem4993 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_hintArgs_in_hintItem4995 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_RPAREN_in_hintItem4997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_MAPJOIN_in_hintName5040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hintArgName_in_hintArgs5075 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_COMMA_in_hintArgs5078 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_hintArgName_in_hintArgs5080 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_Identifier_in_hintArgName5122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectExpression_in_selectItem5155 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0004000000100000L});
    public static final BitSet FOLLOW_KW_AS_in_selectItem5159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_Identifier_in_selectItem5162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SELECT_in_trfmClause5209 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_KW_TRANSFORM_in_trfmClause5211 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_LPAREN_in_trfmClause5213 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000518800L,0x3000006000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_selectExpressionList_in_trfmClause5215 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_RPAREN_in_trfmClause5217 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_KW_MAP_in_trfmClause5227 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000518800L,0x3000006000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_selectExpressionList_in_trfmClause5232 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_KW_REDUCE_in_trfmClause5242 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000518800L,0x3000006000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_selectExpressionList_in_trfmClause5244 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_serde_in_trfmClause5254 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_KW_USING_in_trfmClause5261 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_StringLiteral_in_trfmClause5263 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0C04000000000000L});
    public static final BitSet FOLLOW_KW_AS_in_trfmClause5272 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000500000L});
    public static final BitSet FOLLOW_LPAREN_in_trfmClause5276 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_aliasList_in_trfmClause5279 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_columnNameTypeList_in_trfmClause5283 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_RPAREN_in_trfmClause5286 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_aliasList_in_trfmClause5292 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_columnNameTypeList_in_trfmClause5296 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_serde_in_trfmClause5309 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_recordReader_in_trfmClause5313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_selectExpression5377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableAllColumns_in_selectExpression5381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectExpression_in_selectExpressionList5412 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_COMMA_in_selectExpressionList5415 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000518800L,0x3000006000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_selectExpression_in_selectExpressionList5417 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_STAR_in_tableAllColumns5452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_tableAllColumns5466 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_DOT_in_tableAllColumns5468 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_STAR_in_tableAllColumns5470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_tableOrColumn5514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList5553 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_COMMA_in_expressionList5556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000518800L,0x3000004000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_expression_in_expressionList5558 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_Identifier_in_aliasList5600 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_COMMA_in_aliasList5603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_Identifier_in_aliasList5605 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_KW_FROM_in_fromClause5652 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000500000L});
    public static final BitSet FOLLOW_joinSource_in_fromClause5654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fromSource_in_joinSource5693 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0003600000000000L});
    public static final BitSet FOLLOW_joinToken_in_joinSource5701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000500000L});
    public static final BitSet FOLLOW_fromSource_in_joinSource5704 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0003700000000000L});
    public static final BitSet FOLLOW_KW_ON_in_joinSource5707 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000518800L,0x3000004000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_expression_in_joinSource5710 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0003600000000000L});
    public static final BitSet FOLLOW_KW_JOIN_in_joinToken5748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_LEFT_in_joinToken5780 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_KW_OUTER_in_joinToken5782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_KW_JOIN_in_joinToken5784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_RIGHT_in_joinToken5799 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_KW_OUTER_in_joinToken5801 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_KW_JOIN_in_joinToken5803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FULL_in_joinToken5817 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_KW_OUTER_in_joinToken5819 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_KW_JOIN_in_joinToken5821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableSource_in_fromSource5860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subQuerySource_in_fromSource5864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TABLESAMPLE_in_tableSample5900 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_LPAREN_in_tableSample5902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_KW_BUCKET_in_tableSample5904 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_Number_in_tableSample5909 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_KW_OUT_in_tableSample5912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_KW_OF_in_tableSample5914 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_Number_in_tableSample5919 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L,0x0000100000000000L});
    public static final BitSet FOLLOW_KW_ON_in_tableSample5923 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000518800L,0x3000004000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_expression_in_tableSample5927 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100800000L});
    public static final BitSet FOLLOW_COMMA_in_tableSample5930 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000518800L,0x3000004000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_expression_in_tableSample5934 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100800000L});
    public static final BitSet FOLLOW_RPAREN_in_tableSample5940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_tableSource5989 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L,0x0004000000000000L});
    public static final BitSet FOLLOW_tableSample_in_tableSource5994 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_Identifier_in_tableSource6001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_subQuerySource6053 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000A0480000010L});
    public static final BitSet FOLLOW_queryStatementExpression_in_subQuerySource6055 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_RPAREN_in_subQuerySource6057 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_Identifier_in_subQuerySource6059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_WHERE_in_whereClause6110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000518800L,0x3000004000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_searchCondition_in_whereClause6112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_searchCondition6151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_GROUP_in_groupByClause6185 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_KW_BY_in_groupByClause6187 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000518800L,0x3000004000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_groupByExpression_in_groupByClause6193 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_COMMA_in_groupByClause6201 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000518800L,0x3000004000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_groupByExpression_in_groupByClause6203 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_expression_in_groupByExpression6250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ORDER_in_orderByClause6282 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_KW_BY_in_orderByClause6284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000518800L,0x3000004000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_columnRefOrder_in_orderByClause6290 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_COMMA_in_orderByClause6298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000518800L,0x3000004000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_columnRefOrder_in_orderByClause6300 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_KW_CLUSTER_in_clusterByClause6342 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_KW_BY_in_clusterByClause6344 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000518800L,0x3000004000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_expression_in_clusterByClause6350 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_COMMA_in_clusterByClause6358 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000518800L,0x3000004000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_expression_in_clusterByClause6360 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_KW_DISTRIBUTE_in_distributeByClause6403 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_KW_BY_in_distributeByClause6405 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000518800L,0x3000004000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_expression_in_distributeByClause6411 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_COMMA_in_distributeByClause6414 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000518800L,0x3000004000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_expression_in_distributeByClause6416 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_KW_SORT_in_sortByClause6458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_KW_BY_in_sortByClause6460 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000518800L,0x3000004000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_columnRefOrder_in_sortByClause6466 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_COMMA_in_sortByClause6474 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000518800L,0x3000004000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_columnRefOrder_in_sortByClause6476 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_functionName_in_function6519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_LPAREN_in_function6525 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000D18800L,0x3000004800000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_KW_DISTINCT_in_function6536 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000D18800L,0x3000004000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_expression_in_function6547 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100800000L});
    public static final BitSet FOLLOW_COMMA_in_function6550 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000518800L,0x3000004000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_expression_in_function6552 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100800000L});
    public static final BitSet FOLLOW_RPAREN_in_function6562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_functionName0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CAST_in_castExpression6686 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_LPAREN_in_castExpression6692 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000518800L,0x3000004000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_expression_in_castExpression6705 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_KW_AS_in_castExpression6717 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000003FF8000L});
    public static final BitSet FOLLOW_primitiveType_in_castExpression6729 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_RPAREN_in_castExpression6735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CASE_in_caseExpression6780 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000518800L,0x3000004000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_expression_in_caseExpression6782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_KW_WHEN_in_caseExpression6789 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000518800L,0x3000004000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_expression_in_caseExpression6791 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_KW_THEN_in_caseExpression6793 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000518800L,0x3000004000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_expression_in_caseExpression6795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_KW_ELSE_in_caseExpression6804 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000518800L,0x3000004000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_expression_in_caseExpression6806 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KW_END_in_caseExpression6814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CASE_in_whenExpression6860 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_KW_WHEN_in_whenExpression6869 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000518800L,0x3000004000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_expression_in_whenExpression6871 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_KW_THEN_in_whenExpression6873 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000518800L,0x3000004000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_expression_in_whenExpression6875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_KW_ELSE_in_whenExpression6884 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000518800L,0x3000004000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_expression_in_whenExpression6886 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KW_END_in_whenExpression6894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Number_in_constant6940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_constant6948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_charSetStringLiteral_in_constant6956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanValue_in_constant6964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CharSetName_in_charSetStringLiteral6998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_CharSetLiteral_in_charSetStringLiteral7002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precedenceOrExpression_in_expression7045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_NULL_in_atomExpression7066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_atomExpression7078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_atomExpression7086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpression_in_atomExpression7094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_caseExpression_in_atomExpression7102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whenExpression_in_atomExpression7110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableOrColumn_in_atomExpression7118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atomExpression7126 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000518800L,0x3000004000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_expression_in_atomExpression7129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_RPAREN_in_atomExpression7131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomExpression_in_precedenceFieldExpression7154 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000004000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_LSQUARE_in_precedenceFieldExpression7158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000518800L,0x3000004000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_expression_in_precedenceFieldExpression7161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RSQUARE_in_precedenceFieldExpression7163 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000004000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_DOT_in_precedenceFieldExpression7170 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_Identifier_in_precedenceFieldExpression7173 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000004000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_set_in_precedenceUnaryOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_NULL_in_nullCondition7226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_NOT_in_nullCondition7240 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_KW_NULL_in_nullCondition7242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precedenceUnaryOperator_in_precedenceUnaryPrefixExpression7270 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000508800L,0x3000004000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_precedenceFieldExpression_in_precedenceUnaryPrefixExpression7275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precedenceUnaryPrefixExpression_in_precedenceUnarySuffixExpression7292 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_KW_IS_in_precedenceUnarySuffixExpression7297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_nullCondition_in_precedenceUnarySuffixExpression7299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BITWISEXOR_in_precedenceBitwiseXorOperator7347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precedenceUnarySuffixExpression_in_precedenceBitwiseXorExpression7368 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_precedenceBitwiseXorOperator_in_precedenceBitwiseXorExpression7371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000508800L,0x3000004000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_precedenceUnarySuffixExpression_in_precedenceBitwiseXorExpression7374 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_set_in_precedenceStarOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precedenceBitwiseXorExpression_in_precedenceStarExpression7432 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000003000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_precedenceStarOperator_in_precedenceStarExpression7435 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000508800L,0x3000004000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_precedenceBitwiseXorExpression_in_precedenceStarExpression7438 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000003000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_set_in_precedencePlusOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precedenceStarExpression_in_precedencePlusExpression7487 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_precedencePlusOperator_in_precedencePlusExpression7490 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000508800L,0x3000004000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_precedenceStarExpression_in_precedencePlusExpression7493 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_AMPERSAND_in_precedenceAmpersandOperator7517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precedencePlusExpression_in_precedenceAmpersandExpression7538 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_precedenceAmpersandOperator_in_precedenceAmpersandExpression7541 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000508800L,0x3000004000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_precedencePlusExpression_in_precedenceAmpersandExpression7544 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_BITWISEOR_in_precedenceBitwiseOrOperator7568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precedenceAmpersandExpression_in_precedenceBitwiseOrExpression7589 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_precedenceBitwiseOrOperator_in_precedenceBitwiseOrExpression7592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000508800L,0x3000004000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_precedenceAmpersandExpression_in_precedenceBitwiseOrExpression7595 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_set_in_precedenceEqualOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression7676 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x4000000000200000L,0x0000000018000000L,0x00000000000F8000L});
    public static final BitSet FOLLOW_precedenceEqualOperator_in_precedenceEqualExpression7679 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000508800L,0x3000004000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression7682 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x4000000000200000L,0x0000000018000000L,0x00000000000F8000L});
    public static final BitSet FOLLOW_KW_NOT_in_precedenceNotOperator7706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precedenceNotOperator_in_precedenceNotExpression7728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000518800L,0x3000004000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_precedenceEqualExpression_in_precedenceNotExpression7733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_AND_in_precedenceAndOperator7755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precedenceNotExpression_in_precedenceAndExpression7776 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_precedenceAndOperator_in_precedenceAndExpression7779 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000518800L,0x3000004000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_precedenceNotExpression_in_precedenceAndExpression7782 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_KW_OR_in_precedenceOrOperator7806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precedenceAndExpression_in_precedenceOrExpression7827 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_precedenceOrOperator_in_precedenceOrExpression7830 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000518800L,0x3000004000000000L,0x0000000000C00194L});
    public static final BitSet FOLLOW_precedenceAndExpression_in_precedenceOrExpression7833 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_KW_TRUE_in_booleanValue7857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FALSE_in_booleanValue7862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_tabName7882 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_partitionSpec_in_tabName7884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_PARTITION_in_partitionSpec7924 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_LPAREN_in_partitionSpec7931 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_partitionVal_in_partitionSpec7933 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100800000L});
    public static final BitSet FOLLOW_COMMA_in_partitionSpec7936 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_partitionVal_in_partitionSpec7939 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100800000L});
    public static final BitSet FOLLOW_RPAREN_in_partitionSpec7944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_partitionVal7975 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_EQUAL_in_partitionVal7977 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000800L,0x0000000000000000L,0x0000000000C00004L});
    public static final BitSet FOLLOW_constant_in_partitionVal7979 = new BitSet(new long[]{0x0000000000000002L});

}