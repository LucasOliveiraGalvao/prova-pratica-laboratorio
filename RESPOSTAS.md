# Respostas — Sistema de Reserva de Laboratorio

Nome completo: Lucas Oliveira Galvão RA: ______________

> Preencha **todos** os campos. Campo vazio é campo não avaliado.
> Não apague os títulos nem os rótulos em negrito: a correção procura por eles.

---

# Etapa 1 — Diagnóstico

## Problema 1 — a conversão do inventario patrimonial


**Em que consiste o problema, e o que acontece quando o sistema cresce:**
R: a matriz está duplicada entre CatalogoEquipamentos e RelatorioAcervo


**Princípio SOLID violado:**
R: responsabilidade unica

**Classes afetadas (pelo nome):**
R: RelatorioAcervo, CatalogoEquipamentos e InventarioLegadoWS

**Que outra dependência indevida essas classes têm em relação ao inventario patrimonial, e por que ela é um problema:**
R: elas dependem de um legado da classe InventarioLegadoWSS


## Problema 2 — o ciclo de vida de Reserva

**Em que consiste o problema, e o que acontece quando o sistema cresce:**


**Princípio SOLID violado:**


**Classes afetadas (pelo nome):**


---

# Etapa 4 — Justificativa

## Padrão aplicado ao Problema 1

**O problema que ele resolve (descreva antes de nomear o padrão):**


**Nome do padrão:**


**Alternativa descartada e por que ela não resolveria por completo:**


## Padrão aplicado ao Problema 2

**O problema que ele resolve (descreva antes de nomear o padrão):**


**Nome do padrão:**


**Alternativa descartada e por que ela não resolveria por completo:**
