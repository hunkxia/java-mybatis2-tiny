package tiny.mybatis2.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

public class SqlSessionUtils {
    public static SqlSession getSqlSession(){
        //-------- 从XML中构建SqlSessionFactory --------
        SqlSession session = null;
        try {
            SqlSessionFactory factory  = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
            //-------- 不使用XML构建SqlSessionFactory,参考官网 -------
            /*
            DataSource dataSource = BlogDataSourceFactory.getBlogDataSource();
            TransactionFactory transactionFactory = new JdbcTransactionFactory();
            Environment environment = new Environment("development", transactionFactory, dataSource);
            Configuration configuration = new Configuration(environment);
            configuration.addMapper(BlogMapper.class);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
            */
            //从SqlSessionFactory获取SqlSession
            session = factory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return session;
    }
}
