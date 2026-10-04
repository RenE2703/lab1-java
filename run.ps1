param(
    [string]$ClassName = "HelloWorld"
)

$ErrorActionPreference = "Stop"
$taskRoot = $PSScriptRoot
$sourceDirectory = Join-Path $taskRoot "src"
$outputDirectory = Join-Path $taskRoot "out"
$javaFiles = @(Get-ChildItem -LiteralPath $sourceDirectory -Filter "*.java" | ForEach-Object { $_.FullName })

if (-not (Test-Path -LiteralPath (Join-Path $sourceDirectory ($ClassName + ".java")))) {
    throw "Khong tim thay lop $ClassName trong src."
}

New-Item -ItemType Directory -Force -Path $outputDirectory | Out-Null
& javac -encoding UTF-8 -d $outputDirectory @javaFiles
if ($LASTEXITCODE -ne 0) { throw "Bien dich Java that bai." }

& java '-Dfile.encoding=UTF-8' -cp $outputDirectory $ClassName
if ($LASTEXITCODE -ne 0) { throw "Chuong trinh Java ket thuc voi loi." }
