public class Demo2{
	public static void main(String[] args){
		int allDates = 199;
		int pageSize =10;
		int totalPage = 0;
		// 使用三元运算符 实现分页功能
		totalPage = allDates%pageSize == 0 ? allDates/pageSize : allDates/pageSize + 1;
		System.out.print(totalPage);
	}
}