Design Patterns Project – Proxy & Flyweight (Java)

Описание

Этот проект демонстрирует **два структурных паттерна проектирования** — **Proxy** и **Flyweight** — через реальные кейсы:

1. **Proxy Pattern** – ленивое и защищённое отображение изображений в системе недвижимости.
2. **Flyweight Pattern** – эффективная отрисовка тысяч маркеров на карте с повторяющимися стилями.

Проект предназначен для учебных целей и подготовки к собеседованиям по Java и архитектуре ПО.

---

 Структура репозитория
design-patterns-project/ ├── proxy-pattern/ # Proxy Pattern: изображения (реал эстейт) │ ├── Image.java │ ├── RealImage.java │ ├── ProxyImage.java │ ├── ProtectionProxyImage.java │ └── README.md

├── flyweight-pattern/ # Flyweight Pattern: карта с маркерами │ ├── MarkerStyle.java │ ├── Marker.java │ ├── MarkerFactory.java │ ├── MapRenderer.java │ └── README.md

├── README.md # Главный README 
flyweight-pattern/

---

 Сценарии

 Proxy Pattern

-  Миниатюры изображений загружаются мгновенно.
-  Полные изображения — только по запросу (`.displayFullImage()`).
-  Защита загрузки изображений для авторизованных пользователей.

➡ Подробнее: [`proxy-pattern/README.md`](./proxy-pattern/README.md)

---

 Flyweight Pattern

-  Общие стили маркеров для снижения памяти.
-  Десятки тысяч маркеров — сотни стилей.
-  Подсчёт реального выигрыша по памяти.



 Как запустить

```bash
cd proxy-pattern
javac *.java
# java Main // добавьте Main.java для запуска

cd ../flyweight-pattern
javac *.java
java MapRenderer
