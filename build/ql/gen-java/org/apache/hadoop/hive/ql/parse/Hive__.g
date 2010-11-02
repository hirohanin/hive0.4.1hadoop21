lexer grammar Hive;
@header {package org.apache.hadoop.hive.ql.parse;}

// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1162
KW_TRUE : 'TRUE';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1163
KW_FALSE : 'FALSE';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1164
KW_ALL : 'ALL';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1165
KW_AND : 'AND';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1166
KW_OR : 'OR';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1167
KW_NOT : 'NOT';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1168
KW_LIKE : 'LIKE';

// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1170
KW_IF : 'IF';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1171
KW_EXISTS : 'EXISTS';

// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1173
KW_ASC : 'ASC';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1174
KW_DESC : 'DESC';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1175
KW_ORDER : 'ORDER';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1176
KW_BY : 'BY';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1177
KW_GROUP : 'GROUP';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1178
KW_WHERE : 'WHERE';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1179
KW_FROM : 'FROM';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1180
KW_AS : 'AS';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1181
KW_SELECT : 'SELECT';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1182
KW_DISTINCT : 'DISTINCT';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1183
KW_INSERT : 'INSERT';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1184
KW_OVERWRITE : 'OVERWRITE';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1185
KW_OUTER : 'OUTER';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1186
KW_JOIN : 'JOIN';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1187
KW_LEFT : 'LEFT';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1188
KW_RIGHT : 'RIGHT';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1189
KW_FULL : 'FULL';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1190
KW_ON : 'ON';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1191
KW_PARTITION : 'PARTITION';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1192
KW_PARTITIONS : 'PARTITIONS';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1193
KW_TABLE: 'TABLE';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1194
KW_TABLES: 'TABLES';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1195
KW_FUNCTIONS: 'FUNCTIONS';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1196
KW_SHOW: 'SHOW';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1197
KW_MSCK: 'MSCK';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1198
KW_DIRECTORY: 'DIRECTORY';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1199
KW_LOCAL: 'LOCAL';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1200
KW_TRANSFORM : 'TRANSFORM';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1201
KW_USING: 'USING';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1202
KW_CLUSTER: 'CLUSTER';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1203
KW_DISTRIBUTE: 'DISTRIBUTE';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1204
KW_SORT: 'SORT';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1205
KW_UNION: 'UNION';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1206
KW_LOAD: 'LOAD';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1207
KW_DATA: 'DATA';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1208
KW_INPATH: 'INPATH';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1209
KW_IS: 'IS';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1210
KW_NULL: 'NULL';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1211
KW_CREATE: 'CREATE';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1212
KW_EXTERNAL: 'EXTERNAL';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1213
KW_ALTER: 'ALTER';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1214
KW_DESCRIBE: 'DESCRIBE';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1215
KW_DROP: 'DROP';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1216
KW_RENAME: 'RENAME';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1217
KW_TO: 'TO';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1218
KW_COMMENT: 'COMMENT';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1219
KW_BOOLEAN: 'BOOLEAN';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1220
KW_TINYINT: 'TINYINT';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1221
KW_SMALLINT: 'SMALLINT';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1222
KW_INT: 'INT';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1223
KW_BIGINT: 'BIGINT';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1224
KW_FLOAT: 'FLOAT';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1225
KW_DOUBLE: 'DOUBLE';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1226
KW_DATE: 'DATE';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1227
KW_DATETIME: 'DATETIME';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1228
KW_TIMESTAMP: 'TIMESTAMP';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1229
KW_STRING: 'STRING';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1230
KW_ARRAY: 'ARRAY';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1231
KW_MAP: 'MAP';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1232
KW_REDUCE: 'REDUCE';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1233
KW_PARTITIONED: 'PARTITIONED';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1234
KW_CLUSTERED: 'CLUSTERED';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1235
KW_SORTED: 'SORTED';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1236
KW_INTO: 'INTO';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1237
KW_BUCKETS: 'BUCKETS';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1238
KW_ROW: 'ROW';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1239
KW_FORMAT: 'FORMAT';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1240
KW_DELIMITED: 'DELIMITED';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1241
KW_FIELDS: 'FIELDS';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1242
KW_TERMINATED: 'TERMINATED';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1243
KW_ESCAPED: 'ESCAPED';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1244
KW_COLLECTION: 'COLLECTION';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1245
KW_ITEMS: 'ITEMS';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1246
KW_KEYS: 'KEYS';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1247
KW_KEY_TYPE: '$KEY$';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1248
KW_LINES: 'LINES';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1249
KW_STORED: 'STORED';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1250
KW_SEQUENCEFILE: 'SEQUENCEFILE';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1251
KW_TEXTFILE: 'TEXTFILE';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1252
KW_RCFILE: 'RCFILE';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1253
KW_INPUTFORMAT: 'INPUTFORMAT';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1254
KW_OUTPUTFORMAT: 'OUTPUTFORMAT';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1255
KW_LOCATION: 'LOCATION';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1256
KW_TABLESAMPLE: 'TABLESAMPLE';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1257
KW_BUCKET: 'BUCKET';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1258
KW_OUT: 'OUT';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1259
KW_OF: 'OF';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1260
KW_CAST: 'CAST';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1261
KW_ADD: 'ADD';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1262
KW_REPLACE: 'REPLACE';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1263
KW_COLUMNS: 'COLUMNS';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1264
KW_RLIKE: 'RLIKE';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1265
KW_REGEXP: 'REGEXP';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1266
KW_TEMPORARY: 'TEMPORARY';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1267
KW_FUNCTION: 'FUNCTION';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1268
KW_EXPLAIN: 'EXPLAIN';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1269
KW_EXTENDED: 'EXTENDED';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1270
KW_SERDE: 'SERDE';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1271
KW_WITH: 'WITH';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1272
KW_SERDEPROPERTIES: 'SERDEPROPERTIES';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1273
KW_LIMIT: 'LIMIT';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1274
KW_SET: 'SET';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1275
KW_PROPERTIES: 'TBLPROPERTIES';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1276
KW_VALUE_TYPE: '$VALUE$';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1277
KW_ELEM_TYPE: '$ELEM$';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1278
KW_CASE: 'CASE';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1279
KW_WHEN: 'WHEN';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1280
KW_THEN: 'THEN';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1281
KW_ELSE: 'ELSE';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1282
KW_END: 'END';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1283
KW_MAPJOIN: 'MAPJOIN';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1284
KW_CLUSTERSTATUS: 'CLUSTERSTATUS';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1285
KW_UTC: 'UTC';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1286
KW_UTCTIMESTAMP: 'UTC_TMESTAMP';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1287
KW_LONG: 'LONG';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1288
KW_DELETE: 'DELETE';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1289
KW_PLUS: 'PLUS';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1290
KW_MINUS: 'MINUS';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1291
KW_FETCH: 'FETCH';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1292
KW_INTERSECT: 'INTERSECT';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1293
KW_VIEW: 'VIEW';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1294
KW_IN: 'IN';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1295
KW_DATABASE: 'DATABASE';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1296
KW_MATERIALIZED: 'MATERIALIZED';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1297
KW_SCHEMA: 'SCHEMA';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1298
KW_SCHEMAS: 'SCHEMAS';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1299
KW_GRANT: 'GRANT';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1300
KW_REVOKE: 'REVOKE';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1301
KW_SSL: 'SSL';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1302
KW_UNDO: 'UNDO';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1303
KW_LOCK: 'LOCK';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1304
KW_UNLOCK: 'UNLOCK';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1305
KW_PROCEDURE: 'PROCEDURE';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1306
KW_UNSIGNED: 'UNSIGNED';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1307
KW_WHILE: 'WHILE';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1308
KW_READ: 'READ';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1309
KW_READS: 'READS';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1310
KW_PURGE: 'PURGE';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1311
KW_RANGE: 'RANGE';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1312
KW_ANALYZE: 'ANALYZE';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1313
KW_BEFORE: 'BEFORE';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1314
KW_BETWEEN: 'BETWEEN';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1315
KW_BOTH: 'BOTH';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1316
KW_BINARY: 'BINARY';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1317
KW_CROSS: 'CROSS';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1318
KW_CONTINUE: 'CONTINUE';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1319
KW_CURSOR: 'CURSOR';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1320
KW_TRIGGER: 'TRIGGER';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1321
KW_RECORDREADER: 'RECORDREADER';


// Operators

// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1326
DOT : '.'; // generated as a part of Number rule
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1327
COLON : ':' ;
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1328
COMMA : ',' ;
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1329
SEMICOLON : ';' ;

// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1331
LPAREN : '(' ;
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1332
RPAREN : ')' ;
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1333
LSQUARE : '[' ;
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1334
RSQUARE : ']' ;
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1335
LCURLY : '{';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1336
RCURLY : '}';

// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1338
EQUAL : '=';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1339
NOTEQUAL : '<>';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1340
LESSTHANOREQUALTO : '<=';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1341
LESSTHAN : '<';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1342
GREATERTHANOREQUALTO : '>=';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1343
GREATERTHAN : '>';

// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1345
DIVIDE : '/';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1346
PLUS : '+';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1347
MINUS : '-';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1348
STAR : '*';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1349
MOD : '%';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1350
DIV : 'DIV';

// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1352
AMPERSAND : '&';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1353
TILDE : '~';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1354
BITWISEOR : '|';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1355
BITWISEXOR : '^';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1356
QUESTION : '?';
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1357
DOLLAR : '$';

// LITERALS
// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1360
fragment
Letter
    : 'a'..'z' | 'A'..'Z'
    ;

// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1365
fragment
HexDigit
    : 'a'..'f' | 'A'..'F' 
    ;

// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1370
fragment
Digit
    :
    '0'..'9'
    ;

// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1376
fragment
Exponent
    :
    'e' ( PLUS|MINUS )? (Digit)+
    ;

// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1382
fragment
RegexComponent
    : 'a'..'z' | 'A'..'Z' | '0'..'9' | '_'
    | PLUS | STAR | QUESTION | MINUS | DOT
    | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY
    | BITWISEXOR | BITWISEOR | DOLLAR
    ;

// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1390
StringLiteral
    :
    ( '\'' ( ~('\''|'\\') | ('\\' .) )* '\'' 
    | '\"' ( ~('\"'|'\\') | ('\\' .) )* '\"' 
    )+
    ;

// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1397
CharSetLiteral
    :    
    StringLiteral 
    | '0' 'X' (HexDigit|Digit)+
    ;

// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1403
Number
    :
    (Digit)+ ( DOT (Digit)* (Exponent)? | Exponent)?
    ;

// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1408
Identifier
    :
    (Letter | Digit) (Letter | Digit | '_')*
    | '`' RegexComponent+ '`'
    ;

// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1414
CharSetName
    :
    '_' (Letter | Digit | '_' | '-' | '.' | ':' )+
    ;

// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1419
WS  :  (' '|'\r'|'\t'|'\n') {$channel=HIDDEN;}
    ;

// $ANTLR src "/home/rohan/workspace/hive/branch-0.4/ql/src/java/org/apache/hadoop/hive/ql/parse/Hive.g" 1422
COMMENT
  : '--' (~('\n'|'\r'))*
    { $channel=HIDDEN; }
  ;


