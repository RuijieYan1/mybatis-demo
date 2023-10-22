import dao.CourseMapper;
import dao.StudentMapper;
import entity.Student;
import org.apache.ibatis.session.SqlSession;
import util.MyUtil;
import java.io.IOException;

public class MyApp {
    public static void main(String[] args) throws IOException {
        //获取SqlSession对象
        SqlSession sqlSession= MyUtil.getSqlSession();
        //获取dao接口的对象
        CourseMapper dao=sqlSession.getMapper(CourseMapper.class);

//        Student student=new Student();
//        student.setId(7);
//        student.setName("箫");
//        student.setAge(12);
//        student.setPhone("2377237");

        System.out.println(dao.queryCourseStudent());

        //提交数据
//        dao.deleteStudent(7);
//        sqlSession.commit();

        sqlSession.close();
    }
}
