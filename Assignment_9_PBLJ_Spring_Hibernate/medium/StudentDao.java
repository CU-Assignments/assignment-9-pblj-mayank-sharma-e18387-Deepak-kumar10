import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentDao {
    public void saveStudent(Student student) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        transaction.commit();
    }
}