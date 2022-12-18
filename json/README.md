### Ładowanie scenariusza do pamięci aplikacji

```
curl 0.0.0.0:8080/load -H "Content-Type: application/json" -d @json/<filename>
```

Zamiast `<filename>` należy wstawić plik JSON, jaki chcemy testować, np. `test.json`

## Liczenie kroków scenariusza
### Wszystkie kroki

```curl 0.0.0.0:8080/stepCount```

Przykładowe użycie:

```
> curl 0.0.0.0:8080/load -H "Content-Type: application/json" -d @json/test.json
> curl 0.0.0.0:8080/stepCount
13                              
```