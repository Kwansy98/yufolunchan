# 与佛论禅加密API

与佛论禅加密基于AES加密算法，可实现文本和咒语的互相转换。

---

* **编译运行**

  使用JDK8或更高版本的编译器

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
          String myCustomKey = "MYCUSTOMKEY";
          String encryptedContent = BuddhismTools.human2Buddhism(content, myCustomKey);
          System.out.println(encryptedContent);

          String decryptedContent = BuddhismTools.buddhism2Human(encryptedContent, myCustomKey);
          System.out.println(decryptedContent);
  ```

---

目前是对base64的65个字符进行映射，也可以找256个佛经里面的字对字节进行映射，那样咒语就会更加丰富。
