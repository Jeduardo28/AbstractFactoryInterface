$ErrorActionPreference = 'Stop'
Set-Location $PSScriptRoot
New-Item -ItemType Directory -Force bin | Out-Null
$fontes = Get-ChildItem -LiteralPath src -Filter *.java | Where-Object { $_.Name -notlike '*Test.java' } | ForEach-Object { $_.FullName }
& javac -encoding UTF-8 -d bin $fontes
if ($LASTEXITCODE -ne 0) { throw 'Falha na compilacao.' }
& java -cp bin App
if ($LASTEXITCODE -ne 0) { throw 'Falha na execucao.' }

