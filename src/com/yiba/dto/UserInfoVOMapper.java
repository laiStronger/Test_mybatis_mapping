package com.yiba.dto;

import com.yiba.vo.UserInfoVO;

public interface UserInfoVOMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_info
	 * @mbggenerated  Thu Sep 10 14:04:53 CST 2015
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_info
	 * @mbggenerated  Thu Sep 10 14:04:53 CST 2015
	 */
	int insert(UserInfoVO record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_info
	 * @mbggenerated  Thu Sep 10 14:04:53 CST 2015
	 */
	int insertSelective(UserInfoVO record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_info
	 * @mbggenerated  Thu Sep 10 14:04:53 CST 2015
	 */
	UserInfoVO selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_info
	 * @mbggenerated  Thu Sep 10 14:04:53 CST 2015
	 */
	int updateByPrimaryKeySelective(UserInfoVO record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_info
	 * @mbggenerated  Thu Sep 10 14:04:53 CST 2015
	 */
	int updateByPrimaryKey(UserInfoVO record);
}