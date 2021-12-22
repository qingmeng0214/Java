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
		// ����ѧ����Ϣ��TreeSet���϶���
		Set<Students> stuSet = new TreeSet<Students>();
		while (true) {
			System.out.println("������ѧ����Ϣ:(ѧ��#����#����)");
			String inputData = input.nextLine();
			// �ж��Ƿ��˳� inputData.equals("exit")
			if ("exit".equals(inputData)) {
				break;
			}
			// ���û������ѧ����Ϣ�ָ�ΪString[]
			String[] info = inputData.split("#");
			// ��������Ϣ��װ��Student������
			 Students stu= new Students(Integer.parseInt(info[0]), info[1],
                     			Integer.parseInt(info[2]));
			// ��ѧ��������뼯��
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
			fw.write("����\t����\tѧ��\n");
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
