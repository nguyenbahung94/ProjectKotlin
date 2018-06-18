package com.example.billy.firstappkotlin.kotlininaction.factorymethods

class User(val nickname: String) {
    companion object {
        fun newSubscribingUser(email: String) =
                User(email.substringBefore('@'))

        fun newFacebookUser(accountId: Int) =
                User(getFacebookName(accountId))

        private fun getFacebookName(accountId: Int): String {
            return ""
        }
    }
}

