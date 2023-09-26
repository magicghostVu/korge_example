package pack

import korlibs.image.format.readBitmap
import korlibs.io.file.std.resourcesVfs
import korlibs.korge.Korge
import korlibs.korge.tween.get
import korlibs.korge.tween.tween
import korlibs.korge.view.image
import korlibs.math.geom.Scale
import korlibs.math.geom.Size
import korlibs.math.geom.degrees
import korlibs.math.interpolation.Easing
import korlibs.time.seconds

suspend fun main() {
    Korge(windowSize = Size(512,512)) {
        val minDegree = (-16).degrees
        val maxDegree = 16.degrees

        val image = image(
            resourcesVfs["korge.png"].readBitmap()
        ){
            scale = Scale(0.5)
        }
        while (true){
            image.tween(image::rotation[minDegree], time= 1f.seconds, easing = Easing.EASE_IN_OUT)
            image.tween(image::rotation[maxDegree], time= 1f.seconds, easing = Easing.EASE_IN_OUT)
        }
    }
}