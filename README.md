# Spring-Boot-Example
  @conditional注解传入的参数必须是condition接口的实现类，一般和@bean配合使用，用来判断是否实例化bean
  @enable*注解通过@import注解来导入配置类，自动开启功能其实是导入了一些自动配置的bean，导入配置分3种：
  1. 直接导入配置类
  2. 根据条件选择配置类
  3. 动态注册bean
