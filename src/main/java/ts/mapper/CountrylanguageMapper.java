package ts.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import ts.persistence.Countrylanguage;
import ts.persistence.CountrylanguageExample;
import ts.persistence.CountrylanguageKey;

public interface CountrylanguageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbggenerated Mon May 08 18:09:48 CST 2017
     */
    int countByExample(CountrylanguageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbggenerated Mon May 08 18:09:48 CST 2017
     */
    int deleteByExample(CountrylanguageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbggenerated Mon May 08 18:09:48 CST 2017
     */
    int deleteByPrimaryKey(CountrylanguageKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbggenerated Mon May 08 18:09:48 CST 2017
     */
    int insert(Countrylanguage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbggenerated Mon May 08 18:09:48 CST 2017
     */
    int insertSelective(Countrylanguage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbggenerated Mon May 08 18:09:48 CST 2017
     */
    List<Countrylanguage> selectByExample(CountrylanguageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbggenerated Mon May 08 18:09:48 CST 2017
     */
    Countrylanguage selectByPrimaryKey(CountrylanguageKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbggenerated Mon May 08 18:09:48 CST 2017
     */
    int updateByExampleSelective(@Param("record") Countrylanguage record, @Param("example") CountrylanguageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbggenerated Mon May 08 18:09:48 CST 2017
     */
    int updateByExample(@Param("record") Countrylanguage record, @Param("example") CountrylanguageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbggenerated Mon May 08 18:09:48 CST 2017
     */
    int updateByPrimaryKeySelective(Countrylanguage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbggenerated Mon May 08 18:09:48 CST 2017
     */
    int updateByPrimaryKey(Countrylanguage record);
}