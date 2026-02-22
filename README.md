# conveyor-twin-logic

Digital Twin-based Quality Control System for Industrial Automation. A Spring Boot application designed to digitize quality inspection processes, featuring real-time decision-making logic for robotic intervention on conveyor belts.

## 🚀 Layihə haqqında
Bu layihə, sənaye avtomatlaşdırılmasında keyfiyyətə nəzarət proseslərinin rəqəmsal əkizini (Digital Twin) yaratmaq üçün hazırlanmışdır. Sistem, konveyer üzərindəki məhsulların keyfiyyətini analiz edir və defektli məhsullar üçün avtomatlaşdırılmış qərarlar qəbul edir.

## 🛠 Texnoloji Stack
* **Backend:** Java 17+, Spring Boot
* **Frontend:** Thymeleaf (Dashboard üçün)
* **Database:** PostgreSQL
* **Build Tool:** Gradle
* **Documentation:** Swagger UI

## 💡 Əsas Funksionallıq
Layihənin mərkəzi məntiqi `ConveyorService` tərəfindən idarə olunur:
* **Defekt Analizi:** Məhsulun keyfiyyət göstəriciləri yoxlanılır (`isDefective`).
* **Robotik Qərar:** Əgər məhsul qüsurludursa, sistem konveyerin sürətinə və məhsulun mövqeyinə əsasən robotun onu götürməli olduğu dəqiq koordinatı (`PICK_AT`) hesablayır.

## 🏗 Quraşdırma
1. Repozitoriyanı klonlayın: `git clone https://github.com/Mirzayev42/conveyor-twin-logic.git`
2. `./gradlew bootRun` komandası ilə işə salın.
