#IKAnalyzer5

支持Lucene 5.x和Solr5.x 

# 使用

启用数据库配置：
#是否启用读取数据库
jdbc.isrun=1
#连接字符串
jdbc.url=jdbc:mysql://10.10.10.10:3306/fenci?useUnicode=true&amp;characterEncoding=GBK
#数据库用户名
jdbc.user=root
#数据库密码
jdbc.password=root
#查询字符串，使用String.format在表中格式化循环语句
jdbc.reload.sql=SELECT word_name,id FROM nlp_dict_word where id>%s order by id limit %s
#单词循环获取的条数
jdbc.reload.sqlsize=1000
#定时多长时间执行一次
jdbc.reload.interval=3600000

# IKAnalyzer5-mysql
