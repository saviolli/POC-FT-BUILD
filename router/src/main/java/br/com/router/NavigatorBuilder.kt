package br.com.router

data class NavigatorBuilder(val navigator: Navigator) {

    fun build() {
        NavigatorFactory.navigator = this.navigator
    }
}