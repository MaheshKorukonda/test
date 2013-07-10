package userlogin;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class LoginDao {
	
	private static SqlSessionFactory factory;
	public void setFactory(SqlSessionFactory factoryArg) 
	{
		factory = factoryArg;
	}
	public int getCount(LoginBean bean)
	{
		SqlSession session = null;
		int count=0;
	        try{
	        	session = factory.openSession();
	        	count= session.selectOne("getCount",bean);
	        	
	            }
	        catch(Exception e)
	        {
//	        	logger.error(e.getMessage());
	        }
	        finally
	        {
	          if(session!= null)
	            {
	             session.close();
	            }
	        }
	        return count;
	}
	public int insertUserDetails(LoginBean bean)
	{
		SqlSession session = null;
		int count=0;
	        try{
	        	session = factory.openSession();
	        	count= session.insert("insertUserDetails",bean);
	        	System.out.print(count);
	        	session.commit();
	            }
	        catch(Exception e)
	        {
//	        	logger.error(e.getMessage());
	        }
	        finally
	        {
	          if(session!= null)
	            {
	             session.close();
	            }
	        }
	        return count;
	}
}
