// класс ограничевающий надо подклассов
// запакованные класс
sealed class Result {
    // три подкласса
    data class Success(val data: String) : Result()
    data class Error(val message: String) : Result()
    object Loading: Result()
}

// конструктор - private всегда
// у него могуть быть наследники, но они должны быть в одном пакете
fun proccessResult(result: Result) {
    when(result) {
        is Result.Success -> {
            println("Success!")
        }
        is Result.Error -> {
            println("Error")
        }
        Result.Loading -> println("Loading...")
    }

}