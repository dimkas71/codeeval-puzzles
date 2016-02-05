
class Util {
    def getFileFromResource(def resourceName) {
        new File(getClass().getClassLoader().getResource(resourceName).getFile())
    }
}
