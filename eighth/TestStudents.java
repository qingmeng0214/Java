import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TestStudents {

	public static void main(String[] args) {
		Set<Students> stuSet = saveStudentInfo();
		outputInfo(stuSet);
	}
	private static Set<Students> saveStudentInfo() {
		Scanner input = new Scanner(System.in);
		// 保存学生信息的TreeSet集合对象
		Set<Students> stuSet = new TreeSet<Students>();
		while (true) {
			System.out.println("请输入学生信息:(学号#姓名#年龄)");
			String inputData = input.nextLine();
			// 判断是否退出 inputData.equals("exit")
			if ("exit".equals(inputData)) {
				break;
			}
			// 将用户输入的学生信息分割为String[]
			String[] info = inputData.split("#");
			// 将输入信息封装到Student对象中
			 Students stu= new Students(Integer.parseInt(info[0]), info[1],
                     			Integer.parseInt(info[2]));
			// 将学生对象加入集合
			stuSet.add(stu);
		}
		return stuSet;
	}
	private static void outputInfo(Set<Students> stuSet) {
		File file = new File("E:/student.txt");
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file);
			Iterator<Students> it = stuSet.iterator();
			fw.write("年龄\t姓名\t学号\n");
			while (it.hasNext()) {
				String info = it.next().toString();
				fw.write(info);
				
				fw.write("\r\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
