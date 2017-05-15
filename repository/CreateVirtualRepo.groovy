repoName = userInput (
    type : "STRING",
    description : "Please provide a repository name"
  )

repo = userInput (
    type : "REPOSITORY",
    description : "Please provide repositories to aggregate",
    multivalued : true
  )

DefaultDeployRepo = userInput (
    type : "REPOSITORY",
    description : "Please provide Default deployment repository",
    multivalued : false
  )

virtualRepository(name) {
  repositories (repo*.key) 
  notes "Created through JFrog Mission Control"
  defaultDeploymentRepo "$DefaultDeployRepo.key"
  includesPattern "**/*" 
  excludesPattern "" 
  packageType "generic" 
}
