repokey = userInput (
    type : "STRING", // "BOOLEAN", "INTEGER", "INSTANCE", "REPOSITORY"
    description : "Repository Key",
    validations : (["cron"])
  )

localRepository(repokey) {
  description "Public Description"
  notes "Some internal notes"
  includesPattern "**/*" // default
  excludesPattern "" // default
  repoLayoutRef "maven-2-default"
  packageType "generic" // "maven" | "gradle" | "ivy" | "sbt" | "nuget" | "gems" | "npm" | "bower" | "debian" | "pypi" | "docker" | "vagrant" | "gitlfs" | "yum" | "generic" 
  blackedOut false // default
  archiveBrowsingEnabled true

}
