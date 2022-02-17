name := "scala_tink1"

version := "0.1"

scalaVersion := "2.13.8"

//Опция отключения автоматического разрешения конфликтов.
conflictManager := ConflictManager.strict

//ссылка на репозиторий.
resolvers ++= Seq(
  "Scala-course" at "https://gitlab.com/api/v4/projects/33751126/packages/maven"
)

//группа; имя; версия; зона видимости;
libraryDependencies ++= Seq (
  "ru.tinkoff" %% "scala-course-tom" % "0.2"
  , "ru.tinkoff" %% "scala-course-john" % "0.2"
  , "ru.tinkoff" %% "scala-course-clerk" % "0.2"
)

//явное фиксирование версии зависимости.
dependencyOverrides ++= Seq (
  "ru.tinkoff" %% "scala-course-clerk" % "0.1"
)
