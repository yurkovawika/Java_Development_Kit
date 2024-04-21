# Java Development Kit (семинары)

<details>

## Урок 1. Графические интерфейсы


Отправлять сообщения из текстового поля сообщения в лог
по нажатию кнопки или по нажатию клавиши Enter на поле ввода сообщения;
Продублировать импровизированный лог (историю) чата в файле;
При запуске клиента чата заполнять поле истории из файла, если он существует. Обратите внимание, что чаще всего история сообщений хранится на сервере
и заполнение истории чата лучше делать при соединении с сервером, а не при открытии окна клиента.


![1](https://github.com/yurkovawika/Java_Development_Kit/assets/102153972/3358b69f-cd6c-46b4-8ee1-dfb68fccf821)

![2](https://github.com/yurkovawika/Java_Development_Kit/assets/102153972/a236a716-2e75-47d4-a879-064d2115a0e5)

![3](https://github.com/yurkovawika/Java_Development_Kit/assets/102153972/1ecaffe7-a286-45bd-8d17-d210d3c9ee57)

  <summary>Урок №1</summary>
</details>

<details>
  <summary>Урок №2</summary>
    
## Урок 2. Программные интерфейсы

### 1. Дописать третье задание таким образом, чтобы в идентификатор типа Developer записывался объект Frontender, и далее вызывался метод developGUI(), не изменяя существующие интерфейсы, только код основного класса.

На скрине ниже отображена работа программы, которая показывает  работу классов в абстрактном классе Developer:
![image](https://github.com/yurkovawika/Java_Development_Kit/assets/102153972/b9054ebb-19d4-4f1c-a57b-26aebad3621d)

</details>


<details>
  <summary>Урок №3</summary>
    
## Урок 3. 

### 1. 

</details>

<details>
  <summary>Урок №4</summary>
    
## Урок 4. 

### 1. 

</details>


<details>
  <summary>Урок №5</summary>
    
## Урок 5. Многопоточность

### 1. В качестве задачи предлагается решить классическую задачу про обедающих философов
#### Условие:
● Есть пять философов (потоки), которые могут либо обедать (выполнение кода) либо размышлять (ожидание).

● Каждый философ должен пообедать три раза. Каждый прием пищи длиться 500 миллисекунд

● После каждого приема пищи философ должен размышлять

● Не должно возникнуть общей блокировки

● Философы не должны есть больше одного раза подряд

[Решение:](https://github.com/yurkovawika/Java_Development_Kit/blob/master/src/seminar5/DiningPhilosophers.java)

Philosopher - это класс, представляющий философа. Каждый философ реализует интерфейс Runnable.Это позволяет его использовать как поток.
В методе run(), который реализует интерфейс Runnable, философ выполняет следующие действия:
- Размышляет, вызывая метод think().
- Затем пытается захватить стол, вызывая table.acquire(). Если стол уже занят четырьмя философами, этот вызов будет заблокирован до тех пор, пока стол не станет доступным.
- После успешного захвата стола, философ обедает, вызывая eat().
- Затем он освобождает стол, вызывая table.release(), чтобы другие философы могли его использовать.

</details>


<details>
  <summary>Урок №6</summary>
  
  ## Урок 6. Управление проектом: сборщики проектов
#### В качестве задачи предлагаю вам реализовать код для демонстрации  [парадокса Монти Холла](https://ru.wikipedia.org/wiki/Парадокс_Монти_Холла) и наглядно убедиться в верности парадокса (запустить игру в цикле на 1000 и вывести итоговый счет).
  
#### Условие:
● Создать свой Java Maven или Gradle [проект](https://github.com/yurkovawika/JavaDevelopmentKit_Final_Project); 

● Самостоятельно реализовать прикладную задачу;

● Сохранить результат в HashMap<шаг теста, результат>

● Вывести на экран статистику по победам и поражениям

![12](https://github.com/yurkovawika/Java_Development_Kit/assets/102153972/46ae9fd9-24d0-4ef4-b3f5-7e8b31d54af7)


</details>



