Setter opp en SOAP-klient mot økonomisystemets simuleringstjeneste.

Merk at dette _bygget_ ikke alene genererer klienten, men legger en drøss SOAP-filer i build/generated/src. Disse filene har blitt manuelt kopiert inn i src/main/java, pga trøbbel med å få wsimport til å kompilere ting for oss.

Ved endring av kontrakt, må `gradle wsimport` kjøres på nytt, og filer kopieres for hånd, på nytt.
