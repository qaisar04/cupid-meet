# CupidMeet

## Документация API

### 1. User Details Service
Сервис для управления профилями пользователей, их предпочтениями и взаимодействиями между ними. Также поддерживаются административные действия, такие как блокировка/разблокировка и назначение ролей.

#### Основные функции:
- Обновление информации профиля и управление вложениями.
- Получение подходящих пользователей на основе предпочтений.
- Оценка пользователей и управление реакциями.
- Административные действия: блокировка, разблокировка, назначение ролей.

[Перейти к API документации User Details Service](https://qaisar.online/api/user-details-service/swagger-ui.html)

---

### 2. Storage Service
Сервис для хранения и управления файлами, такими как аватары пользователей или другие вложения.

#### Основные функции:
- Загрузка файлов и управление вложениями.
- Удаление файлов пользователей.

[Перейти к API документации Storage Service](https://qaisar.online/api/storage-service/swagger-ui.html)

---

### 3. Location Data Service
Сервис для работы с геолокационными данными пользователей, который позволяет находить ближайших пользователей или события на основе их местоположения.

#### Основные функции:
- Поиск пользователей по их географическому местоположению.
- Обработка и хранение данных о местоположении.

[Перейти к API документации Location Data Service](https://qaisar.online/api/location-data-service/swagger-ui.html)

---

### 4. Feedback Service
Сервис для сбора и управления отзывами и оценками пользователей на основе их взаимодействий с другими пользователями или приложением.

#### Основные функции:
- Создание отзывов и оценок.
- Получение фидбэка и его анализ.

[Перейти к API документации Feedback Service](https://qaisar.online/api/feedback-service/swagger-ui.html)

---

### 5. QR Service
Сервис для генерации QR-кодов, которые могут быть использованы для предоставления быстрых ссылок на различные ресурсы.

#### Основные функции:
- Генерация QR-кодов для различных ресурсов.
- Генерация QR-кода и сохранение его в виде файла, возвращая путь к этому файлу.

[Перейти к API документации QR Service](https://qaisar.online/api/qr-service/swagger-ui.html)

---

## Мониторинг и управление

- [Grafana Dashboard](http://103.106.3.186:3000/)
- [MinIO Console](https://s3.qaisar.online/)
- [Keycloak Console](https://qaisar.online:8843/)

---

## Подключение к базе данных

- **URL**: `jdbc:postgresql://qaisar.online:5433/cupid-meet`
- **Username**: `postgres`
- **Password**: `postgres` `(уточнить у @qaisario при необходимости)`
