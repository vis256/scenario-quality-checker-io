## Scenario Quality Checker (SQC)

### Retrospekcja znajduje się w pliku [RETRO.md](https://github.com/vis256/scenario-quality-checker-io/blob/main/RETRO.md)

Dla analityków dokumentujących wymagania funkcjonalne za pomocą scenariuszy nasza aplikacja SQC dostarczy informacji ilościowych oraz umożliwi wykrywanie problemów w wymaganiach funkcjonalnych zapisanych w postaci scenariuszy. Aplikacja będzie dostępna poprzez GUI a także jako zdalne API dzięki czemu można ją zintegrować z istniejącymi narzędziami.

### Włączanie aplikacji
```
mvn spring-boot:run
```

Domyślny port serwera: 8080

### Przykładowy input JSON
```
{
  "title": "Dodanie książki",
  "actors": [
    "Bibliotekarz"
  ],
  "system_actor": "System",
  "steps": [
    {
      "text": "Bibliotekarz wybiera opcje dodania nowej pozycji książkowej"
    },
    {
      "text": "Wyświetla się formularz."
    },
    {
      "text": "Bibliotekarz podaje dane książki."
    },
    {
      "text": "IF: Bibliotekarz pragnie dodać egzemplarze książki",
      "steps": [
        {
          "text": "Bibliotekarz wybiera opcję definiowania egzemplarzy"
        },
        {
          "text": "System prezentuje zdefiniowane egzemplarze"
        },
        {
          "text": "FOR EACH egzemplarz:",
          "steps": [
            {
              "text": "Bibliotekarz wybiera opcję dodania egzemplarza"
            },
            {
              "text": "System prosi o podanie danych egzemplarza"
            },
            {
              "text": "Bibliotekarz podaje dane egzemplarza i zatwierdza."
            },
            {
              "text": "System informuje o poprawnym dodaniu egzemplarza i prezentuje zaktualizowaną listę egzemplarzy."
            }
          ]
        }
      ]
    },
    {
      "text": "Bibliotekarz zatwierdza dodanie książki."
    },
    {
      "text": "System informuje o poprawnym dodaniu książki."
    }
  ]
}
```
