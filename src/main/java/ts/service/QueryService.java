package ts.service;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.mybatis.spring.SqlSessionTemplate;

import ts.mapper.CityMapper;
import ts.persistence.City;
import ts.persistence.CityExample;

public class QueryService {
	
	public SqlSessionTemplate sqlSession = null;
	
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public void inserCity(String name, String code, String district, Integer pooulation) throws Exception {

		try {
			CityMapper city = sqlSession.getMapper(CityMapper.class);
			City example = new City();
			example.setName(name);
			example.setCountrycode(code);
			example.setDistrict(district);
			example.setPopulation(pooulation);
			city.insert(example);

			if(1 == 1) {
				
				// spring tracsaction will roll back by default
//				throw new UnsupportedOperationException();
				
				// spring tracsaction will roll back after setting
				throw new Exception("Transaction!");
				
				// spring tracsaction will not roll back when java.lang.NullPointerException if you set it.
//				String sss = null;
//				sss.toString();
				
			}
			
		} catch (Exception e) {
//			You can also indicate a required rollback programmatically. Although very simple, 
//			this process is quite invasive, and tightly couples your code to the Spring Framework��s transaction infrastructure
//			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			
			throw e;
		}
		
	}
	
	public void searchCityByExample(String name) {
		CityMapper city = sqlSession.getMapper(CityMapper.class);
		CityExample example = new CityExample();
		example.createCriteria().andNameEqualTo(name);
		List<City> list = city.selectByExample(example);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(ToStringBuilder.reflectionToString(list.get(i)));
		}
		
	}

}
