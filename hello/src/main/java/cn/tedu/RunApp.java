package cn.tedu;  //底层包扫描，扫描所有子路径，包括自身路径

//所有类的父路径中
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication  //标识是一个SpringBoot应用程序
public class RunApp {
	//运行入口函数
	public static void main(String[] args) {
		//启动SpringApplication程序
		SpringApplication.run(RunApp.class, args);
	}
}
