repoName = userInput (
    type : "STRING",
    description : "Please provide a repository name"
  )

repoList = userInput (
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
  repositories (repoList*.key) 
  notes "Created through JFrog Mission Control"
  defaultDeploymentRepo "$DefaultDeployRepo.key"
  includesPattern "**/*" 
  excludesPattern "" 
  packageType "generic" 
}
