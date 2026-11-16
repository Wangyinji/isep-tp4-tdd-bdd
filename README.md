# ISEP TP4: TDD and BDD

三个 Java 17 练习，放在同一个 Maven 多模块项目中。

| 目录 | 第一个测试 | 当前阶段 |
| --- | --- | --- |
| `prime-checker` | 0 不是质数 | Red |
| `fizzbuzz` | 1 返回字符串 `"1"` | Red |
| `roman-numerals` | 1 转换为 `"I"`，使用 Gherkin + Cucumber | Red |

## 运行

用 IntelliJ IDEA 打开根目录的 `pom.xml`，选择 JDK 17 并加载 Maven 项目。
也可以在项目根目录使用 PowerShell：

```powershell
.\mvnw.cmd -fae test
```

`JAVA_HOME` 需要指向 JDK 17。首次运行会下载 Maven 和测试依赖。
`-fae` 会让 Maven 继续运行其他模块，即使前面的模块测试失败。

分别运行：

```powershell
.\mvnw.cmd -pl prime-checker test
.\mvnw.cmd -pl fizzbuzz test
.\mvnw.cmd -pl roman-numerals test
```

## 第一次测试：Red

每个练习只有一个测试。功能方法目前是可编译的空壳，抛出
`UnsupportedOperationException`，所以三个测试都应显示红色，Maven 返回非零退出码。
这属于预期结果，不是依赖或编译错误。不要将测试禁用或删除。

下一步由负责 Green 的同学补充最少的实现，使第一个测试通过，提交并推送。
之后检查是否需要重构，再添加下一个失败测试，继续循环。

罗马数字场景位于
`roman-numerals/src/test/resources/features/roman-numerals.feature`。
测试报告生成在各模块的 `target/surefire-reports/` 中，不提交构建产物。

测试框架参考：[Cucumber Java 官方文档](https://cucumber.io/docs/installation/java/)。
