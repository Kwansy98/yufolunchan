# 与佛论禅加密

------

* **编译运行**

	使用JDK8或更高版本的编译器

	```
	javac Main.java
	java Main
	```
	
---


* **使用方法**

	使用默认密钥加密

	```
	String content = "Hello world!";
	String encryptedContent = BuddhismTools.human2Buddhism(content);
	System.out.println(encryptedContent);
	```

	使用默认密钥解密

	```
	String decryptedContent = BuddhismTools.buddhism2Human(encryptedContent);
	System.out.println(decryptedContent);	
	```

	使用自定义密钥
	
	```
	String content = "Hello world!";
	String encryptedContent = BuddhismTools.human2Buddhism(content, "MYCUSTOMKEY");
	System.out.println(encryptedContent);
	String decryptedContent = BuddhismTools.buddhism2Human(encryptedContent, "MYCUSTOMKEY");
	System.out.println(decryptedContent);
	```



