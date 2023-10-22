package dao;

import entity.Student;
import java.util.List;

//操作student表的dao接口
public interface StudentMapper {

     //查询所有数据(包括自定义别名)
     List<Student> selectStudents();

     //根据id值查询
     Student selectStudentById(Integer id);

     //根据对象查询
     List<Student> selectMulitObject(Student student);

     //模糊查询
     List<Student> selectLikeStudents(Student student);

     //插入数据
     int insertStudent(Student student);

     //更新数据
     int updateStudent(Student student);

     //删除数据
     int deleteStudent(Integer id);

     void deleteStudentsByIn(Student student);
}
