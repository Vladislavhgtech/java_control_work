## Две контрольные работы 
### по курсу "Основы языка Java"
### Московский институт электронной техники 

------------

**Задание**

------------

### КОНТРОЛЬНАЯ РАБОТА №1

- Создать на платформе Java приложение с графическим интерфейсом, которое
позволяет добавлять задачи в список дел. Графический интерфейс должен
позволять выбрать вид задачи (день рождения, деловая встреча, авиаперелет)
и отобразить поля для ввода данных задачи в зависимости от типа. 
- На форме должна располагаться кнопка “save”. При нажатии на эту кнопку задача должна произведена проверка, что все поля заполнены(в случае, если какое-то поле не заполнено, то пользователю необходимо вывести сообщение об
ошибке) и, в случае успешной проверки, задача должна быть записана в
консоль в виде форматированного текста(в консоль записываются данные
всех полей).
- Каждый тип задачи описывается собственным классом, которые наследуются
от общего абстрактного родительского класса.
- Общей информацией для задачи являются следующие параметры:
• дата и время
• приоритет(0 – не важна, 1 – обычная, 2 – важна, 3 – крайне важна.
Реализовать это через enum.)
День рождения хранит информацию о ФИО именинника.
Деловая встреча должна иметь описание места, где будет происходить
встреча, список ФИО тех, кто участвует во встрече.
Авиаперелет должен описывать аэропорт вылета и прилета, а также время
перелета.
- Каждый класс задач, в том числе и базовый, должен содержать конструктор
со всеми полями, а также переопределенный метод toString(), hashCode(),
equals() с участием всех полей.
- Также, каждый класс должен реализовывать интерфейс java.lang.Comparable.
Метод compareTo в первую очередь должен учитывать дату и время задачи, а
потом уже приоритет. Все остальные поля классов игнорируются.

------------

### КОНТРОЛЬНАЯ РАБОТА №2

- Создать на платформе Java игру теннис, по типу игры Pong, как на игровых автоматах (http://en.wikipedia.org/wiki/Pong). Интерфейс должен выглядеть аналогично http://en.wikipedia.org/wiki/Pong#mediaviewer/File:Pong.png  
- Каждой ракеткой управляет пользователь. Для управления левой ракеткой использовать клавиши w, s, а для правой ракетки клавиши “вверх” и “вниз”. 
- Счет ведется до пяти очков. После этого появляется окно, которое содержит информацию о том какой пользователь выиграл и две кнопки “начать заново” и “выход”. 
- При нажатии на “начать заново” счет обнуляется и игра начинается заново. При нажатии на “выход” происходит выход из приложения. Программа должна работать в несколько потоков. 
- Обработка каждой ракетки должна идти в собственном потоке, мячик отрисовывается также в собственном потоке.

