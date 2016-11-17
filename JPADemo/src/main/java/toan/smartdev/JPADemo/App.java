package toan.smartdev.JPADemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import toan.smartdev.JPADemo.model.Role;
import toan.smartdev.JPADemo.model.User;
import toan.smartdev.JPADemo.repository.RoleRepository;
import toan.smartdev.JPADemo.repository.UserRepository;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args ) throws InterruptedException
    {
        @SuppressWarnings("resource")
        ApplicationContext context = 
                new ClassPathXmlApplicationContext("spring-data.xml");
        UserRepository userRepository = (UserRepository) context.getBean("userRepository");
        RoleRepository roleRepository = context.getBean(RoleRepository.class);
        userRepository.deleteAll();
        roleRepository.deleteAll();
        Role role =  roleRepository.save(new Role("aaaa"));
        User user = new User();
        user.setId(1);
        user.setUsername("User1");
        user.setRole(role);
        userRepository.save(user);
        System.out.println(userRepository.findAll());
//        User user = userRepository.findOne(1);
//        System.out.println();
//        System.out.println(user.toString());
//        Role role = user.getRole();
//        System.out.println(role.toString());
//        System.out.println();
//        user.setPassword("abcdef");
//        Thread.sleep(1000);
//        userRepository.save(user);
//        Thread.sleep(1000);
//        user = userRepository.findOne(1);
//        System.out.println();
//        role = user.getRole();
//        System.out.println(role.toString());
    }
}
