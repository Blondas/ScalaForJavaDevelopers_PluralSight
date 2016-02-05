// SIMPLE VARIABLES:
// creating value (constant):
// - scala nie wymaga srednika, potrzebny tylko gdy wiele polecen w jednej linii
val language: String = "Scala"

// creating variable:
var language2: String = "Java"
language2 = "Scala"


// FUNCTIONS:
// signature:
def add(x: Int, y: Int): Int

// simple function:
// - if-else moze byc pisany w jednej linii
// - return nie jest potrzebne - zostanie zwrocona ostatnia wykonana linijka w funkcji
def min(x: Int, y: Int): Int = {
  if (x < y) x else y
}

// funckja bez typu zwracanej wartosci:
// - jesli nie ma return, to mozna opusci typ zwracanej wartosci
def min2(x: Int, y: Int) = {
  if (x < y) x else y
}

// funkcje mozna tez napisac tak:
def min3(x: Int, y: Int) = if (x < y) x else y

// funkcja nie zwracajaca wartosci:
// - funkcja zwroci cos jak void w javie
def min4(x: Int, y: Int) {
  if (x < y) x else y
}


// CALL BY VALUE, CALL BY NAME:
// - call by name to leniwe wykonywanie