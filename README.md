# BL Language Plugin [![JetBrains IntelliJ Platform SDK Docs](https://jb.gg/badges/docs.svg)][docs]

## Quickstart

Defines a new language, _BL language_ with support for syntax highlighting, annotations, code completion, and other features.

### Extension Points

| Name                                          | Implementation                                                                          | Extension Point Class               |
|-----------------------------------------------|-----------------------------------------------------------------------------------------|-------------------------------------|
| `com.intellij.fileType`                       | [BLFileType][file:BLFileType]                                                   | `LanguageFileType`                  |
| `com.intellij.lang.parserDefinition`          | [BLParserDefinition][file:BLParserDefinition]                                   | `ParserDefinition`                  |

[//]: # (| `com.intellij.lang.syntaxHighlighterFactory`  | [BLSyntaxHighlighterFactory][file:BLSyntaxHighlighterFactory]                   | `SyntaxHighlighterFactory`          |)

[//]: # (| `com.intellij.colorSettingsPage`              | [BLColorSettingsPage][file:BLColorSettingsPage]                                 | `ColorSettingsPage`                 |)

[//]: # (| `com.intellij.annotator`                      | [BLAnnotator][file:BLAnnotator]                                                 | `Annotator`                         |)

[//]: # (| `com.intellij.codeInsight.lineMarkerProvider` | [BLLineMarkerProvider][file:BLLineMarkerProvider]                               | `RelatedItemLineMarkerProvider`     |)

[//]: # (| `com.intellij.completion.contributor`         | [BLCompletionContributor][file:BLCompletionContributor]                         | `CompletionContributor`             |)

[//]: # (| `com.intellij.psi.referenceContributor`       | [BLReferenceContributor][file:BLReferenceContributor]                           | `PsiReferenceContributor`           |)

[//]: # (| `com.intellij.lang.refactoringSupport`        | [BLRefactoringSupportProvider][file:BLRefactoringSupportProvider]               | `RefactoringSupportProvider`        |)

[//]: # (| `com.intellij.lang.findUsagesProvider`        | [BLFindUsagesProvider][file:BLFindUsagesProvider]                               | `FindUsagesProvider`                |)

[//]: # (| `com.intellij.lang.foldingBuilder`            | [BLFoldingBuilder][file:BLFoldingBuilder]                                       | `FoldingBuilderEx`                  |)

[//]: # (| `com.intellij.gotoSymbolContributor`          | [BLChooseByNameContributor][file:BLChooseByNameContributor]                     | `ChooseByNameContributor`           |)

[//]: # (| `com.intellij.lang.psiStructureViewFactory`   | [BLStructureViewFactory][file:BLStructureViewFactory]                           | `PsiStructureViewFactory`           |)

[//]: # (| `com.intellij.lang.formatter`                 | [BLFormattingModelBuilder][file:BLFormattingModelBuilder]                       | `FormattingModelBuilder`            |)

[//]: # (| `com.intellij.codeStyleSettingsProvider`      | [BLCodeStyleSettingsProvider][file:BLCodeStyleSettingsProvider]                 | `CodeStyleSettingsProvider`         |)

[//]: # (| `com.intellij.langCodeStyleSettingsProvider`  | [BLLanguageCodeStyleSettingsProvider][file:BLLanguageCodeStyleSettingsProvider] | `LanguageCodeStyleSettingsProvider` |)

[//]: # (| `com.intellij.lang.commenter`                 | [BLCommenter][file:BLCommenter]                                                 | `Commenter`                         |)


[docs]: https://plugins.jetbrains.com/docs/intellij/
[docs:custom_language_support_tutorial]: https://plugins.jetbrains.com/docs/intellij/custom-language-support-tutorial.html
[docs:ep]: https://plugins.jetbrains.com/docs/intellij/plugin-extensions.html

[file:BLFileType]: ./src/main/java/pro/doczilla/language/BLFileType.java
[file:BLParserDefinition]: ./src/main/java/pro/doczilla/language/BLParserDefinition.java
[file:BLSyntaxHighlighterFactory]: ./src/main/java/pro/doczilla/language/BLSyntaxHighlighterFactory.java
[file:BLColorSettingsPage]: ./src/main/java/pro/doczilla/language/BLColorSettingsPage.java
[file:BLAnnotator]: ./src/main/java/pro/doczilla/language/BLAnnotator.java
[file:BLLineMarkerProvider]: ./src/main/java/pro/doczilla/language/BLLineMarkerProvider.java
[file:BLCompletionContributor]: ./src/main/java/pro/doczilla/language/BLCompletionContributor.java
[file:BLReferenceContributor]: ./src/main/java/pro/doczilla/language/BLReferenceContributor.java
[file:BLRefactoringSupportProvider]: ./src/main/java/pro/doczilla/language/BLRefactoringSupportProvider.java
[file:BLFindUsagesProvider]: ./src/main/java/pro/doczilla/language/BLFindUsagesProvider.java
[file:BLFoldingBuilder]: ./src/main/java/pro/doczilla/language/BLFoldingBuilder.java
[file:BLChooseByNameContributor]: ./src/main/java/pro/doczilla/language/BLChooseByNameContributor.java
[file:BLStructureViewFactory]: ./src/main/java/pro/doczilla/language/BLStructureViewFactory.java
[file:BLFormattingModelBuilder]: ./src/main/java/pro/doczilla/language/BLFormattingModelBuilder.java
[file:BLCodeStyleSettingsProvider]: ./src/main/java/pro/doczilla/language/BLCodeStyleSettingsProvider.java
[file:BLLanguageCodeStyleSettingsProvider]: ./src/main/java/pro/doczilla/language/BLLanguageCodeStyleSettingsProvider.java
[file:BLCommenter]: ./src/main/java/pro/doczilla/language/BLCommenter.java

