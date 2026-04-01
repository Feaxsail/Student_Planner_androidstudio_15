package com.shcherbakov.student_planner_androidstudio_15.data

data class Subject(
    val id: String,
    val name: String,
    val professor: String,
    val credits: Int,
    val currentGrade: String,
    val description: String
)

val sampleSubjects = listOf(
    Subject(
        id = "1",
        name = "Разработка мобильных приложений",
        professor = "Леонтьев Д.А.",
        credits = 91,
        currentGrade = "Отлично",
        description = "Разработка нативных Android-приложений с использованием Kotlin и современных компонентов Jetpack Compose. Изучение архитектурных паттернов MVVM, работы с локальными базами данных и сетевыми API."
    ),
    Subject(
        id = "2",
        name = "Базы данных",
        professor = "Петров П.П.",
        credits = 85,
        currentGrade = "Хорошо",
        description = "Изучение реляционных баз данных, SQL, проектирование схем данных и нормализация. Работа с PostgreSQL."
    ),
    Subject(
        id = "3",
        name = "Системное программирование",
        professor = "Токаев Т.И.",
        credits = 75,
        currentGrade = "Хорошо",
        description = "Низкоуровневая разработка на языке Rust: управление памятью без сборщика мусора, многопоточность, работа с операционной системой и создание высокопроизводительных системных компонентов."
    ),
    Subject(
        id = "4",
        name = "Веб-программирование",
        professor = "Сидоров А.В.",
        credits = 88,
        currentGrade = "Отлично",
        description = "Разработка веб-приложений с использованием современных фреймворков. Изучение HTML, CSS, JavaScript, React и серверной части на Node.js."
    ),
    Subject(
        id = "5",
        name = "Компьютерные сети",
        professor = "Козлов Н.Н.",
        credits = 80,
        currentGrade = "Хорошо",
        description = "Изучение сетевых протоколов, архитектуры TCP/IP, маршрутизации и безопасности сетей. Практическая работа с Cisco Packet Tracer."
    ),
    Subject(
        id = "6",
        name = "Инженерия программного обеспечения",
        professor = "Морозова Е.С.",
        credits = 92,
        currentGrade = "Отлично",
        description = "Методологии разработки ПО, управление проектами, тестирование, CI/CD. Изучение Agile, Scrum и DevOps практик."
    )
)