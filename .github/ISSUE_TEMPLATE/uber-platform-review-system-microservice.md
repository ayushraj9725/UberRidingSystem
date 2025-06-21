---
name: Uber Platform Review System Microservice
about: 'We propose a Review Service Microservice as part of the Uber Platform. '
title: ''
labels: ''
assignees: ayushraj9725

---

**Is your feature request related to a problem? Please describe.**
Currently, the Uber platform lacks a structured way for users to provide feedback about their ride experience. This makes it difficult to monitor the quality of drivers and passengers, leading to frustration over unresolved complaints, repeated issues, and an inability to build a trust-driven platform.

Ex: I'm always frustrated when there's no system in place to rate or review a rude passenger or an unsafe driver.

**Describe the solution you'd like**
We propose implementing a dedicated Review System Microservice that allows passengers to rate and review drivers, and vice versa. Each review should be linked to a completed booking via its booking_id. The microservice will provide endpoints for creating, reading, updating, and deleting reviews, and can be consumed by other services like Booking, Ride History, or User Profile to display rating information.

**Describe alternatives you've considered**
Embedding review functionality inside the Booking Service, but this violated the separation of concerns and would make the booking logic more complex.

Using a third-party review system, but this reduced our control over data integrity and integration flexibility.

Deferring reviews to post-email follow-ups, which isn't integrated and lacks real-time visibility within the app.

**Additional context**
Built using Java (Spring Boot), following RESTful principles.

Data model includes separate entities for DriverReview and PassengerReview, each linked to a booking_id.

No authentication is enforced yet to simplify development and testing.

Future improvements may include rating aggregation, spam review detection, and UI integration with ride history.
