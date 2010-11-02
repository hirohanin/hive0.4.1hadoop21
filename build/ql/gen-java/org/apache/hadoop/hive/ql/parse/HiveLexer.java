// $ANTLR 3.0.1 /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g 2010-09-20 11:50:06
package org.apache.hadoop.hive.ql.parse;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class HiveLexer extends Lexer {
    public static final int KW_ALTER=153;
    public static final int TOK_FUNCTIONDI=21;
    public static final int KW_PARTITIONED=180;
    public static final int TOK_TABREF=15;
    public static final int KW_LIKE=149;
    public static final int STAR=229;
    public static final int KW_JOIN=237;
    public static final int LSQUARE=261;
    public static final int KW_PLUS=286;
    public static final int KW_ITEMS=195;
    public static final int MOD=267;
    public static final int KW_ROW=187;
    public static final int TOK_OP_EQ=23;
    public static final int KW_FORMAT=188;
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
    public static final int TOK_TABCOL=95;
    public static final int SEMICOLON=319;
    public static final int KW_FETCH=288;
    public static final int KW_TRANSFORM=232;
    public static final int KW_DELETE=285;
    public static final int KW_MATERIALIZED=293;
    public static final int TOK_WHERE=22;
    public static final int TOK_TBLSEQUENCEFILE=104;
    public static final int TOK_SELEXPR=8;
    public static final int KW_SELECT=226;
    public static final int WS=329;
    public static final int TOK_TABLEROWFORMATFIELD=100;
    public static final int KW_REPLACE=157;
    public static final int TOK_MAP=76;
    public static final int KW_LOCK=300;
    public static final int KW_BUCKET=243;
    public static final int KW_LOAD=135;
    public static final int KW_GROUP=247;
    public static final int KW_TO=155;
    public static final int KW_BY=181;
    public static final int TOK_UNION=55;
    public static final int TOK_SELECT=6;
    public static final int TOK_OP_LIKE=41;
    public static final int KW_LOCAL=137;
    public static final int KW_DISTRIBUTE=250;
    public static final int KW_NOT=144;
    public static final int TOK_TABLEPROPLIST=121;
    public static final int TOK_TMP_FILE=112;
    public static final int KW_ELSE=256;
    public static final int KW_UTC=282;
    public static final int KW_INPATH=138;
    public static final int KW_OUT=244;
    public static final int KW_LINES=198;
    public static final int KW_AND=276;
    public static final int TOK_SUBQUERY=16;
    public static final int KW_BOOLEAN=211;
    public static final int CharSetName=258;
    public static final int KW_CLUSTERSTATUS=281;
    public static final int TOK_DOUBLE=70;
    public static final int TOK_DROPFUNCTION=117;
    public static final int KW_REGEXP=275;
    public static final int TOK_DATETIME=72;
    public static final int TOK_DESCTABLE=79;
    public static final int KW_DIRECTORY=224;
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
    public static final int Tokens=331;
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
    public static final int TOK_TABLEROWFORMATMAPKEYS=102;
    public static final int KW_WHERE=246;
    public static final int Identifier=148;
    public static final int KW_EXISTS=145;
    public static final int TOK_OP_DIV=29;
    public static final int NOTEQUAL=271;
    public static final int TOK_PARTVAL=12;
    public static final int TOK_OP_NE=24;
    public static final int TOK_TABLEBUCKETS=98;
    public static final int KW_RLIKE=274;
    public static final int TOK_DATE=71;
    public static final int TOK_OP_NOT=40;
    public static final int KW_SCHEMAS=295;
    public static final int COMMENT=330;
    public static final int KW_OVERWRITE=140;
    public static final int TOK_TABLEROWFORMAT=99;
    public static final int KW_DISTINCT=227;
    public static final int GREATERTHAN=220;
    public static final int TOK_SHOWPARTITIONS=92;
    public static final int TOK_ISNOTNULL=63;
    public static final int KW_FUNCTION=171;
    public static final int KW_CLUSTER=249;
    public static final int TOK_EXPLIST=48;
    public static final int TOK_ALIASLIST=49;
    public static final int TOK_DISTRIBUTEBY=53;
    public static final int TOK_LIST=75;
    public static final int KW_ESCAPED=193;
    public static final int TOK_TBLRCFILE=106;
    public static final int TOK_INSERT=4;
    public static final int KW_SMALLINT=208;
    public static final int KW_INT=209;
    public static final int TOK_HINT=127;
    public static final int TOK_TABLEPROPERTIES=120;
    public static final int KW_TEXTFILE=201;
    public static final int TOK_USERSCRIPTCOLNAMES=130;
    public static final int TOK_SERDE=45;
    public static final int KW_RENAME=154;
    public static final int KW_KEYS=197;
    public static final int KW_LEFT=238;
    public static final int TOK_SHOWFUNCTIONS=91;
    public static final int KW_VIEW=290;
    public static final int KW_DOUBLE=213;
    public static final int TOK_TABLESERIALIZER=119;
    public static final int TOK_LEFTOUTERJOIN=57;
    public static final int TOK_ALTERTABLE_REPLACECOLS=83;
    public static final int KW_SORTED=183;
    public static final int KW_MAP=196;
    public static final int KW_BINARY=313;
    public static final int KW_ELEM_TYPE=167;
    public static final int TOK_STRING=74;
    public static final int KW_END=257;
    public static final int KW_FULL=241;
    public static final int TOK_CLUSTERBY=52;
    public static final int TOK_FLOAT=69;
    public static final int TOK_SERDENAME=46;
    public static final int TOK_SORTBY=54;
    public static final int KW_TABLES=173;
    public static final int TOK_PARTITIONLOCATION=110;
    public static final int LESSTHANOREQUALTO=272;
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
    public static final int KW_DESCRIBE=170;
    public static final int TOK_OP_MUL=32;
    public static final int TOK_CREATETABLE=77;
    public static final int KW_DESC=206;
    public static final int KW_RCFILE=202;
    public static final int KW_CREATE=146;
    public static final int Exponent=327;
    public static final int KW_MAPJOIN=231;
    public static final int KW_TRUE=278;
    public static final int TOK_ALTERTABLE_PROPERTIES=88;
    public static final int KW_LIMIT=225;
    public static final int KW_WITH=164;
    public static final int KW_BIGINT=210;
    public static final int TOK_INT=66;
    public static final int KW_MINUS=287;
    public static final int TOK_TABLEFILEFORMAT=107;
    public static final int KW_RIGHT=240;
    public static final int TOK_ORDERBY=51;
    public static final int KW_GRANT=296;
    public static final int Number=184;
    public static final int KW_EXTERNAL=147;
    public static final int COMMA=160;
    public static final int KW_WHILE=304;
    public static final int EQUAL=190;
    public static final int TOK_JOIN=56;
    public static final int TILDE=264;
    public static final int KW_RECORDREADER=186;
    public static final int TOK_DESTINATION=17;
    public static final int DOT=166;
    public static final int TOK_OP_BITAND=34;
    public static final int KW_UNDO=299;
    public static final int TOK_TAB=10;
    public static final int KW_UNION=221;
    public static final int KW_TEMPORARY=177;
    public static final int KW_CAST=252;
    public static final int KW_FALSE=279;
    public static final int TOK_EXPLAIN=118;
    public static final int KW_INTERSECT=289;
    public static final int KW_TRIGGER=317;
    public static final int KW_CONTINUE=315;
    public static final int TOK_USERSCRIPTCOLSCHEMA=131;
    public static final int TOK_OP_BITOR=36;
    public static final int RSQUARE=262;
    public static final int TOK_PARTSPEC=11;
    public static final int KW_STORED=199;
    public static final int Digit=326;
    public static final int TOK_BOOLEAN=68;
    public static final int KW_CASE=253;
    public static final int KW_UNSIGNED=303;
    public static final int KW_DATA=136;
    public static final int TOK_LIMIT=123;
    public static final int TOK_TABSORTCOLNAMEASC=113;
    public static final int KW_SHOW=172;
    public static final int TOK_OP_BITNOT=35;
    public static final int TOK_TABCOLLIST=94;
    public static final int KW_DATE=214;
    public static final int TOK_TABTYPE=122;
    public static final int KW_INTO=141;
    public static final int QUESTION=322;
    public static final int TOK_HINTLIST=126;
    public static final int KW_OR=277;
    public static final int TOK_TABLEROWFORMATCOLLITEMS=101;
    public static final int KW_VALUE_TYPE=169;
    public static final int KW_ON=236;
    public static final int KW_AS=178;
    public static final int KW_BEFORE=310;
    public static final int KW_OF=245;
    public static final int KW_KEY_TYPE=168;
    public static final int KW_BETWEEN=311;
    public static final int TOK_OP_SUB=31;
    public static final int TOK_TABLELOCATION=109;
    public static final int TOK_RECORDREADER=132;
    public static final int KW_PROPERTIES=162;
    public HiveLexer() {;} 
    public HiveLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g"; }

    // $ANTLR start KW_TRUE
    public final void mKW_TRUE() throws RecognitionException {
        try {
            int _type = KW_TRUE;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1162:9: ( 'TRUE' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1162:11: 'TRUE'
            {
            match("TRUE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_TRUE

    // $ANTLR start KW_FALSE
    public final void mKW_FALSE() throws RecognitionException {
        try {
            int _type = KW_FALSE;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1163:10: ( 'FALSE' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1163:12: 'FALSE'
            {
            match("FALSE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_FALSE

    // $ANTLR start KW_ALL
    public final void mKW_ALL() throws RecognitionException {
        try {
            int _type = KW_ALL;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1164:8: ( 'ALL' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1164:10: 'ALL'
            {
            match("ALL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ALL

    // $ANTLR start KW_AND
    public final void mKW_AND() throws RecognitionException {
        try {
            int _type = KW_AND;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1165:8: ( 'AND' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1165:10: 'AND'
            {
            match("AND"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_AND

    // $ANTLR start KW_OR
    public final void mKW_OR() throws RecognitionException {
        try {
            int _type = KW_OR;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1166:7: ( 'OR' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1166:9: 'OR'
            {
            match("OR"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_OR

    // $ANTLR start KW_NOT
    public final void mKW_NOT() throws RecognitionException {
        try {
            int _type = KW_NOT;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1167:8: ( 'NOT' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1167:10: 'NOT'
            {
            match("NOT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_NOT

    // $ANTLR start KW_LIKE
    public final void mKW_LIKE() throws RecognitionException {
        try {
            int _type = KW_LIKE;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1168:9: ( 'LIKE' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1168:11: 'LIKE'
            {
            match("LIKE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_LIKE

    // $ANTLR start KW_IF
    public final void mKW_IF() throws RecognitionException {
        try {
            int _type = KW_IF;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1170:7: ( 'IF' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1170:9: 'IF'
            {
            match("IF"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_IF

    // $ANTLR start KW_EXISTS
    public final void mKW_EXISTS() throws RecognitionException {
        try {
            int _type = KW_EXISTS;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1171:11: ( 'EXISTS' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1171:13: 'EXISTS'
            {
            match("EXISTS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_EXISTS

    // $ANTLR start KW_ASC
    public final void mKW_ASC() throws RecognitionException {
        try {
            int _type = KW_ASC;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1173:8: ( 'ASC' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1173:10: 'ASC'
            {
            match("ASC"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ASC

    // $ANTLR start KW_DESC
    public final void mKW_DESC() throws RecognitionException {
        try {
            int _type = KW_DESC;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1174:9: ( 'DESC' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1174:11: 'DESC'
            {
            match("DESC"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DESC

    // $ANTLR start KW_ORDER
    public final void mKW_ORDER() throws RecognitionException {
        try {
            int _type = KW_ORDER;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1175:10: ( 'ORDER' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1175:12: 'ORDER'
            {
            match("ORDER"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ORDER

    // $ANTLR start KW_BY
    public final void mKW_BY() throws RecognitionException {
        try {
            int _type = KW_BY;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1176:7: ( 'BY' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1176:9: 'BY'
            {
            match("BY"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_BY

    // $ANTLR start KW_GROUP
    public final void mKW_GROUP() throws RecognitionException {
        try {
            int _type = KW_GROUP;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1177:10: ( 'GROUP' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1177:12: 'GROUP'
            {
            match("GROUP"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_GROUP

    // $ANTLR start KW_WHERE
    public final void mKW_WHERE() throws RecognitionException {
        try {
            int _type = KW_WHERE;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1178:10: ( 'WHERE' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1178:12: 'WHERE'
            {
            match("WHERE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_WHERE

    // $ANTLR start KW_FROM
    public final void mKW_FROM() throws RecognitionException {
        try {
            int _type = KW_FROM;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1179:9: ( 'FROM' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1179:11: 'FROM'
            {
            match("FROM"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_FROM

    // $ANTLR start KW_AS
    public final void mKW_AS() throws RecognitionException {
        try {
            int _type = KW_AS;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1180:7: ( 'AS' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1180:9: 'AS'
            {
            match("AS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_AS

    // $ANTLR start KW_SELECT
    public final void mKW_SELECT() throws RecognitionException {
        try {
            int _type = KW_SELECT;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1181:11: ( 'SELECT' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1181:13: 'SELECT'
            {
            match("SELECT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SELECT

    // $ANTLR start KW_DISTINCT
    public final void mKW_DISTINCT() throws RecognitionException {
        try {
            int _type = KW_DISTINCT;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1182:13: ( 'DISTINCT' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1182:15: 'DISTINCT'
            {
            match("DISTINCT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DISTINCT

    // $ANTLR start KW_INSERT
    public final void mKW_INSERT() throws RecognitionException {
        try {
            int _type = KW_INSERT;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1183:11: ( 'INSERT' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1183:13: 'INSERT'
            {
            match("INSERT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_INSERT

    // $ANTLR start KW_OVERWRITE
    public final void mKW_OVERWRITE() throws RecognitionException {
        try {
            int _type = KW_OVERWRITE;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1184:14: ( 'OVERWRITE' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1184:16: 'OVERWRITE'
            {
            match("OVERWRITE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_OVERWRITE

    // $ANTLR start KW_OUTER
    public final void mKW_OUTER() throws RecognitionException {
        try {
            int _type = KW_OUTER;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1185:10: ( 'OUTER' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1185:12: 'OUTER'
            {
            match("OUTER"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_OUTER

    // $ANTLR start KW_JOIN
    public final void mKW_JOIN() throws RecognitionException {
        try {
            int _type = KW_JOIN;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1186:9: ( 'JOIN' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1186:11: 'JOIN'
            {
            match("JOIN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_JOIN

    // $ANTLR start KW_LEFT
    public final void mKW_LEFT() throws RecognitionException {
        try {
            int _type = KW_LEFT;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1187:9: ( 'LEFT' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1187:11: 'LEFT'
            {
            match("LEFT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_LEFT

    // $ANTLR start KW_RIGHT
    public final void mKW_RIGHT() throws RecognitionException {
        try {
            int _type = KW_RIGHT;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1188:10: ( 'RIGHT' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1188:12: 'RIGHT'
            {
            match("RIGHT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_RIGHT

    // $ANTLR start KW_FULL
    public final void mKW_FULL() throws RecognitionException {
        try {
            int _type = KW_FULL;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1189:9: ( 'FULL' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1189:11: 'FULL'
            {
            match("FULL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_FULL

    // $ANTLR start KW_ON
    public final void mKW_ON() throws RecognitionException {
        try {
            int _type = KW_ON;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1190:7: ( 'ON' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1190:9: 'ON'
            {
            match("ON"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ON

    // $ANTLR start KW_PARTITION
    public final void mKW_PARTITION() throws RecognitionException {
        try {
            int _type = KW_PARTITION;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1191:14: ( 'PARTITION' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1191:16: 'PARTITION'
            {
            match("PARTITION"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_PARTITION

    // $ANTLR start KW_PARTITIONS
    public final void mKW_PARTITIONS() throws RecognitionException {
        try {
            int _type = KW_PARTITIONS;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1192:15: ( 'PARTITIONS' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1192:17: 'PARTITIONS'
            {
            match("PARTITIONS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_PARTITIONS

    // $ANTLR start KW_TABLE
    public final void mKW_TABLE() throws RecognitionException {
        try {
            int _type = KW_TABLE;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1193:9: ( 'TABLE' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1193:11: 'TABLE'
            {
            match("TABLE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_TABLE

    // $ANTLR start KW_TABLES
    public final void mKW_TABLES() throws RecognitionException {
        try {
            int _type = KW_TABLES;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1194:10: ( 'TABLES' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1194:12: 'TABLES'
            {
            match("TABLES"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_TABLES

    // $ANTLR start KW_FUNCTIONS
    public final void mKW_FUNCTIONS() throws RecognitionException {
        try {
            int _type = KW_FUNCTIONS;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1195:13: ( 'FUNCTIONS' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1195:15: 'FUNCTIONS'
            {
            match("FUNCTIONS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_FUNCTIONS

    // $ANTLR start KW_SHOW
    public final void mKW_SHOW() throws RecognitionException {
        try {
            int _type = KW_SHOW;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1196:8: ( 'SHOW' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1196:10: 'SHOW'
            {
            match("SHOW"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SHOW

    // $ANTLR start KW_MSCK
    public final void mKW_MSCK() throws RecognitionException {
        try {
            int _type = KW_MSCK;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1197:8: ( 'MSCK' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1197:10: 'MSCK'
            {
            match("MSCK"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_MSCK

    // $ANTLR start KW_DIRECTORY
    public final void mKW_DIRECTORY() throws RecognitionException {
        try {
            int _type = KW_DIRECTORY;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1198:13: ( 'DIRECTORY' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1198:15: 'DIRECTORY'
            {
            match("DIRECTORY"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DIRECTORY

    // $ANTLR start KW_LOCAL
    public final void mKW_LOCAL() throws RecognitionException {
        try {
            int _type = KW_LOCAL;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1199:9: ( 'LOCAL' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1199:11: 'LOCAL'
            {
            match("LOCAL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_LOCAL

    // $ANTLR start KW_TRANSFORM
    public final void mKW_TRANSFORM() throws RecognitionException {
        try {
            int _type = KW_TRANSFORM;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1200:14: ( 'TRANSFORM' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1200:16: 'TRANSFORM'
            {
            match("TRANSFORM"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_TRANSFORM

    // $ANTLR start KW_USING
    public final void mKW_USING() throws RecognitionException {
        try {
            int _type = KW_USING;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1201:9: ( 'USING' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1201:11: 'USING'
            {
            match("USING"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_USING

    // $ANTLR start KW_CLUSTER
    public final void mKW_CLUSTER() throws RecognitionException {
        try {
            int _type = KW_CLUSTER;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1202:11: ( 'CLUSTER' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1202:13: 'CLUSTER'
            {
            match("CLUSTER"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_CLUSTER

    // $ANTLR start KW_DISTRIBUTE
    public final void mKW_DISTRIBUTE() throws RecognitionException {
        try {
            int _type = KW_DISTRIBUTE;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1203:14: ( 'DISTRIBUTE' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1203:16: 'DISTRIBUTE'
            {
            match("DISTRIBUTE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DISTRIBUTE

    // $ANTLR start KW_SORT
    public final void mKW_SORT() throws RecognitionException {
        try {
            int _type = KW_SORT;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1204:8: ( 'SORT' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1204:10: 'SORT'
            {
            match("SORT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SORT

    // $ANTLR start KW_UNION
    public final void mKW_UNION() throws RecognitionException {
        try {
            int _type = KW_UNION;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1205:9: ( 'UNION' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1205:11: 'UNION'
            {
            match("UNION"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_UNION

    // $ANTLR start KW_LOAD
    public final void mKW_LOAD() throws RecognitionException {
        try {
            int _type = KW_LOAD;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1206:8: ( 'LOAD' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1206:10: 'LOAD'
            {
            match("LOAD"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_LOAD

    // $ANTLR start KW_DATA
    public final void mKW_DATA() throws RecognitionException {
        try {
            int _type = KW_DATA;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1207:8: ( 'DATA' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1207:10: 'DATA'
            {
            match("DATA"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DATA

    // $ANTLR start KW_INPATH
    public final void mKW_INPATH() throws RecognitionException {
        try {
            int _type = KW_INPATH;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1208:10: ( 'INPATH' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1208:12: 'INPATH'
            {
            match("INPATH"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_INPATH

    // $ANTLR start KW_IS
    public final void mKW_IS() throws RecognitionException {
        try {
            int _type = KW_IS;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1209:6: ( 'IS' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1209:8: 'IS'
            {
            match("IS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_IS

    // $ANTLR start KW_NULL
    public final void mKW_NULL() throws RecognitionException {
        try {
            int _type = KW_NULL;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1210:8: ( 'NULL' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1210:10: 'NULL'
            {
            match("NULL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_NULL

    // $ANTLR start KW_CREATE
    public final void mKW_CREATE() throws RecognitionException {
        try {
            int _type = KW_CREATE;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1211:10: ( 'CREATE' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1211:12: 'CREATE'
            {
            match("CREATE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_CREATE

    // $ANTLR start KW_EXTERNAL
    public final void mKW_EXTERNAL() throws RecognitionException {
        try {
            int _type = KW_EXTERNAL;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1212:12: ( 'EXTERNAL' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1212:14: 'EXTERNAL'
            {
            match("EXTERNAL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_EXTERNAL

    // $ANTLR start KW_ALTER
    public final void mKW_ALTER() throws RecognitionException {
        try {
            int _type = KW_ALTER;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1213:9: ( 'ALTER' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1213:11: 'ALTER'
            {
            match("ALTER"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ALTER

    // $ANTLR start KW_DESCRIBE
    public final void mKW_DESCRIBE() throws RecognitionException {
        try {
            int _type = KW_DESCRIBE;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1214:12: ( 'DESCRIBE' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1214:14: 'DESCRIBE'
            {
            match("DESCRIBE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DESCRIBE

    // $ANTLR start KW_DROP
    public final void mKW_DROP() throws RecognitionException {
        try {
            int _type = KW_DROP;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1215:8: ( 'DROP' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1215:10: 'DROP'
            {
            match("DROP"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DROP

    // $ANTLR start KW_RENAME
    public final void mKW_RENAME() throws RecognitionException {
        try {
            int _type = KW_RENAME;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1216:10: ( 'RENAME' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1216:12: 'RENAME'
            {
            match("RENAME"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_RENAME

    // $ANTLR start KW_TO
    public final void mKW_TO() throws RecognitionException {
        try {
            int _type = KW_TO;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1217:6: ( 'TO' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1217:8: 'TO'
            {
            match("TO"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_TO

    // $ANTLR start KW_COMMENT
    public final void mKW_COMMENT() throws RecognitionException {
        try {
            int _type = KW_COMMENT;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1218:11: ( 'COMMENT' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1218:13: 'COMMENT'
            {
            match("COMMENT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_COMMENT

    // $ANTLR start KW_BOOLEAN
    public final void mKW_BOOLEAN() throws RecognitionException {
        try {
            int _type = KW_BOOLEAN;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1219:11: ( 'BOOLEAN' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1219:13: 'BOOLEAN'
            {
            match("BOOLEAN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_BOOLEAN

    // $ANTLR start KW_TINYINT
    public final void mKW_TINYINT() throws RecognitionException {
        try {
            int _type = KW_TINYINT;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1220:11: ( 'TINYINT' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1220:13: 'TINYINT'
            {
            match("TINYINT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_TINYINT

    // $ANTLR start KW_SMALLINT
    public final void mKW_SMALLINT() throws RecognitionException {
        try {
            int _type = KW_SMALLINT;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1221:12: ( 'SMALLINT' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1221:14: 'SMALLINT'
            {
            match("SMALLINT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SMALLINT

    // $ANTLR start KW_INT
    public final void mKW_INT() throws RecognitionException {
        try {
            int _type = KW_INT;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1222:7: ( 'INT' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1222:9: 'INT'
            {
            match("INT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_INT

    // $ANTLR start KW_BIGINT
    public final void mKW_BIGINT() throws RecognitionException {
        try {
            int _type = KW_BIGINT;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1223:10: ( 'BIGINT' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1223:12: 'BIGINT'
            {
            match("BIGINT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_BIGINT

    // $ANTLR start KW_FLOAT
    public final void mKW_FLOAT() throws RecognitionException {
        try {
            int _type = KW_FLOAT;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1224:9: ( 'FLOAT' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1224:11: 'FLOAT'
            {
            match("FLOAT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_FLOAT

    // $ANTLR start KW_DOUBLE
    public final void mKW_DOUBLE() throws RecognitionException {
        try {
            int _type = KW_DOUBLE;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1225:10: ( 'DOUBLE' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1225:12: 'DOUBLE'
            {
            match("DOUBLE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DOUBLE

    // $ANTLR start KW_DATE
    public final void mKW_DATE() throws RecognitionException {
        try {
            int _type = KW_DATE;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1226:8: ( 'DATE' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1226:10: 'DATE'
            {
            match("DATE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DATE

    // $ANTLR start KW_DATETIME
    public final void mKW_DATETIME() throws RecognitionException {
        try {
            int _type = KW_DATETIME;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1227:12: ( 'DATETIME' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1227:14: 'DATETIME'
            {
            match("DATETIME"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DATETIME

    // $ANTLR start KW_TIMESTAMP
    public final void mKW_TIMESTAMP() throws RecognitionException {
        try {
            int _type = KW_TIMESTAMP;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1228:13: ( 'TIMESTAMP' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1228:15: 'TIMESTAMP'
            {
            match("TIMESTAMP"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_TIMESTAMP

    // $ANTLR start KW_STRING
    public final void mKW_STRING() throws RecognitionException {
        try {
            int _type = KW_STRING;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1229:10: ( 'STRING' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1229:12: 'STRING'
            {
            match("STRING"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_STRING

    // $ANTLR start KW_ARRAY
    public final void mKW_ARRAY() throws RecognitionException {
        try {
            int _type = KW_ARRAY;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1230:9: ( 'ARRAY' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1230:11: 'ARRAY'
            {
            match("ARRAY"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ARRAY

    // $ANTLR start KW_MAP
    public final void mKW_MAP() throws RecognitionException {
        try {
            int _type = KW_MAP;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1231:7: ( 'MAP' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1231:9: 'MAP'
            {
            match("MAP"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_MAP

    // $ANTLR start KW_REDUCE
    public final void mKW_REDUCE() throws RecognitionException {
        try {
            int _type = KW_REDUCE;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1232:10: ( 'REDUCE' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1232:12: 'REDUCE'
            {
            match("REDUCE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_REDUCE

    // $ANTLR start KW_PARTITIONED
    public final void mKW_PARTITIONED() throws RecognitionException {
        try {
            int _type = KW_PARTITIONED;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1233:15: ( 'PARTITIONED' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1233:17: 'PARTITIONED'
            {
            match("PARTITIONED"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_PARTITIONED

    // $ANTLR start KW_CLUSTERED
    public final void mKW_CLUSTERED() throws RecognitionException {
        try {
            int _type = KW_CLUSTERED;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1234:13: ( 'CLUSTERED' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1234:15: 'CLUSTERED'
            {
            match("CLUSTERED"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_CLUSTERED

    // $ANTLR start KW_SORTED
    public final void mKW_SORTED() throws RecognitionException {
        try {
            int _type = KW_SORTED;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1235:10: ( 'SORTED' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1235:12: 'SORTED'
            {
            match("SORTED"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SORTED

    // $ANTLR start KW_INTO
    public final void mKW_INTO() throws RecognitionException {
        try {
            int _type = KW_INTO;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1236:8: ( 'INTO' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1236:10: 'INTO'
            {
            match("INTO"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_INTO

    // $ANTLR start KW_BUCKETS
    public final void mKW_BUCKETS() throws RecognitionException {
        try {
            int _type = KW_BUCKETS;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1237:11: ( 'BUCKETS' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1237:13: 'BUCKETS'
            {
            match("BUCKETS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_BUCKETS

    // $ANTLR start KW_ROW
    public final void mKW_ROW() throws RecognitionException {
        try {
            int _type = KW_ROW;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1238:7: ( 'ROW' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1238:9: 'ROW'
            {
            match("ROW"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ROW

    // $ANTLR start KW_FORMAT
    public final void mKW_FORMAT() throws RecognitionException {
        try {
            int _type = KW_FORMAT;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1239:10: ( 'FORMAT' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1239:12: 'FORMAT'
            {
            match("FORMAT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_FORMAT

    // $ANTLR start KW_DELIMITED
    public final void mKW_DELIMITED() throws RecognitionException {
        try {
            int _type = KW_DELIMITED;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1240:13: ( 'DELIMITED' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1240:15: 'DELIMITED'
            {
            match("DELIMITED"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DELIMITED

    // $ANTLR start KW_FIELDS
    public final void mKW_FIELDS() throws RecognitionException {
        try {
            int _type = KW_FIELDS;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1241:10: ( 'FIELDS' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1241:12: 'FIELDS'
            {
            match("FIELDS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_FIELDS

    // $ANTLR start KW_TERMINATED
    public final void mKW_TERMINATED() throws RecognitionException {
        try {
            int _type = KW_TERMINATED;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1242:14: ( 'TERMINATED' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1242:16: 'TERMINATED'
            {
            match("TERMINATED"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_TERMINATED

    // $ANTLR start KW_ESCAPED
    public final void mKW_ESCAPED() throws RecognitionException {
        try {
            int _type = KW_ESCAPED;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1243:11: ( 'ESCAPED' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1243:13: 'ESCAPED'
            {
            match("ESCAPED"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ESCAPED

    // $ANTLR start KW_COLLECTION
    public final void mKW_COLLECTION() throws RecognitionException {
        try {
            int _type = KW_COLLECTION;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1244:14: ( 'COLLECTION' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1244:16: 'COLLECTION'
            {
            match("COLLECTION"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_COLLECTION

    // $ANTLR start KW_ITEMS
    public final void mKW_ITEMS() throws RecognitionException {
        try {
            int _type = KW_ITEMS;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1245:9: ( 'ITEMS' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1245:11: 'ITEMS'
            {
            match("ITEMS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ITEMS

    // $ANTLR start KW_KEYS
    public final void mKW_KEYS() throws RecognitionException {
        try {
            int _type = KW_KEYS;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1246:8: ( 'KEYS' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1246:10: 'KEYS'
            {
            match("KEYS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_KEYS

    // $ANTLR start KW_KEY_TYPE
    public final void mKW_KEY_TYPE() throws RecognitionException {
        try {
            int _type = KW_KEY_TYPE;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1247:12: ( '$KEY$' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1247:14: '$KEY$'
            {
            match("$KEY$"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_KEY_TYPE

    // $ANTLR start KW_LINES
    public final void mKW_LINES() throws RecognitionException {
        try {
            int _type = KW_LINES;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1248:9: ( 'LINES' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1248:11: 'LINES'
            {
            match("LINES"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_LINES

    // $ANTLR start KW_STORED
    public final void mKW_STORED() throws RecognitionException {
        try {
            int _type = KW_STORED;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1249:10: ( 'STORED' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1249:12: 'STORED'
            {
            match("STORED"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_STORED

    // $ANTLR start KW_SEQUENCEFILE
    public final void mKW_SEQUENCEFILE() throws RecognitionException {
        try {
            int _type = KW_SEQUENCEFILE;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1250:16: ( 'SEQUENCEFILE' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1250:18: 'SEQUENCEFILE'
            {
            match("SEQUENCEFILE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SEQUENCEFILE

    // $ANTLR start KW_TEXTFILE
    public final void mKW_TEXTFILE() throws RecognitionException {
        try {
            int _type = KW_TEXTFILE;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1251:12: ( 'TEXTFILE' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1251:14: 'TEXTFILE'
            {
            match("TEXTFILE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_TEXTFILE

    // $ANTLR start KW_RCFILE
    public final void mKW_RCFILE() throws RecognitionException {
        try {
            int _type = KW_RCFILE;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1252:10: ( 'RCFILE' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1252:12: 'RCFILE'
            {
            match("RCFILE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_RCFILE

    // $ANTLR start KW_INPUTFORMAT
    public final void mKW_INPUTFORMAT() throws RecognitionException {
        try {
            int _type = KW_INPUTFORMAT;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1253:15: ( 'INPUTFORMAT' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1253:17: 'INPUTFORMAT'
            {
            match("INPUTFORMAT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_INPUTFORMAT

    // $ANTLR start KW_OUTPUTFORMAT
    public final void mKW_OUTPUTFORMAT() throws RecognitionException {
        try {
            int _type = KW_OUTPUTFORMAT;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1254:16: ( 'OUTPUTFORMAT' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1254:18: 'OUTPUTFORMAT'
            {
            match("OUTPUTFORMAT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_OUTPUTFORMAT

    // $ANTLR start KW_LOCATION
    public final void mKW_LOCATION() throws RecognitionException {
        try {
            int _type = KW_LOCATION;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1255:12: ( 'LOCATION' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1255:14: 'LOCATION'
            {
            match("LOCATION"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_LOCATION

    // $ANTLR start KW_TABLESAMPLE
    public final void mKW_TABLESAMPLE() throws RecognitionException {
        try {
            int _type = KW_TABLESAMPLE;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1256:15: ( 'TABLESAMPLE' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1256:17: 'TABLESAMPLE'
            {
            match("TABLESAMPLE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_TABLESAMPLE

    // $ANTLR start KW_BUCKET
    public final void mKW_BUCKET() throws RecognitionException {
        try {
            int _type = KW_BUCKET;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1257:10: ( 'BUCKET' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1257:12: 'BUCKET'
            {
            match("BUCKET"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_BUCKET

    // $ANTLR start KW_OUT
    public final void mKW_OUT() throws RecognitionException {
        try {
            int _type = KW_OUT;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1258:7: ( 'OUT' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1258:9: 'OUT'
            {
            match("OUT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_OUT

    // $ANTLR start KW_OF
    public final void mKW_OF() throws RecognitionException {
        try {
            int _type = KW_OF;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1259:6: ( 'OF' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1259:8: 'OF'
            {
            match("OF"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_OF

    // $ANTLR start KW_CAST
    public final void mKW_CAST() throws RecognitionException {
        try {
            int _type = KW_CAST;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1260:8: ( 'CAST' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1260:10: 'CAST'
            {
            match("CAST"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_CAST

    // $ANTLR start KW_ADD
    public final void mKW_ADD() throws RecognitionException {
        try {
            int _type = KW_ADD;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1261:7: ( 'ADD' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1261:9: 'ADD'
            {
            match("ADD"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ADD

    // $ANTLR start KW_REPLACE
    public final void mKW_REPLACE() throws RecognitionException {
        try {
            int _type = KW_REPLACE;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1262:11: ( 'REPLACE' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1262:13: 'REPLACE'
            {
            match("REPLACE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_REPLACE

    // $ANTLR start KW_COLUMNS
    public final void mKW_COLUMNS() throws RecognitionException {
        try {
            int _type = KW_COLUMNS;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1263:11: ( 'COLUMNS' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1263:13: 'COLUMNS'
            {
            match("COLUMNS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_COLUMNS

    // $ANTLR start KW_RLIKE
    public final void mKW_RLIKE() throws RecognitionException {
        try {
            int _type = KW_RLIKE;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1264:9: ( 'RLIKE' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1264:11: 'RLIKE'
            {
            match("RLIKE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_RLIKE

    // $ANTLR start KW_REGEXP
    public final void mKW_REGEXP() throws RecognitionException {
        try {
            int _type = KW_REGEXP;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1265:10: ( 'REGEXP' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1265:12: 'REGEXP'
            {
            match("REGEXP"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_REGEXP

    // $ANTLR start KW_TEMPORARY
    public final void mKW_TEMPORARY() throws RecognitionException {
        try {
            int _type = KW_TEMPORARY;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1266:13: ( 'TEMPORARY' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1266:15: 'TEMPORARY'
            {
            match("TEMPORARY"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_TEMPORARY

    // $ANTLR start KW_FUNCTION
    public final void mKW_FUNCTION() throws RecognitionException {
        try {
            int _type = KW_FUNCTION;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1267:12: ( 'FUNCTION' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1267:14: 'FUNCTION'
            {
            match("FUNCTION"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_FUNCTION

    // $ANTLR start KW_EXPLAIN
    public final void mKW_EXPLAIN() throws RecognitionException {
        try {
            int _type = KW_EXPLAIN;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1268:11: ( 'EXPLAIN' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1268:13: 'EXPLAIN'
            {
            match("EXPLAIN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_EXPLAIN

    // $ANTLR start KW_EXTENDED
    public final void mKW_EXTENDED() throws RecognitionException {
        try {
            int _type = KW_EXTENDED;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1269:12: ( 'EXTENDED' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1269:14: 'EXTENDED'
            {
            match("EXTENDED"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_EXTENDED

    // $ANTLR start KW_SERDE
    public final void mKW_SERDE() throws RecognitionException {
        try {
            int _type = KW_SERDE;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1270:9: ( 'SERDE' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1270:11: 'SERDE'
            {
            match("SERDE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SERDE

    // $ANTLR start KW_WITH
    public final void mKW_WITH() throws RecognitionException {
        try {
            int _type = KW_WITH;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1271:8: ( 'WITH' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1271:10: 'WITH'
            {
            match("WITH"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_WITH

    // $ANTLR start KW_SERDEPROPERTIES
    public final void mKW_SERDEPROPERTIES() throws RecognitionException {
        try {
            int _type = KW_SERDEPROPERTIES;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1272:19: ( 'SERDEPROPERTIES' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1272:21: 'SERDEPROPERTIES'
            {
            match("SERDEPROPERTIES"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SERDEPROPERTIES

    // $ANTLR start KW_LIMIT
    public final void mKW_LIMIT() throws RecognitionException {
        try {
            int _type = KW_LIMIT;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1273:9: ( 'LIMIT' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1273:11: 'LIMIT'
            {
            match("LIMIT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_LIMIT

    // $ANTLR start KW_SET
    public final void mKW_SET() throws RecognitionException {
        try {
            int _type = KW_SET;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1274:7: ( 'SET' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1274:9: 'SET'
            {
            match("SET"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SET

    // $ANTLR start KW_PROPERTIES
    public final void mKW_PROPERTIES() throws RecognitionException {
        try {
            int _type = KW_PROPERTIES;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1275:14: ( 'TBLPROPERTIES' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1275:16: 'TBLPROPERTIES'
            {
            match("TBLPROPERTIES"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_PROPERTIES

    // $ANTLR start KW_VALUE_TYPE
    public final void mKW_VALUE_TYPE() throws RecognitionException {
        try {
            int _type = KW_VALUE_TYPE;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1276:14: ( '$VALUE$' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1276:16: '$VALUE$'
            {
            match("$VALUE$"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_VALUE_TYPE

    // $ANTLR start KW_ELEM_TYPE
    public final void mKW_ELEM_TYPE() throws RecognitionException {
        try {
            int _type = KW_ELEM_TYPE;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1277:13: ( '$ELEM$' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1277:15: '$ELEM$'
            {
            match("$ELEM$"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ELEM_TYPE

    // $ANTLR start KW_CASE
    public final void mKW_CASE() throws RecognitionException {
        try {
            int _type = KW_CASE;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1278:8: ( 'CASE' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1278:10: 'CASE'
            {
            match("CASE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_CASE

    // $ANTLR start KW_WHEN
    public final void mKW_WHEN() throws RecognitionException {
        try {
            int _type = KW_WHEN;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1279:8: ( 'WHEN' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1279:10: 'WHEN'
            {
            match("WHEN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_WHEN

    // $ANTLR start KW_THEN
    public final void mKW_THEN() throws RecognitionException {
        try {
            int _type = KW_THEN;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1280:8: ( 'THEN' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1280:10: 'THEN'
            {
            match("THEN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_THEN

    // $ANTLR start KW_ELSE
    public final void mKW_ELSE() throws RecognitionException {
        try {
            int _type = KW_ELSE;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1281:8: ( 'ELSE' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1281:10: 'ELSE'
            {
            match("ELSE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ELSE

    // $ANTLR start KW_END
    public final void mKW_END() throws RecognitionException {
        try {
            int _type = KW_END;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1282:7: ( 'END' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1282:9: 'END'
            {
            match("END"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_END

    // $ANTLR start KW_MAPJOIN
    public final void mKW_MAPJOIN() throws RecognitionException {
        try {
            int _type = KW_MAPJOIN;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1283:11: ( 'MAPJOIN' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1283:13: 'MAPJOIN'
            {
            match("MAPJOIN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_MAPJOIN

    // $ANTLR start KW_CLUSTERSTATUS
    public final void mKW_CLUSTERSTATUS() throws RecognitionException {
        try {
            int _type = KW_CLUSTERSTATUS;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1284:17: ( 'CLUSTERSTATUS' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1284:19: 'CLUSTERSTATUS'
            {
            match("CLUSTERSTATUS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_CLUSTERSTATUS

    // $ANTLR start KW_UTC
    public final void mKW_UTC() throws RecognitionException {
        try {
            int _type = KW_UTC;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1285:7: ( 'UTC' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1285:9: 'UTC'
            {
            match("UTC"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_UTC

    // $ANTLR start KW_UTCTIMESTAMP
    public final void mKW_UTCTIMESTAMP() throws RecognitionException {
        try {
            int _type = KW_UTCTIMESTAMP;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1286:16: ( 'UTC_TMESTAMP' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1286:18: 'UTC_TMESTAMP'
            {
            match("UTC_TMESTAMP"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_UTCTIMESTAMP

    // $ANTLR start KW_LONG
    public final void mKW_LONG() throws RecognitionException {
        try {
            int _type = KW_LONG;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1287:8: ( 'LONG' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1287:10: 'LONG'
            {
            match("LONG"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_LONG

    // $ANTLR start KW_DELETE
    public final void mKW_DELETE() throws RecognitionException {
        try {
            int _type = KW_DELETE;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1288:10: ( 'DELETE' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1288:12: 'DELETE'
            {
            match("DELETE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DELETE

    // $ANTLR start KW_PLUS
    public final void mKW_PLUS() throws RecognitionException {
        try {
            int _type = KW_PLUS;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1289:8: ( 'PLUS' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1289:10: 'PLUS'
            {
            match("PLUS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_PLUS

    // $ANTLR start KW_MINUS
    public final void mKW_MINUS() throws RecognitionException {
        try {
            int _type = KW_MINUS;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1290:9: ( 'MINUS' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1290:11: 'MINUS'
            {
            match("MINUS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_MINUS

    // $ANTLR start KW_FETCH
    public final void mKW_FETCH() throws RecognitionException {
        try {
            int _type = KW_FETCH;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1291:9: ( 'FETCH' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1291:11: 'FETCH'
            {
            match("FETCH"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_FETCH

    // $ANTLR start KW_INTERSECT
    public final void mKW_INTERSECT() throws RecognitionException {
        try {
            int _type = KW_INTERSECT;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1292:13: ( 'INTERSECT' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1292:15: 'INTERSECT'
            {
            match("INTERSECT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_INTERSECT

    // $ANTLR start KW_VIEW
    public final void mKW_VIEW() throws RecognitionException {
        try {
            int _type = KW_VIEW;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1293:8: ( 'VIEW' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1293:10: 'VIEW'
            {
            match("VIEW"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_VIEW

    // $ANTLR start KW_IN
    public final void mKW_IN() throws RecognitionException {
        try {
            int _type = KW_IN;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1294:6: ( 'IN' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1294:8: 'IN'
            {
            match("IN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_IN

    // $ANTLR start KW_DATABASE
    public final void mKW_DATABASE() throws RecognitionException {
        try {
            int _type = KW_DATABASE;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1295:12: ( 'DATABASE' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1295:14: 'DATABASE'
            {
            match("DATABASE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DATABASE

    // $ANTLR start KW_MATERIALIZED
    public final void mKW_MATERIALIZED() throws RecognitionException {
        try {
            int _type = KW_MATERIALIZED;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1296:16: ( 'MATERIALIZED' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1296:18: 'MATERIALIZED'
            {
            match("MATERIALIZED"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_MATERIALIZED

    // $ANTLR start KW_SCHEMA
    public final void mKW_SCHEMA() throws RecognitionException {
        try {
            int _type = KW_SCHEMA;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1297:10: ( 'SCHEMA' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1297:12: 'SCHEMA'
            {
            match("SCHEMA"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SCHEMA

    // $ANTLR start KW_SCHEMAS
    public final void mKW_SCHEMAS() throws RecognitionException {
        try {
            int _type = KW_SCHEMAS;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1298:11: ( 'SCHEMAS' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1298:13: 'SCHEMAS'
            {
            match("SCHEMAS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SCHEMAS

    // $ANTLR start KW_GRANT
    public final void mKW_GRANT() throws RecognitionException {
        try {
            int _type = KW_GRANT;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1299:9: ( 'GRANT' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1299:11: 'GRANT'
            {
            match("GRANT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_GRANT

    // $ANTLR start KW_REVOKE
    public final void mKW_REVOKE() throws RecognitionException {
        try {
            int _type = KW_REVOKE;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1300:10: ( 'REVOKE' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1300:12: 'REVOKE'
            {
            match("REVOKE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_REVOKE

    // $ANTLR start KW_SSL
    public final void mKW_SSL() throws RecognitionException {
        try {
            int _type = KW_SSL;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1301:7: ( 'SSL' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1301:9: 'SSL'
            {
            match("SSL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SSL

    // $ANTLR start KW_UNDO
    public final void mKW_UNDO() throws RecognitionException {
        try {
            int _type = KW_UNDO;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1302:8: ( 'UNDO' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1302:10: 'UNDO'
            {
            match("UNDO"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_UNDO

    // $ANTLR start KW_LOCK
    public final void mKW_LOCK() throws RecognitionException {
        try {
            int _type = KW_LOCK;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1303:8: ( 'LOCK' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1303:10: 'LOCK'
            {
            match("LOCK"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_LOCK

    // $ANTLR start KW_UNLOCK
    public final void mKW_UNLOCK() throws RecognitionException {
        try {
            int _type = KW_UNLOCK;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1304:10: ( 'UNLOCK' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1304:12: 'UNLOCK'
            {
            match("UNLOCK"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_UNLOCK

    // $ANTLR start KW_PROCEDURE
    public final void mKW_PROCEDURE() throws RecognitionException {
        try {
            int _type = KW_PROCEDURE;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1305:13: ( 'PROCEDURE' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1305:15: 'PROCEDURE'
            {
            match("PROCEDURE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_PROCEDURE

    // $ANTLR start KW_UNSIGNED
    public final void mKW_UNSIGNED() throws RecognitionException {
        try {
            int _type = KW_UNSIGNED;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1306:12: ( 'UNSIGNED' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1306:14: 'UNSIGNED'
            {
            match("UNSIGNED"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_UNSIGNED

    // $ANTLR start KW_WHILE
    public final void mKW_WHILE() throws RecognitionException {
        try {
            int _type = KW_WHILE;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1307:9: ( 'WHILE' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1307:11: 'WHILE'
            {
            match("WHILE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_WHILE

    // $ANTLR start KW_READ
    public final void mKW_READ() throws RecognitionException {
        try {
            int _type = KW_READ;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1308:8: ( 'READ' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1308:10: 'READ'
            {
            match("READ"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_READ

    // $ANTLR start KW_READS
    public final void mKW_READS() throws RecognitionException {
        try {
            int _type = KW_READS;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1309:9: ( 'READS' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1309:11: 'READS'
            {
            match("READS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_READS

    // $ANTLR start KW_PURGE
    public final void mKW_PURGE() throws RecognitionException {
        try {
            int _type = KW_PURGE;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1310:9: ( 'PURGE' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1310:11: 'PURGE'
            {
            match("PURGE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_PURGE

    // $ANTLR start KW_RANGE
    public final void mKW_RANGE() throws RecognitionException {
        try {
            int _type = KW_RANGE;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1311:9: ( 'RANGE' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1311:11: 'RANGE'
            {
            match("RANGE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_RANGE

    // $ANTLR start KW_ANALYZE
    public final void mKW_ANALYZE() throws RecognitionException {
        try {
            int _type = KW_ANALYZE;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1312:11: ( 'ANALYZE' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1312:13: 'ANALYZE'
            {
            match("ANALYZE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ANALYZE

    // $ANTLR start KW_BEFORE
    public final void mKW_BEFORE() throws RecognitionException {
        try {
            int _type = KW_BEFORE;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1313:10: ( 'BEFORE' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1313:12: 'BEFORE'
            {
            match("BEFORE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_BEFORE

    // $ANTLR start KW_BETWEEN
    public final void mKW_BETWEEN() throws RecognitionException {
        try {
            int _type = KW_BETWEEN;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1314:11: ( 'BETWEEN' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1314:13: 'BETWEEN'
            {
            match("BETWEEN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_BETWEEN

    // $ANTLR start KW_BOTH
    public final void mKW_BOTH() throws RecognitionException {
        try {
            int _type = KW_BOTH;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1315:8: ( 'BOTH' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1315:10: 'BOTH'
            {
            match("BOTH"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_BOTH

    // $ANTLR start KW_BINARY
    public final void mKW_BINARY() throws RecognitionException {
        try {
            int _type = KW_BINARY;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1316:10: ( 'BINARY' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1316:12: 'BINARY'
            {
            match("BINARY"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_BINARY

    // $ANTLR start KW_CROSS
    public final void mKW_CROSS() throws RecognitionException {
        try {
            int _type = KW_CROSS;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1317:9: ( 'CROSS' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1317:11: 'CROSS'
            {
            match("CROSS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_CROSS

    // $ANTLR start KW_CONTINUE
    public final void mKW_CONTINUE() throws RecognitionException {
        try {
            int _type = KW_CONTINUE;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1318:12: ( 'CONTINUE' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1318:14: 'CONTINUE'
            {
            match("CONTINUE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_CONTINUE

    // $ANTLR start KW_CURSOR
    public final void mKW_CURSOR() throws RecognitionException {
        try {
            int _type = KW_CURSOR;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1319:10: ( 'CURSOR' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1319:12: 'CURSOR'
            {
            match("CURSOR"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_CURSOR

    // $ANTLR start KW_TRIGGER
    public final void mKW_TRIGGER() throws RecognitionException {
        try {
            int _type = KW_TRIGGER;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1320:11: ( 'TRIGGER' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1320:13: 'TRIGGER'
            {
            match("TRIGGER"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_TRIGGER

    // $ANTLR start KW_RECORDREADER
    public final void mKW_RECORDREADER() throws RecognitionException {
        try {
            int _type = KW_RECORDREADER;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1321:16: ( 'RECORDREADER' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1321:18: 'RECORDREADER'
            {
            match("RECORDREADER"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_RECORDREADER

    // $ANTLR start DOT
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1326:5: ( '.' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1326:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DOT

    // $ANTLR start COLON
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1327:7: ( ':' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1327:9: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COLON

    // $ANTLR start COMMA
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1328:7: ( ',' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1328:9: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMMA

    // $ANTLR start SEMICOLON
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1329:11: ( ';' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1329:13: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SEMICOLON

    // $ANTLR start LPAREN
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1331:8: ( '(' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1331:10: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LPAREN

    // $ANTLR start RPAREN
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1332:8: ( ')' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1332:10: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RPAREN

    // $ANTLR start LSQUARE
    public final void mLSQUARE() throws RecognitionException {
        try {
            int _type = LSQUARE;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1333:9: ( '[' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1333:11: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LSQUARE

    // $ANTLR start RSQUARE
    public final void mRSQUARE() throws RecognitionException {
        try {
            int _type = RSQUARE;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1334:9: ( ']' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1334:11: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RSQUARE

    // $ANTLR start LCURLY
    public final void mLCURLY() throws RecognitionException {
        try {
            int _type = LCURLY;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1335:8: ( '{' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1335:10: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LCURLY

    // $ANTLR start RCURLY
    public final void mRCURLY() throws RecognitionException {
        try {
            int _type = RCURLY;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1336:8: ( '}' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1336:10: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RCURLY

    // $ANTLR start EQUAL
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1338:7: ( '=' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1338:9: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EQUAL

    // $ANTLR start NOTEQUAL
    public final void mNOTEQUAL() throws RecognitionException {
        try {
            int _type = NOTEQUAL;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1339:10: ( '<>' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1339:12: '<>'
            {
            match("<>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NOTEQUAL

    // $ANTLR start LESSTHANOREQUALTO
    public final void mLESSTHANOREQUALTO() throws RecognitionException {
        try {
            int _type = LESSTHANOREQUALTO;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1340:19: ( '<=' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1340:21: '<='
            {
            match("<="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LESSTHANOREQUALTO

    // $ANTLR start LESSTHAN
    public final void mLESSTHAN() throws RecognitionException {
        try {
            int _type = LESSTHAN;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1341:10: ( '<' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1341:12: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LESSTHAN

    // $ANTLR start GREATERTHANOREQUALTO
    public final void mGREATERTHANOREQUALTO() throws RecognitionException {
        try {
            int _type = GREATERTHANOREQUALTO;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1342:22: ( '>=' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1342:24: '>='
            {
            match(">="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GREATERTHANOREQUALTO

    // $ANTLR start GREATERTHAN
    public final void mGREATERTHAN() throws RecognitionException {
        try {
            int _type = GREATERTHAN;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1343:13: ( '>' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1343:15: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GREATERTHAN

    // $ANTLR start DIVIDE
    public final void mDIVIDE() throws RecognitionException {
        try {
            int _type = DIVIDE;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1345:8: ( '/' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1345:10: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DIVIDE

    // $ANTLR start PLUS
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1346:6: ( '+' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1346:8: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PLUS

    // $ANTLR start MINUS
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1347:7: ( '-' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1347:9: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MINUS

    // $ANTLR start STAR
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1348:6: ( '*' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1348:8: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STAR

    // $ANTLR start MOD
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1349:5: ( '%' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1349:7: '%'
            {
            match('%'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MOD

    // $ANTLR start DIV
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1350:5: ( 'DIV' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1350:7: 'DIV'
            {
            match("DIV"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DIV

    // $ANTLR start AMPERSAND
    public final void mAMPERSAND() throws RecognitionException {
        try {
            int _type = AMPERSAND;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1352:11: ( '&' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1352:13: '&'
            {
            match('&'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end AMPERSAND

    // $ANTLR start TILDE
    public final void mTILDE() throws RecognitionException {
        try {
            int _type = TILDE;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1353:7: ( '~' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1353:9: '~'
            {
            match('~'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TILDE

    // $ANTLR start BITWISEOR
    public final void mBITWISEOR() throws RecognitionException {
        try {
            int _type = BITWISEOR;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1354:11: ( '|' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1354:13: '|'
            {
            match('|'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BITWISEOR

    // $ANTLR start BITWISEXOR
    public final void mBITWISEXOR() throws RecognitionException {
        try {
            int _type = BITWISEXOR;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1355:12: ( '^' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1355:14: '^'
            {
            match('^'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BITWISEXOR

    // $ANTLR start QUESTION
    public final void mQUESTION() throws RecognitionException {
        try {
            int _type = QUESTION;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1356:10: ( '?' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1356:12: '?'
            {
            match('?'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end QUESTION

    // $ANTLR start DOLLAR
    public final void mDOLLAR() throws RecognitionException {
        try {
            int _type = DOLLAR;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1357:8: ( '$' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1357:10: '$'
            {
            match('$'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DOLLAR

    // $ANTLR start Letter
    public final void mLetter() throws RecognitionException {
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1362:5: ( 'a' .. 'z' | 'A' .. 'Z' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end Letter

    // $ANTLR start HexDigit
    public final void mHexDigit() throws RecognitionException {
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1367:5: ( 'a' .. 'f' | 'A' .. 'F' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end HexDigit

    // $ANTLR start Digit
    public final void mDigit() throws RecognitionException {
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1372:5: ( '0' .. '9' )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1373:5: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end Digit

    // $ANTLR start Exponent
    public final void mExponent() throws RecognitionException {
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1378:5: ( 'e' ( PLUS | MINUS )? ( Digit )+ )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1379:5: 'e' ( PLUS | MINUS )? ( Digit )+
            {
            match('e'); 
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1379:9: ( PLUS | MINUS )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='+'||LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }


                    }
                    break;

            }

            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1379:25: ( Digit )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1379:26: Digit
            	    {
            	    mDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end Exponent

    // $ANTLR start RegexComponent
    public final void mRegexComponent() throws RecognitionException {
        try {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1384:5: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | PLUS | STAR | QUESTION | MINUS | DOT | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | BITWISEXOR | BITWISEOR | DOLLAR )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:
            {
            if ( input.LA(1)=='$'||(input.LA(1)>='(' && input.LA(1)<='+')||(input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='?'||(input.LA(1)>='A' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='_')||(input.LA(1)>='a' && input.LA(1)<='}') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end RegexComponent

    // $ANTLR start StringLiteral
    public final void mStringLiteral() throws RecognitionException {
        try {
            int _type = StringLiteral;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1391:5: ( ( '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\'' | '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"' )+ )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1392:5: ( '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\'' | '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"' )+
            {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1392:5: ( '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\'' | '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\'') ) {
                    alt5=1;
                }
                else if ( (LA5_0=='\"') ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1392:7: '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\''
            	    {
            	    match('\''); 
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1392:12: (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )*
            	    loop3:
            	    do {
            	        int alt3=3;
            	        int LA3_0 = input.LA(1);

            	        if ( ((LA3_0>='\u0000' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFE')) ) {
            	            alt3=1;
            	        }
            	        else if ( (LA3_0=='\\') ) {
            	            alt3=2;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1392:14: ~ ( '\\'' | '\\\\' )
            	    	    {
            	    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse =
            	    	            new MismatchedSetException(null,input);
            	    	        recover(mse);    throw mse;
            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1392:29: ( '\\\\' . )
            	    	    {
            	    	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1392:29: ( '\\\\' . )
            	    	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1392:30: '\\\\' .
            	    	    {
            	    	    match('\\'); 
            	    	    matchAny(); 

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);

            	    match('\''); 

            	    }
            	    break;
            	case 2 :
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1393:7: '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"'
            	    {
            	    match('\"'); 
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1393:12: (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )*
            	    loop4:
            	    do {
            	        int alt4=3;
            	        int LA4_0 = input.LA(1);

            	        if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
            	            alt4=1;
            	        }
            	        else if ( (LA4_0=='\\') ) {
            	            alt4=2;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1393:14: ~ ( '\\\"' | '\\\\' )
            	    	    {
            	    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse =
            	    	            new MismatchedSetException(null,input);
            	    	        recover(mse);    throw mse;
            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1393:29: ( '\\\\' . )
            	    	    {
            	    	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1393:29: ( '\\\\' . )
            	    	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1393:30: '\\\\' .
            	    	    {
            	    	    match('\\'); 
            	    	    matchAny(); 

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop4;
            	        }
            	    } while (true);

            	    match('\"'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end StringLiteral

    // $ANTLR start CharSetLiteral
    public final void mCharSetLiteral() throws RecognitionException {
        try {
            int _type = CharSetLiteral;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1398:5: ( StringLiteral | '0' 'X' ( HexDigit | Digit )+ )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"'||LA7_0=='\'') ) {
                alt7=1;
            }
            else if ( (LA7_0=='0') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1397:1: CharSetLiteral : ( StringLiteral | '0' 'X' ( HexDigit | Digit )+ );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1399:5: StringLiteral
                    {
                    mStringLiteral(); 

                    }
                    break;
                case 2 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1400:7: '0' 'X' ( HexDigit | Digit )+
                    {
                    match('0'); 
                    match('X'); 
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1400:15: ( HexDigit | Digit )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='F')||(LA6_0>='a' && LA6_0<='f')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CharSetLiteral

    // $ANTLR start Number
    public final void mNumber() throws RecognitionException {
        try {
            int _type = Number;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1404:5: ( ( Digit )+ ( DOT ( Digit )* ( Exponent )? | Exponent )? )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1405:5: ( Digit )+ ( DOT ( Digit )* ( Exponent )? | Exponent )?
            {
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1405:5: ( Digit )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1405:6: Digit
            	    {
            	    mDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1405:14: ( DOT ( Digit )* ( Exponent )? | Exponent )?
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='.') ) {
                alt11=1;
            }
            else if ( (LA11_0=='e') ) {
                alt11=2;
            }
            switch (alt11) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1405:16: DOT ( Digit )* ( Exponent )?
                    {
                    mDOT(); 
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1405:20: ( Digit )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1405:21: Digit
                    	    {
                    	    mDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1405:29: ( Exponent )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='e') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1405:30: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1405:43: Exponent
                    {
                    mExponent(); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Number

    // $ANTLR start Identifier
    public final void mIdentifier() throws RecognitionException {
        try {
            int _type = Identifier;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1409:5: ( ( Letter | Digit ) ( Letter | Digit | '_' )* | '`' ( RegexComponent )+ '`' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>='0' && LA14_0<='9')||(LA14_0>='A' && LA14_0<='Z')||(LA14_0>='a' && LA14_0<='z')) ) {
                alt14=1;
            }
            else if ( (LA14_0=='`') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1408:1: Identifier : ( ( Letter | Digit ) ( Letter | Digit | '_' )* | '`' ( RegexComponent )+ '`' );", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1410:5: ( Letter | Digit ) ( Letter | Digit | '_' )*
                    {
                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }

                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1410:22: ( Letter | Digit | '_' )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')||(LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1411:7: '`' ( RegexComponent )+ '`'
                    {
                    match('`'); 
                    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1411:11: ( RegexComponent )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='$'||(LA13_0>='(' && LA13_0<='+')||(LA13_0>='-' && LA13_0<='.')||(LA13_0>='0' && LA13_0<='9')||LA13_0=='?'||(LA13_0>='A' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='_')||(LA13_0>='a' && LA13_0<='}')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1411:11: RegexComponent
                    	    {
                    	    mRegexComponent(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);

                    match('`'); 

                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Identifier

    // $ANTLR start CharSetName
    public final void mCharSetName() throws RecognitionException {
        try {
            int _type = CharSetName;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1415:5: ( '_' ( Letter | Digit | '_' | '-' | '.' | ':' )+ )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1416:5: '_' ( Letter | Digit | '_' | '-' | '.' | ':' )+
            {
            match('_'); 
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1416:9: ( Letter | Digit | '_' | '-' | '.' | ':' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='-' && LA15_0<='.')||(LA15_0>='0' && LA15_0<=':')||(LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='z')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:
            	    {
            	    if ( (input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<=':')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CharSetName

    // $ANTLR start WS
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1419:5: ( ( ' ' | '\\r' | '\\t' | '\\n' ) )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1419:8: ( ' ' | '\\r' | '\\t' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WS

    // $ANTLR start COMMENT
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1423:3: ( '--' (~ ( '\\n' | '\\r' ) )* )
            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1423:5: '--' (~ ( '\\n' | '\\r' ) )*
            {
            match("--"); 

            // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1423:10: (~ ( '\\n' | '\\r' ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\u0000' && LA16_0<='\t')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\uFFFE')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1423:11: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             channel=HIDDEN; 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMMENT

    public void mTokens() throws RecognitionException {
        // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:8: ( KW_TRUE | KW_FALSE | KW_ALL | KW_AND | KW_OR | KW_NOT | KW_LIKE | KW_IF | KW_EXISTS | KW_ASC | KW_DESC | KW_ORDER | KW_BY | KW_GROUP | KW_WHERE | KW_FROM | KW_AS | KW_SELECT | KW_DISTINCT | KW_INSERT | KW_OVERWRITE | KW_OUTER | KW_JOIN | KW_LEFT | KW_RIGHT | KW_FULL | KW_ON | KW_PARTITION | KW_PARTITIONS | KW_TABLE | KW_TABLES | KW_FUNCTIONS | KW_SHOW | KW_MSCK | KW_DIRECTORY | KW_LOCAL | KW_TRANSFORM | KW_USING | KW_CLUSTER | KW_DISTRIBUTE | KW_SORT | KW_UNION | KW_LOAD | KW_DATA | KW_INPATH | KW_IS | KW_NULL | KW_CREATE | KW_EXTERNAL | KW_ALTER | KW_DESCRIBE | KW_DROP | KW_RENAME | KW_TO | KW_COMMENT | KW_BOOLEAN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_DOUBLE | KW_DATE | KW_DATETIME | KW_TIMESTAMP | KW_STRING | KW_ARRAY | KW_MAP | KW_REDUCE | KW_PARTITIONED | KW_CLUSTERED | KW_SORTED | KW_INTO | KW_BUCKETS | KW_ROW | KW_FORMAT | KW_DELIMITED | KW_FIELDS | KW_TERMINATED | KW_ESCAPED | KW_COLLECTION | KW_ITEMS | KW_KEYS | KW_KEY_TYPE | KW_LINES | KW_STORED | KW_SEQUENCEFILE | KW_TEXTFILE | KW_RCFILE | KW_INPUTFORMAT | KW_OUTPUTFORMAT | KW_LOCATION | KW_TABLESAMPLE | KW_BUCKET | KW_OUT | KW_OF | KW_CAST | KW_ADD | KW_REPLACE | KW_COLUMNS | KW_RLIKE | KW_REGEXP | KW_TEMPORARY | KW_FUNCTION | KW_EXPLAIN | KW_EXTENDED | KW_SERDE | KW_WITH | KW_SERDEPROPERTIES | KW_LIMIT | KW_SET | KW_PROPERTIES | KW_VALUE_TYPE | KW_ELEM_TYPE | KW_CASE | KW_WHEN | KW_THEN | KW_ELSE | KW_END | KW_MAPJOIN | KW_CLUSTERSTATUS | KW_UTC | KW_UTCTIMESTAMP | KW_LONG | KW_DELETE | KW_PLUS | KW_MINUS | KW_FETCH | KW_INTERSECT | KW_VIEW | KW_IN | KW_DATABASE | KW_MATERIALIZED | KW_SCHEMA | KW_SCHEMAS | KW_GRANT | KW_REVOKE | KW_SSL | KW_UNDO | KW_LOCK | KW_UNLOCK | KW_PROCEDURE | KW_UNSIGNED | KW_WHILE | KW_READ | KW_READS | KW_PURGE | KW_RANGE | KW_ANALYZE | KW_BEFORE | KW_BETWEEN | KW_BOTH | KW_BINARY | KW_CROSS | KW_CONTINUE | KW_CURSOR | KW_TRIGGER | KW_RECORDREADER | DOT | COLON | COMMA | SEMICOLON | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | EQUAL | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | DIVIDE | PLUS | MINUS | STAR | MOD | DIV | AMPERSAND | TILDE | BITWISEOR | BITWISEXOR | QUESTION | DOLLAR | StringLiteral | CharSetLiteral | Number | Identifier | CharSetName | WS | COMMENT )
        int alt17=193;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:10: KW_TRUE
                {
                mKW_TRUE(); 

                }
                break;
            case 2 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:18: KW_FALSE
                {
                mKW_FALSE(); 

                }
                break;
            case 3 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:27: KW_ALL
                {
                mKW_ALL(); 

                }
                break;
            case 4 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:34: KW_AND
                {
                mKW_AND(); 

                }
                break;
            case 5 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:41: KW_OR
                {
                mKW_OR(); 

                }
                break;
            case 6 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:47: KW_NOT
                {
                mKW_NOT(); 

                }
                break;
            case 7 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:54: KW_LIKE
                {
                mKW_LIKE(); 

                }
                break;
            case 8 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:62: KW_IF
                {
                mKW_IF(); 

                }
                break;
            case 9 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:68: KW_EXISTS
                {
                mKW_EXISTS(); 

                }
                break;
            case 10 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:78: KW_ASC
                {
                mKW_ASC(); 

                }
                break;
            case 11 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:85: KW_DESC
                {
                mKW_DESC(); 

                }
                break;
            case 12 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:93: KW_ORDER
                {
                mKW_ORDER(); 

                }
                break;
            case 13 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:102: KW_BY
                {
                mKW_BY(); 

                }
                break;
            case 14 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:108: KW_GROUP
                {
                mKW_GROUP(); 

                }
                break;
            case 15 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:117: KW_WHERE
                {
                mKW_WHERE(); 

                }
                break;
            case 16 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:126: KW_FROM
                {
                mKW_FROM(); 

                }
                break;
            case 17 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:134: KW_AS
                {
                mKW_AS(); 

                }
                break;
            case 18 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:140: KW_SELECT
                {
                mKW_SELECT(); 

                }
                break;
            case 19 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:150: KW_DISTINCT
                {
                mKW_DISTINCT(); 

                }
                break;
            case 20 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:162: KW_INSERT
                {
                mKW_INSERT(); 

                }
                break;
            case 21 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:172: KW_OVERWRITE
                {
                mKW_OVERWRITE(); 

                }
                break;
            case 22 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:185: KW_OUTER
                {
                mKW_OUTER(); 

                }
                break;
            case 23 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:194: KW_JOIN
                {
                mKW_JOIN(); 

                }
                break;
            case 24 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:202: KW_LEFT
                {
                mKW_LEFT(); 

                }
                break;
            case 25 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:210: KW_RIGHT
                {
                mKW_RIGHT(); 

                }
                break;
            case 26 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:219: KW_FULL
                {
                mKW_FULL(); 

                }
                break;
            case 27 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:227: KW_ON
                {
                mKW_ON(); 

                }
                break;
            case 28 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:233: KW_PARTITION
                {
                mKW_PARTITION(); 

                }
                break;
            case 29 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:246: KW_PARTITIONS
                {
                mKW_PARTITIONS(); 

                }
                break;
            case 30 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:260: KW_TABLE
                {
                mKW_TABLE(); 

                }
                break;
            case 31 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:269: KW_TABLES
                {
                mKW_TABLES(); 

                }
                break;
            case 32 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:279: KW_FUNCTIONS
                {
                mKW_FUNCTIONS(); 

                }
                break;
            case 33 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:292: KW_SHOW
                {
                mKW_SHOW(); 

                }
                break;
            case 34 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:300: KW_MSCK
                {
                mKW_MSCK(); 

                }
                break;
            case 35 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:308: KW_DIRECTORY
                {
                mKW_DIRECTORY(); 

                }
                break;
            case 36 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:321: KW_LOCAL
                {
                mKW_LOCAL(); 

                }
                break;
            case 37 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:330: KW_TRANSFORM
                {
                mKW_TRANSFORM(); 

                }
                break;
            case 38 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:343: KW_USING
                {
                mKW_USING(); 

                }
                break;
            case 39 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:352: KW_CLUSTER
                {
                mKW_CLUSTER(); 

                }
                break;
            case 40 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:363: KW_DISTRIBUTE
                {
                mKW_DISTRIBUTE(); 

                }
                break;
            case 41 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:377: KW_SORT
                {
                mKW_SORT(); 

                }
                break;
            case 42 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:385: KW_UNION
                {
                mKW_UNION(); 

                }
                break;
            case 43 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:394: KW_LOAD
                {
                mKW_LOAD(); 

                }
                break;
            case 44 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:402: KW_DATA
                {
                mKW_DATA(); 

                }
                break;
            case 45 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:410: KW_INPATH
                {
                mKW_INPATH(); 

                }
                break;
            case 46 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:420: KW_IS
                {
                mKW_IS(); 

                }
                break;
            case 47 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:426: KW_NULL
                {
                mKW_NULL(); 

                }
                break;
            case 48 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:434: KW_CREATE
                {
                mKW_CREATE(); 

                }
                break;
            case 49 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:444: KW_EXTERNAL
                {
                mKW_EXTERNAL(); 

                }
                break;
            case 50 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:456: KW_ALTER
                {
                mKW_ALTER(); 

                }
                break;
            case 51 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:465: KW_DESCRIBE
                {
                mKW_DESCRIBE(); 

                }
                break;
            case 52 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:477: KW_DROP
                {
                mKW_DROP(); 

                }
                break;
            case 53 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:485: KW_RENAME
                {
                mKW_RENAME(); 

                }
                break;
            case 54 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:495: KW_TO
                {
                mKW_TO(); 

                }
                break;
            case 55 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:501: KW_COMMENT
                {
                mKW_COMMENT(); 

                }
                break;
            case 56 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:512: KW_BOOLEAN
                {
                mKW_BOOLEAN(); 

                }
                break;
            case 57 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:523: KW_TINYINT
                {
                mKW_TINYINT(); 

                }
                break;
            case 58 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:534: KW_SMALLINT
                {
                mKW_SMALLINT(); 

                }
                break;
            case 59 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:546: KW_INT
                {
                mKW_INT(); 

                }
                break;
            case 60 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:553: KW_BIGINT
                {
                mKW_BIGINT(); 

                }
                break;
            case 61 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:563: KW_FLOAT
                {
                mKW_FLOAT(); 

                }
                break;
            case 62 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:572: KW_DOUBLE
                {
                mKW_DOUBLE(); 

                }
                break;
            case 63 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:582: KW_DATE
                {
                mKW_DATE(); 

                }
                break;
            case 64 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:590: KW_DATETIME
                {
                mKW_DATETIME(); 

                }
                break;
            case 65 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:602: KW_TIMESTAMP
                {
                mKW_TIMESTAMP(); 

                }
                break;
            case 66 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:615: KW_STRING
                {
                mKW_STRING(); 

                }
                break;
            case 67 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:625: KW_ARRAY
                {
                mKW_ARRAY(); 

                }
                break;
            case 68 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:634: KW_MAP
                {
                mKW_MAP(); 

                }
                break;
            case 69 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:641: KW_REDUCE
                {
                mKW_REDUCE(); 

                }
                break;
            case 70 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:651: KW_PARTITIONED
                {
                mKW_PARTITIONED(); 

                }
                break;
            case 71 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:666: KW_CLUSTERED
                {
                mKW_CLUSTERED(); 

                }
                break;
            case 72 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:679: KW_SORTED
                {
                mKW_SORTED(); 

                }
                break;
            case 73 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:689: KW_INTO
                {
                mKW_INTO(); 

                }
                break;
            case 74 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:697: KW_BUCKETS
                {
                mKW_BUCKETS(); 

                }
                break;
            case 75 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:708: KW_ROW
                {
                mKW_ROW(); 

                }
                break;
            case 76 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:715: KW_FORMAT
                {
                mKW_FORMAT(); 

                }
                break;
            case 77 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:725: KW_DELIMITED
                {
                mKW_DELIMITED(); 

                }
                break;
            case 78 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:738: KW_FIELDS
                {
                mKW_FIELDS(); 

                }
                break;
            case 79 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:748: KW_TERMINATED
                {
                mKW_TERMINATED(); 

                }
                break;
            case 80 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:762: KW_ESCAPED
                {
                mKW_ESCAPED(); 

                }
                break;
            case 81 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:773: KW_COLLECTION
                {
                mKW_COLLECTION(); 

                }
                break;
            case 82 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:787: KW_ITEMS
                {
                mKW_ITEMS(); 

                }
                break;
            case 83 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:796: KW_KEYS
                {
                mKW_KEYS(); 

                }
                break;
            case 84 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:804: KW_KEY_TYPE
                {
                mKW_KEY_TYPE(); 

                }
                break;
            case 85 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:816: KW_LINES
                {
                mKW_LINES(); 

                }
                break;
            case 86 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:825: KW_STORED
                {
                mKW_STORED(); 

                }
                break;
            case 87 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:835: KW_SEQUENCEFILE
                {
                mKW_SEQUENCEFILE(); 

                }
                break;
            case 88 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:851: KW_TEXTFILE
                {
                mKW_TEXTFILE(); 

                }
                break;
            case 89 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:863: KW_RCFILE
                {
                mKW_RCFILE(); 

                }
                break;
            case 90 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:873: KW_INPUTFORMAT
                {
                mKW_INPUTFORMAT(); 

                }
                break;
            case 91 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:888: KW_OUTPUTFORMAT
                {
                mKW_OUTPUTFORMAT(); 

                }
                break;
            case 92 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:904: KW_LOCATION
                {
                mKW_LOCATION(); 

                }
                break;
            case 93 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:916: KW_TABLESAMPLE
                {
                mKW_TABLESAMPLE(); 

                }
                break;
            case 94 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:931: KW_BUCKET
                {
                mKW_BUCKET(); 

                }
                break;
            case 95 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:941: KW_OUT
                {
                mKW_OUT(); 

                }
                break;
            case 96 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:948: KW_OF
                {
                mKW_OF(); 

                }
                break;
            case 97 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:954: KW_CAST
                {
                mKW_CAST(); 

                }
                break;
            case 98 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:962: KW_ADD
                {
                mKW_ADD(); 

                }
                break;
            case 99 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:969: KW_REPLACE
                {
                mKW_REPLACE(); 

                }
                break;
            case 100 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:980: KW_COLUMNS
                {
                mKW_COLUMNS(); 

                }
                break;
            case 101 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:991: KW_RLIKE
                {
                mKW_RLIKE(); 

                }
                break;
            case 102 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1000: KW_REGEXP
                {
                mKW_REGEXP(); 

                }
                break;
            case 103 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1010: KW_TEMPORARY
                {
                mKW_TEMPORARY(); 

                }
                break;
            case 104 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1023: KW_FUNCTION
                {
                mKW_FUNCTION(); 

                }
                break;
            case 105 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1035: KW_EXPLAIN
                {
                mKW_EXPLAIN(); 

                }
                break;
            case 106 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1046: KW_EXTENDED
                {
                mKW_EXTENDED(); 

                }
                break;
            case 107 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1058: KW_SERDE
                {
                mKW_SERDE(); 

                }
                break;
            case 108 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1067: KW_WITH
                {
                mKW_WITH(); 

                }
                break;
            case 109 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1075: KW_SERDEPROPERTIES
                {
                mKW_SERDEPROPERTIES(); 

                }
                break;
            case 110 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1094: KW_LIMIT
                {
                mKW_LIMIT(); 

                }
                break;
            case 111 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1103: KW_SET
                {
                mKW_SET(); 

                }
                break;
            case 112 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1110: KW_PROPERTIES
                {
                mKW_PROPERTIES(); 

                }
                break;
            case 113 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1124: KW_VALUE_TYPE
                {
                mKW_VALUE_TYPE(); 

                }
                break;
            case 114 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1138: KW_ELEM_TYPE
                {
                mKW_ELEM_TYPE(); 

                }
                break;
            case 115 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1151: KW_CASE
                {
                mKW_CASE(); 

                }
                break;
            case 116 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1159: KW_WHEN
                {
                mKW_WHEN(); 

                }
                break;
            case 117 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1167: KW_THEN
                {
                mKW_THEN(); 

                }
                break;
            case 118 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1175: KW_ELSE
                {
                mKW_ELSE(); 

                }
                break;
            case 119 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1183: KW_END
                {
                mKW_END(); 

                }
                break;
            case 120 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1190: KW_MAPJOIN
                {
                mKW_MAPJOIN(); 

                }
                break;
            case 121 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1201: KW_CLUSTERSTATUS
                {
                mKW_CLUSTERSTATUS(); 

                }
                break;
            case 122 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1218: KW_UTC
                {
                mKW_UTC(); 

                }
                break;
            case 123 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1225: KW_UTCTIMESTAMP
                {
                mKW_UTCTIMESTAMP(); 

                }
                break;
            case 124 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1241: KW_LONG
                {
                mKW_LONG(); 

                }
                break;
            case 125 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1249: KW_DELETE
                {
                mKW_DELETE(); 

                }
                break;
            case 126 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1259: KW_PLUS
                {
                mKW_PLUS(); 

                }
                break;
            case 127 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1267: KW_MINUS
                {
                mKW_MINUS(); 

                }
                break;
            case 128 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1276: KW_FETCH
                {
                mKW_FETCH(); 

                }
                break;
            case 129 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1285: KW_INTERSECT
                {
                mKW_INTERSECT(); 

                }
                break;
            case 130 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1298: KW_VIEW
                {
                mKW_VIEW(); 

                }
                break;
            case 131 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1306: KW_IN
                {
                mKW_IN(); 

                }
                break;
            case 132 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1312: KW_DATABASE
                {
                mKW_DATABASE(); 

                }
                break;
            case 133 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1324: KW_MATERIALIZED
                {
                mKW_MATERIALIZED(); 

                }
                break;
            case 134 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1340: KW_SCHEMA
                {
                mKW_SCHEMA(); 

                }
                break;
            case 135 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1350: KW_SCHEMAS
                {
                mKW_SCHEMAS(); 

                }
                break;
            case 136 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1361: KW_GRANT
                {
                mKW_GRANT(); 

                }
                break;
            case 137 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1370: KW_REVOKE
                {
                mKW_REVOKE(); 

                }
                break;
            case 138 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1380: KW_SSL
                {
                mKW_SSL(); 

                }
                break;
            case 139 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1387: KW_UNDO
                {
                mKW_UNDO(); 

                }
                break;
            case 140 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1395: KW_LOCK
                {
                mKW_LOCK(); 

                }
                break;
            case 141 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1403: KW_UNLOCK
                {
                mKW_UNLOCK(); 

                }
                break;
            case 142 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1413: KW_PROCEDURE
                {
                mKW_PROCEDURE(); 

                }
                break;
            case 143 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1426: KW_UNSIGNED
                {
                mKW_UNSIGNED(); 

                }
                break;
            case 144 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1438: KW_WHILE
                {
                mKW_WHILE(); 

                }
                break;
            case 145 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1447: KW_READ
                {
                mKW_READ(); 

                }
                break;
            case 146 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1455: KW_READS
                {
                mKW_READS(); 

                }
                break;
            case 147 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1464: KW_PURGE
                {
                mKW_PURGE(); 

                }
                break;
            case 148 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1473: KW_RANGE
                {
                mKW_RANGE(); 

                }
                break;
            case 149 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1482: KW_ANALYZE
                {
                mKW_ANALYZE(); 

                }
                break;
            case 150 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1493: KW_BEFORE
                {
                mKW_BEFORE(); 

                }
                break;
            case 151 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1503: KW_BETWEEN
                {
                mKW_BETWEEN(); 

                }
                break;
            case 152 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1514: KW_BOTH
                {
                mKW_BOTH(); 

                }
                break;
            case 153 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1522: KW_BINARY
                {
                mKW_BINARY(); 

                }
                break;
            case 154 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1532: KW_CROSS
                {
                mKW_CROSS(); 

                }
                break;
            case 155 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1541: KW_CONTINUE
                {
                mKW_CONTINUE(); 

                }
                break;
            case 156 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1553: KW_CURSOR
                {
                mKW_CURSOR(); 

                }
                break;
            case 157 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1563: KW_TRIGGER
                {
                mKW_TRIGGER(); 

                }
                break;
            case 158 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1574: KW_RECORDREADER
                {
                mKW_RECORDREADER(); 

                }
                break;
            case 159 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1590: DOT
                {
                mDOT(); 

                }
                break;
            case 160 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1594: COLON
                {
                mCOLON(); 

                }
                break;
            case 161 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1600: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 162 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1606: SEMICOLON
                {
                mSEMICOLON(); 

                }
                break;
            case 163 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1616: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 164 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1623: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 165 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1630: LSQUARE
                {
                mLSQUARE(); 

                }
                break;
            case 166 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1638: RSQUARE
                {
                mRSQUARE(); 

                }
                break;
            case 167 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1646: LCURLY
                {
                mLCURLY(); 

                }
                break;
            case 168 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1653: RCURLY
                {
                mRCURLY(); 

                }
                break;
            case 169 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1660: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 170 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1666: NOTEQUAL
                {
                mNOTEQUAL(); 

                }
                break;
            case 171 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1675: LESSTHANOREQUALTO
                {
                mLESSTHANOREQUALTO(); 

                }
                break;
            case 172 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1693: LESSTHAN
                {
                mLESSTHAN(); 

                }
                break;
            case 173 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1702: GREATERTHANOREQUALTO
                {
                mGREATERTHANOREQUALTO(); 

                }
                break;
            case 174 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1723: GREATERTHAN
                {
                mGREATERTHAN(); 

                }
                break;
            case 175 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1735: DIVIDE
                {
                mDIVIDE(); 

                }
                break;
            case 176 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1742: PLUS
                {
                mPLUS(); 

                }
                break;
            case 177 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1747: MINUS
                {
                mMINUS(); 

                }
                break;
            case 178 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1753: STAR
                {
                mSTAR(); 

                }
                break;
            case 179 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1758: MOD
                {
                mMOD(); 

                }
                break;
            case 180 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1762: DIV
                {
                mDIV(); 

                }
                break;
            case 181 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1766: AMPERSAND
                {
                mAMPERSAND(); 

                }
                break;
            case 182 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1776: TILDE
                {
                mTILDE(); 

                }
                break;
            case 183 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1782: BITWISEOR
                {
                mBITWISEOR(); 

                }
                break;
            case 184 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1792: BITWISEXOR
                {
                mBITWISEXOR(); 

                }
                break;
            case 185 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1803: QUESTION
                {
                mQUESTION(); 

                }
                break;
            case 186 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1812: DOLLAR
                {
                mDOLLAR(); 

                }
                break;
            case 187 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1819: StringLiteral
                {
                mStringLiteral(); 

                }
                break;
            case 188 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1833: CharSetLiteral
                {
                mCharSetLiteral(); 

                }
                break;
            case 189 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1848: Number
                {
                mNumber(); 

                }
                break;
            case 190 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1855: Identifier
                {
                mIdentifier(); 

                }
                break;
            case 191 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1866: CharSetName
                {
                mCharSetName(); 

                }
                break;
            case 192 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1878: WS
                {
                mWS(); 

                }
                break;
            case 193 :
                // /home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g:1:1881: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\24\62\1\u0088\1\62\13\uffff\1\u008c\1\u008e\2\uffff\1\u0090"+
        "\11\uffff\2\u0099\3\uffff\3\62\1\u00a1\12\62\1\u00b0\6\62\1\u00b9"+
        "\1\u00bb\1\u00bc\5\62\1\u00c9\1\u00ca\1\u00cb\12\62\1\u00db\45\62"+
        "\4\uffff\1\62\11\uffff\1\u0119\2\uffff\1\u0119\2\62\1\uffff\1\u0099"+
        "\6\62\1\uffff\15\62\1\u0130\1\uffff\1\u0131\2\62\1\u0134\1\62\1"+
        "\u0136\1\62\1\u013a\1\uffff\1\62\2\uffff\1\u013c\10\62\1\u0148\2"+
        "\62\3\uffff\6\62\1\u0152\1\62\1\u0154\6\62\1\uffff\17\62\1\u016d"+
        "\5\62\1\u0173\12\62\1\u017e\10\62\1\u0188\7\62\1\u0191\12\62\3\uffff"+
        "\1\u019e\1\u0099\1\u019f\10\62\1\u01a8\1\62\1\u01aa\2\62\1\u01ad"+
        "\4\62\2\uffff\2\62\1\uffff\1\62\1\uffff\3\62\1\uffff\1\62\1\uffff"+
        "\1\u01b9\1\u01ba\1\u01bb\3\62\1\u01c0\1\u01c1\1\u01c2\1\u01c3\1"+
        "\62\1\uffff\10\62\1\u01ce\1\uffff\1\62\1\uffff\1\62\1\u01d3\2\62"+
        "\1\u01d7\1\u01d9\1\u01da\3\62\1\u01de\6\62\1\u01e5\2\62\1\u01e8"+
        "\3\62\1\uffff\1\u01ed\1\u01ee\3\62\1\uffff\1\62\1\u01f3\2\62\1\u01f7"+
        "\5\62\1\uffff\5\62\1\u0202\1\62\1\u0204\1\62\1\uffff\4\62\1\u020a"+
        "\3\62\1\uffff\7\62\1\u0215\1\u0216\1\62\1\u0218\1\u0219\2\uffff"+
        "\2\62\1\u021d\5\62\1\uffff\1\62\1\uffff\1\62\1\u0225\1\uffff\1\u0226"+
        "\2\62\1\u0229\1\u022a\1\62\1\u022c\1\62\1\u022e\1\62\1\u0230\3\uffff"+
        "\1\u0231\1\u0232\1\62\1\u0234\4\uffff\4\62\1\u0239\5\62\1\uffff"+
        "\4\62\1\uffff\3\62\1\uffff\1\62\2\uffff\3\62\1\uffff\4\62\1\u024e"+
        "\1\u024f\1\uffff\1\u0250\1\u0251\1\uffff\1\62\1\u0254\2\62\2\uffff"+
        "\4\62\1\uffff\1\u025b\1\62\1\u025d\1\uffff\6\62\1\u0264\1\u0265"+
        "\2\62\1\uffff\1\u0268\1\uffff\2\62\1\u026b\1\u026c\1\62\1\uffff"+
        "\1\62\1\u026f\1\62\1\u0271\6\62\2\uffff\1\62\2\uffff\2\62\1\u027c"+
        "\1\uffff\7\62\2\uffff\1\u0284\1\u0285\2\uffff\1\62\1\uffff\1\62"+
        "\1\uffff\1\62\3\uffff\1\62\1\uffff\1\62\1\u028b\1\u028c\1\62\1\uffff"+
        "\3\62\1\u0291\6\62\1\u0298\2\62\1\u029b\1\u029d\1\62\1\u029f\1\u02a0"+
        "\1\62\1\u02a2\4\uffff\1\u02a3\1\62\1\uffff\1\62\1\u02a6\1\u02a7"+
        "\1\u02a8\1\62\1\u02ab\1\uffff\1\u02ac\1\uffff\1\62\1\u02ae\1\u02af"+
        "\1\62\1\u02b1\1\u02b2\2\uffff\2\62\1\uffff\2\62\2\uffff\1\62\1\u02b8"+
        "\1\uffff\1\62\1\uffff\1\u02ba\5\62\1\u02c0\1\62\1\u02c2\1\62\1\uffff"+
        "\1\u02c4\6\62\2\uffff\1\u02cb\4\62\2\uffff\3\62\1\u02d3\1\uffff"+
        "\1\u02d4\5\62\1\uffff\2\62\1\uffff\1\u02dc\1\uffff\1\u02dd\2\uffff"+
        "\1\u02de\2\uffff\2\62\3\uffff\1\62\1\u02e2\2\uffff\1\62\2\uffff"+
        "\1\u02e4\2\uffff\2\62\1\u02e7\2\62\1\uffff\1\62\1\uffff\1\u02ed"+
        "\1\62\1\u02ef\1\62\1\u02f1\1\uffff\1\62\1\uffff\1\62\1\uffff\1\62"+
        "\1\u02f5\3\62\1\u02fa\1\uffff\2\62\1\u02fd\2\62\1\u0300\1\u0301"+
        "\2\uffff\1\u0302\2\62\1\u0305\1\62\1\u0307\1\u0308\3\uffff\2\62"+
        "\1\u030b\1\uffff\1\62\1\uffff\2\62\1\uffff\1\62\1\u0310\3\62\1\uffff"+
        "\1\u0314\1\uffff\1\62\1\uffff\1\u0316\1\62\1\u0318\1\uffff\1\u0319"+
        "\2\62\1\u031c\1\uffff\1\u031d\1\62\1\uffff\1\u031f\1\62\3\uffff"+
        "\1\62\1\u0322\1\uffff\1\u0323\2\uffff\2\62\1\uffff\1\62\1\u0329"+
        "\1\u032a\1\62\1\uffff\1\62\1\u032d\1\62\1\uffff\1\62\1\uffff\1\62"+
        "\2\uffff\1\u0331\1\62\2\uffff\1\62\1\uffff\1\62\1\u0335\2\uffff"+
        "\3\62\1\u0339\1\62\2\uffff\2\62\1\uffff\1\62\1\u033e\1\u033f\1\uffff"+
        "\2\62\1\u0342\1\uffff\3\62\1\uffff\1\u0346\3\62\2\uffff\1\62\1\u034b"+
        "\1\uffff\1\62\1\u034d\1\u034e\1\uffff\1\u034f\1\u0350\1\62\1\u0352"+
        "\1\uffff\1\62\4\uffff\1\u0354\1\uffff\1\62\1\uffff\1\u0356\1\uffff";
    static final String DFA17_eofS =
        "\u0357\uffff";
    static final String DFA17_minS =
        "\1\11\2\101\1\104\1\106\1\117\1\105\1\106\1\114\1\101\1\105\1\122"+
        "\1\110\1\103\1\117\3\101\1\116\1\101\2\105\1\111\13\uffff\2\75\2"+
        "\uffff\1\55\7\uffff\2\0\2\60\3\uffff\1\101\1\102\1\115\1\60\1\115"+
        "\1\105\3\114\2\117\1\105\1\122\1\124\1\60\1\114\1\101\1\122\1\104"+
        "\1\105\1\124\3\60\1\124\1\114\1\106\1\113\1\101\3\60\1\105\1\111"+
        "\1\103\1\123\1\104\1\122\1\114\1\124\1\117\1\125\1\60\1\103\1\117"+
        "\1\107\1\106\1\101\1\105\1\124\1\114\1\122\2\117\1\101\1\114\1\110"+
        "\1\111\1\107\1\101\1\127\1\106\1\111\1\116\1\122\1\117\1\125\1\122"+
        "\1\103\1\120\1\116\1\104\1\111\1\103\1\105\1\125\1\114\1\123\1\122"+
        "\1\131\4\uffff\1\105\7\uffff\2\0\1\42\2\0\1\42\1\60\1\53\1\uffff"+
        "\1\60\1\105\1\116\1\107\1\114\1\131\1\105\1\uffff\1\124\1\120\1"+
        "\115\1\116\1\120\1\114\1\103\1\123\1\115\1\101\1\114\1\115\1\103"+
        "\1\60\1\uffff\1\60\1\105\1\114\1\60\1\101\1\60\1\122\1\60\1\uffff"+
        "\1\105\2\uffff\1\60\1\114\1\124\2\105\1\111\1\101\1\107\1\104\1"+
        "\60\1\105\1\101\3\uffff\1\115\1\105\1\114\1\123\1\101\1\105\1\60"+
        "\1\124\1\60\1\105\1\103\1\105\1\101\1\120\1\102\1\uffff\1\113\1"+
        "\114\1\110\1\111\1\101\1\127\1\117\1\125\2\116\1\114\1\110\1\105"+
        "\1\104\1\125\1\60\1\124\1\127\1\122\1\111\1\114\1\60\1\105\1\116"+
        "\1\110\1\101\1\104\1\117\1\105\1\117\1\114\1\125\1\60\1\111\1\113"+
        "\1\107\1\124\1\103\1\123\1\107\1\113\1\60\1\105\1\125\1\117\1\111"+
        "\2\117\1\116\1\60\1\123\1\101\1\123\1\124\1\114\1\115\1\105\2\123"+
        "\1\127\1\0\1\uffff\1\0\3\60\1\123\1\107\1\105\1\111\1\123\1\106"+
        "\1\117\1\111\1\60\1\122\1\60\1\124\1\105\1\60\1\124\1\104\1\101"+
        "\1\110\2\uffff\1\122\1\131\1\uffff\1\131\1\uffff\1\127\1\122\1\125"+
        "\1\uffff\1\122\1\uffff\3\60\1\123\1\124\1\114\4\60\1\122\1\uffff"+
        "\1\122\2\124\1\123\1\116\1\101\1\124\1\120\1\60\1\uffff\1\111\1"+
        "\uffff\1\103\1\60\1\115\1\124\3\60\1\114\2\105\1\60\1\116\1\122"+
        "\1\105\1\122\1\120\1\124\1\60\2\105\1\60\1\103\2\105\1\uffff\2\60"+
        "\1\105\1\116\1\114\1\uffff\1\115\1\60\1\124\1\115\1\60\1\122\1\130"+
        "\1\113\1\101\1\103\1\uffff\1\114\2\105\1\111\1\105\1\60\1\105\1"+
        "\60\1\117\1\uffff\1\122\1\123\1\116\1\107\1\60\1\103\1\107\1\124"+
        "\1\uffff\1\123\2\124\1\111\1\115\2\105\2\60\1\117\2\60\2\uffff\1"+
        "\106\1\105\1\60\1\116\1\124\1\111\1\122\1\116\1\uffff\1\117\1\uffff"+
        "\1\111\1\60\1\uffff\1\60\1\123\1\124\2\60\1\132\1\60\1\122\1\60"+
        "\1\124\1\60\3\uffff\2\60\1\111\1\60\4\uffff\1\123\1\124\1\110\1"+
        "\106\1\60\1\104\1\116\1\111\1\123\1\105\1\uffff\1\116\1\111\1\124"+
        "\1\111\1\uffff\1\111\1\105\1\111\1\uffff\1\101\2\uffff\1\105\1\124"+
        "\1\101\1\uffff\1\124\1\131\2\105\2\60\1\uffff\2\60\1\uffff\1\124"+
        "\1\60\1\116\1\104\2\uffff\1\104\1\107\1\111\1\101\1\uffff\1\60\1"+
        "\105\1\60\1\uffff\1\104\1\120\1\105\1\103\2\105\2\60\1\124\1\104"+
        "\1\uffff\1\60\1\uffff\2\111\2\60\1\116\1\uffff\1\113\1\60\1\115"+
        "\1\60\2\105\2\116\1\103\1\116\2\uffff\1\122\2\uffff\1\117\1\122"+
        "\1\60\1\uffff\1\124\1\101\1\114\2\101\1\120\1\117\2\uffff\2\60\2"+
        "\uffff\1\105\1\uffff\1\111\1\uffff\1\106\3\uffff\1\117\1\uffff\1"+
        "\105\2\60\1\117\1\uffff\1\105\1\101\1\116\1\60\1\104\1\103\1\102"+
        "\1\117\1\102\1\124\1\60\1\115\1\123\2\60\1\116\2\60\1\116\1\60\4"+
        "\uffff\1\60\1\122\1\uffff\1\103\3\60\1\116\1\60\1\uffff\1\60\1\uffff"+
        "\1\122\2\60\1\105\2\60\2\uffff\1\111\1\125\1\uffff\1\116\1\101\2"+
        "\uffff\1\105\1\60\1\uffff\1\105\1\uffff\1\60\1\122\1\125\1\123\2"+
        "\124\1\60\1\122\1\60\1\115\1\uffff\1\60\1\115\1\105\1\122\1\124"+
        "\1\105\1\116\2\uffff\1\60\1\124\1\117\1\116\1\103\2\uffff\1\122"+
        "\1\104\1\114\1\60\1\uffff\1\60\1\124\1\125\1\122\2\105\1\uffff\2"+
        "\105\1\uffff\1\60\1\uffff\1\60\2\uffff\1\60\2\uffff\1\117\1\105"+
        "\3\uffff\1\124\1\60\2\uffff\1\105\2\uffff\1\60\2\uffff\1\117\1\122"+
        "\1\60\1\114\1\104\1\uffff\1\123\1\uffff\1\60\1\105\1\60\1\111\1"+
        "\60\1\uffff\1\115\1\uffff\1\120\1\uffff\1\120\1\60\1\131\1\105\1"+
        "\122\1\60\1\uffff\1\105\1\122\1\60\1\124\1\115\2\60\2\uffff\1\60"+
        "\1\124\1\131\1\60\1\104\2\60\3\uffff\1\120\1\106\1\60\1\uffff\1"+
        "\101\1\uffff\1\116\1\105\1\uffff\1\111\1\60\1\124\1\104\1\124\1"+
        "\uffff\1\60\1\uffff\1\117\1\uffff\1\60\1\114\1\60\1\uffff\1\60\1"+
        "\104\1\124\1\60\1\uffff\1\60\1\115\1\uffff\1\60\1\101\3\uffff\1"+
        "\105\1\60\1\uffff\1\60\2\uffff\1\105\1\111\1\uffff\1\104\2\60\1"+
        "\132\1\uffff\1\101\1\60\1\101\1\uffff\1\116\1\uffff\1\105\2\uffff"+
        "\1\60\1\111\2\uffff\1\101\1\uffff\1\124\1\60\2\uffff\1\122\1\114"+
        "\1\105\1\60\1\104\2\uffff\1\105\1\115\1\uffff\1\124\2\60\1\uffff"+
        "\1\105\1\124\1\60\1\uffff\1\124\1\105\1\122\1\uffff\1\60\1\104\1"+
        "\120\1\125\2\uffff\1\123\1\60\1\uffff\1\111\2\60\1\uffff\2\60\1"+
        "\123\1\60\1\uffff\1\105\4\uffff\1\60\1\uffff\1\123\1\uffff\1\60"+
        "\1\uffff";
    static final String DFA17_maxS =
        "\1\176\1\122\1\125\1\123\1\126\1\125\1\117\1\124\1\130\1\122\1\131"+
        "\1\122\1\111\1\124\2\117\1\125\1\123\1\124\1\125\1\105\1\126\1\111"+
        "\13\uffff\1\76\1\75\2\uffff\1\55\7\uffff\2\ufffe\2\172\3\uffff\1"+
        "\125\1\102\1\116\1\172\1\130\1\105\1\114\1\116\1\114\2\117\1\105"+
        "\1\122\1\124\1\172\1\124\1\104\1\122\1\104\1\105\1\124\3\172\1\124"+
        "\1\114\1\106\2\116\3\172\1\105\1\124\1\103\1\123\1\104\1\126\1\123"+
        "\1\124\1\117\1\125\1\172\1\103\1\124\1\116\1\124\1\117\1\111\2\124"+
        "\1\122\1\117\1\122\1\101\1\114\1\110\1\111\1\107\1\126\1\127\1\106"+
        "\1\111\1\116\1\122\1\117\1\125\1\122\1\103\1\124\1\116\1\123\1\111"+
        "\1\103\1\117\1\125\1\116\1\123\1\122\1\131\4\uffff\1\105\7\uffff"+
        "\2\ufffe\1\47\2\ufffe\1\47\1\146\1\71\1\uffff\1\172\1\105\1\116"+
        "\1\107\1\114\1\131\1\105\1\uffff\1\124\1\120\1\115\1\116\1\120\1"+
        "\114\1\103\1\123\1\115\1\101\1\114\1\115\1\103\1\172\1\uffff\1\172"+
        "\1\105\1\114\1\172\1\101\1\172\1\122\1\172\1\uffff\1\105\2\uffff"+
        "\1\172\1\114\1\124\2\105\1\111\1\113\1\107\1\104\1\172\1\105\1\125"+
        "\3\uffff\1\115\1\105\1\114\1\123\1\101\1\105\1\172\1\124\1\172\1"+
        "\105\1\103\1\111\1\105\1\120\1\102\1\uffff\1\113\1\114\1\110\1\111"+
        "\1\101\1\127\1\117\1\125\1\116\1\122\1\114\1\110\1\105\1\104\1\125"+
        "\1\172\1\124\1\127\1\122\1\111\1\114\1\172\1\105\1\116\1\110\1\101"+
        "\1\104\1\117\1\105\1\117\1\114\1\125\1\172\1\111\1\113\1\107\1\124"+
        "\1\103\1\123\1\107\1\113\1\172\1\105\1\125\1\117\1\111\2\117\1\116"+
        "\1\172\1\123\1\101\1\123\1\124\1\125\1\115\1\124\2\123\1\127\1\ufffe"+
        "\1\uffff\1\ufffe\3\172\1\123\1\107\1\105\1\111\1\123\1\106\1\117"+
        "\1\111\1\172\1\122\1\172\1\124\1\105\1\172\1\124\1\104\1\101\1\110"+
        "\2\uffff\1\122\1\131\1\uffff\1\131\1\uffff\1\127\1\122\1\125\1\uffff"+
        "\1\122\1\uffff\3\172\1\123\2\124\4\172\1\122\1\uffff\1\122\2\124"+
        "\1\123\1\122\1\101\1\124\1\120\1\172\1\uffff\1\122\1\uffff\1\103"+
        "\1\172\1\115\1\124\3\172\1\114\2\105\1\172\1\116\1\122\1\105\1\122"+
        "\1\120\1\124\1\172\2\105\1\172\1\103\2\105\1\uffff\2\172\1\105\1"+
        "\116\1\114\1\uffff\1\115\1\172\1\124\1\115\1\172\1\122\1\130\1\113"+
        "\1\101\1\103\1\uffff\1\114\2\105\1\111\1\105\1\172\1\105\1\172\1"+
        "\117\1\uffff\1\122\1\123\1\116\1\107\1\172\1\103\1\107\1\124\1\uffff"+
        "\1\123\2\124\1\111\1\115\2\105\2\172\1\117\2\172\2\uffff\1\106\1"+
        "\105\1\172\1\116\1\124\1\111\1\122\1\116\1\uffff\1\117\1\uffff\1"+
        "\111\1\172\1\uffff\1\172\1\123\1\124\2\172\1\132\1\172\1\122\1\172"+
        "\1\124\1\172\3\uffff\2\172\1\111\1\172\4\uffff\1\123\1\124\1\110"+
        "\1\106\1\172\1\104\1\116\1\111\1\123\1\105\1\uffff\1\116\1\111\1"+
        "\124\1\111\1\uffff\1\111\1\105\1\111\1\uffff\1\101\2\uffff\1\105"+
        "\1\124\1\101\1\uffff\1\124\1\131\2\105\2\172\1\uffff\2\172\1\uffff"+
        "\1\124\1\172\1\116\1\104\2\uffff\1\104\1\107\1\111\1\101\1\uffff"+
        "\1\172\1\105\1\172\1\uffff\1\104\1\120\1\105\1\103\2\105\2\172\1"+
        "\124\1\104\1\uffff\1\172\1\uffff\2\111\2\172\1\116\1\uffff\1\113"+
        "\1\172\1\115\1\172\2\105\2\116\1\103\1\116\2\uffff\1\122\2\uffff"+
        "\1\117\1\122\1\172\1\uffff\1\124\1\101\1\114\2\101\1\120\1\117\2"+
        "\uffff\2\172\2\uffff\1\105\1\uffff\1\111\1\uffff\1\106\3\uffff\1"+
        "\117\1\uffff\1\105\2\172\1\117\1\uffff\1\105\1\101\1\116\1\172\1"+
        "\104\1\103\1\102\1\117\1\102\1\124\1\172\1\115\1\123\2\172\1\116"+
        "\2\172\1\116\1\172\4\uffff\1\172\1\122\1\uffff\1\103\3\172\1\116"+
        "\1\172\1\uffff\1\172\1\uffff\1\122\2\172\1\105\2\172\2\uffff\1\111"+
        "\1\125\1\uffff\1\116\1\101\2\uffff\1\105\1\172\1\uffff\1\105\1\uffff"+
        "\1\172\1\122\1\125\1\123\2\124\1\172\1\122\1\172\1\115\1\uffff\1"+
        "\172\1\115\1\105\1\122\1\124\1\105\1\116\2\uffff\1\172\1\124\1\117"+
        "\1\116\1\103\2\uffff\1\122\1\104\1\114\1\172\1\uffff\1\172\1\124"+
        "\1\125\1\122\2\105\1\uffff\2\105\1\uffff\1\172\1\uffff\1\172\2\uffff"+
        "\1\172\2\uffff\1\117\1\105\3\uffff\1\124\1\172\2\uffff\1\105\2\uffff"+
        "\1\172\2\uffff\1\117\1\122\1\172\1\114\1\104\1\uffff\1\123\1\uffff"+
        "\1\172\1\105\1\172\1\111\1\172\1\uffff\1\115\1\uffff\1\120\1\uffff"+
        "\1\120\1\172\1\131\1\105\1\122\1\172\1\uffff\1\105\1\122\1\172\1"+
        "\124\1\115\2\172\2\uffff\1\172\1\124\1\131\1\172\1\104\2\172\3\uffff"+
        "\1\120\1\106\1\172\1\uffff\1\101\1\uffff\1\116\1\105\1\uffff\1\111"+
        "\1\172\1\124\1\104\1\124\1\uffff\1\172\1\uffff\1\117\1\uffff\1\172"+
        "\1\114\1\172\1\uffff\1\172\1\104\1\124\1\172\1\uffff\1\172\1\115"+
        "\1\uffff\1\172\1\101\3\uffff\1\105\1\172\1\uffff\1\172\2\uffff\1"+
        "\105\1\111\1\uffff\1\104\2\172\1\132\1\uffff\1\101\1\172\1\101\1"+
        "\uffff\1\116\1\uffff\1\105\2\uffff\1\172\1\111\2\uffff\1\101\1\uffff"+
        "\1\124\1\172\2\uffff\1\122\1\114\1\105\1\172\1\104\2\uffff\1\105"+
        "\1\115\1\uffff\1\124\2\172\1\uffff\1\105\1\124\1\172\1\uffff\1\124"+
        "\1\105\1\122\1\uffff\1\172\1\104\1\120\1\125\2\uffff\1\123\1\172"+
        "\1\uffff\1\111\2\172\1\uffff\2\172\1\123\1\172\1\uffff\1\105\4\uffff"+
        "\1\172\1\uffff\1\123\1\uffff\1\172\1\uffff";
    static final String DFA17_acceptS =
        "\27\uffff\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u00a4\1\u00a5"+
        "\1\u00a6\1\u00a7\1\u00a8\1\u00a9\2\uffff\1\u00af\1\u00b0\1\uffff"+
        "\1\u00b2\1\u00b3\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\4\uffff"+
        "\1\u00be\1\u00bf\1\u00c0\120\uffff\1\124\1\161\1\162\1\u00ba\1\uffff"+
        "\1\u00ab\1\u00aa\1\u00ac\1\u00ad\1\u00ae\1\u00c1\1\u00b1\10\uffff"+
        "\1\u00bd\7\uffff\1\66\16\uffff\1\21\10\uffff\1\33\1\uffff\1\5\1"+
        "\140\14\uffff\1\u0083\1\10\1\56\17\uffff\1\15\75\uffff\1\u00bb\26"+
        "\uffff\1\12\1\3\2\uffff\1\4\1\uffff\1\142\3\uffff\1\137\1\uffff"+
        "\1\6\13\uffff\1\73\11\uffff\1\167\1\uffff\1\u00b4\30\uffff\1\157"+
        "\5\uffff\1\u008a\12\uffff\1\113\11\uffff\1\104\10\uffff\1\172\14"+
        "\uffff\1\u00bc\1\1\10\uffff\1\165\1\uffff\1\32\2\uffff\1\20\13\uffff"+
        "\1\57\1\30\1\7\4\uffff\1\u008c\1\174\1\53\1\111\12\uffff\1\166\4"+
        "\uffff\1\13\3\uffff\1\77\1\uffff\1\54\1\64\3\uffff\1\u0098\6\uffff"+
        "\1\164\2\uffff\1\154\4\uffff\1\51\1\41\4\uffff\1\27\3\uffff\1\u0091"+
        "\12\uffff\1\176\1\uffff\1\42\5\uffff\1\u008b\12\uffff\1\163\1\141"+
        "\1\uffff\1\123\1\u0082\3\uffff\1\36\7\uffff\1\2\1\75\2\uffff\1\u0080"+
        "\1\62\1\uffff\1\103\1\uffff\1\26\1\uffff\1\14\1\125\1\156\1\uffff"+
        "\1\44\4\uffff\1\122\24\uffff\1\16\1\u0088\1\17\1\u0090\2\uffff\1"+
        "\153\6\uffff\1\31\1\uffff\1\u0092\6\uffff\1\145\1\u0094\2\uffff"+
        "\1\u0093\2\uffff\1\177\1\52\2\uffff\1\46\1\uffff\1\u009a\12\uffff"+
        "\1\37\7\uffff\1\116\1\114\5\uffff\1\24\1\55\4\uffff\1\11\6\uffff"+
        "\1\175\2\uffff\1\76\1\uffff\1\136\1\uffff\1\74\1\u0099\1\uffff\1"+
        "\u0096\1\22\2\uffff\1\110\1\126\1\102\2\uffff\1\u0086\1\65\1\uffff"+
        "\1\146\1\u0089\1\uffff\1\105\1\131\5\uffff\1\u008d\1\uffff\1\60"+
        "\5\uffff\1\u009c\1\uffff\1\u009d\1\uffff\1\71\6\uffff\1\u0095\7"+
        "\uffff\1\151\1\120\7\uffff\1\112\1\70\1\u0097\3\uffff\1\u0087\1"+
        "\uffff\1\143\2\uffff\1\170\5\uffff\1\47\1\uffff\1\144\1\uffff\1"+
        "\67\3\uffff\1\130\4\uffff\1\150\2\uffff\1\134\2\uffff\1\152\1\61"+
        "\1\23\2\uffff\1\63\1\uffff\1\100\1\u0084\2\uffff\1\72\4\uffff\1"+
        "\u008f\3\uffff\1\u009b\1\uffff\1\45\1\uffff\1\101\1\147\2\uffff"+
        "\1\40\1\25\1\uffff\1\u0081\2\uffff\1\43\1\115\5\uffff\1\34\1\u008e"+
        "\2\uffff\1\107\3\uffff\1\117\3\uffff\1\50\3\uffff\1\35\4\uffff\1"+
        "\121\1\135\2\uffff\1\132\3\uffff\1\106\4\uffff\1\133\1\uffff\1\127"+
        "\1\u009e\1\u0085\1\173\1\uffff\1\160\1\uffff\1\171\1\uffff\1\155";
    static final String DFA17_specialS =
        "\u0357\uffff}>";
    static final String[] DFA17_transitionS = {
            "\2\64\2\uffff\1\64\22\uffff\1\64\1\uffff\1\57\1\uffff\1\25\1"+
            "\50\1\51\1\56\1\33\1\34\1\47\1\45\1\31\1\46\1\27\1\44\1\60\11"+
            "\61\1\30\1\32\1\42\1\41\1\43\1\55\1\uffff\1\3\1\12\1\23\1\11"+
            "\1\10\1\2\1\13\1\62\1\7\1\16\1\24\1\6\1\21\1\5\1\4\1\20\1\62"+
            "\1\17\1\15\1\1\1\22\1\26\1\14\3\62\1\35\1\uffff\1\36\1\54\1"+
            "\63\33\62\1\37\1\53\1\40\1\52",
            "\1\66\1\73\2\uffff\1\71\2\uffff\1\72\1\67\5\uffff\1\70\2\uffff"+
            "\1\65",
            "\1\75\3\uffff\1\102\3\uffff\1\100\2\uffff\1\77\2\uffff\1\101"+
            "\2\uffff\1\76\2\uffff\1\74",
            "\1\107\7\uffff\1\104\1\uffff\1\105\3\uffff\1\106\1\103",
            "\1\114\7\uffff\1\112\3\uffff\1\113\2\uffff\1\111\1\110",
            "\1\115\5\uffff\1\116",
            "\1\117\3\uffff\1\120\5\uffff\1\121",
            "\1\123\7\uffff\1\122\4\uffff\1\124\1\125",
            "\1\130\1\uffff\1\131\4\uffff\1\127\4\uffff\1\126",
            "\1\134\3\uffff\1\133\3\uffff\1\132\5\uffff\1\136\2\uffff\1\135",
            "\1\143\3\uffff\1\142\5\uffff\1\141\5\uffff\1\140\3\uffff\1\137",
            "\1\144",
            "\1\145\1\146",
            "\1\155\1\uffff\1\147\2\uffff\1\151\4\uffff\1\153\1\uffff\1\150"+
            "\3\uffff\1\154\1\152",
            "\1\156",
            "\1\164\1\uffff\1\162\1\uffff\1\160\3\uffff\1\157\2\uffff\1\163"+
            "\2\uffff\1\161",
            "\1\165\12\uffff\1\167\5\uffff\1\166\2\uffff\1\170",
            "\1\172\7\uffff\1\173\11\uffff\1\171",
            "\1\174\4\uffff\1\175\1\176",
            "\1\u0082\12\uffff\1\u0080\2\uffff\1\u0081\2\uffff\1\177\2\uffff"+
            "\1\u0083",
            "\1\u0084",
            "\1\u0087\5\uffff\1\u0085\12\uffff\1\u0086",
            "\1\u0089",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u008a\1\u008b",
            "\1\u008d",
            "",
            "",
            "\1\u008f",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\47\u0091\1\u0093\64\u0091\1\u0092\uffa2\u0091",
            "\42\u0094\1\u0096\71\u0094\1\u0095\uffa2\u0094",
            "\12\u009a\7\uffff\27\62\1\u0097\2\62\4\uffff\1\62\1\uffff\4"+
            "\62\1\u0098\25\62",
            "\12\u009a\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0098\25"+
            "\62",
            "",
            "",
            "",
            "\1\u009c\7\uffff\1\u009d\13\uffff\1\u009b",
            "\1\u009e",
            "\1\u00a0\1\u009f",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00a3\4\uffff\1\u00a4\5\uffff\1\u00a2",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7\1\uffff\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\12\62\7\uffff\2\62\1\u00af\27\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00b1\7\uffff\1\u00b2",
            "\1\u00b3\2\uffff\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\3\62\1\u00ba\26\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0\1\uffff\1\u00c2\1\u00c1",
            "\1\u00c5\1\uffff\1\u00c3\12\uffff\1\u00c4",
            "\12\62\7\uffff\17\62\1\u00c8\2\62\1\u00c7\1\u00c6\6\62\4\uffff"+
            "\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00cc",
            "\1\u00cf\6\uffff\1\u00ce\3\uffff\1\u00cd",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d5\1\u00d3\2\uffff\1\u00d4",
            "\1\u00d7\6\uffff\1\u00d6",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00dc",
            "\1\u00dd\4\uffff\1\u00de",
            "\1\u00df\6\uffff\1\u00e0",
            "\1\u00e2\15\uffff\1\u00e1",
            "\1\u00e4\15\uffff\1\u00e3",
            "\1\u00e5\3\uffff\1\u00e6",
            "\1\u00e7",
            "\1\u00e8\4\uffff\1\u00ea\1\u00e9\1\uffff\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee\2\uffff\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f6\1\uffff\1\u00f7\1\u00fb\2\uffff\1\u00f8\6\uffff\1\u00f5"+
            "\1\uffff\1\u00fa\5\uffff\1\u00f9",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105\3\uffff\1\u0106",
            "\1\u0107",
            "\1\u010a\4\uffff\1\u0108\2\uffff\1\u010b\6\uffff\1\u0109",
            "\1\u010c",
            "\1\u010d",
            "\1\u010f\11\uffff\1\u010e",
            "\1\u0110",
            "\1\u0112\1\u0113\1\u0111",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "",
            "",
            "",
            "",
            "\1\u0117",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\47\u0091\1\u0093\64\u0091\1\u0092\uffa2\u0091",
            "\uffff\u0118",
            "\1\57\4\uffff\1\56",
            "\42\u0094\1\u0096\71\u0094\1\u0095\uffa2\u0094",
            "\uffff\u011a",
            "\1\57\4\uffff\1\56",
            "\12\u011b\7\uffff\6\u011b\32\uffff\6\u011b",
            "\1\u0099\1\uffff\1\u0099\2\uffff\12\u011c",
            "",
            "\12\u009a\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0098\25"+
            "\62",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0132",
            "\1\u0133",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0135",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0137",
            "\12\62\7\uffff\4\62\1\u0138\12\62\1\u0139\12\62\4\uffff\1\62"+
            "\1\uffff\32\62",
            "",
            "\1\u013b",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142\11\uffff\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\12\62\7\uffff\4\62\1\u0147\11\62\1\u0146\13\62\4\uffff\1\62"+
            "\1\uffff\32\62",
            "\1\u0149",
            "\1\u014a\23\uffff\1\u014b",
            "",
            "",
            "",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0153",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0155",
            "\1\u0156",
            "\1\u0158\3\uffff\1\u0157",
            "\1\u015a\3\uffff\1\u0159",
            "\1\u015b",
            "\1\u015c",
            "",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166\3\uffff\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\12\62\7\uffff\11\62\1\u0187\20\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\12\62\7\uffff\32\62\4\uffff\1\u0190\1\uffff\32\62",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0197\10\uffff\1\u0196",
            "\1\u0198",
            "\1\u0199\16\uffff\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "\47\u0091\1\u0093\64\u0091\1\u0092\uffa2\u0091",
            "",
            "\42\u0094\1\u0096\71\u0094\1\u0095\uffa2\u0094",
            "\12\u011b\7\uffff\6\u011b\24\62\4\uffff\1\62\1\uffff\6\u011b"+
            "\24\62",
            "\12\u011c\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u01a0",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u01a9",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u01ab",
            "\1\u01ac",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b1",
            "",
            "",
            "\1\u01b2",
            "\1\u01b3",
            "",
            "\1\u01b4",
            "",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "",
            "\1\u01b8",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u01bc",
            "\1\u01bd",
            "\1\u01bf\7\uffff\1\u01be",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u01c4",
            "",
            "\1\u01c5",
            "\1\u01c6",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9\3\uffff\1\u01ca",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\u01cf\10\uffff\1\u01d0",
            "",
            "\1\u01d1",
            "\12\62\7\uffff\21\62\1\u01d2\10\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u01d4",
            "\1\u01d5",
            "\12\62\7\uffff\23\62\1\u01d6\6\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\1\62\1\u01d8\30\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u01db",
            "\1\u01dc",
            "\1\u01dd",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u01df",
            "\1\u01e0",
            "\1\u01e1",
            "\1\u01e2",
            "\1\u01e3",
            "\1\u01e4",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u01e6",
            "\1\u01e7",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u01e9",
            "\1\u01ea",
            "\1\u01eb",
            "",
            "\12\62\7\uffff\4\62\1\u01ec\25\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u01ef",
            "\1\u01f0",
            "\1\u01f1",
            "",
            "\1\u01f2",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u01f4",
            "\1\u01f5",
            "\12\62\7\uffff\22\62\1\u01f6\7\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u01f8",
            "\1\u01f9",
            "\1\u01fa",
            "\1\u01fb",
            "\1\u01fc",
            "",
            "\1\u01fd",
            "\1\u01fe",
            "\1\u01ff",
            "\1\u0200",
            "\1\u0201",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0203",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0205",
            "",
            "\1\u0206",
            "\1\u0207",
            "\1\u0208",
            "\1\u0209",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u020b",
            "\1\u020c",
            "\1\u020d",
            "",
            "\1\u020e",
            "\1\u020f",
            "\1\u0210",
            "\1\u0211",
            "\1\u0212",
            "\1\u0213",
            "\1\u0214",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0217",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "\1\u021a",
            "\1\u021b",
            "\12\62\7\uffff\22\62\1\u021c\7\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u021e",
            "\1\u021f",
            "\1\u0220",
            "\1\u0221",
            "\1\u0222",
            "",
            "\1\u0223",
            "",
            "\1\u0224",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0227",
            "\1\u0228",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u022b",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u022d",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u022f",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0233",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "",
            "",
            "\1\u0235",
            "\1\u0236",
            "\1\u0237",
            "\1\u0238",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u023a",
            "\1\u023b",
            "\1\u023c",
            "\1\u023d",
            "\1\u023e",
            "",
            "\1\u023f",
            "\1\u0240",
            "\1\u0241",
            "\1\u0242",
            "",
            "\1\u0243",
            "\1\u0244",
            "\1\u0245",
            "",
            "\1\u0246",
            "",
            "",
            "\1\u0247",
            "\1\u0248",
            "\1\u0249",
            "",
            "\1\u024a",
            "\1\u024b",
            "\1\u024c",
            "\1\u024d",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\u0252",
            "\12\62\7\uffff\17\62\1\u0253\12\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0255",
            "\1\u0256",
            "",
            "",
            "\1\u0257",
            "\1\u0258",
            "\1\u0259",
            "\1\u025a",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u025c",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\u025e",
            "\1\u025f",
            "\1\u0260",
            "\1\u0261",
            "\1\u0262",
            "\1\u0263",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0266",
            "\1\u0267",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\u0269",
            "\1\u026a",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u026d",
            "",
            "\1\u026e",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0270",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0272",
            "\1\u0273",
            "\1\u0274",
            "\1\u0275",
            "\1\u0276",
            "\1\u0277",
            "",
            "",
            "\1\u0278",
            "",
            "",
            "\1\u0279",
            "\1\u027a",
            "\12\62\7\uffff\1\u027b\31\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\u027d",
            "\1\u027e",
            "\1\u027f",
            "\1\u0280",
            "\1\u0281",
            "\1\u0282",
            "\1\u0283",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "\1\u0286",
            "",
            "\1\u0287",
            "",
            "\1\u0288",
            "",
            "",
            "",
            "\1\u0289",
            "",
            "\1\u028a",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u028d",
            "",
            "\1\u028e",
            "\1\u028f",
            "\1\u0290",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0292",
            "\1\u0293",
            "\1\u0294",
            "\1\u0295",
            "\1\u0296",
            "\1\u0297",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0299",
            "\1\u029a",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\22\62\1\u029c\7\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u029e",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u02a1",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u02a4",
            "",
            "\1\u02a5",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u02a9",
            "\12\62\7\uffff\22\62\1\u02aa\7\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\u02ad",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u02b0",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "\1\u02b3",
            "\1\u02b4",
            "",
            "\1\u02b5",
            "\1\u02b6",
            "",
            "",
            "\1\u02b7",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\u02b9",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u02bb",
            "\1\u02bc",
            "\1\u02bd",
            "\1\u02be",
            "\1\u02bf",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u02c1",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u02c3",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u02c5",
            "\1\u02c6",
            "\1\u02c7",
            "\1\u02c8",
            "\1\u02c9",
            "\1\u02ca",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u02cc",
            "\1\u02cd",
            "\1\u02ce",
            "\1\u02cf",
            "",
            "",
            "\1\u02d0",
            "\1\u02d1",
            "\1\u02d2",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u02d5",
            "\1\u02d6",
            "\1\u02d7",
            "\1\u02d8",
            "\1\u02d9",
            "",
            "\1\u02da",
            "\1\u02db",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "\1\u02df",
            "\1\u02e0",
            "",
            "",
            "",
            "\1\u02e1",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "\1\u02e3",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "\1\u02e5",
            "\1\u02e6",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u02e8",
            "\1\u02e9",
            "",
            "\1\u02ea",
            "",
            "\12\62\7\uffff\4\62\1\u02eb\15\62\1\u02ec\7\62\4\uffff\1\62"+
            "\1\uffff\32\62",
            "\1\u02ee",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u02f0",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\u02f2",
            "",
            "\1\u02f3",
            "",
            "\1\u02f4",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u02f6",
            "\1\u02f7",
            "\1\u02f8",
            "\12\62\7\uffff\22\62\1\u02f9\7\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\u02fb",
            "\1\u02fc",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u02fe",
            "\1\u02ff",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0303",
            "\1\u0304",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0306",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "",
            "\1\u0309",
            "\1\u030a",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\u030c",
            "",
            "\1\u030d",
            "\1\u030e",
            "",
            "\1\u030f",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0311",
            "\1\u0312",
            "\1\u0313",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\u0315",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0317",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u031a",
            "\1\u031b",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u031e",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0320",
            "",
            "",
            "",
            "\1\u0321",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "\1\u0324",
            "\1\u0325",
            "",
            "\1\u0326",
            "\12\62\7\uffff\4\62\1\u0328\15\62\1\u0327\7\62\4\uffff\1\62"+
            "\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u032b",
            "",
            "\1\u032c",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u032e",
            "",
            "\1\u032f",
            "",
            "\1\u0330",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0332",
            "",
            "",
            "\1\u0333",
            "",
            "\1\u0334",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "\1\u0336",
            "\1\u0337",
            "\1\u0338",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u033a",
            "",
            "",
            "\1\u033b",
            "\1\u033c",
            "",
            "\1\u033d",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\u0340",
            "\1\u0341",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\u0343",
            "\1\u0344",
            "\1\u0345",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0347",
            "\1\u0348",
            "\1\u0349",
            "",
            "",
            "\1\u034a",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\u034c",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0351",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\u0353",
            "",
            "",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\u0355",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( KW_TRUE | KW_FALSE | KW_ALL | KW_AND | KW_OR | KW_NOT | KW_LIKE | KW_IF | KW_EXISTS | KW_ASC | KW_DESC | KW_ORDER | KW_BY | KW_GROUP | KW_WHERE | KW_FROM | KW_AS | KW_SELECT | KW_DISTINCT | KW_INSERT | KW_OVERWRITE | KW_OUTER | KW_JOIN | KW_LEFT | KW_RIGHT | KW_FULL | KW_ON | KW_PARTITION | KW_PARTITIONS | KW_TABLE | KW_TABLES | KW_FUNCTIONS | KW_SHOW | KW_MSCK | KW_DIRECTORY | KW_LOCAL | KW_TRANSFORM | KW_USING | KW_CLUSTER | KW_DISTRIBUTE | KW_SORT | KW_UNION | KW_LOAD | KW_DATA | KW_INPATH | KW_IS | KW_NULL | KW_CREATE | KW_EXTERNAL | KW_ALTER | KW_DESCRIBE | KW_DROP | KW_RENAME | KW_TO | KW_COMMENT | KW_BOOLEAN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_DOUBLE | KW_DATE | KW_DATETIME | KW_TIMESTAMP | KW_STRING | KW_ARRAY | KW_MAP | KW_REDUCE | KW_PARTITIONED | KW_CLUSTERED | KW_SORTED | KW_INTO | KW_BUCKETS | KW_ROW | KW_FORMAT | KW_DELIMITED | KW_FIELDS | KW_TERMINATED | KW_ESCAPED | KW_COLLECTION | KW_ITEMS | KW_KEYS | KW_KEY_TYPE | KW_LINES | KW_STORED | KW_SEQUENCEFILE | KW_TEXTFILE | KW_RCFILE | KW_INPUTFORMAT | KW_OUTPUTFORMAT | KW_LOCATION | KW_TABLESAMPLE | KW_BUCKET | KW_OUT | KW_OF | KW_CAST | KW_ADD | KW_REPLACE | KW_COLUMNS | KW_RLIKE | KW_REGEXP | KW_TEMPORARY | KW_FUNCTION | KW_EXPLAIN | KW_EXTENDED | KW_SERDE | KW_WITH | KW_SERDEPROPERTIES | KW_LIMIT | KW_SET | KW_PROPERTIES | KW_VALUE_TYPE | KW_ELEM_TYPE | KW_CASE | KW_WHEN | KW_THEN | KW_ELSE | KW_END | KW_MAPJOIN | KW_CLUSTERSTATUS | KW_UTC | KW_UTCTIMESTAMP | KW_LONG | KW_DELETE | KW_PLUS | KW_MINUS | KW_FETCH | KW_INTERSECT | KW_VIEW | KW_IN | KW_DATABASE | KW_MATERIALIZED | KW_SCHEMA | KW_SCHEMAS | KW_GRANT | KW_REVOKE | KW_SSL | KW_UNDO | KW_LOCK | KW_UNLOCK | KW_PROCEDURE | KW_UNSIGNED | KW_WHILE | KW_READ | KW_READS | KW_PURGE | KW_RANGE | KW_ANALYZE | KW_BEFORE | KW_BETWEEN | KW_BOTH | KW_BINARY | KW_CROSS | KW_CONTINUE | KW_CURSOR | KW_TRIGGER | KW_RECORDREADER | DOT | COLON | COMMA | SEMICOLON | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | EQUAL | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | DIVIDE | PLUS | MINUS | STAR | MOD | DIV | AMPERSAND | TILDE | BITWISEOR | BITWISEXOR | QUESTION | DOLLAR | StringLiteral | CharSetLiteral | Number | Identifier | CharSetName | WS | COMMENT );";
        }
    }
 

}