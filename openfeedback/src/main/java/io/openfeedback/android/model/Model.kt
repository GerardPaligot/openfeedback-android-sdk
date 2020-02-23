package io.openfeedback.android.model

class Project(
        val chipColors: List<String> = emptyList(),
        val voteItems: List<VoteItem> = emptyList()
)

class VoteItem(
        val id: String = "",
        val name: String = "",
        val position: Int = 0,
        val type: String = ""
)

class Snapshot<T>(
        val snapshot: T,
        val fromCache: Boolean
)

enum class VoteStatus(val value: String) {
    Active("active"),
    Deleted("deleted")
}