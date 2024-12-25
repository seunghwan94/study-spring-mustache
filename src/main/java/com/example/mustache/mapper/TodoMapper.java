package com.example.mustache.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.mustache.vo.Todo;

@Mapper
public interface TodoMapper {
  @Select("select * from tbl_todo")
	List<Todo> select();

  @Select("select * from tbl_todo where id = #{id}")
  Todo selectByOne(int id);

  @Insert("insert into tbl_todo (task) values (#{task})")
  int insert(Todo todo);

  @Update("update tbl_todo set done = #{done} where id = #{id}")
  int update(Todo todo);

  @Delete("delete from tbl_todo where id = #{id}")
  int delete(int id);
}
