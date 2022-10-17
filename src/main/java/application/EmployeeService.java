package application;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmployeeService
{
	@Autowired
	private Myrepo myrepo;
	public  List<Employee> displayData()
	{
		 return myrepo.findAll();
	}
	public void saveEmployee(Employee employee)
	{
		myrepo.save(employee);
	}
	public Employee getEmp(long id)
	{
		return myrepo.findById(id).get();
	}
	public void delete(long id)
	{
		myrepo.deleteById(id);
	}
}

